package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import android.view.TextureView;
import com.yandex.mobile.ads.impl.gt0;

/* loaded from: classes8.dex */
public final class gi1 implements gt0.b {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private k41 f385757a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private k41 f385758b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private TextureView f385759c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private int f385760d;

    public final void a(@j.P TextureView textureView) {
        this.f385759c = textureView;
        if (this.f385760d == 0 || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        this.f385759c.setTransform(matrix);
    }

    public final void b(@j.P int i12) {
        this.f385760d = i12;
        if (i12 == 0 || this.f385759c == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        this.f385759c.setTransform(matrix);
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void onSurfaceSizeChanged(int i12, int i13) {
        int i14;
        Matrix matrixA;
        k41 k41Var = new k41(i12, i13);
        this.f385758b = k41Var;
        k41 k41Var2 = this.f385757a;
        if (k41Var2 == null || (i14 = this.f385760d) == 0 || this.f385759c == null || (matrixA = new hi1(k41Var, k41Var2).a(i14)) == null) {
            return;
        }
        this.f385759c.setTransform(matrixA);
    }

    @Override // com.yandex.mobile.ads.impl.gt0.b
    public final void a(@j.N ji1 ji1Var) {
        int i12;
        Matrix matrixA;
        int iRound = ji1Var.f386883a;
        float f12 = ji1Var.f386886d;
        if (f12 > 0.0f) {
            iRound = Math.round(iRound * f12);
        }
        k41 k41Var = new k41(iRound, ji1Var.f386884b);
        this.f385757a = k41Var;
        k41 k41Var2 = this.f385758b;
        if (k41Var2 == null || (i12 = this.f385760d) == 0 || this.f385759c == null || (matrixA = new hi1(k41Var2, k41Var).a(i12)) == null) {
            return;
        }
        this.f385759c.setTransform(matrixA);
    }
}
