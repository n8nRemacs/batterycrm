package net.bytebuddy.matcher;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.matcher.z;

/* compiled from: FilterableList.java */
/* loaded from: classes7.dex */
public interface z<T, S extends z<T, S>> extends List<T> {

    /* compiled from: FilterableList.java */
    public static abstract class a<T, S extends z<T, S>> extends AbstractList<T> implements z<T, S> {
        @Override // net.bytebuddy.matcher.z
        public final T M2() {
            if (size() == 1) {
                return get(0);
            }
            throw new IllegalStateException("size = " + size());
        }

        @Override // net.bytebuddy.matcher.z
        public final S P1(InterfaceC44410t<? super T> interfaceC44410t) {
            ArrayList arrayList = new ArrayList(size());
            Iterator it = iterator();
            while (it.hasNext()) {
                A00.b bVar = (Object) it.next();
                if (interfaceC44410t.b(bVar)) {
                    arrayList.add(bVar);
                }
            }
            return arrayList.size() == size() ? this : (S) a(arrayList);
        }

        public abstract S a(List<T> list);

        @Override // java.util.AbstractList, java.util.List
        public final S subList(int i12, int i13) {
            return (S) a(super.subList(i12, i13));
        }
    }

    /* compiled from: FilterableList.java */
    public static class b<T, S extends z<T, S>> extends AbstractList<T> implements z<T, S> {
        @Override // net.bytebuddy.matcher.z
        public final T M2() {
            throw new IllegalStateException("size = 0");
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i12) {
            throw new IndexOutOfBoundsException(AK.c.g(i12, "index = "));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final /* bridge */ /* synthetic */ List subList(int i12, int i13) {
            subList(i12, i13);
            return this;
        }

        @Override // java.util.AbstractList, java.util.List, net.bytebuddy.matcher.z
        public final S subList(int i12, int i13) {
            if (i12 == i13 && i13 == 0) {
                return this;
            }
            if (i12 > i13) {
                throw new IllegalArgumentException(androidx.appcompat.app.r.l(i12, i13, "fromIndex(", ") > toIndex(", ")"));
            }
            throw new IndexOutOfBoundsException(AK.c.g(i12, "fromIndex = "));
        }

        @Override // net.bytebuddy.matcher.z
        public final S P1(InterfaceC44410t<? super T> interfaceC44410t) {
            return this;
        }
    }

    T M2();

    S P1(InterfaceC44410t<? super T> interfaceC44410t);

    @Override // java.util.List
    S subList(int i12, int i13);
}
