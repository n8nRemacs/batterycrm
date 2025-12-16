package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2;

/* loaded from: classes8.dex */
final class p11 implements kh1, ci {

    /* renamed from: j, reason: collision with root package name */
    private int f388702j;

    /* renamed from: k, reason: collision with root package name */
    private SurfaceTexture f388703k;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private byte[] f388706n;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f388694b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f388695c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private final qv0 f388696d = new qv0();

    /* renamed from: e, reason: collision with root package name */
    private final ax f388697e = new ax();

    /* renamed from: f, reason: collision with root package name */
    private final h91<Long> f388698f = new h91<>();

    /* renamed from: g, reason: collision with root package name */
    private final h91<ov0> f388699g = new h91<>();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f388700h = new float[16];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f388701i = new float[16];

    /* renamed from: l, reason: collision with root package name */
    private volatile int f388704l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f388705m = -1;

    @Override // com.yandex.mobile.ads.impl.ci
    public final void f() {
        this.f388698f.a();
        this.f388697e.a();
        this.f388695c.set(true);
    }

    public final void a(int i12) {
        this.f388704l = i12;
    }

    public final SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        qy.a();
        this.f388696d.a();
        qy.a();
        this.f388702j = qy.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f388702j);
        this.f388703k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.yandex.mobile.ads.impl.E1
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f383197b.a(surfaceTexture2);
            }
        });
        return this.f388703k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.f388694b.set(true);
    }

    public final void a(float[] fArr) {
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        qy.a();
        if (this.f388694b.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f388703k;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            qy.a();
            if (this.f388695c.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f388700h, 0);
            }
            long timestamp = this.f388703k.getTimestamp();
            Long lA2 = this.f388698f.a(timestamp);
            if (lA2 != null) {
                this.f388697e.a(lA2.longValue(), this.f388700h);
            }
            ov0 ov0VarB = this.f388699g.b(timestamp);
            if (ov0VarB != null) {
                this.f388696d.a(ov0VarB);
            }
        }
        Matrix.multiplyMM(this.f388701i, 0, fArr, 0, this.f388700h, 0);
        this.f388696d.a(this.f388702j, this.f388701i);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    @Override // com.yandex.mobile.ads.impl.kh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r33, long r35, com.yandex.mobile.ads.impl.vw r37, @j.P android.media.MediaFormat r38) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.p11.a(long, long, com.yandex.mobile.ads.impl.vw, android.media.MediaFormat):void");
    }

    @Override // com.yandex.mobile.ads.impl.ci
    public final void a(long j12, float[] fArr) {
        this.f388697e.b(j12, fArr);
    }
}
