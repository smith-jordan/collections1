
package collectionsexample;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Jordan
 */
public class Collectionsexample {

    public static void main(String[] args) {
      
     // list type   
      List lnkLst = new LinkedList();
      lnkLst.add("Add element1");
      lnkLst.add("Add element2");
      lnkLst.add("Add element3");
      lnkLst.add("Add element4");
      displayAll(lnkLst);
      List aryLst = new ArrayList();
      aryLst.add("x");
      aryLst.add("y");
      aryLst.add("z");
      aryLst.remove("x");
      displayAll(aryLst);
      
      // set type
      Set hashSet = new HashSet();
      hashSet.add("set1");
      hashSet.add("set2");
      hashSet.add("set3");
      hashSet.remove("set1");
      displayAll(hashSet);
      
      // tree type
      SortedSet treeSet = new TreeSet();
      treeSet.add("Tree 1");
      treeSet.add("Tree 2");
      treeSet.add("Tree 3");
      treeSet.remove("Tree 1");
      displayAll(treeSet);
      
      // Hashset type
      LinkedHashSet lnkHashset = new LinkedHashSet();
      lnkHashset.add("Hash Set one");
      lnkHashset.add("Hash Set two");
      lnkHashset.add("Hash Set three");
      lnkHashset.remove("Hash Set two");
      displayAll(lnkHashset);
      
      // map type
      Map map1 = new HashMap();
      map1.put("key1", "Apple");
      map1.put("key2", "Orange");
      map1.put("key3", "Banana");
      map1.put("key4", "Pineapple");
      displayAll(map1.keySet());
      displayAll(map1.values());
      SortedMap map2 = new TreeMap();
      map2.put("key1", "Blackfoot");
      map2.put("key2", "Idaho Falls");
      map2.put("key3", "Pocatello");
      map2.put("key4", "Rexburg");
      displayAll(map2.keySet());
      displayAll(map2.values());
      LinkedHashMap map3 = new LinkedHashMap();
      map3.put("key1", "Jordan");
      map3.put("key2", "Megan");
      map3.put("key3", "Tyson");
      map3.put("key4", "Kabel");
      displayAll(map3.keySet());
      displayAll(map3.values());
   }
   static void displayAll(Collection col) {
      Iterator itr = col.iterator();
      while (itr.hasNext()) {
         String str = (String) itr.next();
         System.out.print(str + " ");
      }
      System.out.println();
   }
}
