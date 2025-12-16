package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import java.util.Arrays;

/* compiled from: FadeDrawable.java */
@Nullsafe
/* loaded from: classes10.dex */
public class h extends b {

    /* renamed from: j, reason: collision with root package name */
    public final Drawable[] f340056j;

    /* renamed from: k, reason: collision with root package name */
    public final int f340057k;

    /* renamed from: l, reason: collision with root package name */
    @k0
    public int f340058l;

    /* renamed from: m, reason: collision with root package name */
    @k0
    public int f340059m;

    /* renamed from: n, reason: collision with root package name */
    @k0
    public long f340060n;

    /* renamed from: o, reason: collision with root package name */
    @k0
    public final int[] f340061o;

    /* renamed from: p, reason: collision with root package name */
    @k0
    public final int[] f340062p;

    /* renamed from: q, reason: collision with root package name */
    @k0
    public int f340063q;

    /* renamed from: r, reason: collision with root package name */
    @k0
    public final boolean[] f340064r;

    /* renamed from: s, reason: collision with root package name */
    @k0
    public int f340065s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f340066t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f340067u;

    public h(Drawable[] drawableArr) {
        super(drawableArr);
        this.f340067u = true;
        if (!(drawableArr.length >= 1)) {
            throw new IllegalStateException("At least one layer required!");
        }
        this.f340056j = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.f340061o = iArr;
        int[] iArr2 = new int[drawableArr.length];
        this.f340062p = iArr2;
        this.f340063q = 255;
        boolean[] zArr = new boolean[drawableArr.length];
        this.f340064r = zArr;
        this.f340065s = 0;
        this.f340057k = 2;
        this.f340058l = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    public final void d() {
        this.f340065s--;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.b, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean zH2;
        int i12;
        int i13 = this.f340058l;
        int[] iArr = this.f340062p;
        Drawable[] drawableArr = this.f340056j;
        if (i13 == 0) {
            System.arraycopy(iArr, 0, this.f340061o, 0, drawableArr.length);
            this.f340060n = SystemClock.uptimeMillis();
            zH2 = h(this.f340059m == 0 ? 1.0f : 0.0f);
            if (!this.f340066t && (i12 = this.f340057k) >= 0) {
                boolean[] zArr = this.f340064r;
                if (i12 < zArr.length && zArr[i12]) {
                    this.f340066t = true;
                }
            }
            this.f340058l = zH2 ? 2 : 1;
        } else if (i13 != 1) {
            zH2 = true;
        } else {
            com.facebook.common.internal.o.d(this.f340059m > 0);
            zH2 = h((SystemClock.uptimeMillis() - this.f340060n) / this.f340059m);
            this.f340058l = zH2 ? 2 : 1;
        }
        for (int i14 = 0; i14 < drawableArr.length; i14++) {
            Drawable drawable = drawableArr[i14];
            int iCeil = (int) Math.ceil((iArr[i14] * this.f340063q) / 255.0d);
            if (drawable != null && iCeil > 0) {
                this.f340065s++;
                if (this.f340067u) {
                    drawable.mutate();
                }
                drawable.setAlpha(iCeil);
                this.f340065s--;
                drawable.draw(canvas);
            }
        }
        if (!zH2) {
            invalidateSelf();
        } else if (this.f340066t) {
            this.f340066t = false;
        }
    }

    public final void g() {
        this.f340058l = 2;
        for (int i12 = 0; i12 < this.f340056j.length; i12++) {
            this.f340062p[i12] = this.f340064r[i12] ? 255 : 0;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f340063q;
    }

    public final boolean h(float f12) {
        boolean z12 = true;
        for (int i12 = 0; i12 < this.f340056j.length; i12++) {
            boolean z13 = this.f340064r[i12];
            int i13 = (int) (((z13 ? 1 : -1) * 255 * f12) + this.f340061o[i12]);
            int[] iArr = this.f340062p;
            iArr[i12] = i13;
            if (i13 < 0) {
                iArr[i12] = 0;
            }
            if (iArr[i12] > 255) {
                iArr[i12] = 255;
            }
            if (z13 && iArr[i12] < 255) {
                z12 = false;
            }
            if (!z13 && iArr[i12] > 0) {
                z12 = false;
            }
        }
        return z12;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f340065s == 0) {
            super.invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.b, android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        if (this.f340063q != i12) {
            this.f340063q = i12;
            invalidateSelf();
        }
    }
}
