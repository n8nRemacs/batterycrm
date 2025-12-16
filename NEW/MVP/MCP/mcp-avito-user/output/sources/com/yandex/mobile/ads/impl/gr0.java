package com.yandex.mobile.ads.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import j.InterfaceC42151g;

/* loaded from: classes8.dex */
final class gr0 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f385815a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f385816b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f385817c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f385818d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    private final Display f385819e;

    /* renamed from: f, reason: collision with root package name */
    private final a[] f385820f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f385821g;

    public interface a {
        void a(float[] fArr, float f12);
    }

    public gr0(Display display, a... aVarArr) {
        this.f385819e = display;
        this.f385820f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    @InterfaceC42151g
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i12;
        SensorManager.getRotationMatrixFromVector(this.f385815a, sensorEvent.values);
        float[] fArr = this.f385815a;
        int rotation = this.f385819e.getRotation();
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
            float[] fArr2 = this.f385816b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f385816b, i13, i12, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f385815a, 1, 131, this.f385816b);
        SensorManager.getOrientation(this.f385816b, this.f385818d);
        float f12 = this.f385818d[2];
        Matrix.rotateM(this.f385815a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f385815a;
        if (!this.f385821g) {
            ax.a(this.f385817c, fArr3);
            this.f385821g = true;
        }
        float[] fArr4 = this.f385816b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f385816b, 0, this.f385817c, 0);
        float[] fArr5 = this.f385815a;
        for (a aVar : this.f385820f) {
            aVar.a(fArr5, f12);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i12) {
    }
}
