package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.B0;
import com.my.target.k1;
import com.my.target.mediation.k;
import com.my.target.p1;
import e11.AbstractC39858c1;
import e11.C39864e1;
import e11.C39901r0;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class j1 extends B0<com.my.target.mediation.k> implements k1 {

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final k1.a f364879k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public k1.b f364880l;

    public class a implements k.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final C39864e1 f364881a;

        public a(C39864e1 c39864e1) {
            this.f364881a = c39864e1;
        }

        public final void a(@j.N com.my.target.mediation.k kVar) {
            j1 j1Var = j1.this;
            if (j1Var.f364337d != kVar) {
                return;
            }
            j1Var.h(this.f364881a, false);
        }
    }

    public j1(@j.N e11.X0 x02, @j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.N k1.a aVar2) {
        super(x02, c39901r0, aVar);
        this.f364879k = aVar2;
    }

    @Override // com.my.target.k1
    public final void destroy() {
        T t12 = this.f364337d;
        if (t12 == 0) {
            return;
        }
        try {
            ((com.my.target.mediation.k) t12).destroy();
        } catch (Throwable th2) {
            th2.toString();
        }
        this.f364337d = null;
    }

    @Override // com.my.target.B0
    public final void e(@j.N com.my.target.mediation.e eVar, @j.N C39864e1 c39864e1, @j.N Context context) {
        com.my.target.mediation.k kVar = (com.my.target.mediation.k) eVar;
        String str = c39864e1.f394581f;
        HashMap mapA = c39864e1.a();
        C39901r0 c39901r0 = this.f364334a;
        B0.a aVar = new B0.a(c39864e1.f394577b, str, mapA, c39901r0.f394764a.g(), c39901r0.f394764a.h(), TextUtils.isEmpty(this.f364341h) ? null : c39901r0.a(this.f364341h));
        if (kVar instanceof com.my.target.mediation.p) {
            AbstractC39858c1 abstractC39858c1 = c39864e1.f394582g;
            if (abstractC39858c1 instanceof e11.W0) {
                ((com.my.target.mediation.p) kVar).f364981a = (e11.W0) abstractC39858c1;
            }
        }
        try {
            kVar.c(aVar, new a(c39864e1), context);
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    @Override // com.my.target.B0
    public final boolean i(@j.N com.my.target.mediation.e eVar) {
        return eVar instanceof com.my.target.mediation.k;
    }

    @Override // com.my.target.B0
    public final void o() {
        this.f364879k.c();
    }

    @Override // com.my.target.B0
    @j.N
    public final com.my.target.mediation.e p() {
        return new com.my.target.mediation.p();
    }
}
