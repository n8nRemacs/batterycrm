package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class ak<V extends ViewGroup> implements up<V>, InterfaceC39365t0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse<?> f383580a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ak0 f383581b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39362s0 f383582c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final lj f383583d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final pl f383584e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private oj f383585f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final pn f383586g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final gv0 f383587h;

    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final pl f383588a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final pn f383589b;

        public a(@j.N pl plVar, @j.N pn pnVar) {
            this.f383588a = plVar;
            this.f383589b = pnVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@j.P View view) {
            this.f383588a.e();
            this.f383589b.a(on.f388588b);
        }
    }

    public ak(@j.N AdResponse adResponse, @j.N C39362s0 c39362s0, @j.N yj1 yj1Var, @j.N pl plVar, @j.N ak0 ak0Var, @j.N pn pnVar, @j.N f91 f91Var) {
        this.f383580a = adResponse;
        this.f383582c = c39362s0;
        this.f383583d = yj1Var;
        this.f383584e = plVar;
        this.f383581b = ak0Var;
        this.f383586g = pnVar;
        this.f383587h = f91Var.c();
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        View viewB = this.f383581b.b(v12);
        ProgressBar progressBarA = this.f383581b.a(v12);
        if (viewB != null) {
            this.f383582c.a(this);
            v11 v11VarA = q21.b().a(viewB.getContext());
            boolean z12 = false;
            boolean z13 = v11VarA != null && v11VarA.c0();
            if ("divkit".equals(this.f383580a.v()) && z13) {
                z12 = true;
            }
            if (!z12) {
                viewB.setOnClickListener(new a(this.f383584e, this.f383586g));
            }
            Long lT2 = this.f383580a.t();
            long jLongValue = lT2 != null ? lT2.longValue() : 0L;
            oj av0Var = progressBarA != null ? new av0(viewB, progressBarA, new ns(), new vj(), this.f383586g, this.f383587h, jLongValue) : new mo(viewB, this.f383583d, this.f383586g, this.f383587h, jLongValue);
            this.f383585f = av0Var;
            av0Var.c();
            if (viewB.getTag() == null) {
                viewB.setTag("close");
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39365t0
    public final void b() {
        oj ojVar = this.f383585f;
        if (ojVar != null) {
            ojVar.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
        this.f383582c.b(this);
        oj ojVar = this.f383585f;
        if (ojVar != null) {
            ojVar.invalidate();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39365t0
    public final void a() {
        oj ojVar = this.f383585f;
        if (ojVar != null) {
            ojVar.a();
        }
    }
}
