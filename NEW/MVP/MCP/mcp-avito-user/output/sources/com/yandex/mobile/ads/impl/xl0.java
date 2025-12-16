package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
final class xl0 implements hx {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final wj f391763a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final gv0 f391764b;

    /* renamed from: e, reason: collision with root package name */
    private final long f391767e;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final a f391766d = new a(this, 0);

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final as0 f391765c = new as0(false);

    public class a implements bs0 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.bs0
        /* renamed from: a */
        public final void mo126a() {
            xl0.a(xl0.this);
        }

        public /* synthetic */ a(xl0 xl0Var, int i12) {
            this();
        }
    }

    public xl0(@j.N AdResponse adResponse, @j.N wj wjVar, @j.N f91 f91Var) {
        this.f391763a = wjVar;
        this.f391764b = f91Var.c();
        this.f391767e = yl0.a(adResponse);
    }

    public static void a(xl0 xl0Var) {
        xl0Var.f391763a.a();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void invalidate() {
        this.f391765c.a();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void pause() {
        this.f391765c.b();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void resume() {
        this.f391765c.d();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void start() {
        this.f391765c.a(Math.max(0L, this.f391767e - this.f391764b.a()), this.f391766d);
    }
}
