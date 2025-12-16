package com.airbnb.lottie.utils;

import android.graphics.Color;
import android.graphics.Matrix;
import j.P;

/* compiled from: DropShadow.java */
/* loaded from: classes10.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public float f60095a;

    /* renamed from: b, reason: collision with root package name */
    public float f60096b;

    /* renamed from: c, reason: collision with root package name */
    public float f60097c;

    /* renamed from: d, reason: collision with root package name */
    public int f60098d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public float[] f60099e;

    public b() {
        this.f60095a = 0.0f;
        this.f60096b = 0.0f;
        this.f60097c = 0.0f;
        this.f60098d = 0;
    }

    public final void a(int i12, com.airbnb.lottie.animation.a aVar) {
        int iAlpha = Color.alpha(this.f60098d);
        int iC2 = j.c(i12);
        Matrix matrix = k.f60123a;
        int i13 = (int) ((((iAlpha / 255.0f) * iC2) / 255.0f) * 255.0f);
        if (i13 <= 0) {
            aVar.clearShadowLayer();
        } else {
            aVar.setShadowLayer(Math.max(this.f60095a, Float.MIN_VALUE), this.f60096b, this.f60097c, Color.argb(i13, Color.red(this.f60098d), Color.green(this.f60098d), Color.blue(this.f60098d)));
        }
    }

    public final void b(int i12) {
        this.f60098d = Color.argb(Math.round((j.c(i12) * Color.alpha(this.f60098d)) / 255.0f), Color.red(this.f60098d), Color.green(this.f60098d), Color.blue(this.f60098d));
    }

    public final void c(Matrix matrix) {
        if (this.f60099e == null) {
            this.f60099e = new float[2];
        }
        float[] fArr = this.f60099e;
        fArr[0] = this.f60096b;
        fArr[1] = this.f60097c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f60099e;
        this.f60096b = fArr2[0];
        this.f60097c = fArr2[1];
        this.f60095a = matrix.mapRadius(this.f60095a);
    }

    public b(b bVar) {
        this.f60095a = 0.0f;
        this.f60096b = 0.0f;
        this.f60097c = 0.0f;
        this.f60098d = 0;
        this.f60095a = bVar.f60095a;
        this.f60096b = bVar.f60096b;
        this.f60097c = bVar.f60097c;
        this.f60098d = bVar.f60098d;
        this.f60099e = null;
    }
}
