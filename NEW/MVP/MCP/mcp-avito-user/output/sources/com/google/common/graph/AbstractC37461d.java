package com.google.common.graph;

/* compiled from: AbstractBaseGraph.java */
@D
/* renamed from: com.google.common.graph.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37461d<N> implements InterfaceC37475o<N> {
    @Override // com.google.common.graph.InterfaceC37475o
    public int g() {
        return c() ? e(null).size() : m(null);
    }

    @Override // com.google.common.graph.InterfaceC37475o
    public int k() {
        return c() ? h(null).size() : m(null);
    }

    public int m(N n12) {
        if (c()) {
            return com.google.common.primitives.l.f(e(n12).size() + h(n12).size());
        }
        return com.google.common.primitives.l.f(r0.size() + ((b() && i(n12).contains(n12)) ? 1 : 0));
    }

    public long n() {
        long jM2 = 0;
        while (d().iterator().hasNext()) {
            jM2 += m(r0.next());
        }
        com.google.common.base.M.q((1 & jM2) == 0);
        return jM2 >>> 1;
    }
}
