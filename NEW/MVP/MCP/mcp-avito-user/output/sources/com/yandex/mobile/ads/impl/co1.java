package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.xm0;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* loaded from: classes8.dex */
public final class co1 implements ud {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.banner.f f384358a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final xm0 f384359b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ee f384360c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final pl0 f384361d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final an1 f384362e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final sl0 f384363f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final Handler f384364g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private final q21 f384365h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    private final n70 f384366i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    private final sd f384367j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    private final ViewTreeObserver.OnPreDrawListener f384368k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    private AdResponse<String> f384369l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    private NativeAd f384370m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f384371n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    private de f384372o;

    public co1(@Y61.k com.yandex.mobile.ads.banner.f fVar, @Y61.k ko1 ko1Var, @Y61.k xm0 xm0Var, @Y61.k ee eeVar, @Y61.k pl0 pl0Var, @Y61.k an1 an1Var, @Y61.k sl0 sl0Var, @Y61.k Handler handler, @Y61.k q21 q21Var, @Y61.k n70 n70Var, @Y61.k sd sdVar) {
        this.f384358a = fVar;
        this.f384359b = xm0Var;
        this.f384360c = eeVar;
        this.f384361d = pl0Var;
        this.f384362e = an1Var;
        this.f384363f = sl0Var;
        this.f384364g = handler;
        this.f384365h = q21Var;
        this.f384366i = n70Var;
        this.f384367j = sdVar;
        this.f384368k = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.mobile.ads.impl.D
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return co1.g(this.f383187b);
            }
        };
    }

    public static final void f(co1 co1Var) {
        co1Var.f384369l = null;
        co1Var.f384370m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(co1 co1Var) {
        co1Var.f384366i.a(co1Var.f384358a.d(), co1Var.f384358a.x());
        co1Var.f384364g.postDelayed(new E(co1Var, 0), 50L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(co1 co1Var) {
        fj1.a(co1Var.f384358a.x(), false);
    }

    public final class a implements qz0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final Context f384373a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final AdResponse<?> f384374b;

        public a(Context context, @Y61.k AdResponse<?> adResponse) {
            this.f384373a = context;
            this.f384374b = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.qz0
        public final void a() {
            w2 w2Var = i5.f386309a;
            co1.this.f384362e.a(this.f384373a, this.f384374b, co1.this.f384361d);
            co1.this.f384362e.a(this.f384373a, this.f384374b, (ql0) null);
        }

        @Override // com.yandex.mobile.ads.impl.qz0
        public final void a(@Y61.k bl0 bl0Var) {
            ql0 ql0Var = new ql0(bl0Var);
            co1.this.f384362e.a(this.f384373a, this.f384374b, co1.this.f384361d);
            co1.this.f384362e.a(this.f384373a, this.f384374b, ql0Var);
        }
    }

    public final class b implements xm0.b {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.xm0.b
        public final void a(@Y61.k NativeAd nativeAd) {
            if (co1.this.f384371n) {
                return;
            }
            co1.this.f384370m = nativeAd;
            co1.this.f384364g.post(new E(co1.this, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(co1 co1Var) {
            co1Var.f384358a.p();
            co1Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.xm0.b
        public final void a(@Y61.k w2 w2Var) {
            if (co1.this.f384371n) {
                return;
            }
            co1.f(co1.this);
            co1.this.f384358a.b(w2Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ud
    public final void a(@Y61.k Context context) {
        de deVar = this.f384372o;
        if (deVar != null) {
            deVar.a();
        }
        this.f384359b.a();
        this.f384369l = null;
        this.f384370m = null;
        this.f384371n = true;
    }

    @Override // com.yandex.mobile.ads.impl.ud
    public final void a(@Y61.k Context context, @Y61.k AdResponse<String> adResponse) {
        v11 v11VarA = this.f384365h.a(context);
        if (!(v11VarA != null ? v11VarA.V() : false)) {
            this.f384358a.b(i5.f386309a);
            return;
        }
        if (this.f384371n) {
            return;
        }
        SizeInfo sizeInfoI = this.f384358a.i();
        SizeInfo sizeInfoF = adResponse.F();
        this.f384369l = adResponse;
        if (sizeInfoI != null && o41.a(context, adResponse, sizeInfoF, this.f384367j, sizeInfoI)) {
            this.f384359b.a(adResponse, new b(), new a(context, adResponse));
            return;
        }
        w2 w2VarA = i5.a(sizeInfoI != null ? sizeInfoI.c(context) : 0, sizeInfoI != null ? sizeInfoI.a(context) : 0, sizeInfoF.e(), sizeInfoF.c(), rj1.c(context), rj1.b(context));
        h70.a(w2VarA.c(), new Object[0]);
        this.f384358a.b(w2VarA);
    }

    public /* synthetic */ co1(com.yandex.mobile.ads.banner.f fVar, ko1 ko1Var) {
        this(fVar, ko1Var, new xm0(fVar.h(), ko1Var, fVar.d(), fVar.e()), new ee(), new pl0(fVar.d()), new an1(fVar.d()), new sl0(fVar), new Handler(Looper.getMainLooper()), q21.b(), new n70(fVar.h()), new sd());
    }

    public final void a() {
        NativeAd nativeAd;
        if (this.f384371n) {
            return;
        }
        AdResponse<String> adResponse = this.f384369l;
        com.yandex.mobile.ads.banner.h hVarX = this.f384358a.x();
        if (adResponse == null || (nativeAd = this.f384370m) == null) {
            return;
        }
        de deVarA = this.f384360c.a(this.f384358a.h(), adResponse, (com.yandex.mobile.ads.nativeads.u) nativeAd, hVarX, this.f384363f, this.f384368k);
        this.f384372o = deVarA;
        deVarA.b();
    }
}
