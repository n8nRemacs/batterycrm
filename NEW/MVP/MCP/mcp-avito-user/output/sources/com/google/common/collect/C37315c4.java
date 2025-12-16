package com.google.common.collect;

import com.google.common.collect.P1;
import com.google.common.collect.t4;
import java.util.Map;

/* compiled from: SingletonImmutableTable.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.c4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37315c4<R, C, V> extends P1<R, C, V> {

    /* renamed from: d, reason: collision with root package name */
    public final R f359658d;

    /* renamed from: e, reason: collision with root package name */
    public final C f359659e;

    /* renamed from: f, reason: collision with root package name */
    public final V f359660f;

    public C37315c4(R r12, C c12, V v12) {
        r12.getClass();
        this.f359658d = r12;
        c12.getClass();
        this.f359659e = c12;
        v12.getClass();
        this.f359660f = v12;
    }

    @Override // com.google.common.collect.P1
    public final AbstractC37412t1<C, Map<R, V>> m() {
        R r12 = this.f359658d;
        V v12 = this.f359660f;
        F.a(r12, v12);
        J3 j3S = J3.s(1, new Object[]{r12, v12}, null);
        C c12 = this.f359659e;
        F.a(c12, j3S);
        return J3.s(1, new Object[]{c12, j3S}, null);
    }

    @Override // com.google.common.collect.P1, com.google.common.collect.AbstractC37405s
    /* renamed from: n */
    public final H1<t4.a<R, C, V>> e() {
        t4.a aVarI = P1.i(this.f359658d, this.f359659e, this.f359660f);
        int i12 = H1.f359346d;
        return new C37309b4(aVarI);
    }

    @Override // com.google.common.collect.P1
    public final P1.b o() {
        return P1.b.a(this, new int[]{0}, new int[]{0});
    }

    @Override // com.google.common.collect.P1, com.google.common.collect.AbstractC37405s
    /* renamed from: p */
    public final AbstractC37378n1<V> f() {
        int i12 = H1.f359346d;
        return new C37309b4(this.f359660f);
    }

    @Override // com.google.common.collect.P1, com.google.common.collect.t4, com.google.common.collect.R3
    /* renamed from: s */
    public final AbstractC37412t1<R, Map<C, V>> d() {
        C c12 = this.f359659e;
        V v12 = this.f359660f;
        F.a(c12, v12);
        J3 j3S = J3.s(1, new Object[]{c12, v12}, null);
        R r12 = this.f359658d;
        F.a(r12, j3S);
        return J3.s(1, new Object[]{r12, j3S}, null);
    }

    @Override // com.google.common.collect.t4
    public final int size() {
        return 1;
    }
}
