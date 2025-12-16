package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.impl.fy;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class fy<T extends fy<T>> extends ea1 {

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final AdResponse<String> f385518m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final n2 f385519n;

    /* renamed from: o, reason: collision with root package name */
    @j.N
    private final a4 f385520o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    private final lx<T> f385521p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    private final vx f385522q;

    /* renamed from: r, reason: collision with root package name */
    @j.N
    private final q71 f385523r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    private final d5 f385524s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    private final ex f385525t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    private ux f385526u;

    /* renamed from: v, reason: collision with root package name */
    @j.N
    private final r3 f385527v;

    public fy(@j.N Context context, @j.N AdResponse<String> adResponse, @j.N n2 n2Var, @j.N ex exVar, @j.N lx<T> lxVar, @j.N r3 r3Var) {
        super(context, exVar, adResponse, n2Var);
        this.f385518m = adResponse;
        this.f385519n = n2Var;
        a4 a4Var = new a4();
        this.f385520o = a4Var;
        this.f385525t = exVar;
        this.f385521p = lxVar;
        this.f385522q = new vx();
        this.f385523r = q71.a();
        this.f385527v = r3Var;
        C39354p0.a().a("window_type_fullscreen", new C39371v0());
        e00 e00Var = new e00();
        e00Var.a(adResponse);
        this.f385524s = new d5(context, adResponse, n2Var, a4Var, e00Var);
    }

    @Override // com.yandex.mobile.ads.impl.ea1
    public final boolean a(int i12) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ea1
    public final boolean i() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ea1
    public final boolean j() {
        return true;
    }

    @j.N
    public final AdInfo l() {
        r3 r3Var = this.f385527v;
        Context contextB = b();
        AdResponse<String> adResponse = this.f385518m;
        n2 n2Var = this.f385519n;
        r3Var.getClass();
        return r3.a(contextB, adResponse, n2Var);
    }

    @j.N
    public abstract T m();

    public final void n() {
        e();
        this.f385523r.a(n80.f388182b, this);
        ux uxVar = this.f385526u;
        if (uxVar != null) {
            uxVar.onAdDismissed();
        }
    }

    public final void o() {
        ux uxVar = this.f385526u;
        if (uxVar != null) {
            uxVar.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39306b0
    public final void onLeftApplication() {
        ux uxVar = this.f385526u;
        if (uxVar != null) {
            uxVar.onAdClicked();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ea1, com.yandex.mobile.ads.impl.q2
    public void onReceiveResult(int i12, @j.P Bundle bundle) {
        getClass().toString();
        adImpressionData = null;
        AdImpressionData adImpressionData = null;
        if (i12 == 0) {
            Map<String, String> map = bundle != null ? (Map) bundle.getSerializable("extra_tracking_parameters") : null;
            this.f385520o.a(z3.f392164d);
            this.f385524s.a();
            o();
            vx vxVar = this.f385522q;
            AdResponse<String> adResponse = this.f385518m;
            vxVar.getClass();
            if (adResponse == null || adResponse.u() != xl.f391761b) {
                a(map);
                return;
            }
            return;
        }
        if (i12 == 16) {
            if (bundle != null) {
                Parcelable parcelable = bundle.getParcelable("impression_data_key");
                if (parcelable instanceof AdImpressionData) {
                    adImpressionData = (AdImpressionData) parcelable;
                }
            }
            a(adImpressionData);
            return;
        }
        if (i12 == 17) {
            ux uxVar = this.f385526u;
            if (uxVar != null) {
                uxVar.onAdClicked();
                return;
            }
            return;
        }
        if (i12 == 2) {
            this.f385525t.a(0);
            b(0);
        } else if (i12 == 3) {
            this.f385525t.a(8);
            b(8);
        } else if (i12 == 4) {
            n();
        } else if (i12 != 5) {
            super.onReceiveResult(i12, bundle);
        }
    }

    public final void a(@j.N Activity activity) {
        d();
        synchronized (this) {
        }
        this.f385520o.b(z3.f392164d);
        this.f385523r.b(n80.f388182b, this);
        this.f385521p.a((lx<T>) m(), activity);
    }

    public final void a(@j.N ux uxVar) {
        this.f385526u = uxVar;
    }

    @Override // com.yandex.mobile.ads.impl.o30.a
    public final void a(@j.P AdImpressionData adImpressionData) {
        ux uxVar = this.f385526u;
        if (uxVar != null) {
            uxVar.onImpression(adImpressionData);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39306b0
    public final void onReturnedToApplication() {
    }
}
