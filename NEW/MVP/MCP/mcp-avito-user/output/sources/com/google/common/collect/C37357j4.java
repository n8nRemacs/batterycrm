package com.google.common.collect;

import com.google.common.collect.C37374m3;
import com.google.common.collect.InterfaceC37338g3;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: SortedMultisets.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.j4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37357j4 {

    /* compiled from: SortedMultisets.java */
    /* renamed from: com.google.common.collect.j4$a */
    public static class a<E> extends C37374m3.c<E> implements SortedSet<E> {

        /* renamed from: b, reason: collision with root package name */
        @Weak
        public final InterfaceC37345h4<E> f359806b;

        public a(InterfaceC37345h4<E> interfaceC37345h4) {
            this.f359806b = interfaceC37345h4;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return this.f359806b.comparator();
        }

        @Override // com.google.common.collect.C37374m3.c
        public final InterfaceC37338g3 e() {
            return this.f359806b;
        }

        @Override // java.util.SortedSet
        @InterfaceC37434x3
        public final E first() {
            InterfaceC37338g3.a<E> aVarFirstEntry = this.f359806b.firstEntry();
            if (aVarFirstEntry != null) {
                return aVarFirstEntry.a();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(@InterfaceC37434x3 E e12) {
            return this.f359806b.l1(e12, BoundType.f359276b).k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<E> iterator() {
            return new C37368l3(this.f359806b.entrySet().iterator());
        }

        @Override // java.util.SortedSet
        @InterfaceC37434x3
        public final E last() {
            InterfaceC37338g3.a<E> aVarLastEntry = this.f359806b.lastEntry();
            if (aVarLastEntry != null) {
                return aVarLastEntry.a();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(@InterfaceC37434x3 E e12, @InterfaceC37434x3 E e13) {
            return this.f359806b.C2(e12, BoundType.f359277c, e13, BoundType.f359276b).k();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(@InterfaceC37434x3 E e12) {
            return this.f359806b.V5(e12, BoundType.f359277c).k();
        }
    }

    /* compiled from: SortedMultisets.java */
    @XY0.c
    /* renamed from: com.google.common.collect.j4$b */
    public static class b<E> extends a<E> implements NavigableSet<E> {
        public b() {
            throw null;
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E ceiling(@InterfaceC37434x3 E e12) {
            return (E) C37357j4.a(this.f359806b.V5(e12, BoundType.f359277c).firstEntry());
        }

        @Override // java.util.NavigableSet
        public final Iterator<E> descendingIterator() {
            return ((a) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> descendingSet() {
            return new b(this.f359806b.d1());
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E floor(@InterfaceC37434x3 E e12) {
            return (E) C37357j4.a(this.f359806b.l1(e12, BoundType.f359277c).lastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> headSet(@InterfaceC37434x3 E e12, boolean z12) {
            return new b(this.f359806b.l1(e12, BoundType.a(z12)));
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E higher(@InterfaceC37434x3 E e12) {
            return (E) C37357j4.a(this.f359806b.V5(e12, BoundType.f359276b).firstEntry());
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E lower(@InterfaceC37434x3 E e12) {
            return (E) C37357j4.a(this.f359806b.l1(e12, BoundType.f359276b).lastEntry());
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E pollFirst() {
            return (E) C37357j4.a(this.f359806b.pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @I41.a
        public final E pollLast() {
            return (E) C37357j4.a(this.f359806b.pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> subSet(@InterfaceC37434x3 E e12, boolean z12, @InterfaceC37434x3 E e13, boolean z13) {
            return new b(this.f359806b.C2(e12, BoundType.a(z12), e13, BoundType.a(z13)));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<E> tailSet(@InterfaceC37434x3 E e12, boolean z12) {
            return new b(this.f359806b.V5(e12, BoundType.a(z12)));
        }
    }

    public static Object a(InterfaceC37338g3.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }
}
