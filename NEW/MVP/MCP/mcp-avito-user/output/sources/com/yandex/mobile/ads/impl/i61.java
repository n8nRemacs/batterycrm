package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.yandex.mobile.ads.impl.gr0;
import com.yandex.mobile.ads.impl.q91;
import j.InterfaceC42151g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes8.dex */
public final class i61 extends GLSurfaceView {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f386340a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f386341b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final Sensor f386342c;

    /* renamed from: d, reason: collision with root package name */
    private final gr0 f386343d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f386344e;

    /* renamed from: f, reason: collision with root package name */
    private final p11 f386345f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private SurfaceTexture f386346g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private Surface f386347h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f386348i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f386349j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f386350k;

    public interface b {
        void a(Surface surface);

        void b();
    }

    public i61(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Surface surface = this.f386347h;
        if (surface != null) {
            Iterator<b> it = this.f386340a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        SurfaceTexture surfaceTexture = this.f386346g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        this.f386346g = null;
        this.f386347h = null;
    }

    private void d() {
        boolean z12 = this.f386348i && this.f386349j;
        Sensor sensor = this.f386342c;
        if (sensor == null || z12 == this.f386350k) {
            return;
        }
        if (z12) {
            this.f386341b.registerListener(this.f386343d, sensor, 0);
        } else {
            this.f386341b.unregisterListener(this.f386343d);
        }
        this.f386350k = z12;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f386344e.post(new J(this, 6));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f386349j = false;
        d();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f386349j = true;
        d();
    }

    public void setDefaultStereoMode(int i12) {
        this.f386345f.a(i12);
    }

    public void setUseSensorRotation(boolean z12) {
        this.f386348i = z12;
        d();
    }

    public i61(Context context, @j.P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f386340a = new CopyOnWriteArrayList<>();
        this.f386344e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) db.a(context.getSystemService("sensor"));
        this.f386341b = sensorManager;
        Sensor defaultSensor = pc1.f388768a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f386342c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        p11 p11Var = new p11();
        this.f386345f = p11Var;
        a aVar = new a(p11Var);
        View.OnTouchListener q91Var = new q91(context, aVar);
        this.f386343d = new gr0(((WindowManager) db.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), q91Var, aVar);
        this.f386348i = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(q91Var);
    }

    public final kh1 b() {
        return this.f386345f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SurfaceTexture surfaceTexture) {
        this.f386344e.post(new H(15, this, surfaceTexture));
    }

    public final ci a() {
        return this.f386345f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f386346g;
        Surface surface = this.f386347h;
        Surface surface2 = new Surface(surfaceTexture);
        this.f386346g = surfaceTexture;
        this.f386347h = surface2;
        Iterator<b> it = this.f386340a.iterator();
        while (it.hasNext()) {
            it.next().a(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    @j.k0
    public final class a implements GLSurfaceView.Renderer, q91.a, gr0.a {

        /* renamed from: a, reason: collision with root package name */
        private final p11 f386351a;

        /* renamed from: d, reason: collision with root package name */
        private final float[] f386354d;

        /* renamed from: e, reason: collision with root package name */
        private final float[] f386355e;

        /* renamed from: f, reason: collision with root package name */
        private final float[] f386356f;

        /* renamed from: g, reason: collision with root package name */
        private float f386357g;

        /* renamed from: h, reason: collision with root package name */
        private float f386358h;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f386352b = new float[16];

        /* renamed from: c, reason: collision with root package name */
        private final float[] f386353c = new float[16];

        /* renamed from: i, reason: collision with root package name */
        private final float[] f386359i = new float[16];

        /* renamed from: j, reason: collision with root package name */
        private final float[] f386360j = new float[16];

        public a(p11 p11Var) {
            float[] fArr = new float[16];
            this.f386354d = fArr;
            float[] fArr2 = new float[16];
            this.f386355e = fArr2;
            float[] fArr3 = new float[16];
            this.f386356f = fArr3;
            this.f386351a = p11Var;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f386358h = 3.1415927f;
        }

        @Override // com.yandex.mobile.ads.impl.gr0.a
        @InterfaceC42151g
        public final synchronized void a(float[] fArr, float f12) {
            float[] fArr2 = this.f386354d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f13 = -f12;
            this.f386358h = f13;
            Matrix.setRotateM(this.f386355e, 0, -this.f386357g, (float) Math.cos(f13), (float) Math.sin(this.f386358h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f386360j, 0, this.f386354d, 0, this.f386356f, 0);
                Matrix.multiplyMM(this.f386359i, 0, this.f386355e, 0, this.f386360j, 0);
            }
            Matrix.multiplyMM(this.f386353c, 0, this.f386352b, 0, this.f386359i, 0);
            this.f386351a.a(this.f386353c);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i12, int i13) {
            GLES20.glViewport(0, 0, i12, i13);
            float f12 = i12 / i13;
            Matrix.perspectiveM(this.f386352b, 0, f12 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f12)) * 2.0d) : 90.0f, f12, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            i61.this.b(this.f386351a.a());
        }

        @j.j0
        public final synchronized void a(PointF pointF) {
            float f12 = pointF.y;
            this.f386357g = f12;
            Matrix.setRotateM(this.f386355e, 0, -f12, (float) Math.cos(this.f386358h), (float) Math.sin(this.f386358h), 0.0f);
            Matrix.setRotateM(this.f386356f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }
    }
}
