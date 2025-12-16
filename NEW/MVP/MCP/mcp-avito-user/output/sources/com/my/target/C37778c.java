package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.my.target.InterfaceC37815v;
import com.my.target.X;
import com.my.target.i1;
import e11.C39872h0;
import e11.C39877j;
import e11.C39884l0;
import e11.C39913v0;
import e11.i2;
import e11.k2;
import java.util.ArrayList;

/* renamed from: com.my.target.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37778c implements i1 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39884l0 f364750b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final e f364751c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final ViewGroup f364752d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final Handler f364753e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final X.a f364754f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public final D f364755g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public final ViewGroup f364756h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public final K0 f364757i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public final C37814u0 f364758j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public Q0 f364759k;

    /* renamed from: com.my.target.c$a */
    public static class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final C37778c f364760b;

        public a(@j.N C37778c c37778c) {
            this.f364760b = c37778c;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, com.my.target.q, com.my.target.v] */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C37778c c37778c = this.f364760b;
            Q0 q02 = c37778c.f364759k;
            if (q02 != null) {
                ?? r12 = q02.f364523c;
                r12.a(true);
                q02.a(r12.getView().getContext());
                if (q02.f364531k) {
                    r1 r1Var = q02.f364525e;
                    if (!r1Var.c()) {
                        k2.a(r1Var.f365126e, r1Var.f365125d.e("closedByUser"));
                    }
                }
            }
            c37778c.f364754f.a();
        }
    }

    /* renamed from: com.my.target.c$b */
    public interface b {
    }

    /* renamed from: com.my.target.c$c, reason: collision with other inner class name */
    public interface InterfaceC10786c extends i1.a {
    }

    /* renamed from: com.my.target.c$d */
    public static class d implements InterfaceC37815v.a {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final C37778c f364761b;

        public d(@j.N C37778c c37778c) {
            this.f364761b = c37778c;
        }

        @Override // com.my.target.C37798m.a
        public final void a(@j.N Context context) {
            C37778c c37778c = this.f364761b;
            Q0 q02 = c37778c.f364759k;
            if (q02 != null) {
                q02.c();
            }
            c37778c.f364754f.d(c37778c.f364750b, context);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, com.my.target.v] */
        @Override // com.my.target.InterfaceC37815v.a
        public final void d() {
            C37778c c37778c = this.f364761b;
            Context context = c37778c.f364752d.getView().getContext();
            C37788h c37788h = c37778c.f364750b.f394698D;
            if (c37788h == null) {
                return;
            }
            D d12 = c37778c.f364755g;
            if (d12 == null || !d12.c()) {
                if (d12 == null) {
                    i2.a(c37788h.f364852b, context);
                } else {
                    d12.b(context);
                }
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewGroup, com.my.target.v] */
        @Override // com.my.target.InterfaceC37815v.a
        public final void e() {
            C37778c c37778c = this.f364761b;
            c37778c.f364754f.f(c37778c.f364750b, null, c37778c.f364752d.getView().getContext());
        }
    }

    /* renamed from: com.my.target.c$e */
    public static class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final ViewGroup f364762b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@j.N InterfaceC37815v interfaceC37815v) {
            this.f364762b = (ViewGroup) interfaceC37815v;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, com.my.target.v] */
        @Override // java.lang.Runnable
        public final void run() {
            this.f364762b.d();
        }
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.ViewGroup, com.my.target.q, com.my.target.v] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.ViewGroup, com.my.target.v] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.ViewGroup, com.my.target.v] */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.view.ViewGroup, com.my.target.v] */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.view.ViewGroup, com.my.target.v] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.ViewGroup, com.my.target.v] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.ViewGroup, com.my.target.v] */
    public C37778c(@j.N C39872h0 c39872h0, @j.N C39884l0 c39884l0, @j.N X.a aVar, @j.N Context context) {
        ViewGroup viewGroup;
        ArrayList arrayList;
        K0 k02;
        this.f364750b = c39884l0;
        this.f364754f = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f364753e = handler;
        d dVar = new d(this);
        C39913v0<com.my.target.common.models.e> c39913v0 = c39884l0.f394673N;
        ArrayList arrayList2 = c39884l0.f394672M;
        boolean zIsEmpty = arrayList2.isEmpty();
        Context context2 = c39872h0.f394605b;
        if (zIsEmpty) {
            ViewGroup l12 = (c39913v0 == null || c39884l0.f394679T != 1) ? new L(context2, c39872h0) : new C37816v0(context2, c39872h0.f394606c);
            this.f364756h = l12;
            viewGroup = l12;
        } else {
            K0 k03 = new K0(context2);
            this.f364757i = k03;
            viewGroup = k03;
        }
        this.f364752d = viewGroup;
        ?? r12 = this.f364752d;
        e eVar = new e(r12);
        this.f364751c = eVar;
        r12.setInterstitialPromoViewListener(dVar);
        this.f364752d.getCloseButton().setOnClickListener(new a(this));
        ?? r14 = this.f364756h;
        if (r14 != 0 && c39913v0 != null) {
            Q0 q02 = new Q0(c39872h0, c39913v0, r14, aVar, new com.my.target.ads.a(this, 7));
            this.f364759k = q02;
            com.my.target.common.models.e eVar2 = (com.my.target.common.models.e) c39913v0.f394856J;
            if (eVar2 != null && eVar2.f394307d == 0) {
                q02.f364533m = false;
            }
            boolean z12 = c39913v0.f394867U;
            q02.f364530j = z12;
            if (z12 && c39913v0.f394872Z == 0.0f && c39913v0.f394863Q) {
                r14.d();
            }
            q02.f364528h = c39913v0.f394724w;
            boolean z13 = c39913v0.f394862P;
            q02.f364529i = z13;
            if (z13) {
                r14.a(0);
            } else {
                if (c39913v0.f394863Q) {
                    q02.d(context);
                }
                r14.a(2);
            }
        }
        this.f364752d.setBanner(c39884l0);
        this.f364752d.setClickArea(c39884l0.f394718q);
        if (c39913v0 == null || !c39913v0.f394863Q) {
            long j12 = (long) (c39884l0.f394742I * 1000.0f);
            if (j12 > 0) {
                handler.removeCallbacks(eVar);
                System.currentTimeMillis();
                handler.postDelayed(eVar, j12);
            } else {
                this.f364752d.d();
            }
        }
        if (!arrayList2.isEmpty() && (k02 = this.f364757i) != null) {
            this.f364758j = new C37814u0(arrayList2, k02);
        }
        C37814u0 c37814u0 = this.f364758j;
        if (c37814u0 != null) {
            c37814u0.f365164c = aVar;
        }
        C37788h c37788h = c39884l0.f394698D;
        if (c37788h != null && (arrayList = c37788h.f364853c) != null) {
            D d12 = new D(arrayList, new C39877j());
            this.f364755g = d12;
            d12.f364362e = dVar;
        }
        aVar.b(c39884l0, this.f364752d.getView());
    }

    @Override // com.my.target.i1
    public final void destroy() {
        this.f364753e.removeCallbacks(this.f364751c);
        Q0 q02 = this.f364759k;
        if (q02 != null) {
            q02.c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, com.my.target.v] */
    @Override // com.my.target.i1
    @j.N
    public final View getCloseButton() {
        return this.f364752d.getCloseButton();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, com.my.target.v] */
    @Override // com.my.target.i1
    @j.N
    public final View j() {
        return this.f364752d.getView();
    }
}
