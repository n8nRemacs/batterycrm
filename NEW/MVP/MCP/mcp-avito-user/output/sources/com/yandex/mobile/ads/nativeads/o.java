package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.a4;
import com.yandex.mobile.ads.impl.az0;
import com.yandex.mobile.ads.impl.bl0;
import com.yandex.mobile.ads.impl.bn0;
import com.yandex.mobile.ads.impl.dl0;
import com.yandex.mobile.ads.impl.ek0;
import com.yandex.mobile.ads.impl.fk0;
import com.yandex.mobile.ads.impl.g5;
import com.yandex.mobile.ads.impl.gl0;
import com.yandex.mobile.ads.impl.i5;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.n80;
import com.yandex.mobile.ads.impl.oe;
import com.yandex.mobile.ads.impl.ok0;
import com.yandex.mobile.ads.impl.q71;
import com.yandex.mobile.ads.impl.re;
import com.yandex.mobile.ads.impl.rk0;
import com.yandex.mobile.ads.impl.w2;
import com.yandex.mobile.ads.impl.y6;
import com.yandex.mobile.ads.impl.z3;
import com.yandex.mobile.ads.impl.zm0;
import j.N;
import j.P;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class o extends re<bl0> {

    /* renamed from: A, reason: collision with root package name */
    @N
    private final t f392696A;

    /* renamed from: B, reason: collision with root package name */
    @N
    private final a4 f392697B;

    /* renamed from: C, reason: collision with root package name */
    @N
    private final q71 f392698C;

    /* renamed from: D, reason: collision with root package name */
    @P
    private az0<bl0> f392699D;

    /* renamed from: E, reason: collision with root package name */
    @P
    private NativeAdRequestConfiguration f392700E;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final rk0 f392701F;

    /* renamed from: w, reason: collision with root package name */
    @N
    private final ek0 f392702w;

    /* renamed from: x, reason: collision with root package name */
    @N
    private final fk0 f392703x;

    /* renamed from: y, reason: collision with root package name */
    @N
    private final dl0 f392704y;

    /* renamed from: z, reason: collision with root package name */
    @N
    private final gl0 f392705z;

    public o(@N Context context, @N ko1 ko1Var, @N t tVar, @N a4 a4Var) {
        super(context, y6.f391938e, a4Var);
        this.f392696A = tVar;
        this.f392697B = a4Var;
        this.f392702w = new a();
        this.f392703x = new fk0(context, ko1Var, d(), a4Var);
        this.f392704y = new dl0();
        gl0 gl0Var = new gl0();
        this.f392705z = gl0Var;
        tVar.a(gl0Var);
        this.f392701F = new rk0(context, this);
        this.f392698C = q71.a();
    }

    @Override // com.yandex.mobile.ads.impl.re
    public final boolean a(@P g5 g5Var) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.re
    public final synchronized void b(@P g5 g5Var) {
        throw null;
    }

    @Override // com.yandex.mobile.ads.impl.re
    @SuppressLint({"VisibleForTests"})
    @P
    public final w2 s() {
        return this.f389503k.c();
    }

    public final void t() {
        b();
        this.f389504l.a();
        this.f389495c.a();
        this.f392696A.a();
        this.f392698C.a(n80.f388181a, this);
        a();
        this.f392703x.a();
    }

    @j.k0
    public class a implements ek0 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ek0
        public final void a(@N w2 w2Var) {
            o.this.f392697B.a(z3.f392163c);
            o.this.b(w2Var);
        }

        @Override // com.yandex.mobile.ads.impl.ek0
        public final void a(@N NativeAd nativeAd) {
            o.this.o();
            o.this.f392696A.a(nativeAd);
        }

        @Override // com.yandex.mobile.ads.impl.ek0
        public final void a(@N ArrayList arrayList) {
            o.this.o();
            o.this.f392696A.a(arrayList);
        }

        @Override // com.yandex.mobile.ads.impl.ek0
        public final void a(@N SliderAd sliderAd) {
            o.this.o();
            o.this.f392696A.a(sliderAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.re, com.yandex.mobile.ads.impl.kz0.b
    public final void a(@N AdResponse<bl0> adResponse) {
        super.a((AdResponse) adResponse);
        this.f392705z.a(adResponse);
        if (j()) {
            return;
        }
        this.f392704y.getClass();
        dl0.a(adResponse).a(this).a(this.f389494b, adResponse);
    }

    public final void a(@N AdResponse<bl0> adResponse, @N ok0 ok0Var, @P String str) {
        b(str);
        if (j()) {
            return;
        }
        this.f392703x.a(this.f389494b, adResponse, adResponse.B(), ok0Var, this.f392702w);
    }

    @Override // com.yandex.mobile.ads.impl.re
    @N
    public final oe<bl0> a(@N String str, @N String str2) {
        return this.f392701F.a(this.f392699D, this.f389498f, this.f392700E, str, str2);
    }

    public final void a(@N NativeAdRequestConfiguration nativeAdRequestConfiguration, @N zm0 zm0Var, @N bn0 bn0Var, @N az0<bl0> az0Var, int i12) {
        this.f392700E = nativeAdRequestConfiguration;
        this.f392699D = az0Var;
        if (az0Var.a()) {
            this.f392697B.b(z3.f392163c);
            this.f392698C.b(n80.f388181a, this);
            this.f389498f.a(i12);
            this.f389498f.a(nativeAdRequestConfiguration.a());
            this.f389498f.a(zm0Var);
            this.f389498f.a(nativeAdRequestConfiguration.j());
            this.f389498f.a(bn0Var);
            g5 g5VarA = new g5.a().a(nativeAdRequestConfiguration.b()).b(nativeAdRequestConfiguration.c()).c(nativeAdRequestConfiguration.d()).a(nativeAdRequestConfiguration.e()).d(nativeAdRequestConfiguration.f()).a(nativeAdRequestConfiguration.g()).a(nativeAdRequestConfiguration.h()).a(nativeAdRequestConfiguration.i()).a();
            synchronized (this) {
                c(g5VarA);
            }
            return;
        }
        b(i5.f386320l);
    }

    @Override // com.yandex.mobile.ads.impl.re
    public final void a(@N w2 w2Var) {
        this.f392696A.b(w2Var);
    }

    public final void a(@P NativeAdLoadListener nativeAdLoadListener) {
        this.f392696A.a(nativeAdLoadListener);
    }

    public final void a(@P NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f392696A.a(nativeBulkAdLoadListener);
    }

    public final void a(@P SliderAdLoadListener sliderAdLoadListener) {
        this.f392696A.a(sliderAdLoadListener);
    }
}
