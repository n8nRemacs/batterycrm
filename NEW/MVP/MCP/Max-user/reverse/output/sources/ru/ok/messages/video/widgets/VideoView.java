package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.d9j;
import defpackage.fwg;
import defpackage.gdh;
import defpackage.kt;
import defpackage.o1g;
import defpackage.yni;

/* loaded from: classes2.dex */
public class VideoView extends FrameLayout implements TextureView.SurfaceTextureListener {
    public o1g a;
    public Surface b;
    public SurfaceTexture c;
    public gdh d;
    public int o;
    public int s0;
    public int t0;
    public int u0;

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(gdh gdhVar) {
        this.d = gdhVar;
        this.u0 = gdhVar.B();
        d();
        if (this.a != null) {
            return;
        }
        o1g o1gVar = new o1g(getContext());
        this.a = o1gVar;
        o1gVar.setSurfaceTextureListener(this);
        addView(this.a, 0);
    }

    public final void b() {
        this.d = null;
        this.u0 = 0;
        this.o = 0;
        this.s0 = 0;
        this.t0 = 0;
        o1g o1gVar = this.a;
        if (o1gVar != null) {
            o1gVar.setListener(null);
            this.a.setSurfaceTextureListener(null);
            removeView(this.a);
            this.a = null;
        }
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.c = null;
        }
    }

    public final void c(int i, int i2, int i3, boolean z) {
        if (!z) {
            this.o = i;
            this.s0 = i2;
            this.t0 = i3;
            requestLayout();
        } else if (i > 0 && i2 > 0 && getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && this.u0 != 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            kt ktVar = new kt(measuredWidth, measuredHeight, 8);
            kt ktVar2 = new kt(i, i2, 8);
            Matrix matrix = new Matrix();
            matrix.postConcat(d9j.a(ktVar2, ktVar, this.u0));
            float f = measuredWidth / 2.0f;
            float f2 = measuredHeight / 2.0f;
            matrix.postRotate(i3, f, f2);
            if (i3 == 90 || i3 == 270) {
                float measuredHeight2 = getMeasuredHeight() / getMeasuredWidth();
                matrix.postScale(1.0f / measuredHeight2, measuredHeight2, f, f2);
            }
            o1g o1gVar = this.a;
            if (o1gVar != null) {
                o1gVar.setTransform(matrix);
            }
            this.o = i;
            this.s0 = i2;
            this.t0 = i3;
        }
        o1g o1gVar2 = this.a;
        if (o1gVar2 != null) {
            o1gVar2.setVisibility((this.o <= 0 || this.s0 <= 0) ? 4 : 0);
        }
    }

    public final void d() {
        gdh gdhVar = this.d;
        int iM = gdhVar == null ? 0 : gdhVar.m();
        gdh gdhVar2 = this.d;
        int iF = gdhVar2 == null ? 0 : gdhVar2.F();
        gdh gdhVar3 = this.d;
        c(iM, iF, gdhVar3 == null ? 0 : gdhVar3.M(), false);
    }

    public BitmapDrawable getVideoScreenShot() {
        o1g o1gVar = this.a;
        if (o1gVar == null || this.t0 != 0 || !o1gVar.isAvailable() || !this.a.isShown() || this.o <= 0 || this.s0 <= 0) {
            return null;
        }
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        float f = width;
        float f2 = f > 640.0f ? 640.0f / f : 1.0f;
        float f3 = height;
        int iMin = (int) Math.min(f2, f3 > 480.0f ? 480.0f / f3 : 1.0f);
        Bitmap bitmap = this.a.getBitmap(width * iMin, height * iMin);
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(getResources(), bitmap);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.o <= 0 || this.s0 <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int[] iArrD = yni.d(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), this.o, this.s0);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iArrD[0], 1073741824), View.MeasureSpec.makeMeasureSpec(iArrD[1], 1073741824));
        c(this.o, this.s0, this.t0, true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
        SurfaceTexture surfaceTexture2 = this.c;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.c = null;
        }
        this.c = surfaceTexture;
        this.b = new Surface(surfaceTexture);
        d();
        gdh gdhVar = this.d;
        if (gdhVar == null) {
            return;
        }
        gdhVar.J(this.b);
        this.a.setListener(new fwg(this, surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        d();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
