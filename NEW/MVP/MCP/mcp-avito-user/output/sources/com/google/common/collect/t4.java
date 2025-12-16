package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* compiled from: Table.java */
@InterfaceC37329f0
@aZ0.f
@XY0.b
/* loaded from: classes6.dex */
public interface t4<R, C, V> {

    /* compiled from: Table.java */
    public interface a<R, C, V> {
        @InterfaceC37434x3
        C a();

        @InterfaceC37434x3
        R b();

        @InterfaceC37434x3
        V getValue();
    }

    Set<a<R, C, V>> U();

    Map<R, Map<C, V>> d();

    boolean equals(@I41.a Object obj);

    int hashCode();

    int size();
}
