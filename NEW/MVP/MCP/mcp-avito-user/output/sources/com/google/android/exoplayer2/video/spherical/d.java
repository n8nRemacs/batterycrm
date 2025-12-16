package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import j.InterfaceC42151g;

/* compiled from: OrientationListener.java */
/* loaded from: classes6.dex */
final class d implements SensorEventListener {

    /* renamed from: b, reason: collision with root package name */
    public final float[] f348334b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f348335c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f348336d = new float[16];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f348337e = new float[3];

    /* renamed from: f, reason: collision with root package name */
    public final Display f348338f;

    /* renamed from: g, reason: collision with root package name */
    public final a[] f348339g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f348340h;

    /* compiled from: OrientationListener.java */
    public interface a {
        void a(float[] fArr, float f12);
    }

    public d(Display display, a... aVarArr) {
        this.f348338f = display;
        this.f348339g = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    @InterfaceC42151g
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i12;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f348334b;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f348338f.getRotation();
        float[] fArr3 = this.f348335c;
        if (rotation != 0) {
            int i13 = 129;
            if (rotation != 1) {
                i12 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i13 = 130;
                    i12 = 1;
                }
            } else {
                i12 = 129;
                i13 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i13, i12, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f348337e;
        SensorManager.getOrientation(fArr3, fArr4);
        float f12 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z12 = this.f348340h;
        float[] fArr5 = this.f348336d;
        if (!z12) {
            c.a(fArr5, fArr2);
            this.f348340h = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (a aVar : this.f348339g) {
            aVar.a(fArr2, f12);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i12) {
    }
}
