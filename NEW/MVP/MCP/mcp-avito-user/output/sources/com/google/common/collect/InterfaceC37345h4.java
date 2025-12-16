package com.google.common.collect;

import com.google.common.collect.InterfaceC37338g3;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: SortedMultiset.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.h4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC37345h4<E> extends InterfaceC37351i4<E>, InterfaceC37321d4<E> {
    InterfaceC37345h4<E> C2(@InterfaceC37434x3 E e12, BoundType boundType, @InterfaceC37434x3 E e13, BoundType boundType2);

    InterfaceC37345h4<E> V5(@InterfaceC37434x3 E e12, BoundType boundType);

    Comparator<? super E> comparator();

    InterfaceC37345h4<E> d1();

    @Override // com.google.common.collect.InterfaceC37338g3
    Set<InterfaceC37338g3.a<E>> entrySet();

    @I41.a
    InterfaceC37338g3.a<E> firstEntry();

    @Override // com.google.common.collect.InterfaceC37351i4, com.google.common.collect.InterfaceC37338g3
    NavigableSet<E> k();

    InterfaceC37345h4<E> l1(@InterfaceC37434x3 E e12, BoundType boundType);

    @I41.a
    InterfaceC37338g3.a<E> lastEntry();

    @I41.a
    InterfaceC37338g3.a<E> pollFirstEntry();

    @I41.a
    InterfaceC37338g3.a<E> pollLastEntry();
}
