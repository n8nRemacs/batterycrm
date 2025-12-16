package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* loaded from: classes8.dex */
public final class xm0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f391771a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final wm0 f391772b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final fk0 f391773c;

    public interface b {
        void a(@j.N w2 w2Var);

        void a(@j.N NativeAd nativeAd);
    }

    public xm0(@j.N Context context, @j.N ko1 ko1Var, @j.N n2 n2Var, @j.N a4 a4Var) {
        Context applicationContext = context.getApplicationContext();
        this.f391771a = applicationContext;
        n2Var.a(zm0.f392297b);
        this.f391772b = new wm0(context);
        this.f391773c = new fk0(applicationContext, ko1Var, n2Var, a4Var);
    }

    public final void a(@j.N AdResponse<String> adResponse, @j.N b bVar, @j.N qz0 qz0Var) {
        this.f391772b.a(adResponse, new a(adResponse, bVar, qz0Var));
    }

    public class a implements qz0 {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final AdResponse<String> f391774a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final b f391775b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final qz0 f391776c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final bo1 f391777d = new bo1();

        public a(AdResponse<String> adResponse, @j.N b bVar, @j.N qz0 qz0Var) {
            this.f391774a = adResponse;
            this.f391775b = bVar;
            this.f391776c = qz0Var;
        }

        @Override // com.yandex.mobile.ads.impl.qz0
        public final void a() {
            w2 w2Var = i5.f386312d;
            this.f391776c.a();
            this.f391775b.a(w2Var);
        }

        @Override // com.yandex.mobile.ads.impl.qz0
        public final void a(@j.N bl0 bl0Var) {
            this.f391776c.a(bl0Var);
            AdResponse<String> adResponse = this.f391774a;
            b bVar = this.f391775b;
            this.f391777d.getClass();
            com.yandex.mobile.ads.nativeads.q0 q0Var = new com.yandex.mobile.ads.nativeads.q0();
            xm0.this.f391773c.a(xm0.this.f391771a, adResponse, bl0Var, new ok0(new xm1(adResponse), new wm1(), q0Var, new wn1(adResponse), new no1()), new wl0(bVar));
        }
    }

    public final void a() {
        this.f391773c.a();
    }
}
