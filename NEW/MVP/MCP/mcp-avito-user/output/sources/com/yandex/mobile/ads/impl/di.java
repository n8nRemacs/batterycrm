package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class di extends ff {

    /* renamed from: n, reason: collision with root package name */
    private final vn f384606n;

    /* renamed from: o, reason: collision with root package name */
    private final pr0 f384607o;

    /* renamed from: p, reason: collision with root package name */
    private long f384608p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    private ci f384609q;

    /* renamed from: r, reason: collision with root package name */
    private long f384610r;

    public di() {
        super(6);
        this.f384606n = new vn(1);
        this.f384607o = new pr0();
    }

    @Override // com.yandex.mobile.ads.impl.vx0
    public final int a(vw vwVar) {
        return "application/x-camera-motion".equals(vwVar.f391181l) ? vx0.a(4) : vx0.a(0);
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ux0, com.yandex.mobile.ads.impl.vx0
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void u() {
        ci ciVar = this.f384609q;
        if (ciVar != null) {
            ciVar.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ff, com.yandex.mobile.ads.impl.kt0.b
    public final void a(int i12, @j.P Object obj) {
        if (i12 == 8) {
            this.f384609q = (ci) obj;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void a(vw[] vwVarArr, long j12, long j13) {
        this.f384608p = j13;
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void a(long j12, boolean z12) {
        this.f384610r = Long.MIN_VALUE;
        ci ciVar = this.f384609q;
        if (ciVar != null) {
            ciVar.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void a(long j12, long j13) {
        float[] fArr;
        while (!e() && this.f384610r < 100000 + j12) {
            this.f384606n.b();
            if (a(q(), this.f384606n, 0) != -4 || this.f384606n.f()) {
                return;
            }
            vn vnVar = this.f384606n;
            this.f384610r = vnVar.f390953e;
            if (this.f384609q != null && !vnVar.e()) {
                this.f384606n.h();
                ByteBuffer byteBuffer = this.f384606n.f390951c;
                int i12 = pc1.f388768a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.f384607o.a(byteBuffer.limit(), byteBuffer.array());
                    this.f384607o.e(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i13 = 0; i13 < 3; i13++) {
                        fArr2[i13] = Float.intBitsToFloat(this.f384607o.k());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f384609q.a(this.f384610r - this.f384608p, fArr);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final boolean a() {
        return e();
    }
}
