package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.base.InterfaceC37276u;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: Iterables.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public final class W1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.java */
    public class a<T> extends AbstractC37431x0<T> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterable f359587c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.google.common.base.N f359588d;

        public a(Iterable iterable, com.google.common.base.N n12) {
            this.f359587c = iterable;
            this.f359588d = n12;
        }

        @Override // java.lang.Iterable
        public final Iterator<T> iterator() {
            return C37325e2.e(this.f359587c.iterator(), this.f359588d);
        }
    }

    /* compiled from: Iterables.java */
    public static final class b<T> extends AbstractC37431x0<T> {

        /* renamed from: c, reason: collision with root package name */
        public final Iterable<? extends T> f359589c;

        public b() {
            throw null;
        }

        public b(Iterable iterable, T1 t12) {
            this.f359589c = iterable;
        }

        @Override // java.lang.Iterable
        public final Iterator<T> iterator() {
            return C37325e2.n(this.f359589c.iterator());
        }

        @Override // com.google.common.collect.AbstractC37431x0
        public final String toString() {
            return this.f359589c.toString();
        }
    }

    @InterfaceC19845a
    public static boolean a(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        iterable.getClass();
        return C37325e2.a(collection, iterable.iterator());
    }

    public static <T> boolean b(Iterable<T> iterable, com.google.common.base.N<? super T> n12) {
        Iterator<T> it = iterable.iterator();
        com.google.common.base.M.j(n12, "predicate");
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (n12.apply(it.next())) {
                break;
            }
            i12++;
        }
        return i12 != -1;
    }

    public static <T> Iterable<T> c(Iterable<T> iterable, com.google.common.base.N<? super T> n12) {
        iterable.getClass();
        n12.getClass();
        return new a(iterable, n12);
    }

    @InterfaceC37434x3
    public static <T> T d(Iterable<T> iterable) {
        T next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (T) androidx.media3.exoplayer.analytics.m.h(1, list);
        }
        Iterator<T> it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @I41.a
    public static <T> T e(Iterable<T> iterable, com.google.common.base.N<? super T> n12) {
        n12.getClass();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (n12.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    @InterfaceC19845a
    public static <T> boolean f(Iterable<T> iterable, com.google.common.base.N<? super T> n12) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator<T> it = iterable.iterator();
            n12.getClass();
            while (it.hasNext()) {
                if (n12.apply(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        List list = (List) iterable;
        n12.getClass();
        int i12 = 0;
        int i13 = 0;
        while (i12 < list.size()) {
            A00.b bVar = (Object) list.get(i12);
            if (!n12.apply(bVar)) {
                if (i12 > i13) {
                    try {
                        list.set(i13, bVar);
                    } catch (IllegalArgumentException unused) {
                        g(list, n12, i13, i12);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        g(list, n12, i13, i12);
                        return true;
                    }
                }
                i13++;
            }
            i12++;
        }
        list.subList(i13, list.size()).clear();
        return i12 != i13;
    }

    public static <T> void g(List<T> list, com.google.common.base.N<? super T> n12, int i12, int i13) {
        for (int size = list.size() - 1; size > i13; size--) {
            if (n12.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i14 = i13 - 1; i14 >= i12; i14--) {
            list.remove(i14);
        }
    }

    public static Iterable h(Collection collection, InterfaceC37276u interfaceC37276u) {
        collection.getClass();
        return new X1(collection, interfaceC37276u);
    }
}
