package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.avito.android.search.filter.RunnableC34589p;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.N;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.video.spherical.d;
import com.google.android.exoplayer2.video.spherical.g;
import com.google.android.exoplayer2.video.spherical.k;
import com.google.android.exoplayer2.video.spherical.l;
import j.InterfaceC42151g;
import j.P;
import j.k0;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import okhttp3.internal.http2.Http2;

/* compiled from: SphericalGLSurfaceView.java */
/* loaded from: classes6.dex */
public final class k extends GLSurfaceView {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f348380m = 0;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f348381b;

    /* renamed from: c, reason: collision with root package name */
    public final SensorManager f348382c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final Sensor f348383d;

    /* renamed from: e, reason: collision with root package name */
    public final d f348384e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f348385f;

    /* renamed from: g, reason: collision with root package name */
    public final i f348386g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public SurfaceTexture f348387h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public Surface f348388i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f348389j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f348390k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f348391l;

    /* compiled from: SphericalGLSurfaceView.java */
    @k0
    public final class a implements GLSurfaceView.Renderer, l.a, d.a {

        /* renamed from: b, reason: collision with root package name */
        public final i f348392b;

        /* renamed from: e, reason: collision with root package name */
        public final float[] f348395e;

        /* renamed from: f, reason: collision with root package name */
        public final float[] f348396f;

        /* renamed from: g, reason: collision with root package name */
        public final float[] f348397g;

        /* renamed from: h, reason: collision with root package name */
        public float f348398h;

        /* renamed from: i, reason: collision with root package name */
        public float f348399i;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f348393c = new float[16];

        /* renamed from: d, reason: collision with root package name */
        public final float[] f348394d = new float[16];

        /* renamed from: j, reason: collision with root package name */
        public final float[] f348400j = new float[16];

        /* renamed from: k, reason: collision with root package name */
        public final float[] f348401k = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f348395e = fArr;
            float[] fArr2 = new float[16];
            this.f348396f = fArr2;
            float[] fArr3 = new float[16];
            this.f348397g = fArr3;
            this.f348392b = iVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f348399i = 3.1415927f;
        }

