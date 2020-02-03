package graph;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @param <T>
 * @author Suranjan Poudel
 */
public class Graph<T> {
    Map<T, LinkedList<T>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    //forward and backward link because of undirected graph
    public void joinVertex(T source, T destination) {
        try {
            adjacencyList.get(source).addFirst(destination);
        } catch (Exception e) {
            adjacencyList.put(source, new LinkedList<>(Collections.singleton(destination)));
        }
        try {
            adjacencyList.get(destination).addFirst(source);
        } catch (Exception e) {
            adjacencyList.put(destination, new LinkedList<>(Collections.singleton(source)));
        }
    }

    public void BFS(T start) {
        Map<T, Boolean> visited = new HashMap<>();
        LinkedList<T> queue = new LinkedList<>();
        visited.put(start, Boolean.TRUE);
        queue.add(start);
        while (!queue.isEmpty()) {
            start = queue.poll();
            System.out.print(start + " ");
            for (T n : adjacencyList.get(start)) {
                visited.computeIfAbsent(n, value -> {
                    queue.add(n);
                    return Boolean.TRUE;
                });
            }
        }
    }
}
