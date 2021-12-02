import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class Node {
    public static void main(String[] args) {
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
        IMap<String, Boolean> nodeMap = hazelcastInstance.getMap("nodeMap");
        String key = "cluster";
        Boolean output = nodeMap.putIfAbsent(key, true);
        System.out.println("Output: " + output);
        if (output == null) {
            System.out.println("We are started");
        }
    }
}
