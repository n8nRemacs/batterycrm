package com.yandex.mobile.ads.embedded.guava.collect;

import aZ0.InterfaceC19845a;
import com.yandex.mobile.ads.embedded.guava.collect.n;
import com.yandex.mobile.ads.impl.ba;
import com.yandex.mobile.ads.impl.iu0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
public abstract class p<E> extends n<E> implements List<E>, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final q0<Object> f382790b = new b(0, f0.f382745f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f382791c = 0;

    public static final class a<E> extends n.a<E> {
        public a() {
            this(0);
        }

        public final p<E> a() {
            this.f382785c = true;
            return p.b(this.f382784b, this.f382783a);
        }

        @InterfaceC19845a
        public final void b(Object obj) {
            a(obj);
        }

        public a(int i12) {
        }

        @InterfaceC19845a
        public final a b(List list) {
            a(list);
            return this;
        }
    }

    public static class b<E> extends com.yandex.mobile.ads.embedded.guava.collect.a<E> {

        /* renamed from: c, reason: collision with root package name */
        private final p<E> f382792c;

        public b(int i12, p pVar) {
            super(pVar.size(), i12);
            this.f382792c = pVar;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.a
        public final E a(int i12) {
            return this.f382792c.get(i12);
        }
    }

    public static class c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        final Object[] f382793a;

        public c(Object[] objArr) {
            this.f382793a = objArr;
        }

        public Object readResolve() {
            return p.b(this.f382793a);
        }
    }

    public class d extends p<E> {

        /* renamed from: d, reason: collision with root package name */
        final transient int f382794d;

        /* renamed from: e, reason: collision with root package name */
        final transient int f382795e;

        public d(int i12, int i13) {
            this.f382794d = i12;
            this.f382795e = i13;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.p, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p<E> subList(int i12, int i13) {
            iu0.a(i12, i13, this.f382795e);
            p pVar = p.this;
            int i14 = this.f382794d;
            return pVar.subList(i12 + i14, i13 + i14);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        @I41.a
        public final Object[] c() {
            return p.this.c();
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final int d() {
            return p.this.e() + this.f382794d + this.f382795e;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final int e() {
            return p.this.e() + this.f382794d;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final E get(int i12) {
            iu0.a(i12, this.f382795e);
            return p.this.get(i12 + this.f382794d);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.p, com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.p, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f382795e;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.p, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i12) {
            return listIterator(i12);
        }
    }

    public static <E> p<E> a(E e12) {
        return a(e12);
    }

    public static <E> a<E> h() {
        return new a<>();
    }

    public static <E> p<E> i() {
        return (p<E>) f0.f382745f;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    @aZ0.e
    @Deprecated
    public final void add(int i12, E e12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final boolean addAll(int i12, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    @aZ0.l
    @Deprecated
    public final p<E> b() {
        return this;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@I41.a Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@I41.a Object obj) {
        return v.a(this, obj);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    /* renamed from: g */
    public final p0<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i12 = 1;
        for (int i13 = 0; i13 < size; i13++) {
            i12 = ~(~(get(i13).hashCode() + (i12 * 31)));
        }
        return i12;
    }

    @Override // java.util.List
    public final int indexOf(@I41.a Object obj) {
        if (obj != null) {
            int size = size();
            for (int i12 = 0; i12 < size; i12++) {
                if (obj.equals(get(i12))) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@I41.a Object obj) {
        if (obj != null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (obj.equals(get(size))) {
                    return size;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final E remove(int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final E set(int i12, E e12) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public Object writeReplace() {
        return new c(toArray());
    }

    public static <E> p<E> a(E e12, E e13) {
        return a(e12, e13);
    }

    public static p b(int i12, Object[] objArr) {
        return i12 == 0 ? f0.f382745f : new f0(i12, objArr);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public static p a(Long l12, Long l13, Long l14, Long l15, Long l16) {
        return a(l12, l13, l14, l15, l16);
    }

    private static <E> p<E> a(Object... objArr) {
        int length = objArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (objArr[i12] == null) {
                throw new NullPointerException(ba.a("at index ", i12));
            }
        }
        return b(objArr.length, objArr);
    }

    public static <E> p<E> b(E[] eArr) {
        if (eArr.length == 0) {
            return (p<E>) f0.f382745f;
        }
        return a((Object[]) eArr.clone());
    }

    public static <E> p<E> a(Collection<? extends E> collection) {
        if (collection instanceof n) {
            p<E> pVarB = ((n) collection).b();
            if (!pVarB.f()) {
                return pVarB;
            }
            Object[] array = pVarB.toArray();
            return b(array.length, array);
        }
        return a(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q0<E> listIterator(int i12) {
        iu0.b(i12, size());
        if (isEmpty()) {
            return (q0<E>) f382790b;
        }
        return new b(i12, this);
    }

    @Override // java.util.List
    /* renamed from: a */
    public p<E> subList(int i12, int i13) {
        iu0.a(i12, i13, size());
        int i14 = i13 - i12;
        if (i14 == size()) {
            return this;
        }
        if (i14 == 0) {
            return (p<E>) f0.f382745f;
        }
        return new d(i12, i14);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public int a(int i12, Object[] objArr) {
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i12 + i13] = get(i13);
        }
        return i12 + size;
    }
}
