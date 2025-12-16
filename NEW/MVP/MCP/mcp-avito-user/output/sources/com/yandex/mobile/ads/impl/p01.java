package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class p01<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse<?> f388676a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final om0 f388677b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ak0 f388678c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39362s0 f388679d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final pl f388680e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final f91 f388681f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final tj f388682g = new tj();

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private hx f388683h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private p01<V>.b f388684i;

    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final pl f388685a;

        public a(@j.N pl plVar) {
            this.f388685a = plVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@j.P View view) {
            this.f388685a.e();
        }
    }

    public class b implements InterfaceC39365t0 {
        private b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39365t0
        public final void a() {
            if (p01.this.f388683h != null) {
                p01.this.f388683h.resume();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39365t0
        public final void b() {
            if (p01.this.f388683h != null) {
                p01.this.f388683h.pause();
            }
        }

        public /* synthetic */ b(p01 p01Var, int i12) {
            this();
        }
    }

    public static class c implements wj {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<View> f388687a;

        public c(@j.N View view) {
            this.f388687a = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.wj
        public final void a() {
            View view = this.f388687a.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public p01(@j.N AdResponse adResponse, @j.N C39362s0 c39362s0, @j.N pl plVar, @j.N ck0 ck0Var, @j.N om0 om0Var, @j.N f91 f91Var) {
        this.f388676a = adResponse;
        this.f388677b = om0Var;
        this.f388679d = c39362s0;
        this.f388680e = plVar;
        this.f388681f = f91Var;
        this.f388678c = ck0Var;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
        p01<V>.b bVar = this.f388684i;
        if (bVar != null) {
            this.f388679d.b(bVar);
        }
        hx hxVar = this.f388683h;
        if (hxVar != null) {
            hxVar.invalidate();
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        View viewB = this.f388678c.b(v12);
        if (viewB == null) {
            this.f388680e.e();
            return;
        }
        int i12 = 0;
        p01<V>.b bVar = new b(this, i12);
        this.f388684i = bVar;
        this.f388679d.a(bVar);
        v11 v11VarA = q21.b().a(viewB.getContext());
        if (v11VarA != null && v11VarA.c0()) {
            i12 = 1;
        }
        if (!"divkit".equals(this.f388676a.v()) || i12 == 0) {
            viewB.setOnClickListener(new a(this.f388680e));
        }
        viewB.setVisibility(8);
        c cVar = new c(viewB);
        tj tjVar = this.f388682g;
        AdResponse<?> adResponse = this.f388676a;
        om0 om0Var = this.f388677b;
        f91 f91Var = this.f388681f;
        tjVar.getClass();
        hx hxVarA = tj.a(adResponse, cVar, om0Var, f91Var);
        this.f388683h = hxVarA;
        hxVarA.start();
    }
}
