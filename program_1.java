package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>(ThreadLocalRandom.current().nextInt(0, 100));
        for (int i = 0; i < array.size(); i ++){
            array.add(i, (ThreadLocalRandom.current().nextInt(0, 100)));
        }
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list){
        int i = 0;
        while (i < list.size()){
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
            else{
                i++;
            }
        }
        return new ArrayList<>();
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int min = 0;
        for (int i = 0; i < list.size(); i++){
            if (min > list.get(i)){
                min = list.get(i);
            }
        }
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int max = 0;
        for (int i = 0; i < list.size(); i++){
            if (max < list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){
        int average = 0;
        for (int i = 0; i < list.size(); i++){
            average += list.get(i);
        }
        return average;
    }