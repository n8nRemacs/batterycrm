package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.B0;
import com.my.target.C37818w0;
import com.my.target.ads.e;
import com.my.target.mediation.l;
import com.my.target.p1;
import e11.AbstractC39858c1;
import e11.C39864e1;
import e11.C39901r0;
import e11.D1;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class n1 extends B0<com.my.target.mediation.l> implements InterfaceC37776b {

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final com.my.target.ads.e f364996k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public C37818w0.a f364997l;

    public class a implements l.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final C39864e1 f364998a;

        public a(C39864e1 c39864e1) {
            this.f364998a = c39864e1;
        }

        public final void a(@j.N com.my.target.mediation.l lVar) {
            n1 n1Var = n1.this;
            if (n1Var.f364337d != lVar) {
                return;
            }
            n1Var.h(this.f364998a, false);
        }
    }

    public n1(@j.N com.my.target.ads.e eVar, @j.N e11.X0 x02, @j.N C39901r0 c39901r0, @j.N p1.a aVar) {
        super(x02, c39901r0, aVar);
        this.f364996k = eVar;
    }

    @Override // com.my.target.InterfaceC37776b
    public final void b(@j.N e.a aVar) {
    }

    @Override // com.my.target.InterfaceC37776b
    public final void c(@j.P C37818w0.a aVar) {
        this.f364997l = aVar;
    }

    @Override // com.my.target.InterfaceC37776b
    public final void destroy() {
        if (this.f364337d == 0) {
            return;
        }
        this.f364996k.removeAllViews();
        try {
            ((com.my.target.mediation.l) this.f364337d).destroy();
        } catch (Throwable th2) {
            th2.toString();
        }
        this.f364337d = null;
    }

    @Override // com.my.target.B0
    public final void e(@j.N com.my.target.mediation.e eVar, @j.N C39864e1 c39864e1, @j.N Context context) {
        com.my.target.mediation.l lVar = (com.my.target.mediation.l) eVar;
        String str = c39864e1.f394581f;
        HashMap mapA = c39864e1.a();
        C39901r0 c39901r0 = this.f364334a;
        B0.a aVar = new B0.a(c39864e1.f394577b, str, mapA, c39901r0.f394764a.g(), c39901r0.f394764a.h(), TextUtils.isEmpty(this.f364341h) ? null : c39901r0.a(this.f364341h));
        if (lVar instanceof com.my.target.mediation.q) {
            AbstractC39858c1 abstractC39858c1 = c39864e1.f394582g;
            if (abstractC39858c1 instanceof D1) {
                ((com.my.target.mediation.q) lVar).f364985a = (D1) abstractC39858c1;
            }
        }
        try {
            lVar.a(aVar, this.f364996k.getSize(), new a(c39864e1), context);
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    @Override // com.my.target.B0
    public final boolean i(@j.N com.my.target.mediation.e eVar) {
        return eVar instanceof com.my.target.mediation.l;
    }

    @Override // com.my.target.B0
    public final void o() {
        C37818w0.a aVar = this.f364997l;
        if (aVar != null) {
            aVar.d("No data for available ad networks");
        }
    }

    @Override // com.my.target.B0
    @j.N
    public final com.my.target.mediation.e p() {
        return new com.my.target.mediation.q();
    }

    @Override // com.my.target.InterfaceC37776b
    public final void b() {
    }

    @Override // com.my.target.InterfaceC37776b
    public final void i() {
        n(this.f364996k.getContext());
    }

    @Override // com.my.target.InterfaceC37776b
    public final void e() {
    }

    @Override // com.my.target.InterfaceC37776b
    public final void a() {
    }

    @Override // com.my.target.InterfaceC37776b
    public final void f() {
    }
}
