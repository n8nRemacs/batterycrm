package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import b11.AbstractC25389a;
import com.yandex.mobile.ads.impl.ze0;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes8.dex */
final class td implements AbstractC25389a.InterfaceC1985a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakReference<com.yandex.mobile.ads.banner.f> f390189a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ze0 f390190b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ee0<AbstractC25389a, AbstractC25389a.InterfaceC1985a> f390191c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final m30 f390192d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f390193e;

    public class a implements ze0.a {
        private a() {
        }

        public /* synthetic */ a(td tdVar, int i12) {
            this();
        }
    }

    public td(@j.N com.yandex.mobile.ads.banner.f fVar, @j.N ee0<AbstractC25389a, AbstractC25389a.InterfaceC1985a> ee0Var, @j.N ze0 ze0Var) {
        this.f390191c = ee0Var;
        this.f390190b = ze0Var;
        this.f390189a = new WeakReference<>(fVar);
        this.f390192d = new m30(ee0Var);
    }

    public static void c(td tdVar) {
        com.yandex.mobile.ads.banner.f fVar = tdVar.f390189a.get();
        if (fVar != null) {
            Context contextH = fVar.h();
            ee0<AbstractC25389a, AbstractC25389a.InterfaceC1985a> ee0Var = tdVar.f390191c;
            ee0Var.getClass();
            ee0Var.b(contextH, new HashMap());
            fVar.a(tdVar.f390192d.a());
        }
    }

    public final void onAdClicked() {
        com.yandex.mobile.ads.banner.f fVar = this.f390189a.get();
        if (fVar != null) {
            Context contextH = fVar.h();
            ee0<AbstractC25389a, AbstractC25389a.InterfaceC1985a> ee0Var = this.f390191c;
            ee0Var.getClass();
            ee0Var.a(contextH, new HashMap());
        }
    }

    public final void onAdFailedToLoad(@j.N com.monetization.ads.mediation.base.a aVar) {
        com.yandex.mobile.ads.banner.f fVar = this.f390189a.get();
        if (fVar != null) {
            Context contextH = fVar.h();
            aVar.getClass();
            w2 w2Var = new w2(0, null, null);
            if (this.f390193e) {
                this.f390191c.a(contextH, w2Var, this);
            } else {
                this.f390191c.b(contextH, w2Var, this);
            }
        }
    }

    public final void onAdImpression() {
        com.yandex.mobile.ads.banner.f fVar;
        if (this.f390191c.b() || (fVar = this.f390189a.get()) == null) {
            return;
        }
        Context contextH = fVar.h();
        ee0<AbstractC25389a, AbstractC25389a.InterfaceC1985a> ee0Var = this.f390191c;
        ee0Var.getClass();
        ee0Var.b(contextH, new HashMap());
        fVar.a(this.f390192d.a());
    }

    public final void onAdLeftApplication() {
        com.yandex.mobile.ads.banner.f fVar = this.f390189a.get();
        if (fVar != null) {
            fVar.onLeftApplication();
        }
    }

    public final void onAdLoaded(@j.N View view) {
        com.yandex.mobile.ads.banner.f fVar = this.f390189a.get();
        if (fVar != null) {
            Context context = view.getContext();
            if (this.f390193e) {
                this.f390191c.b(context);
            } else {
                this.f390193e = true;
                ee0<AbstractC25389a, AbstractC25389a.InterfaceC1985a> ee0Var = this.f390191c;
                ee0Var.getClass();
                ee0Var.c(context, new HashMap());
            }
            this.f390190b.a(view, new a(this, 0));
            fVar.b(new o7(this.f390191c).a());
            fVar.p();
        }
    }
}
