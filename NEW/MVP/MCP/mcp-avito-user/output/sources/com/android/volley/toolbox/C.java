package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import j.P;

/* compiled from: NetworkImageView.java */
/* loaded from: classes10.dex */
public class C extends ImageView {

    /* renamed from: b, reason: collision with root package name */
    public int f67104b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public Drawable f67105c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public Bitmap f67106d;

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        boolean z13;
        boolean z14;
        super.onLayout(z12, i12, i13, i14, i15);
        int width = getWidth();
        int height = getHeight();
        getScaleType();
        if (getLayoutParams() != null) {
            z13 = getLayoutParams().width == -2;
            z14 = getLayoutParams().height == -2;
        } else {
            z13 = false;
            z14 = false;
        }
        boolean z15 = z13 && z14;
        if (width == 0 && height == 0 && !z15) {
            return;
        }
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        int i16 = this.f67104b;
        if (i16 != 0) {
            setImageResource(i16);
            return;
        }
        Drawable drawable = this.f67105c;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f67106d;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f67104b = 0;
        this.f67105c = null;
        this.f67106d = bitmap;
    }

    public void setDefaultImageDrawable(@P Drawable drawable) {
        this.f67104b = 0;
        this.f67106d = null;
        this.f67105c = drawable;
    }

    public void setDefaultImageResId(int i12) {
        this.f67106d = null;
        this.f67105c = null;
        this.f67104b = i12;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
    }

    public void setErrorImageDrawable(@P Drawable drawable) {
    }

    public void setErrorImageResId(int i12) {
    }
}
