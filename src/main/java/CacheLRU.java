import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class CacheLRU with properties <b>exist</b> и <b>value</b>.
 * @autor Shaykhutdinov Artyom
 * @version 1.0
 */

class CacheLRU<K, V> {
    private Map<K, V> map;

    /**
     * Constructor - creating a new object with specific values.
     * @param quantity - limits the number of key-value pairs present on this map.
     */

    public CacheLRU(int quantity) {
        this.map = Collections.synchronizedMap(new LinkedHashMap<>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > quantity;
            }
        });
    }

    /**
     * Map entry confirmation function
     * @return <b>true</b> if the key already exists and overwrite the value under the same key
     * or returns <b>false</b> if the key with the value is newly added.
     */

    public boolean put(K key, V value) {
        boolean exist = false;
        if(map.containsKey(key)){
            exist = true;
        }
        map.put(key, value);
        return exist;
    }

    /**
     * Key value retrieval function
     * @return value or null. If the key is in map, it returns a <b>value</b> and moves it to the beginning of map.
     * If the key is not in map, then <b>null</b> is returned
     */

    public V get(K key) {
        if (map.containsKey(key)) {
            V value = map.get(key);
            map.remove(key);
            map.put(key, value);
            return value;
        }
        return null;
    }
}
