package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.AbstractC37378n1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.r1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37401r1<E> extends AbstractC37378n1<E> implements List<E>, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final O4<Object> f359977c = new b(0, I3.f359390f);

    /* compiled from: ImmutableList.java */
    /* renamed from: com.google.common.collect.r1$a */
    public static final class a<E> extends AbstractC37378n1.a<E> {
        public a() {
            super(4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractC37378n1.a
        @InterfaceC19845a
        /* renamed from: b */
        public final AbstractC37378n1.a c(Object obj) {
            super.c(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractC37378n1.a
        @InterfaceC19845a
        public final AbstractC37378n1.b c(Object obj) {
            super.c(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC19845a
        public final void g(Object obj) {
            super.c(obj);
        }

        @InterfaceC19845a
        public final void h(Object... objArr) {
            int length = objArr.length;
            C37414t3.a(length, objArr);
            f(this.f359867b + length);
            System.arraycopy(objArr, 0, this.f359866a, this.f359867b, length);
            this.f359867b += length;
        }

        public final AbstractC37401r1<E> i() {
            this.f359868c = true;
            return AbstractC37401r1.r(this.f359867b, this.f359866a);
        }
    }

    /* compiled from: ImmutableList.java */
    /* renamed from: com.google.common.collect.r1$b */
    public static class b<E> extends AbstractC37310c<E> {

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC37401r1<E> f359978d;

        public b(int i12, AbstractC37401r1 abstractC37401r1) {
            super(abstractC37401r1.size(), i12);
            this.f359978d = abstractC37401r1;
        }

        @Override // com.google.common.collect.AbstractC37310c
        public final E a(int i12) {
            return this.f359978d.get(i12);
        }
    }

    /* compiled from: ImmutableList.java */
    /* renamed from: com.google.common.collect.r1$c */
    public static class c<E> extends AbstractC37401r1<E> {

        /* renamed from: d, reason: collision with root package name */
        public final transient AbstractC37401r1<E> f359979d;

        public c(AbstractC37401r1<E> abstractC37401r1) {
            this.f359979d = abstractC37401r1;
        }

        @Override // com.google.common.collect.AbstractC37401r1
        public final AbstractC37401r1<E> N() {
            return this.f359979d;
        }

        @Override // com.google.common.collect.AbstractC37401r1, java.util.List
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public final AbstractC37401r1<E> subList(int i12, int i13) {
            AbstractC37401r1<E> abstractC37401r1 = this.f359979d;
            com.google.common.base.M.l(i12, i13, abstractC37401r1.size());
            return abstractC37401r1.subList(abstractC37401r1.size() - i13, abstractC37401r1.size() - i12).N();
        }

        @Override // com.google.common.collect.AbstractC37401r1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            return this.f359979d.contains(obj);
        }

        @Override // java.util.List
        public final E get(int i12) {
            AbstractC37401r1<E> abstractC37401r1 = this.f359979d;
            com.google.common.base.M.i(i12, abstractC37401r1.size());
            return abstractC37401r1.get((abstractC37401r1.size() - 1) - i12);
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return this.f359979d.i();
        }

        @Override // com.google.common.collect.AbstractC37401r1, java.util.List
        public final int indexOf(@I41.a Object obj) {
            int iLastIndexOf = this.f359979d.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return (r0.size() - 1) - iLastIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.AbstractC37401r1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.AbstractC37401r1, java.util.List
        public final int lastIndexOf(@I41.a Object obj) {
            int iIndexOf = this.f359979d.indexOf(obj);
            if (iIndexOf >= 0) {
                return (r0.size() - 1) - iIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.AbstractC37401r1, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f359979d.size();
        }

        @Override // com.google.common.collect.AbstractC37401r1, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i12) {
            return listIterator(i12);
        }
    }

    /* compiled from: ImmutableList.java */
    @XY0.d
    /* renamed from: com.google.common.collect.r1$d */
    public static class d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f359980b;

        public d(Object[] objArr) {
            this.f359980b = objArr;
        }

        public Object readResolve() {
            return AbstractC37401r1.w(this.f359980b);
        }
    }

    /* compiled from: ImmutableList.java */
    /* renamed from: com.google.common.collect.r1$e */
    public class e extends AbstractC37401r1<E> {

        /* renamed from: d, reason: collision with root package name */
        public final transient int f359981d;

        /* renamed from: e, reason: collision with root package name */
        public final transient int f359982e;

        public e(int i12, int i13) {
            this.f359981d = i12;
            this.f359982e = i13;
        }

        @Override // com.google.common.collect.AbstractC37401r1, java.util.List
        /* renamed from: O */
        public final AbstractC37401r1<E> subList(int i12, int i13) {
            com.google.common.base.M.l(i12, i13, this.f359982e);
            int i14 = this.f359981d;
            return AbstractC37401r1.this.subList(i12 + i14, i13 + i14);
        }

        @Override // com.google.common.collect.AbstractC37378n1
        @I41.a
        public final Object[] e() {
            return AbstractC37401r1.this.e();
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final int g() {
            return AbstractC37401r1.this.h() + this.f359981d + this.f359982e;
        }

        @Override // java.util.List
        public final E get(int i12) {
            com.google.common.base.M.i(i12, this.f359982e);
            return AbstractC37401r1.this.get(i12 + this.f359981d);
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final int h() {
            return AbstractC37401r1.this.h() + this.f359981d;
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.AbstractC37401r1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.AbstractC37401r1, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f359982e;
        }

        @Override // com.google.common.collect.AbstractC37401r1, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i12) {
            return listIterator(i12);
        }
    }

    public static <E> AbstractC37401r1<E> C() {
        return (AbstractC37401r1<E>) I3.f359390f;
    }

    public static <E> AbstractC37401r1<E> E(E e12) {
        Object[] objArr = {e12};
        C37414t3.a(1, objArr);
        return r(1, objArr);
    }

    public static <E> AbstractC37401r1<E> I(E e12, E e13) {
        Object[] objArr = {e12, e13};
        C37414t3.a(2, objArr);
        return r(2, objArr);
    }

    public static <E> AbstractC37401r1<E> K(E e12, E e13, E e14, E e15, E e16) {
        Object[] objArr = {e12, e13, e14, e15, e16};
        C37414t3.a(5, objArr);
        return r(5, objArr);
    }

    public static AbstractC37401r1 r(int i12, Object[] objArr) {
        return i12 == 0 ? I3.f359390f : new I3(objArr, i12);
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> a<E> s() {
        return new a<>();
    }

    public static <E> AbstractC37401r1<E> t(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return v((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return (AbstractC37401r1<E>) I3.f359390f;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return E(next);
        }
        a aVar = new a();
        aVar.g(next);
        while (it.hasNext()) {
            aVar.c(it.next());
        }
        return aVar.i();
    }

    public static <E> AbstractC37401r1<E> v(Collection<? extends E> collection) {
        if (!(collection instanceof AbstractC37378n1)) {
            Object[] array = collection.toArray();
            C37414t3.a(array.length, array);
            return r(array.length, array);
        }
        AbstractC37401r1<E> abstractC37401r1B = ((AbstractC37378n1) collection).b();
        if (!abstractC37401r1B.i()) {
            return abstractC37401r1B;
        }
        Object[] array2 = abstractC37401r1B.toArray(AbstractC37378n1.f359865b);
        return r(array2.length, array2);
    }

    public static <E> AbstractC37401r1<E> w(E[] eArr) {
        if (eArr.length == 0) {
            return (AbstractC37401r1<E>) I3.f359390f;
        }
        Object[] objArr = (Object[]) eArr.clone();
        C37414t3.a(objArr.length, objArr);
        return r(objArr.length, objArr);
    }

    public AbstractC37401r1<E> N() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* renamed from: O */
    public AbstractC37401r1<E> subList(int i12, int i13) {
        com.google.common.base.M.l(i12, i13, size());
        int i14 = i13 - i12;
        return i14 == size() ? this : i14 == 0 ? (AbstractC37401r1<E>) I3.f359390f : new e(i12, i14);
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

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@I41.a Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public int d(int i12, Object[] objArr) {
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i12 + i13] = get(i13);
        }
        return i12 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i12 = 0; i12 < size; i12++) {
                        if (com.google.common.base.F.a(get(i12), list.get(i12))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && com.google.common.base.F.a(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
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
    public int indexOf(@I41.a Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (obj.equals(get(i12))) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    /* renamed from: l */
    public final N4<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(@I41.a Object obj) {
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

    @Override // com.google.common.collect.AbstractC37378n1
    @XY0.d
    public Object writeReplace() {
        return new d(toArray(AbstractC37378n1.f359865b));
    }

    @Override // java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public O4<E> listIterator(int i12) {
        com.google.common.base.M.k(i12, size());
        return isEmpty() ? (O4<E>) f359977c : new b(i12, this);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    @aZ0.l
    @Deprecated
    public final AbstractC37401r1<E> b() {
        return this;
    }
}