        @Override // com.google.android.exoplayer2.video.spherical.d.a
        @InterfaceC42151g
        public final synchronized void a(float[] fArr, float f12) {
            float[] fArr2 = this.f348395e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f13 = -f12;
            this.f348399i = f13;
            Matrix.setRotateM(this.f348396f, 0, -this.f348398h, (float) Math.cos(f13), (float) Math.sin(this.f348399i), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            Long lD2;
            e eVarD;
            float[] fArrD;
            float[] fArr;
            synchronized (this) {
                Matrix.multiplyMM(this.f348401k, 0, this.f348395e, 0, this.f348397g, 0);
                Matrix.multiplyMM(this.f348400j, 0, this.f348396f, 0, this.f348401k, 0);
            }
            Matrix.multiplyMM(this.f348394d, 0, this.f348393c, 0, this.f348400j, 0);
            i iVar = this.f348392b;
            float[] fArr2 = this.f348394d;
            GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
            GlUtil.b();
            if (iVar.f348366b.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = iVar.f348375k;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                GlUtil.b();
                if (iVar.f348367c.compareAndSet(true, false)) {
                    Matrix.setIdentityM(iVar.f348372h, 0);
                }
                long timestamp = iVar.f348375k.getTimestamp();
                N<Long> n12 = iVar.f348370f;
                synchronized (n12) {
                    lD2 = n12.d(timestamp, false);
                }
                Long l12 = lD2;
                if (l12 != null) {
                    c cVar = iVar.f348369e;
                    float[] fArr3 = iVar.f348372h;
                    long jLongValue = l12.longValue();
                    N<float[]> n13 = cVar.f348332c;
                    synchronized (n13) {
                        fArrD = n13.d(jLongValue, true);
                    }
                    float[] fArr4 = fArrD;
                    if (fArr4 != null) {
                        float f12 = fArr4[0];
                        float f13 = -fArr4[1];
                        float f14 = -fArr4[2];
                        float length = Matrix.length(f12, f13, f14);
                        float[] fArr5 = cVar.f348331b;
                        if (length != 0.0f) {
                            fArr = fArr3;
                            Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f12 / length, f13 / length, f14 / length);
                        } else {
                            fArr = fArr3;
                            Matrix.setIdentityM(fArr5, 0);
                        }
                        if (!cVar.f348333d) {
                            c.a(cVar.f348330a, cVar.f348331b);
                            cVar.f348333d = true;
                        }
                        Matrix.multiplyMM(fArr, 0, cVar.f348330a, 0, cVar.f348331b, 0);
                    }
                }
                N<e> n14 = iVar.f348371g;
                synchronized (n14) {
                    eVarD = n14.d(timestamp, true);
                }
                e eVar = eVarD;
                if (eVar != null) {
                    g gVar = iVar.f348368d;
                    gVar.getClass();
                    if (g.a(eVar)) {
                        gVar.f348353a = eVar.f348343c;
                        gVar.f348354b = new g.a(eVar.f348341a.f348345a[0]);
                        if (!eVar.f348344d) {
                            new g.a(eVar.f348342b.f348345a[0]);
                        }
                    }
                }
            }
            Matrix.multiplyMM(iVar.f348373i, 0, fArr2, 0, iVar.f348372h, 0);
            g gVar2 = iVar.f348368d;
            int i12 = iVar.f348374j;
            float[] fArr6 = iVar.f348373i;
            g.a aVar = gVar2.f348354b;
            if (aVar == null) {
                return;
            }
            int i13 = gVar2.f348353a;
            GLES20.glUniformMatrix3fv(gVar2.f348357e, 1, false, i13 == 1 ? g.f348351j : i13 == 2 ? g.f348352k : g.f348350i, 0);
            GLES20.glUniformMatrix4fv(gVar2.f348356d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i12);
            GLES20.glUniform1i(gVar2.f348360h, 0);
            GlUtil.b();
            GLES20.glVertexAttribPointer(gVar2.f348358f, 3, 5126, false, 12, (Buffer) aVar.f348362b);
            GlUtil.b();
            GLES20.glVertexAttribPointer(gVar2.f348359g, 2, 5126, false, 8, (Buffer) aVar.f348363c);
            GlUtil.b();
            GLES20.glDrawArrays(aVar.f348364d, 0, aVar.f348361a);
            GlUtil.b();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i12, int i13) {
            GLES20.glViewport(0, 0, i12, i13);
            float f12 = i12 / i13;
            Matrix.perspectiveM(this.f348393c, 0, f12 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f12)) * 2.0d) : 90.0f, f12, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            k kVar = k.this;
            kVar.f348385f.post(new RunnableC34589p(28, kVar, this.f348392b.a()));
        }
    }

    /* compiled from: SphericalGLSurfaceView.java */
    public interface b {
        void f(Surface surface);

        void g();
    }

    public k(Context context) {
        super(context, null);
        this.f348381b = new CopyOnWriteArrayList<>();
        this.f348385f = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f348382c = sensorManager;
        Sensor defaultSensor = U.f348106a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f348383d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f348386g = iVar;
        a aVar = new a(iVar);
        View.OnTouchListener lVar = new l(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f348384e = new d(windowManager.getDefaultDisplay(), lVar, aVar);
        this.f348389j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z12 = this.f348389j && this.f348390k;
        Sensor sensor = this.f348383d;
        if (sensor == null || z12 == this.f348391l) {
            return;
        }
        d dVar = this.f348384e;
        SensorManager sensorManager = this.f348382c;
        if (z12) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.f348391l = z12;
    }

    public com.google.android.exoplayer2.video.spherical.a getCameraMotionListener() {
        return this.f348386g;
    }

    public com.google.android.exoplayer2.video.j getVideoFrameMetadataListener() {
        return this.f348386g;
    }

    @P
    public Surface getVideoSurface() {
        return this.f348388i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f348385f.post(new Runnable() { // from class: com.google.android.exoplayer2.video.spherical.j
            @Override // java.lang.Runnable
            public final void run() {
                k kVar = this.f348379b;
                Surface surface = kVar.f348388i;
                if (surface != null) {
                    Iterator<k.b> it = kVar.f348381b.iterator();
                    while (it.hasNext()) {
                        it.next().g();
                    }
                }
                SurfaceTexture surfaceTexture = kVar.f348387h;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar.f348387h = null;
                kVar.f348388i = null;
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f348390k = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f348390k = true;
        a();
    }

    public void setDefaultStereoMode(int i12) {
        this.f348386g.f348376l = i12;
    }

    public void setUseSensorRotation(boolean z12) {
        this.f348389j = z12;
        a();
    }
}
