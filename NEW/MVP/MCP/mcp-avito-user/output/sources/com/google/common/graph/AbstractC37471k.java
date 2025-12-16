package com.google.common.graph;

import com.google.common.collect.M2;
import java.util.AbstractMap;

/* compiled from: AbstractNetwork.java */
@D
@XY0.a
/* renamed from: com.google.common.graph.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37471k<N, E> implements InterfaceC37462d0<N, E> {
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC37462d0)) {
            return false;
        }
        InterfaceC37462d0 interfaceC37462d0 = (InterfaceC37462d0) obj;
        if (c() == interfaceC37462d0.c() && d().equals(interfaceC37462d0.d())) {
            if (((AbstractMap) M2.b(a(), new com.avito.android.str_seller_orders.orders_seller.d(this, 26))).equals(M2.b(interfaceC37462d0.a(), new com.avito.android.str_seller_orders.orders_seller.d(interfaceC37462d0, 26)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractMap) M2.b(a(), new com.avito.android.str_seller_orders.orders_seller.d(this, 26))).hashCode();
    }

    public final String toString() {
        return "isDirected: " + c() + ", allowsParallelEdges: " + j() + ", allowsSelfLoops: " + b() + ", nodes: " + d() + ", edges: " + M2.b(a(), new com.avito.android.str_seller_orders.orders_seller.d(this, 26));
    }
}
