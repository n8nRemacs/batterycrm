package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: Lists.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.v2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37423v2 {

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$a */
    public static class a<E> extends AbstractList<E> {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i12, @InterfaceC37434x3 E e12) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i12, Collection<? extends E> collection) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@I41.a Object obj) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC37434x3
        public final E get(int i12) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC37434x3
        public final E remove(int i12) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC37434x3
        public final E set(int i12, @InterfaceC37434x3 E e12) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$b */
    public static final class b extends AbstractList<Character> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$c */
    public static class c<E> extends AbstractList<E> implements Serializable, RandomAccess {

        @XY0.d
        private static final long serialVersionUID = 0;

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC37434x3
        public final E get(int i12) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$d */
    public static class d<T> extends AbstractList<List<T>> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$e */
    public static class e<E> extends a<E> implements RandomAccess {
    }

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$f */
    public static class f<T> extends d<T> implements RandomAccess {
    }

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$g */
    public static class g<T> extends h<T> implements RandomAccess {
        public g() {
            throw null;
        }
    }

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$h */
    public static class h<T> extends AbstractList<T> {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f360026c = 0;

        /* renamed from: b, reason: collision with root package name */
        public final List<T> f360027b;

        /* compiled from: Lists.java */
        /* renamed from: com.google.common.collect.v2$h$a */
        public class a implements ListIterator<T> {

            /* renamed from: b, reason: collision with root package name */
            public boolean f360028b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ListIterator f360029c;

            public a(ListIterator listIterator) {
                this.f360029c = listIterator;
            }

            @Override // java.util.ListIterator
            public final void add(@InterfaceC37434x3 T t12) {
                ListIterator listIterator = this.f360029c;
                listIterator.add(t12);
                listIterator.previous();
                this.f360028b = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f360029c.hasPrevious();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f360029c.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            @InterfaceC37434x3
            public final T next() {
                ListIterator listIterator = this.f360029c;
                if (!listIterator.hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f360028b = true;
                return (T) listIterator.previous();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                int iNextIndex = this.f360029c.nextIndex();
                int i12 = h.f360026c;
                return h.this.a(iNextIndex);
            }

            @Override // java.util.ListIterator
            @InterfaceC37434x3
            public final T previous() {
                ListIterator listIterator = this.f360029c;
                if (!listIterator.hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f360028b = true;
                return (T) listIterator.next();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                F.e(this.f360028b);
                this.f360029c.remove();
                this.f360028b = false;
            }

            @Override // java.util.ListIterator
            public final void set(@InterfaceC37434x3 T t12) {
                com.google.common.base.M.q(this.f360028b);
                this.f360029c.set(t12);
            }
        }

        public h(List<T> list) {
            list.getClass();
            this.f360027b = list;
        }

        public final int a(int i12) {
            int size = this.f360027b.size();
            com.google.common.base.M.k(i12, size);
            return size - i12;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i12, @InterfaceC37434x3 T t12) {
            this.f360027b.add(a(i12), t12);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            this.f360027b.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC37434x3
        public final T get(int i12) {
            List<T> list = this.f360027b;
            int size = list.size();
            com.google.common.base.M.i(i12, size);
            return list.get((size - 1) - i12);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i12) {
            return new a(this.f360027b.listIterator(a(i12)));
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC37434x3
        public final T remove(int i12) {
            List<T> list = this.f360027b;
            int size = list.size();
            com.google.common.base.M.i(i12, size);
            return list.remove((size - 1) - i12);
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i12, int i13) {
            subList(i12, i13).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC37434x3
        public final T set(int i12, @InterfaceC37434x3 T t12) {
            List<T> list = this.f360027b;
            int size = list.size();
            com.google.common.base.M.i(i12, size);
            return list.set((size - 1) - i12, t12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f360027b.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<T> subList(int i12, int i13) {
            List<T> list = this.f360027b;
            com.google.common.base.M.l(i12, i13, list.size());
            List<T> listSubList = list.subList(a(i13), a(i12));
            if (listSubList instanceof AbstractC37401r1) {
                return ((AbstractC37401r1) listSubList).N();
            }
            if (listSubList instanceof h) {
                return ((h) listSubList).f360027b;
            }
            return listSubList instanceof RandomAccess ? new g<>(listSubList) : new h<>(listSubList);
        }
    }

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$i */
    public static final class i extends AbstractC37401r1<Character> {

        /* renamed from: d, reason: collision with root package name */
        public final String f360031d;

        public i(String str) {
            this.f360031d = str;
        }

        @Override // com.google.common.collect.AbstractC37401r1, java.util.List
        /* renamed from: O */
        public final AbstractC37401r1<Character> subList(int i12, int i13) {
            String str = this.f360031d;
            com.google.common.base.M.l(i12, i13, str.length());
            String strSubstring = str.substring(i12, i13);
            strSubstring.getClass();
            return new i(strSubstring);
        }

        @Override // java.util.List
        public final Object get(int i12) {
            String str = this.f360031d;
            com.google.common.base.M.i(i12, str.length());
            return Character.valueOf(str.charAt(i12));
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return false;
        }

        @Override // com.google.common.collect.AbstractC37401r1, java.util.List
        public final int indexOf(@I41.a Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return this.f360031d.indexOf(((Character) obj).charValue());
        }

        @Override // com.google.common.collect.AbstractC37401r1, java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return this.f360031d.lastIndexOf(((Character) obj).charValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f360031d.length();
        }
    }

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$j */
    public static class j<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final List<F> f360032b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC37276u<? super F, ? extends T> f360033c;

        /* compiled from: Lists.java */
        /* renamed from: com.google.common.collect.v2$j$a */
        public class a extends A4<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.z4
            public final T a(F f12) {
                return j.this.f360033c.apply(f12);
            }
        }

        public j(List<F> list, InterfaceC37276u<? super F, ? extends T> interfaceC37276u) {
            list.getClass();
            this.f360032b = list;
            interfaceC37276u.getClass();
            this.f360033c = interfaceC37276u;
        }

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC37434x3
        public final T get(int i12) {
            return this.f360033c.apply(this.f360032b.get(i12));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.f360032b.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i12) {
            return new a(this.f360032b.listIterator(i12));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i12) {
            return this.f360033c.apply(this.f360032b.remove(i12));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i12, int i13) {
            this.f360032b.subList(i12, i13).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f360032b.size();
        }
    }

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$k */
    public static class k<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final List<F> f360035b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC37276u<? super F, ? extends T> f360036c;

        /* compiled from: Lists.java */
        /* renamed from: com.google.common.collect.v2$k$a */
        public class a extends A4<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.z4
            @InterfaceC37434x3
            public final T a(@InterfaceC37434x3 F f12) {
                return k.this.f360036c.apply(f12);
            }
        }

        public k(List<F> list, InterfaceC37276u<? super F, ? extends T> interfaceC37276u) {
            list.getClass();
            this.f360035b = list;
            interfaceC37276u.getClass();
            this.f360036c = interfaceC37276u;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i12) {
            return new a(this.f360035b.listIterator(i12));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i12, int i13) {
            this.f360035b.subList(i12, i13).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f360035b.size();
        }
    }

    /* compiled from: Lists.java */
    /* renamed from: com.google.common.collect.v2$l */
    public static class l<E> extends AbstractList<E> implements Serializable, RandomAccess {

        @XY0.d
        private static final long serialVersionUID = 0;

        @Override // java.util.AbstractList, java.util.List
        @InterfaceC37434x3
        public final E get(int i12) {
            if (i12 == 0 || i12 == 1) {
                return null;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    @XY0.e
    public static int a(int i12) {
        F.b(i12, "arraySize");
        return com.google.common.primitives.l.f(i12 + 5 + (i12 / 10));
    }

    @XY0.b
    public static <E> ArrayList<E> b(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        C37325e2.a(arrayList, it);
        return arrayList;
    }

    @XY0.b
    public static <E> ArrayList<E> c(int i12) {
        F.b(i12, "initialArraySize");
        return new ArrayList<>(i12);
    }

    public static AbstractList d(List list, InterfaceC37276u interfaceC37276u) {
        return list instanceof RandomAccess ? new j(list, interfaceC37276u) : new k(list, interfaceC37276u);
    }
}
