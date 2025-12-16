package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.AbstractC37316d;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Iterators.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.e2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37325e2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    /* renamed from: com.google.common.collect.e2$a */
    public class a<T> extends N4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterator f359705b;

        public a(Iterator it) {
            this.f359705b = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359705b.hasNext();
        }

        @Override // java.util.Iterator
        @InterfaceC37434x3
        public final T next() {
            return (T) this.f359705b.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    /* renamed from: com.google.common.collect.e2$b */
    public class b<T> extends AbstractC37316d<T> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Iterator f359706d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.google.common.base.N f359707e;

        public b(Iterator it, com.google.common.base.N n12) {
            this.f359706d = it;
            this.f359707e = n12;
        }

        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final T a() {
            T t12;
            do {
                Iterator it = this.f359706d;
                if (!it.hasNext()) {
                    this.f359661b = AbstractC37316d.b.f359666d;
                    return null;
                }
                t12 = (T) it.next();
            } while (!this.f359707e.apply(t12));
            return t12;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* compiled from: Iterators.java */
    /* renamed from: com.google.common.collect.e2$c */
    public class c<F, T> extends z4<F, T> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC37276u f359708c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Iterator it, InterfaceC37276u interfaceC37276u) {
            super(it);
            this.f359708c = interfaceC37276u;
        }

        @Override // com.google.common.collect.z4
        @InterfaceC37434x3
        public final T a(@InterfaceC37434x3 F f12) {
            return (T) this.f359708c.apply(f12);
        }
    }

    /* compiled from: Iterators.java */
    /* renamed from: com.google.common.collect.e2$d */
    public static final class d<T> extends AbstractC37310c<T> {

        /* renamed from: e, reason: collision with root package name */
        public static final O4<Object> f359709e = new d(new Object[0], 0);

        /* renamed from: d, reason: collision with root package name */
        public final T[] f359710d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object[] objArr, int i12) {
            super(i12, 0);
            this.f359710d = objArr;
        }

        @Override // com.google.common.collect.AbstractC37310c
        @InterfaceC37434x3
        public final T a(int i12) {
            return this.f359710d[i12];
        }
    }

    /* compiled from: Iterators.java */
    /* renamed from: com.google.common.collect.e2$e */
    public static class e<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        @I41.a
        public Iterator<? extends T> f359711b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<? extends T> f359712c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public Iterator<? extends Iterator<? extends T>> f359713d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public ArrayDeque f359714e;

        public e() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<? extends Iterator<? extends T>> it;
            while (true) {
                Iterator<? extends T> it2 = this.f359712c;
                it2.getClass();
                if (it2.hasNext()) {
                    return true;
                }
                while (true) {
                    Iterator<? extends Iterator<? extends T>> it3 = this.f359713d;
                    if (it3 != null && it3.hasNext()) {
                        it = this.f359713d;
                        break;
                    }
                    ArrayDeque arrayDeque = this.f359714e;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        break;
                    }
                    this.f359713d = (Iterator) this.f359714e.removeFirst();
                }
                it = null;
                this.f359713d = it;
                if (it == null) {
                    return false;
                }
                Iterator<? extends T> next = it.next();
                this.f359712c = next;
                if (next instanceof e) {
                    e eVar = (e) next;
                    this.f359712c = eVar.f359712c;
                    if (this.f359714e == null) {
                        this.f359714e = new ArrayDeque();
                    }
                    this.f359714e.addFirst(this.f359713d);
                    if (eVar.f359714e != null) {
                        while (!eVar.f359714e.isEmpty()) {
                            this.f359714e.addFirst((Iterator) eVar.f359714e.removeLast());
                        }
                    }
                    this.f359713d = eVar.f359713d;
                }
            }
        }

        @Override // java.util.Iterator
        @InterfaceC37434x3
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f359712c;
            this.f359711b = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Iterator<? extends T> it = this.f359711b;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f359711b = null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Iterators.java */
    /* renamed from: com.google.common.collect.e2$f */
    public static final class f implements Iterator<Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f359715b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ f[] f359716c;

        static {
            f fVar = new f("INSTANCE", 0);
            f359715b = fVar;
            f359716c = new f[]{fVar};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f359716c.clone();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            F.e(false);
        }
    }

    /* compiled from: Iterators.java */
    /* renamed from: com.google.common.collect.e2$g */
    public static class g<T> extends N4<T> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        @InterfaceC37434x3
        public final T next() {
            throw null;
        }
    }

    /* compiled from: Iterators.java */
    /* renamed from: com.google.common.collect.e2$h */
    public static class h<E> implements InterfaceC37449y3<E> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<? extends E> f359717b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f359718c;

        /* renamed from: d, reason: collision with root package name */
        @I41.a
        public E f359719d;

        public h(Iterator<? extends E> it) {
            it.getClass();
            this.f359717b = it;
        }

        @InterfaceC37434x3
        public final E a() {
            if (!this.f359718c) {
                this.f359719d = this.f359717b.next();
                this.f359718c = true;
            }
            return this.f359719d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359718c || this.f359717b.hasNext();
        }

        @Override // java.util.Iterator
        @InterfaceC37434x3
        public final E next() {
            if (!this.f359718c) {
                return this.f359717b.next();
            }
            E e12 = this.f359719d;
            this.f359718c = false;
            this.f359719d = null;
            return e12;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.base.M.n("Can't remove after you've peeked at next", !this.f359718c);
            this.f359717b.remove();
        }
    }

    @InterfaceC19845a
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static void b(Iterator<?> it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> c(Iterator<? extends T> it, Iterator<? extends T> it2) {
        C37337g2 c37337g2 = new C37337g2(new Iterator[]{it, it2});
        e eVar = new e();
        eVar.f359712c = d.f359709e;
        eVar.f359713d = c37337g2;
        return eVar;
    }

    public static boolean d(Iterator<?> it, @I41.a Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> N4<T> e(Iterator<T> it, com.google.common.base.N<? super T> n12) {
        it.getClass();
        n12.getClass();
        return new b(it, n12);
    }

    @I41.a
    public static Object f(Iterator it, com.google.common.base.N n12) {
        it.getClass();
        n12.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (n12.apply(next)) {
                return next;
            }
        }
        return null;
    }

    @SafeVarargs
    public static <T> N4<T> g(T... tArr) {
        int length = tArr.length;
        com.google.common.base.M.g(length >= 0);
        com.google.common.base.M.l(0, length, tArr.length);
        com.google.common.base.M.k(0, length);
        return length == 0 ? d.f359709e : new d(tArr, length);
    }

    @InterfaceC37434x3
    public static Object h(Iterator it, @InterfaceC37434x3 String str) {
        return it.hasNext() ? it.next() : str;
    }

    public static <T> InterfaceC37449y3<T> i(Iterator<? extends T> it) {
        return it instanceof h ? (h) it : new h(it);
    }

    @I41.a
    public static <T> T j(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @InterfaceC19845a
    public static boolean k(Collection collection, Iterator it) {
        collection.getClass();
        boolean z12 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }

    public static int l(Iterator<?> it) {
        long j12 = 0;
        while (it.hasNext()) {
            it.next();
            j12++;
        }
        return com.google.common.primitives.l.f(j12);
    }

    public static <F, T> Iterator<T> m(Iterator<F> it, InterfaceC37276u<? super F, ? extends T> interfaceC37276u) {
        interfaceC37276u.getClass();
        return new c(it, interfaceC37276u);
    }

    public static <T> N4<T> n(Iterator<? extends T> it) {
        it.getClass();
        return it instanceof N4 ? (N4) it : new a(it);
    }
}
