package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class bp implements zb0 {

    /* renamed from: b, reason: collision with root package name */
    private final u61 f384014b;

    /* renamed from: c, reason: collision with root package name */
    private final a f384015c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private ux0 f384016d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private zb0 f384017e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f384018f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f384019g;

    public interface a {
    }

    public bp(a aVar, c81 c81Var) {
        this.f384015c = aVar;
        this.f384014b = new u61(c81Var);
    }

    public final void a() {
        this.f384019g = true;
        this.f384014b.a();
    }

    public final void b() {
        this.f384019g = false;
        this.f384014b.b();
    }

    @Override // com.yandex.mobile.ads.impl.zb0
    public final ct0 getPlaybackParameters() {
        zb0 zb0Var = this.f384017e;
        return zb0Var != null ? zb0Var.getPlaybackParameters() : this.f384014b.getPlaybackParameters();
    }

    @Override // com.yandex.mobile.ads.impl.zb0
    public final long o() {
        if (this.f384018f) {
            return this.f384014b.o();
        }
        zb0 zb0Var = this.f384017e;
        zb0Var.getClass();
        return zb0Var.o();
    }

    public final void a(long j12) {
        this.f384014b.a(j12);
    }

    public final void b(ux0 ux0Var) {
        zb0 zb0Var;
        zb0 zb0VarL = ux0Var.l();
        if (zb0VarL == null || zb0VarL == (zb0Var = this.f384017e)) {
            return;
        }
        if (zb0Var == null) {
            this.f384017e = zb0VarL;
            this.f384016d = ux0Var;
            zb0VarL.a(this.f384014b.getPlaybackParameters());
            return;
        }
        throw lt.a(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
    }

    public final void a(ux0 ux0Var) {
        if (ux0Var == this.f384016d) {
            this.f384017e = null;
            this.f384016d = null;
            this.f384018f = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.zb0
    public final void a(ct0 ct0Var) {
        zb0 zb0Var = this.f384017e;
        if (zb0Var != null) {
            zb0Var.a(ct0Var);
            ct0Var = this.f384017e.getPlaybackParameters();
        }
        this.f384014b.a(ct0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r5) {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.ux0 r0 = r4.f384016d
            if (r0 == 0) goto L68
            boolean r0 = r0.a()
            if (r0 != 0) goto L68
            com.yandex.mobile.ads.impl.ux0 r0 = r4.f384016d
            boolean r0 = r0.d()
            if (r0 != 0) goto L1d
            if (r5 != 0) goto L68
            com.yandex.mobile.ads.impl.ux0 r5 = r4.f384016d
            boolean r5 = r5.e()
            if (r5 == 0) goto L1d
            goto L68
        L1d:
            com.yandex.mobile.ads.impl.zb0 r5 = r4.f384017e
            r5.getClass()
            long r0 = r5.o()
            boolean r2 = r4.f384018f
            if (r2 == 0) goto L46
            com.yandex.mobile.ads.impl.u61 r2 = r4.f384014b
            long r2 = r2.o()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L3a
            com.yandex.mobile.ads.impl.u61 r5 = r4.f384014b
            r5.b()
            goto L74
        L3a:
            r2 = 0
            r4.f384018f = r2
            boolean r2 = r4.f384019g
            if (r2 == 0) goto L46
            com.yandex.mobile.ads.impl.u61 r2 = r4.f384014b
            r2.a()
        L46:
            com.yandex.mobile.ads.impl.u61 r2 = r4.f384014b
            r2.a(r0)
            com.yandex.mobile.ads.impl.ct0 r5 = r5.getPlaybackParameters()
            com.yandex.mobile.ads.impl.u61 r0 = r4.f384014b
            com.yandex.mobile.ads.impl.ct0 r0 = r0.getPlaybackParameters()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L74
            com.yandex.mobile.ads.impl.u61 r0 = r4.f384014b
            r0.a(r5)
            com.yandex.mobile.ads.impl.bp$a r0 = r4.f384015c
            com.yandex.mobile.ads.impl.rt r0 = (com.yandex.mobile.ads.impl.rt) r0
            r0.a(r5)
            goto L74
        L68:
            r5 = 1
            r4.f384018f = r5
            boolean r5 = r4.f384019g
            if (r5 == 0) goto L74
            com.yandex.mobile.ads.impl.u61 r5 = r4.f384014b
            r5.a()
        L74:
            long r0 = r4.o()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bp.a(boolean):long");
    }
}
