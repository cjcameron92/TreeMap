# TreeMap


```java
    public static void main(String[] args) {
        TreeMap<Listener> exampleTreeMap = new TreeMap<>();

        exampleTreeMap.addListener(() -> System.out.println("Listener:9090"));
        exampleTreeMap.addListener(() -> System.out.println("Listener:1010"));
        exampleTreeMap.addListener(() -> System.out.println("Listener:8080"));
        exampleTreeMap.addListener(() -> System.out.println("Listener:2020"));
        
        exampleTreeMap.invoke();
        
        Iterator<? super Listener> listenerIterator = exampleTreeMap.iterator();
        
        while (listenerIterator.hasNext()) {
            listenerIterator.next();
        }
    }
    ```
