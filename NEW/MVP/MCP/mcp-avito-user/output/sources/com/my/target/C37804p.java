package com.my.target;

import android.content.Context;
import com.my.target.AbstractC37822y0;
import com.my.target.Z;
import com.my.target.p1;
import e11.C39901r0;

/* renamed from: com.my.target.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37804p extends Z<e11.W0> {

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final e11.W0 f365067e;

    /* renamed from: com.my.target.p$b */
    public static class b implements Z.a<e11.W0> {
        public b() {
        }

        @Override // com.my.target.Z.a
        @j.N
        public final AbstractC37822y0 a() {
            return new AbstractC37822y0.a();
        }

        @Override // com.my.target.Z.a
        public final boolean b() {
            return true;
        }

        @Override // com.my.target.Z.a
        @j.P
        public final e11.T0<e11.W0> c() {
            return new e11.O0();
        }

        @Override // com.my.target.Z.a
        @j.N
        public final AbstractC37789h0<e11.W0> d() {
            return new C37785f0();
        }
    }

    public C37804p(@j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.P e11.W0 w02) {
        super(new b(), c39901r0, aVar);
        this.f365067e = w02;
    }

    @Override // com.my.target.Z
    public final void g(@j.N p1 p1Var, @j.N Context context, @j.N FX0.b bVar) {
        e11.W0 w02 = this.f365067e;
        if (w02 == null) {
            super.g(p1Var, context, bVar);
        } else {
            e11.W0 w0B = b(w02, context);
            bVar.c(w0B, w0B != null ? null : "error occurred while handling result of request");
        }
    }
}
