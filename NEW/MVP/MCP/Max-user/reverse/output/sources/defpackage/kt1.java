package defpackage;

import android.opengl.EGL14;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.ui.internal.VoipVideoRenderer;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.android.webrtc.opengl.CallVideoFrameDrawer$CallVideoFrameDrawerError;

/* loaded from: classes2.dex */
public final class kt1 extends zg1 {
    public static final AtomicInteger m = new AtomicInteger(0);
    public final String b;
    public final CopyOnWriteArrayList c;
    public final AtomicReference d;
    public final dq0 e;
    public final s7c f;
    public ah1 g;
    public final Object h;
    public Surface i;
    public final String j;
    public RendererCommon.GlDrawer k;
    public final lt1 l;

    public kt1(String str) {
        this.a = EGL14.EGL_NO_SURFACE;
        this.b = str;
        this.c = new CopyOnWriteArrayList();
        this.d = new AtomicReference(null);
        this.e = new dq0(2);
        this.f = new s7c(7);
        this.h = new Object();
        this.j = "CallOpenGL_drawer_".concat(str);
        this.l = new lt1(str, new m2(17, this));
    }

    @Override // defpackage.zg1
    public final lt1 a() {
        return this.l;
    }

    @Override // defpackage.zg1
    public final void b(Object obj) {
        y6d y6dVar;
        this.k = (RendererCommon.GlDrawer) obj;
        long jNanoTime = System.nanoTime();
        lt1 lt1Var = this.l;
        lt1Var.g = jNanoTime;
        lt1Var.f = 0;
        lt1Var.h = 0L;
        lt1Var.i = 0L;
        lt1Var.c.set(0);
        lt1Var.d.set(0);
        ah1 ah1Var = this.g;
        if (ah1Var == null || (y6dVar = ah1Var.a) == null) {
            throw new CallVideoFrameDrawer$CallVideoFrameDrawerError("Render is missing inside onInitialize() callback");
        }
        y6dVar.log(this.j, "Instance " + this.b + " initialized. Total count is " + m.incrementAndGet());
    }

    @Override // defpackage.zg1
    public final void c(yg1 yg1Var) {
        y6d y6dVar;
        synchronized (this.h) {
            this.i = null;
            ah1 ah1Var = this.g;
            if (ah1Var != null && (y6dVar = ah1Var.a) != null) {
                this.g = null;
                VideoFrame videoFrame = (VideoFrame) this.d.getAndSet(null);
                if (videoFrame != null) {
                    videoFrame.release();
                }
                RendererCommon.GlDrawer glDrawer = this.k;
                if (glDrawer != null) {
                    glDrawer.release();
                }
                this.k = null;
                int iDecrementAndGet = m.decrementAndGet();
                y6dVar.log(this.j, "Instance " + this.b + " released. Remaining count is " + iDecrementAndGet);
            }
        }
    }

    @Override // defpackage.zg1
    public final void d(ah1 ah1Var, yg1 yg1Var) {
        float fFloatValue;
        VideoFrame videoFrame = (VideoFrame) this.d.getAndSet(null);
        if (videoFrame == null) {
            return;
        }
        dq0 dq0Var = this.e;
        synchronized (dq0Var) {
            long j = dq0Var.c;
            if (j > 0) {
                if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
                    long jNanoTime = System.nanoTime();
                    long j2 = dq0Var.b;
                    if (jNanoTime >= j2) {
                        long j3 = j2 + dq0Var.c;
                        dq0Var.b = j3;
                        dq0Var.b = Math.max(j3, jNanoTime);
                    }
                }
            }
            try {
                int rotatedWidth = videoFrame.getRotatedWidth();
                int rotatedHeight = videoFrame.getRotatedHeight();
                float f = rotatedWidth / rotatedHeight;
                s7c s7cVar = this.f;
                Float fValueOf = (Float) ((AtomicReference) s7cVar.a).get();
                if (fValueOf != null && fValueOf.floatValue() == 0.0f) {
                    fValueOf = Float.valueOf(f);
                }
                float f2 = 1.0f;
                if (f > fValueOf.floatValue()) {
                    float fFloatValue2 = fValueOf.floatValue() / f;
                    fFloatValue = 1.0f;
                    f2 = fFloatValue2;
                } else {
                    fFloatValue = f / fValueOf.floatValue();
                }
                ah1Var.b(yg1Var, this, videoFrame, new al1(f2, fFloatValue, ((AtomicBoolean) s7cVar.b).get()));
                this.l.f++;
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    VoipVideoRenderer.drawerListener$lambda$1(((bjh) ((jt1) it.next())).a, rotatedWidth, rotatedHeight);
                }
            } finally {
                videoFrame.release();
            }
        }
    }
}
