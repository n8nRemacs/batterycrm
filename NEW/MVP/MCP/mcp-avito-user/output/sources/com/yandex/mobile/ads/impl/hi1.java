package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;

/* loaded from: classes8.dex */
public final class hi1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final k41 f386144a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final k41 f386145b;

    public hi1(@j.N k41 k41Var, @j.N k41 k41Var2) {
        this.f386144a = k41Var;
        this.f386145b = k41Var2;
    }

    @j.P
    public final Matrix a(@j.N int i12) {
        k41 k41Var = this.f386145b;
        if (k41Var.b() <= 0 || k41Var.a() <= 0) {
            return null;
        }
        k41 k41Var2 = this.f386144a;
        if (k41Var2.b() <= 0 || k41Var2.a() <= 0) {
            return null;
        }
        if (i12 == 0) {
            throw null;
        }
        int i13 = i12 - 1;
        if (i13 == 0) {
            return a(1.0f, 1.0f, 1);
        }
        if (i13 == 1) {
            float fB2 = this.f386144a.b() / this.f386145b.b();
            float fA2 = this.f386144a.a() / this.f386145b.a();
            float fMin = Math.min(fB2, fA2);
            return a(fMin / fB2, fMin / fA2, 2);
        }
        if (i13 != 2) {
            return null;
        }
        float fB3 = this.f386144a.b() / this.f386145b.b();
        float fA3 = this.f386144a.a() / this.f386145b.a();
        float fMax = Math.max(fB3, fA3);
        return a(fMax / fB3, fMax / fA3, 2);
    }

    @j.P
    private Matrix a(float f12, float f13, int i12) {
        if (i12 == 0) {
            throw null;
        }
        int i13 = i12 - 1;
        if (i13 == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f12, f13, 0.0f, 0.0f);
            return matrix;
        }
        if (i13 != 1) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f12, f13, this.f386144a.b() / 2.0f, this.f386144a.a() / 2.0f);
        return matrix2;
    }
}
