package net.ciklum.study.Map;


import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

public class TimeMap {
    private HashMap<Integer, TimeString> timeMap = new HashMap<Integer, TimeString>();

    public void put(Integer id, String string) {
        TimeString timeString = new TimeString();
        timeString.put(string);
        timeMap.put(id, timeString);
    }

    public String get(Integer id) {
        long cuurrentTime = new Date().getTime() / 1000;
        long creatinTime = timeMap.get(id).getCreationDate() / 1000;
        long lifeTime = (cuurrentTime - creatinTime);
        if (lifeTime > 5) {
            timeMap.remove(id);
            return null;
        } else {
            return timeMap.get(id).getTimeString();
        }
    }


    private class TimeString {

        private String timeString;
        private long creationDate;

        public void put(String string) {
            timeString = string;
            creationDate = Calendar.getInstance().getTimeInMillis();
        }

        private String getTimeString() {
            return timeString;
        }

        private long getCreationDate() {
            return creationDate;
        }
    }

}
