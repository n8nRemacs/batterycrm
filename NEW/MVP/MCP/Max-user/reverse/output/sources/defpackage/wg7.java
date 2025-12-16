package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class wg7 extends ng7 implements List, RandomAccess {
    public static final t76 b = new t76(zjd.o, 0);

    public static zjd h(int i, Object[] objArr) {
        return i == 0 ? zjd.o : new zjd(i, objArr);
    }

    public static tg7 i() {
        return new tg7(4);
    }

    public static wg7 j(Collection collection) {
        if (!(collection instanceof ng7)) {
            Object[] array = collection.toArray();
            pyi.a(array.length, array);
            return h(array.length, array);
        }
        wg7 wg7VarA = ((ng7) collection).a();
        if (!wg7VarA.f()) {
            return wg7VarA;
        }
        Object[] array2 = wg7VarA.toArray(ng7.a);
        return h(array2.length, array2);
    }

    public static zjd k(Object[] objArr) {
        if (objArr.length == 0) {
            return zjd.o;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        pyi.a(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static zjd m(Object obj) {
        Object[] objArr = {obj};
        pyi.a(1, objArr);
        return h(1, objArr);
    }

    public static zjd n(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        pyi.a(2, objArr);
        return h(2, objArr);
    }

    public static zjd o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        pyi.a(5, objArr);
        return h(5, objArr);
    }

    public static zjd p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        u5j.c("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        pyi.a(length, objArr2);
        return h(length, objArr2);
    }

    public static zjd q(String str, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, str2, str3, str4, str5, str6};
        pyi.a(6, objArr);
        return h(6, objArr);
    }

    public static zjd r(Comparator comparator, List list) {
        comparator.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        pyi.a(array.length, array);
        Arrays.sort(array, comparator);
        return h(array.length, array);
    }

    @Override // defpackage.ng7
    public final wg7 a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ng7
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.ng7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && uyi.c(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (uyi.c(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ng7
    /* renamed from: g */
    public final rrg iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ng7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final t76 listIterator(int i) {
        u5j.f(i, size());
        return isEmpty() ? b : new t76(this, i);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public wg7 subList(int i, int i2) {
        u5j.g(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zjd.o : new vg7(this, i, i3);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
