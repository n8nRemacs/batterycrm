package com.google.common.collect;

import aZ0.InterfaceC19845a;
import aZ0.InterfaceC19847c;
import java.util.Collection;
import java.util.Set;

/* compiled from: Multiset.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.g3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC37338g3<E> extends Collection<E> {

    /* compiled from: Multiset.java */
    /* renamed from: com.google.common.collect.g3$a */
    public interface a<E> {
        @InterfaceC37434x3
        E a();

        int getCount();
    }

    @InterfaceC19845a
    int O3(int i12, @I41.a @InterfaceC19847c Object obj);

    @InterfaceC19845a
    boolean P2(int i12, @InterfaceC37434x3 Object obj);

    int S5(@I41.a @InterfaceC19847c Object obj);

    @InterfaceC19845a
    int add(int i12, @InterfaceC37434x3 Object obj);

    Set<a<E>> entrySet();

    boolean equals(@I41.a Object obj);

    int hashCode();

    Set<E> k();

    @InterfaceC19845a
    int p6(@InterfaceC37434x3 Object obj);
}
