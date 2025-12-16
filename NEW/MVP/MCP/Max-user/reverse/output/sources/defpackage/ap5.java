package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ap5 extends j3 {
    public static final int[] G0 = {2, 3, 6, 7, 8, 9, 11, 14};
    public static final int[] H0 = {1920, 1088};
    public static final long I0;
    public yj6 A0;
    public boolean B0;
    public ScheduledFuture C0;
    public CountDownLatch D0;
    public volatile boolean E0;
    public volatile RuntimeException F0;
    public final int X;
    public final Surface Y;
    public final SurfaceTexture Z;
    public final xo8 d;
    public jp4 o;
    public final float[] s0;
    public final ConcurrentLinkedQueue t0;
    public final ScheduledExecutorService u0;
    public final boolean v0;
    public int w0;
    public int x0;
    public boolean y0;
    public yj6 z0;

    static {
        I0 = zxg.P() ? 20000L : 500L;
    }

    public ap5(xo8 xo8Var, final iy1 iy1Var, boolean z, boolean z2) throws VideoFrameProcessingException {
        super(iy1Var);
        this.d = xo8Var;
        this.B0 = z;
        this.v0 = z2;
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            guf.d();
            int i = iArr[0];
            guf.b(36197, i, 9729);
            this.X = i;
            SurfaceTexture surfaceTexture = new SurfaceTexture(i);
            this.Z = surfaceTexture;
            this.s0 = new float[16];
            this.t0 = new ConcurrentLinkedQueue();
            this.u0 = Executors.newSingleThreadScheduledExecutor(new nn3(3, "ExtTexMgr:Timer"));
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: zo5
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    iy1Var.g(new yo5(this.a, 4), false);
                }
            });
            this.Y = new Surface(surfaceTexture);
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    public static float C(int i, float f, int i2) {
        float fAbs = 1.0f;
        for (int i3 = 0; i3 <= 2; i3++) {
            float f2 = ((i2 - i3) / i) - f;
            if (Math.abs(f2) < fAbs) {
                fAbs = Math.abs(f2);
            }
        }
        return fAbs;
    }

    public static float z(int i, float f) {
        int i2 = i;
        for (int i3 = 2; i3 <= 256; i3 *= 2) {
            int i4 = (((i + i3) - 1) / i3) * i3;
            if (C(i4, f, i) < C(i2, f, i)) {
                i2 = i4;
            }
        }
        for (int i5 = 0; i5 < 2; i5++) {
            int i6 = H0[i5];
            if (i6 >= i && C(i6, f, i) < C(i2, f, i)) {
                i2 = i6;
            }
        }
        return C(i2, f, i) > 1.0E-9f ? f : i / i2;
    }

    public final void A() {
        if (this.w0 == 0 || this.x0 == 0 || this.z0 != null) {
            return;
        }
        this.Z.updateTexImage();
        this.x0--;
        yj6 yj6Var = (yj6) this.t0.element();
        this.z0 = yj6Var;
        this.w0--;
        this.Z.getTransformMatrix(this.s0);
        long timestamp = (this.Z.getTimestamp() / 1000) + yj6Var.b;
        if (this.v0) {
            float[] fArr = this.s0;
            hf6 hf6Var = yj6Var.a;
            int i = hf6Var.u;
            int i2 = hf6Var.v;
            int i3 = fArr.length != 16 ? 1 : 0;
            int[] iArr = G0;
            for (int i4 = 0; i4 < 8; i4++) {
                i3 |= Math.abs(fArr[iArr[i4]]) > 1.0E-9f ? 1 : 0;
            }
            int i5 = i3 | (Math.abs(fArr[10] - 1.0f) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[15] - 1.0f) > 1.0E-9f ? 1 : 0);
            char c = '\r';
            char c2 = '\f';
            char c3 = 4;
            if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
                i = (Math.abs(fArr[4]) <= 1.0E-9f ? 0 : 1) | i5 | (Math.abs(fArr[1]) > 1.0E-9f ? 1 : 0);
                c2 = '\r';
                c = '\f';
                c3 = 5;
            } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
                i = -1;
                c = 65535;
                c2 = 65535;
                c3 = 65535;
            } else {
                i = 1;
                i = i5 | (Math.abs(fArr[0]) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[5]) > 1.0E-9f ? 1 : 0);
            }
            if (i != 0) {
                LinkedHashMap linkedHashMap = ah4.a;
                synchronized (ah4.class) {
                }
            } else {
                float f = fArr[i];
                float f2 = fArr[c];
                if (Math.abs(f) + 1.0E-9f < 1.0f) {
                    float fCopySign = Math.copySign(z(i, Math.abs(f)), f);
                    float fI = utb.i(f, fCopySign, 0.5f, f2);
                    LinkedHashMap linkedHashMap2 = ah4.a;
                    synchronized (ah4.class) {
                    }
                    fArr[i] = fCopySign;
                    fArr[c] = fI;
                }
                float f3 = fArr[c3];
                float f4 = fArr[c2];
                if (Math.abs(f3) + 1.0E-9f < 1.0f) {
                    float fCopySign2 = Math.copySign(z(i2, Math.abs(f3)), f3);
                    float fI2 = utb.i(f3, fCopySign2, 0.5f, f4);
                    LinkedHashMap linkedHashMap3 = ah4.a;
                    synchronized (ah4.class) {
                    }
                    fArr[c3] = fCopySign2;
                    fArr[c2] = fI2;
                }
            }
        }
        jp4 jp4Var = this.o;
        jp4Var.getClass();
        jp4Var.h.z("uTexTransformationMatrix", this.s0);
        jp4 jp4Var2 = this.o;
        jp4Var2.getClass();
        xo8 xo8Var = this.d;
        int i6 = this.X;
        hf6 hf6Var2 = yj6Var.a;
        jp4Var2.d(xo8Var, new tu6(i6, -1, hf6Var2.u, hf6Var2.v), timestamp);
        hsi.h((yj6) this.t0.remove());
        ah4.a();
    }

    public final void B() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        while (true) {
            int i = this.x0;
            concurrentLinkedQueue = this.t0;
            if (i <= 0) {
                break;
            }
            this.x0 = i - 1;
            this.Z.updateTexImage();
            concurrentLinkedQueue.remove();
        }
        if (this.D0 == null || !concurrentLinkedQueue.isEmpty()) {
            return;
        }
        this.D0.countDown();
    }

    @Override // defpackage.j3
    public final void e() {
        this.E0 = true;
    }

    @Override // defpackage.j3
    public final void f() {
        this.w0 = 0;
        this.z0 = null;
        this.t0.clear();
        this.A0 = null;
        super.f();
    }

    @Override // defpackage.j3
    public final Surface g() {
        return this.Y;
    }

    @Override // defpackage.j3
    public final int h() {
        return this.t0.size();
    }

    @Override // defpackage.qu6
    public final void m() {
        ((iy1) this.a).g(new yo5(this, 6), true);
    }

    @Override // defpackage.j3
    public final void n(yj6 yj6Var) {
        this.A0 = yj6Var;
        if (!this.B0) {
            this.t0.add(yj6Var);
        }
        ((iy1) this.a).g(new yo5(this, 1), true);
    }

    @Override // defpackage.qu6
    public final void o(tu6 tu6Var) {
        ((iy1) this.a).g(new yo5(this, 5), true);
    }

    @Override // defpackage.j3
    public final void q() {
        this.Z.release();
        this.Y.release();
        this.u0.shutdownNow();
    }

    @Override // defpackage.j3
    public final void s() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.D0 = countDownLatch;
        ((iy1) this.a).g(new yo5(this, 3), true);
        try {
            if (!countDownLatch.await(I0, TimeUnit.MILLISECONDS)) {
                a8i.l("ExtTexMgr", "Timeout reached while waiting for latch to be unblocked.");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            a8i.l("ExtTexMgr", "Interrupted when waiting for MediaCodec frames to arrive.");
        }
        this.D0 = null;
        if (this.F0 != null) {
            throw this.F0;
        }
    }

    @Override // defpackage.j3
    public final void u(yj6 yj6Var, boolean z) {
        this.B0 = z;
        if (z) {
            this.A0 = yj6Var;
            hf6 hf6Var = yj6Var.a;
            this.Z.setDefaultBufferSize(hf6Var.u, hf6Var.v);
        }
    }

    @Override // defpackage.j3
    public final void w(jp4 jp4Var) {
        ((iy1) this.a).g(new o72(this, 2, jp4Var), true);
    }

    @Override // defpackage.j3
    public final void x() {
        ((iy1) this.a).g(new yo5(this, 2), true);
    }
}
