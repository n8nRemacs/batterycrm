package com.my.target;

import android.content.Context;
import com.my.target.AbstractC37822y0;
import com.my.target.Z;
import com.my.target.p1;
import e11.C39901r0;
import e11.C39917w1;
import e11.D1;

/* renamed from: com.my.target.s0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37810s0 extends Z<D1> {

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final D1 f365131e;

    /* renamed from: com.my.target.s0$b */
    public static class b implements Z.a<D1> {
        public b() {
        }

        @Override // com.my.target.Z.a
        @j.N
        public final AbstractC37822y0 a() {
            return new AbstractC37822y0.a();
        }

        @Override // com.my.target.Z.a
        public final boolean b() {
            return false;
        }

        @Override // com.my.target.Z.a
        @j.P
        public final e11.T0<D1> c() {
            return new C39917w1();
        }

        @Override // com.my.target.Z.a
        @j.N
        public final AbstractC37789h0<D1> d() {
            return new D0();
        }
    }

    public C37810s0(@j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.P D1 d12) {
        super(new b(), c39901r0, aVar);
        this.f365131e = d12;
    }

    @Override // com.my.target.Z
    public final void g(@j.N p1 p1Var, @j.N Context context, @j.N FX0.b bVar) {
        D1 d12 = this.f365131e;
        if (d12 == null) {
            super.g(p1Var, context, bVar);
        } else {
            D1 d1B = b(d12, context);
            bVar.c(d1B, d1B != null ? null : "error occurred while handling result of request");
        }
    }
}
