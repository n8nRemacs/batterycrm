package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class jm0 implements hx {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final hv0 f386916a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final as0 f386917b = new as0(false);

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final gv0 f386918c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC39327g1 f386919d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final no f386920e;

    public class a implements bs0, l91 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.bs0
        /* renamed from: a */
        public final void mo126a() {
            jm0.this.f386916a.a();
        }

        public /* synthetic */ a(jm0 jm0Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.l91
        public final void a(long j12) {
            long jA2 = jm0.this.f386918c.a() + (jm0.this.f386920e.a() - j12);
            jm0.this.f386916a.a(jm0.this.f386919d.a(), jA2);
        }
    }

    public jm0(@j.N hv0 hv0Var, @j.N f91 f91Var) {
        this.f386916a = hv0Var;
        this.f386918c = f91Var.c();
        this.f386919d = f91Var.a();
        this.f386920e = f91Var.b();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void invalidate() {
        this.f386917b.a();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void pause() {
        this.f386917b.b();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void resume() {
        this.f386917b.d();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void start() {
        a aVar = new a(this, 0);
        this.f386917b.a(this.f386920e.a(), aVar);
        this.f386917b.a(aVar);
    }
}
