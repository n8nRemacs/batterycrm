package kotlin.collections;

import java.security.SecureRandom;
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
import java.util.TreeSet;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.random.f;
import kotlin.sequences.C43033p;

@Metadata(d1 = {"kotlin/collections/g0", "kotlin/collections/i0", "kotlin/collections/k0", "kotlin/collections/m0", "kotlin/collections/n0", "kotlin/collections/o0", "kotlin/collections/p0", "kotlin/collections/q0", "kotlin/collections/r0", "kotlin/collections/w0"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* renamed from: kotlin.collections.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42745f0 extends C42778w0 {
    @Y61.k
    public static ArrayList A(@Y61.k Collection collection, @Y61.k Y41.l lVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Y61.k
    public static List A0(@Y61.k Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List listG = C42778w0.g(iterable);
            y0(listG);
            return listG;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return M0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    @Y61.k
    public static ArrayList B(@Y61.k Iterable iterable, @Y61.k Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Y61.k
    public static List B0(@Y61.k Iterable iterable, @Y61.k Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List listG = C42778w0.g(iterable);
            z0(listG, comparator);
            return listG;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return M0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    @Y61.k
    public static ArrayList C(@Y61.k Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @X41.i
    public static float C0(@Y61.k ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += ((Number) it.next()).floatValue();
        }
        return fFloatValue;
    }

    public static Object D(@Y61.k Iterable iterable) {
        if (iterable instanceof List) {
            return E((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @X41.i
    public static int D0(@Y61.k Iterable iterable) {
        Iterator it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    public static Object E(@Y61.k List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @Y61.k
    public static List E0(@Y61.k Iterable iterable, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested element count ", " is less than zero.").toString());
        }
        if (i12 == 0) {
            return C42784z0.f406748b;
        }
        if (iterable instanceof Collection) {
            if (i12 >= ((Collection) iterable).size()) {
                return M0(iterable);
            }
            if (i12 == 1) {
                return Collections.singletonList(D(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i12);
        Iterator it = iterable.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i13++;
            if (i13 == i12) {
                break;
            }
        }
        return C42751i0.a(arrayList);
    }

    @Y61.l
    public static Object F(@Y61.k Iterable iterable) {
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

    @Y61.k
    public static List F0(int i12, @Y61.k List list) {
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested element count ", " is less than zero.").toString());
        }
        if (i12 == 0) {
            return C42784z0.f406748b;
        }
        int size = list.size();
        if (i12 >= size) {
            return M0(list);
        }
        if (i12 == 1) {
            return Collections.singletonList(Q(list));
        }
        ArrayList arrayList = new ArrayList(i12);
        if (list instanceof RandomAccess) {
            for (int i13 = size - i12; i13 < size; i13++) {
                arrayList.add(list.get(i13));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i12);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    @Y61.l
    public static Object G(@Y61.k List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @kotlin.X
    @InterfaceC42733c0
    public static void G0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @Y61.k
    public static ArrayList H(@Y61.k Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }

    @kotlin.X
    @InterfaceC42733c0
    public static void H0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @Y61.k
    public static kotlin.ranges.l I(@Y61.k Collection collection) {
        return new kotlin.ranges.l(0, collection.size() - 1, 1);
    }

    @Y61.k
    public static void I0(@Y61.k Iterable iterable, @Y61.k AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int J(@Y61.k List list) {
        return list.size() - 1;
    }

    @Y61.k
    public static float[] J0(@Y61.k Collection collection) {
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            fArr[i12] = ((Number) it.next()).floatValue();
            i12++;
        }
        return fArr;
    }

    @Y61.l
    public static Object K(int i12, @Y61.k List list) {
        if (i12 < 0 || i12 >= list.size()) {
            return null;
        }
        return list.get(i12);
    }

    @Y61.k
    public static HashSet K0(@Y61.k Iterable iterable) {
        HashSet hashSet = new HashSet(P0.f(q(iterable, 12)));
        I0(iterable, hashSet);
        return hashSet;
    }

    public static int L(@Y61.k Iterable iterable, Object obj) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i12 = 0;
        for (Object obj2 : iterable) {
            if (i12 < 0) {
                H0();
                throw null;
            }
            if (kotlin.jvm.internal.L.f(obj, obj2)) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    @Y61.k
    public static int[] L0(@Y61.k Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            iArr[i12] = ((Number) it.next()).intValue();
            i12++;
        }
        return iArr;
    }

    @Y61.k
    public static LinkedHashSet M(@Y61.k Iterable iterable, @Y61.k Iterable iterable2) {
        LinkedHashSet linkedHashSetO0 = O0(iterable);
        linkedHashSetO0.retainAll(s(iterable2));
        return linkedHashSetO0;
    }

    @Y61.k
    public static List M0(@Y61.k Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return C42751i0.a(C42778w0.g(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C42784z0.f406748b;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static /* synthetic */ void N(Iterable iterable, Appendable appendable, String str, String str2, String str3, Y41.l lVar, int i12) {
        String str4 = (i12 & 4) != 0 ? "" : str2;
        String str5 = (i12 & 8) != 0 ? "" : str3;
        if ((i12 & 64) != 0) {
            lVar = null;
        }
        C42778w0.f(iterable, appendable, str, str4, str5, lVar);
    }

    @Y61.k
    public static ArrayList N0(@Y61.k Collection collection) {
        return new ArrayList(collection);
    }

    public static String O(Iterable iterable, String str, String str2, String str3, Y41.l lVar, int i12) {
        if ((i12 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i12 & 2) != 0 ? "" : str2;
        String str6 = (i12 & 4) != 0 ? "" : str3;
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        C42778w0.f(iterable, sb2, str4, str5, str6, lVar);
        return sb2.toString();
    }

    @Y61.k
    public static LinkedHashSet O0(@Y61.k Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        I0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Object P(@Y61.k Iterable iterable) {
        if (iterable instanceof List) {
            return Q((List) iterable);
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

    @Y61.k
    public static Set P0(@Y61.k Iterable iterable) {
        Set setSingleton;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return B0.f406639b;
            }
            if (size == 1) {
                return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(P0.f(collection.size()));
            I0(iterable, linkedHashSet);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        I0(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 == 0) {
            setSingleton = B0.f406639b;
        } else {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            setSingleton = Collections.singleton(linkedHashSet2.iterator().next());
        }
        return setSingleton;
    }

    public static Object Q(@Y61.k List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return androidx.media3.exoplayer.analytics.m.h(1, list);
    }

    @Y61.k
    public static TreeSet Q0(@Y61.k Iterable iterable) {
        TreeSet treeSet = new TreeSet();
        I0(iterable, treeSet);
        return treeSet;
    }

    @Y61.l
    public static Object R(@Y61.k Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return androidx.media3.exoplayer.analytics.m.h(1, list);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @InterfaceC42733c0
    @Y61.k
    public static ArrayList R0(@Y61.k Iterable iterable, int i12, int i13) {
        ArrayList arrayList;
        i1.a(i12, i13);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            arrayList = new ArrayList((size / i13) + (size % i13 == 0 ? 0 : 1));
            int i14 = 0;
            while (i14 >= 0 && i14 < size) {
                int i15 = size - i14;
                if (i12 <= i15) {
                    i15 = i12;
                }
                ArrayList arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 < i15; i16++) {
                    arrayList2.add(list.get(i16 + i14));
                }
                arrayList.add(arrayList2);
                i14 += i13;
            }
        } else {
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            Iterator itV = !it.hasNext() ? C42782y0.f406747b : C43033p.v(new g1(i12, i13, it, null));
            while (itV.hasNext()) {
                arrayList.add((List) itV.next());
            }
        }
        return arrayList;
    }

    @Y61.l
    public static Object S(@Y61.k List list) {
        if (list.isEmpty()) {
            return null;
        }
        return androidx.media3.exoplayer.analytics.m.h(1, list);
    }

    @Y61.k
    public static I0 S0(@Y61.k Iterable iterable) {
        return new I0(new C42776v0(iterable));
    }

    @Y61.k
    public static List T(Object obj) {
        return Collections.singletonList(obj);
    }

    @Y61.k
    public static ArrayList T0(@Y61.k Iterable iterable, @Y61.k Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(q(iterable, 10), q(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new kotlin.Q(it.next(), it2.next()));
        }
        return arrayList;
    }

    @Y61.k
    public static List U(@Y61.k Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : C42784z0.f406748b;
    }

    @Y61.k
    public static List V(@Y61.l Object obj) {
        return obj != null ? Collections.singletonList(obj) : C42784z0.f406748b;
    }

    @Y61.l
    @InterfaceC42733c0
    public static Comparable W(@Y61.k Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    @Y61.l
    @InterfaceC42733c0
    public static Float X(@Y61.k Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC42733c0
    @X41.i
    public static float Y(@Y61.k ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC42733c0
    @X41.i
    @Y61.k
    public static Comparable Z(@Y61.k Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    @Y61.l
    @InterfaceC42733c0
    public static Comparable a0(@Y61.k ArrayList arrayList) {
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

    @Y61.l
    @InterfaceC42733c0
    public static Float b0(@Y61.k Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @Y61.k
    public static ArrayList c0(@Y61.k Iterable iterable, Object obj) {
        ArrayList arrayList = new ArrayList(q(iterable, 10));
        boolean z12 = false;
        for (Object obj2 : iterable) {
            boolean z13 = true;
            if (!z12 && kotlin.jvm.internal.L.f(obj2, obj)) {
                z12 = true;
                z13 = false;
            }
            if (z13) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Y61.k
    public static List d0(@Y61.k Iterable iterable, @Y61.k Iterable iterable2) {
        Collection collectionS = s(iterable2);
        if (collectionS.isEmpty()) {
            return M0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionS.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Y61.k
    public static ArrayList e0(@Y61.k Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C42752j(true, objArr));
    }

    @Y61.k
    public static ArrayList f0(@Y61.k Iterable iterable, @Y61.k Iterable iterable2) {
        if (iterable instanceof Collection) {
            return h0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        h(iterable, arrayList);
        h(iterable2, arrayList);
        return arrayList;
    }

    @Y61.k
    public static ArrayList g0(@Y61.k Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return i0(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        h(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static void h(@Y61.k Iterable iterable, @Y61.k Collection collection) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    @Y61.k
    public static ArrayList h0(@Y61.k Iterable iterable, @Y61.k Collection collection) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            h(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static void i(@Y61.k Collection collection, @Y61.k Object[] objArr) {
        collection.addAll(Arrays.asList(objArr));
    }

    @Y61.k
    public static ArrayList i0(Object obj, @Y61.k Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    @Y61.k
    public static ArrayList j(@Y61.k Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C42752j(true, objArr));
    }

    @InterfaceC42733c0
    public static Object j0(@Y61.k Collection collection, @Y61.k f.a aVar) {
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Collection collection2 = collection;
        int size = collection.size();
        aVar.getClass();
        return y(kotlin.random.f.f406883c.k(size), collection2);
    }

    @Y61.k
    public static List k(@Y61.k List list) {
        return new Z0(list);
    }

    public static void k0(@Y61.k Iterable iterable, @Y61.k Y41.l lVar) {
        C42765p0.c(iterable, lVar, true);
    }

    @X41.i
    @Y61.k
    public static List l(@Y61.k List list) {
        return new Y0(list);
    }

    public static boolean l0(@Y61.k Y41.l lVar, @Y61.k List list) {
        int i12;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof Z41.a) && !(list instanceof Z41.c)) {
                kotlin.jvm.internal.v0.i(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                return C42765p0.c(list, lVar, true);
            } catch (ClassCastException e12) {
                kotlin.jvm.internal.L.i(e12, kotlin.jvm.internal.v0.class.getName());
                throw e12;
            }
        }
        int iJ2 = J(list);
        if (iJ2 >= 0) {
            int i13 = 0;
            i12 = 0;
            while (true) {
                Object obj = list.get(i13);
                if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                    if (i12 != i13) {
                        list.set(i12, obj);
                    }
                    i12++;
                }
                if (i13 == iJ2) {
                    break;
                }
                i13++;
            }
        } else {
            i12 = 0;
        }
        if (i12 >= list.size()) {
            return false;
        }
        int size = list.size() - 1;
        if (i12 > size) {
            return true;
        }
        while (true) {
            list.remove(size);
            if (size == i12) {
                return true;
            }
            size--;
        }
    }

    @X41.i
    public static double m(@Y61.k Iterable iterable) {
        Iterator it = iterable.iterator();
        double dLongValue = 0.0d;
        int i12 = 0;
        while (it.hasNext()) {
            dLongValue += ((Number) it.next()).longValue();
            i12++;
            if (i12 < 0) {
                G0();
                throw null;
            }
        }
        if (i12 == 0) {
            return Double.NaN;
        }
        return dLongValue / i12;
    }

    @InterfaceC42733c0
    public static Object m0(@Y61.k List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static int n(@Y61.k List list, int i12, @Y61.k Y41.l lVar) {
        C42751i0.b(list.size(), i12);
        int i13 = i12 - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            int iIntValue = ((Number) lVar.invoke(list.get(i15))).intValue();
            if (iIntValue < 0) {
                i14 = i15 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i15;
                }
                i13 = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    @InterfaceC42733c0
    public static Object n0(@Y61.k List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(list.size() - 1);
    }

    public static int o(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        C42751i0.b(arrayList.size(), size);
        int i12 = size - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int iB2 = kotlin.comparisons.a.b((Comparable) arrayList.get(i14), comparable);
            if (iB2 < 0) {
                i13 = i14 + 1;
            } else {
                if (iB2 <= 0) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    @Y61.l
    @InterfaceC42733c0
    public static Object o0(@Y61.k List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    @kotlin.X
    @InterfaceC42733c0
    @Y61.k
    public static kotlin.collections.builders.b p(@Y61.k List list) {
        kotlin.collections.builders.b bVar = (kotlin.collections.builders.b) list;
        bVar.g();
        bVar.f406669d = true;
        return bVar.f406668c > 0 ? bVar : kotlin.collections.builders.b.f406666e;
    }

    public static void p0(@Y61.k Iterable iterable, @Y61.k Y41.l lVar) {
        C42765p0.c(iterable, lVar, false);
    }

    @kotlin.X
    public static int q(@Y61.k Iterable iterable, int i12) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i12;
    }

    @Y61.k
    public static List q0(@Y61.k Iterable iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return M0(iterable);
        }
        List listG = C42778w0.g(iterable);
        Collections.reverse(listG);
        return listG;
    }

    public static boolean r(@Y61.k Iterable iterable, Object obj) {
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : L(iterable, obj) >= 0;
    }

    @InterfaceC42733c0
    @Y61.k
    public static List r0(@Y61.k Iterable iterable) {
        List listG = C42778w0.g(iterable);
        Collections.shuffle(listG);
        return listG;
    }

    @Y61.k
    public static Collection s(@Y61.k Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            iterable = M0(iterable);
        }
        return (Collection) iterable;
    }

    @InterfaceC42733c0
    @Y61.k
    public static List s0(@Y61.k ArrayList arrayList, @Y61.k SecureRandom secureRandom) {
        List listG = C42778w0.g(arrayList);
        Collections.shuffle(listG, secureRandom);
        return listG;
    }

    @kotlin.X
    @InterfaceC42733c0
    @Y61.k
    public static kotlin.collections.builders.b t() {
        return new kotlin.collections.builders.b(0, 1, null);
    }

    public static Object t0(@Y61.k Iterable iterable) {
        if (iterable instanceof List) {
            return u0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    @kotlin.X
    @InterfaceC42733c0
    @Y61.k
    public static kotlin.collections.builders.b u() {
        return new kotlin.collections.builders.b(2);
    }

    public static Object u0(@Y61.k List list) {
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @Y61.k
    public static List v(@Y61.k Iterable iterable) {
        return M0(O0(iterable));
    }

    @Y61.l
    public static Object v0(@Y61.k Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @Y61.k
    public static List w(@Y61.k Iterable iterable, int i12) {
        ArrayList arrayList;
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested element count ", " is less than zero.").toString());
        }
        if (i12 == 0) {
            return M0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i12;
            if (size <= 0) {
                return C42784z0.f406748b;
            }
            if (size == 1) {
                return Collections.singletonList(P(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i12 < size2) {
                        arrayList.add(((List) iterable).get(i12));
                        i12++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i12);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i13 = 0;
        for (Object obj : iterable) {
            if (i13 >= i12) {
                arrayList.add(obj);
            } else {
                i13++;
            }
        }
        return C42751i0.a(arrayList);
    }

    @Y61.l
    public static Object w0(@Y61.k List list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @Y61.k
    public static List x(@Y61.k List list) {
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return E0(list2, size);
    }

    @Y61.k
    public static List x0(@Y61.k List list, @Y61.k kotlin.ranges.l lVar) {
        if (lVar.isEmpty()) {
            return C42784z0.f406748b;
        }
        return M0(list.subList(lVar.f406905b, lVar.f406906c + 1));
    }

    public static Object y(int i12, @Y61.k Collection collection) {
        boolean z12 = collection instanceof List;
        if (z12) {
            return ((List) collection).get(i12);
        }
        C42772t0 c42772t0 = new C42772t0(i12);
        if (z12) {
            List list = (List) collection;
            if (i12 >= 0 && i12 < list.size()) {
                return list.get(i12);
            }
            c42772t0.invoke(Integer.valueOf(i12));
            throw null;
        }
        if (i12 < 0) {
            c42772t0.invoke(Integer.valueOf(i12));
            throw null;
        }
        int i13 = 0;
        for (Object obj : collection) {
            int i14 = i13 + 1;
            if (i12 == i13) {
                return obj;
            }
            i13 = i14;
        }
        c42772t0.invoke(Integer.valueOf(i12));
        throw null;
    }

    public static void y0(@Y61.k List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @Y61.k
    public static C42784z0 z() {
        return C42784z0.f406748b;
    }

    public static void z0(@Y61.k List list, @Y61.k Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
