package com.google.common.graph;

import com.google.common.collect.M2;
import java.util.AbstractMap;
import java.util.Set;

/* compiled from: AbstractValueGraph.java */
@D
@XY0.a
/* renamed from: com.google.common.graph.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37474n<N, V> extends AbstractC37461d<N> implements D0<N, V> {
    @Override // com.google.common.graph.D0
    public final Set a() {
        return new C37455a(this);
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        if (c() == d02.c() && d().equals(d02.d())) {
            if (((AbstractMap) M2.b(a(), new com.avito.android.str_seller_orders.orders_seller.d(this, 27))).equals(M2.b(d02.a(), new com.avito.android.str_seller_orders.orders_seller.d(d02, 27)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractMap) M2.b(a(), new com.avito.android.str_seller_orders.orders_seller.d(this, 27))).hashCode();
    }

    public final String toString() {
        return "isDirected: " + c() + ", allowsSelfLoops: " + b() + ", nodes: " + d() + ", edges: " + M2.b(a(), new com.avito.android.str_seller_orders.orders_seller.d(this, 27));
    }
}
