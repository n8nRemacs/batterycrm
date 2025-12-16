package androidx.constraintlayout.utils.widget;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import j.X;
import m.C43852a;

/* compiled from: ImageFilterButton.java */
/* loaded from: classes.dex */
public class a extends AppCompatImageButton {

    /* renamed from: b, reason: collision with root package name */
    public float f44094b;

    /* renamed from: c, reason: collision with root package name */
    public float f44095c;

    /* renamed from: d, reason: collision with root package name */
    public float f44096d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f44097e;

    /* renamed from: f, reason: collision with root package name */
    public float f44098f;

    /* renamed from: g, reason: collision with root package name */
    public float f44099g;

    /* renamed from: h, reason: collision with root package name */
    public float f44100h;

    /* renamed from: i, reason: collision with root package name */
    public float f44101i;

    /* compiled from: ImageFilterButton.java */
    /* renamed from: androidx.constraintlayout.utils.widget.a$a, reason: collision with other inner class name */
    public class C1710a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* compiled from: ImageFilterButton.java */
    public class b extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    public final void a() {
        if (Float.isNaN(this.f44098f) && Float.isNaN(this.f44099g) && Float.isNaN(this.f44100h) && Float.isNaN(this.f44101i)) {
            return;
        }
        float f12 = Float.isNaN(this.f44098f) ? 0.0f : this.f44098f;
        float f13 = Float.isNaN(this.f44099g) ? 0.0f : this.f44099g;
        float f14 = Float.isNaN(this.f44100h) ? 1.0f : this.f44100h;
        float f15 = Float.isNaN(this.f44101i) ? 0.0f : this.f44101i;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f16 = f14 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f16, f16);
        float f17 = intrinsicWidth * f16;
        float f18 = f16 * intrinsicHeight;
        matrix.postTranslate(((((width - f17) * f12) + width) - f17) * 0.5f, ((((height - f18) * f13) + height) - f18) * 0.5f);
        matrix.postRotate(f15, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void b() {
        if (Float.isNaN(this.f44098f) && Float.isNaN(this.f44099g) && Float.isNaN(this.f44100h) && Float.isNaN(this.f44101i)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            a();
        }
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.f44094b;
    }

    public float getImagePanX() {
        return this.f44098f;
    }

    public float getImagePanY() {
        return this.f44099g;
    }

    public float getImageRotate() {
        return this.f44101i;
    }

    public float getImageZoom() {
        return this.f44100h;
    }

    public float getRound() {
        return this.f44096d;
    }

    public float getRoundPercent() {
        return this.f44095c;
    }

    public float getSaturation() {
        throw null;
    }

    public float getWarmth() {
        throw null;
    }

    @Override // android.view.View
    public final void layout(int i12, int i13, int i14, int i15) {
        super.layout(i12, i13, i14, i15);
        a();
    }

    public void setAltImageResource(int i12) {
        this.f44097e = C43852a.a(getContext(), i12).mutate();
        throw null;
    }

    public void setBrightness(float f12) {
        throw null;
    }

    public void setContrast(float f12) {
        throw null;
    }

    public void setCrossfade(float f12) {
        this.f44094b = f12;
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f44097e == null || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            drawable.mutate();
            throw null;
        }
    }

    public void setImagePanX(float f12) {
        this.f44098f = f12;
        b();
    }

    public void setImagePanY(float f12) {
        this.f44099g = f12;
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i12) {
        if (this.f44097e == null) {
            super.setImageResource(i12);
        } else {
            C43852a.a(getContext(), i12).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f12) {
        this.f44101i = f12;
        b();
    }

    public void setImageZoom(float f12) {
        this.f44100h = f12;
        b();
    }

    @X
    public void setRound(float f12) {
        if (Float.isNaN(f12)) {
            this.f44096d = f12;
            float f13 = this.f44095c;
            this.f44095c = -1.0f;
            setRoundPercent(f13);
            return;
        }
        boolean z12 = this.f44096d != f12;
        this.f44096d = f12;
        if (f12 != 0.0f) {
            setClipToOutline(true);
            getWidth();
            getHeight();
            throw null;
        }
        setClipToOutline(false);
        if (z12) {
            invalidateOutline();
        }
    }

    @X
    public void setRoundPercent(float f12) {
        boolean z12 = this.f44095c != f12;
        this.f44095c = f12;
        if (f12 != 0.0f) {
            setClipToOutline(true);
            Math.min(getWidth(), getHeight());
            throw null;
        }
        setClipToOutline(false);
        if (z12) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f12) {
        throw null;
    }

    public void setWarmth(float f12) {
        throw null;
    }

    private void setOverlay(boolean z12) {
    }
}
