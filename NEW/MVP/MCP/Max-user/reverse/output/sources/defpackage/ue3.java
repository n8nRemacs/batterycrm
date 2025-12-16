package defpackage;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ue3 extends af3 {
    public static boolean A(Iterable iterable, Object obj) {
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : K(iterable, obj) >= 0;
    }

    public static List B(int i, List list) {
        ArrayList arrayList;
        if (i < 0) {
            throw new IllegalArgumentException(wy1.e(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return d0(list);
        }
        if (list != null) {
            int size = list.size() - i;
            if (size <= 0) {
                return hd5.a;
            }
            if (size == 1) {
                return Collections.singletonList(O(list));
            }
            arrayList = new ArrayList(size);
            if (list != null) {
                if (list instanceof RandomAccess) {
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = list.listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : list) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return ve3.m(arrayList);
    }

    public static List C(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(wy1.e(i, "Requested element count ", " is less than zero.").toString());
        }
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return Y(list, size);
    }

    public static Object D(int i, Collection collection) {
        boolean z = collection instanceof List;
        if (z) {
            return ((List) collection).get(i);
        }
        bf3 bf3Var = new bf3(i);
        if (z) {
            List list = (List) collection;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            bf3Var.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            bf3Var.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        bf3Var.invoke(Integer.valueOf(i));
        throw null;
    }

    public static List E(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object F(Iterable iterable) {
        if (iterable instanceof List) {
            return G((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object G(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object H(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object I(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object J(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int K(Iterable iterable, Object obj) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                ve3.p();
                throw null;
            }
            if (fni.a(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void L(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, String str, em6 em6Var) throws IOException {
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                ee4.a(appendable, obj, em6Var);
            }
        }
        if (i >= 0 && i2 > i) {
            appendable.append(str);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void M(Iterable iterable, Appendable appendable, em6 em6Var, int i) throws IOException {
        int i2 = (i & 16) != 0 ? -1 : 5;
        if ((i & 64) != 0) {
            em6Var = null;
        }
        L(iterable, appendable, "\n", "", "", i2, "...", em6Var);
    }

    public static String N(Iterable iterable, String str, String str2, String str3, em6 em6Var, int i) throws IOException {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            em6Var = null;
        }
        StringBuilder sb = new StringBuilder();
        L(iterable, sb, str4, str5, str6, -1, "...", em6Var);
        return sb.toString();
    }

    public static Object O(Iterable iterable) {
        if (iterable instanceof List) {
            return P((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object P(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(ve3.i(list));
    }

    public static Object Q(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable R(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List S(List list, Collection collection) {
        if (collection == null) {
            collection = d0(collection);
        }
        if (collection.isEmpty()) {
            return d0(list);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!collection.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList T(Collection collection, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            af3.v(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList U(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List V(Collection collection) {
        if (collection != null && collection.size() <= 1) {
            return d0(collection);
        }
        List listF0 = f0(collection);
        Collections.reverse(listF0);
        return listF0;
    }

    public static List W(List list) {
        if (list == null) {
            List listF0 = f0(list);
            if (((ArrayList) listF0).size() > 1) {
                Collections.sort(listF0);
            }
            return listF0;
        }
        if (list.size() <= 1) {
            return d0(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    public static List X(Iterable iterable, Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List listF0 = f0(iterable);
            ze3.s(comparator, listF0);
            return listF0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return d0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    public static List Y(Iterable iterable, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(wy1.e(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return hd5.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return d0(iterable);
            }
            if (i == 1) {
                return Collections.singletonList(F(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return ve3.m(arrayList);
    }

    public static List Z(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(wy1.e(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return hd5.a;
        }
        int size = list.size();
        if (i >= size) {
            return d0(list);
        }
        if (i == 1) {
            return Collections.singletonList(P(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final void a0(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static HashSet b0(ArrayList arrayList) {
        HashSet hashSet = new HashSet(to8.i(we3.q(arrayList, 12)));
        a0(arrayList, hashSet);
        return hashSet;
    }

    public static int[] c0(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List d0(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return ve3.m(f0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return hd5.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] e0(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static final List f0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        a0(iterable, arrayList);
        return arrayList;
    }

    public static Set g0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set h0(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(to8.i(collection.size()));
                a0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            a0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next());
            }
        }
        return rd5.a;
    }

    public static ArrayList i0(Iterable iterable, int i, int i2) {
        bbj.a(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            Iterator itB = !it.hasNext() ? gd5.a : mee.b(new x4f(i, i2, it, null));
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static ArrayList j0(Iterable iterable, List list) {
        Iterator it = iterable.iterator();
        Iterator it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(we3.q(iterable, 10), we3.q(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new imb(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int y(int i, List list) {
        if (i >= 0 && i <= ve3.i(list)) {
            return ve3.i(list) - i;
        }
        StringBuilder sbM = ho7.m(i, "Element index ", " must be in range [");
        sbM.append(new to7(0, ve3.i(list), 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public static final int z(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbM = ho7.m(i, "Position index ", " must be in range [");
        sbM.append(new to7(0, list.size(), 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }
}
