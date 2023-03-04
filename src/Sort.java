import java.util.ArrayList;

public class Sort {
    public static void sort(int[] numbers) {
        int i=0;
        while (i<numbers.length-1) {
            int first = numbers[i];
            int second = numbers[i+1];

            if (first>second) {
                numbers[i]=second; // Swap pair
                numbers[i+1]=first;
                if (i>0) {i--;} // Go to previous pair
            } else {
                i++; // Go to next pair
            }
        }
    }



    // PART A.  Which Sort is Which?
    public static void selectionSort(int[] elements) {
        int count=0;

        for (int j = 0; j < elements.length - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++) {
                count++;
                if (elements[k] < elements[minIndex]) {
                    minIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }

        System.out.println("Count: " + count);
    }

    public static void insertionSort(int[] elements) {
        int count = 0;

        for (int j = 1; j < elements.length; j++) {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
                count++;
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }

        System.out.println("Count: " + count);
    }

    // PART B.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words) {
        int count=0;

        for (int j = 0; j < words.size() - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < words.size(); k++) {
                count++;
                if ( words.get(k).compareTo(words.get(minIndex))<0 ) {
                    minIndex = k;
                }
            }
            String temp = words.get(j);
            words.set(j, words.get(minIndex));
            words.set(minIndex,temp);
        }

        System.out.println("Count: " + count);
    }

    public static void insertionSortWordList(ArrayList<String> words) {
        int count = 0;

        for (int j = 1; j < words.size(); j++) {
            String temp = words.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && temp.compareTo(words.get(possibleIndex-1))<0 ) {
                count++;
                words.set(possibleIndex, words.get(possibleIndex-1));
                possibleIndex--;
            }
            words.set(possibleIndex, temp);
        }

        System.out.println("Count: " + count);
    }

    public static void selectionSortDescending(int[] elements) {
        int count=0;

        for (int j = 0; j < elements.length - 1; j++) {
            int maxIndex = j;
            for (int k = j + 1; k < elements.length; k++) {
                count++;
                if (elements[k] > elements[maxIndex]) {
                    maxIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[maxIndex];
            elements[maxIndex] = temp;
        }

        System.out.println("Count: " + count);
    }

    public static void insertionSortDescending(int[] elements) {
        int count = 0;

        for (int j = 1; j < elements.length; j++) {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp > elements[possibleIndex - 1]) {
                count++;
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }

        System.out.println("Count: " + count);
    }
}
