package com.my.target;

import android.content.Context;
import com.my.target.Z;
import com.my.target.p1;
import e11.C39862e;
import e11.C39901r0;
import e11.q2;

/* loaded from: classes7.dex */
public final class X0 extends Z<C39862e> {

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final C39862e f364639e;

    public static class a implements Z.a<C39862e> {
        @Override // com.my.target.Z.a
        @j.N
        public final AbstractC37822y0 a() {
            return new C37784f();
        }

        @Override // com.my.target.Z.a
        public final boolean b() {
            return false;
        }

        @Override // com.my.target.Z.a
        @j.P
        public final e11.T0<C39862e> c() {
            return new q2();
        }

        @Override // com.my.target.Z.a
        @j.N
        public final AbstractC37789h0<C39862e> d() {
            return new q1();
        }
    }

    public X0(@j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.P C39862e c39862e) {
        super(new a(), c39901r0, aVar);
        this.f364639e = c39862e;
    }

    @Override // com.my.target.Z
    public final void g(@j.N p1 p1Var, @j.N Context context, @j.N FX0.b bVar) {
        C39862e c39862e = this.f364639e;
        if (c39862e == null) {
            super.g(p1Var, context, bVar);
        } else {
            C39862e c39862eB = b(c39862e, context);
            bVar.c(c39862eB, c39862eB != null ? null : "error occurred while handling result of section");
        }
    }
}
