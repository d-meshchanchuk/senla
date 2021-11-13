package Task05;

import java.util.ArrayList;

public class Safe {
    int volume;
    int maxPrice;
    ArrayList<Subject> bestSubjects;

    public Safe(int volume) {
        this.volume = volume;
    }

    //перебор всех возможных наборов
    public void iterateList(ArrayList<Subject> subjects) {
        if (subjects.size() > 0) {
            checkList(subjects);
        }

        for (int i = 0; i < subjects.size(); i++) {
            ArrayList<Subject> newList = new ArrayList<>(subjects);
            newList.remove(i);
            iterateList(newList);
        }
    }

    //проверка, является ли данный набор лучшим
    private void checkList(ArrayList<Subject> subjects) {
        if (bestSubjects == null) {
            if (calcVolume(subjects) <= volume) {
                bestSubjects = subjects;
                maxPrice = calcPrice(subjects);
            }
        } else if (calcVolume(subjects) <= volume && calcPrice(subjects) > maxPrice) {
            bestSubjects = subjects;
            maxPrice = calcPrice(subjects);
        }
    }

    //вычисляет общий объем набора
    private int calcVolume(ArrayList<Subject> subjects) {
        int sumVolume = 0;

        for (Subject subject : subjects) {
            sumVolume += subject.getVolume();
        }

        return sumVolume;
    }

    //вычисляет общую ценность набора
    private int calcPrice(ArrayList<Subject> subjects) {
        int sumPrice = 0;

        for (Subject subject : subjects) {
            sumPrice += subject.getPrice();
        }

        return sumPrice;
    }

    //возвращает решение задачи (набор предметов)
    public ArrayList<Subject> getBestSet() {
        return bestSubjects;
    }

    @Override
    public String toString() {
        return "Safe(volume: " + volume + ")";
    }
}
