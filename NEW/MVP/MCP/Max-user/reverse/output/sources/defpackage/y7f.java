package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class y7f extends GLSurfaceView {
    public final CopyOnWriteArrayList a;
    public final SensorManager b;
    public final Sensor c;
    public final ljb d;
    public final Handler o;
    public final hzd s0;
    public SurfaceTexture t0;
    public Surface u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;

    public y7f(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.o = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = xxg.a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        hzd hzdVar = new hzd();
        this.s0 = hzdVar;
        x7f x7fVar = new x7f(this, hzdVar);
        View.OnTouchListener aegVar = new aeg(context, x7fVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new ljb(windowManager.getDefaultDisplay(), aegVar, x7fVar);
        this.v0 = true;
        setEGLContextClientVersion(2);
        setRenderer(x7fVar);
        setOnTouchListener(aegVar);
    }

    public final void a() {
        boolean z = this.v0 && this.w0;
        Sensor sensor = this.c;
        if (sensor == null || z == this.x0) {
            return;
        }
        ljb ljbVar = this.d;
        SensorManager sensorManager = this.b;
        if (z) {
            sensorManager.registerListener(ljbVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(ljbVar);
        }
        this.x0 = z;
    }

    public y22 getCameraMotionListener() {
        return this.s0;
    }

    public w3h getVideoFrameMetadataListener() {
        return this.s0;
    }

    public Surface getVideoSurface() {
        return this.u0;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o.post(new bee(12, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.w0 = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.w0 = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.s0.u0 = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.v0 = z;
        a();
    }
}
