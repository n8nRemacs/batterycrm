package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.C39357q0;
import com.yandex.mobile.ads.impl.fy;
import com.yandex.mobile.ads.impl.xm0;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* loaded from: classes8.dex */
public final class ho1<T extends fy<T>> implements lx<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final rx<T> f386184a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final an1 f386185b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final xm0 f386186c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final n2 f386187d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final pl0 f386188e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final zx f386189f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private AdResponse<String> f386190g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private NativeAd f386191h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f386192i;

    public final class b implements xm0.b {
        private b() {
        }

        @Override // com.yandex.mobile.ads.impl.xm0.b
        public final void a(@j.N NativeAd nativeAd) {
            if (ho1.this.f386192i) {
                return;
            }
            ho1.this.f386191h = nativeAd;
            ho1.this.f386184a.p();
        }

        public /* synthetic */ b(ho1 ho1Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.xm0.b
        public final void a(@j.N w2 w2Var) {
            if (ho1.this.f386192i) {
                return;
            }
            ho1.this.f386191h = null;
            ho1.this.f386184a.b(w2Var);
        }
    }

    public ho1(@j.N rx<T> rxVar, @j.N ko1 ko1Var) {
        this.f386184a = rxVar;
        Context contextH = rxVar.h();
        n2 n2VarD = rxVar.d();
        this.f386187d = n2VarD;
        this.f386188e = new pl0(n2VarD);
        a4 a4VarE = rxVar.e();
        this.f386185b = new an1(n2VarD);
        this.f386186c = new xm0(contextH, ko1Var, n2VarD, a4VarE);
        ko1Var.getClass();
        this.f386189f = new zx(ko1.a(), 0);
    }

    public final class a implements qz0 {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final Context f386193a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final AdResponse<String> f386194b;

        public a(Context context, @j.N AdResponse<String> adResponse) {
            this.f386193a = context.getApplicationContext();
            this.f386194b = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.qz0
        public final void a(@j.N bl0 bl0Var) {
            ql0 ql0Var = new ql0(bl0Var);
            ho1.this.f386185b.a(this.f386193a, this.f386194b, ho1.this.f386188e);
            ho1.this.f386185b.a(this.f386193a, this.f386194b, ql0Var);
        }

        @Override // com.yandex.mobile.ads.impl.qz0
        public final void a() {
            ho1.this.f386185b.a(this.f386193a, this.f386194b, ho1.this.f386188e);
            ho1.this.f386185b.a(this.f386193a, this.f386194b, (ql0) null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@j.N Context context) {
        this.f386192i = true;
        this.f386190g = null;
        this.f386191h = null;
        this.f386186c.a();
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@j.N Context context, @j.N AdResponse<String> adResponse) {
        if (this.f386192i) {
            return;
        }
        this.f386190g = adResponse;
        this.f386186c.a(adResponse, new b(this, 0), new a(context, adResponse));
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@j.N T t12, @j.N Activity activity) {
        AdResponse<String> adResponse = this.f386190g;
        if (adResponse == null || this.f386191h == null) {
            return;
        }
        this.f386189f.a(activity, new C39357q0(new C39357q0.a(adResponse).a(this.f386187d.l()).a(this.f386191h)), t12.g());
        this.f386190g = null;
        this.f386191h = null;
    }
}
