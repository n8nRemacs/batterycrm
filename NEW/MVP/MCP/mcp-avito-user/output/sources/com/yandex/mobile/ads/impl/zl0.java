package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class zl0 implements hx {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private k2 f392290a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final as0 f392291b = new as0(false);

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final no f392292c;

    public class a implements bs0 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.bs0
        /* renamed from: a */
        public final void mo126a() {
            zl0.a(zl0.this);
        }

        public /* synthetic */ a(zl0 zl0Var, int i12) {
            this();
        }
    }

    public zl0(@j.N k2 k2Var, @j.N f91 f91Var) {
        this.f392290a = k2Var;
        this.f392292c = f91Var.b();
    }

    public static void a(zl0 zl0Var) {
        k2 k2Var = zl0Var.f392290a;
        if (k2Var != null) {
            k2Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void invalidate() {
        this.f392291b.a();
        this.f392290a = null;
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void pause() {
        this.f392291b.b();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void resume() {
        this.f392291b.d();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void start() {
        a aVar = new a(this, 0);
        this.f392291b.a(this.f392292c.a(), aVar);
    }
}
