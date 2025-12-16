package androidx.constraintlayout.utils.widget;

import android.graphics.ColorMatrix;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import j.X;
import m.C43852a;

/* compiled from: ImageFilterView.java */
/* loaded from: classes.dex */
public class b extends AppCompatImageView {

    /* renamed from: b, reason: collision with root package name */
    public Drawable f44102b;

    /* renamed from: c, reason: collision with root package name */
    public float f44103c;

    /* renamed from: d, reason: collision with root package name */
    public float f44104d;

    /* renamed from: e, reason: collision with root package name */
    public float f44105e;

    /* renamed from: f, reason: collision with root package name */
    public float f44106f;

    /* renamed from: g, reason: collision with root package name */
    public float f44107g;

    /* renamed from: h, reason: collision with root package name */
    public float f44108h;

    /* renamed from: i, reason: collision with root package name */
    public float f44109i;

    /* compiled from: ImageFilterView.java */
    public class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* compiled from: ImageFilterView.java */
    /* renamed from: androidx.constraintlayout.utils.widget.b$b, reason: collision with other inner class name */
    public class C1711b extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* compiled from: ImageFilterView.java */
    public static class c {
        public c() {
            new ColorMatrix();
            new ColorMatrix();
        }
    }

    public float getBrightness() {
        throw null;
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.f44103c;
    }

    public float getImagePanX() {
        return this.f44106f;
    }

    public float getImagePanY() {
        return this.f44107g;
    }

    public float getImageRotate() {
        return this.f44109i;
    }

    public float getImageZoom() {
        return this.f44108h;
    }

    public float getRound() {
        return this.f44105e;
    }

    public float getRoundPercent() {
        return this.f44104d;
    }

    public float getSaturation() {
        throw null;
    }

    public float getWarmth() {
        throw null;
    }

    public final void k() {
        if (Float.isNaN(this.f44106f) && Float.isNaN(this.f44107g) && Float.isNaN(this.f44108h) && Float.isNaN(this.f44109i)) {
            return;
        }
        float f12 = Float.isNaN(this.f44106f) ? 0.0f : this.f44106f;
        float f13 = Float.isNaN(this.f44107g) ? 0.0f : this.f44107g;
        float f14 = Float.isNaN(this.f44108h) ? 1.0f : this.f44108h;
        float f15 = Float.isNaN(this.f44109i) ? 0.0f : this.f44109i;
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

    public final void l() {
        if (Float.isNaN(this.f44106f) && Float.isNaN(this.f44107g) && Float.isNaN(this.f44108h) && Float.isNaN(this.f44109i)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            k();
        }
    }

    @Override // android.view.View
    public final void layout(int i12, int i13, int i14, int i15) {
        super.layout(i12, i13, i14, i15);
        k();
    }

    public void setAltImageResource(int i12) {
        this.f44102b = C43852a.a(getContext(), i12).mutate();
        throw null;
    }

    public void setBrightness(float f12) {
        throw null;
    }

    public void setContrast(float f12) {
        throw null;
    }

    public void setCrossfade(float f12) {
        this.f44103c = f12;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f44102b == null || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            drawable.mutate();
            throw null;
        }
    }

    public void setImagePanX(float f12) {
        this.f44106f = f12;
        l();
    }

    public void setImagePanY(float f12) {
        this.f44107g = f12;
        l();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i12) {
        if (this.f44102b == null) {
            super.setImageResource(i12);
        } else {
            C43852a.a(getContext(), i12).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f12) {
        this.f44109i = f12;
        l();
    }

    public void setImageZoom(float f12) {
        this.f44108h = f12;
        l();
    }

    @X
    public void setRound(float f12) {
        if (Float.isNaN(f12)) {
            this.f44105e = f12;
            float f13 = this.f44104d;
            this.f44104d = -1.0f;
            setRoundPercent(f13);
            return;
        }
        boolean z12 = this.f44105e != f12;
        this.f44105e = f12;
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
        boolean z12 = this.f44104d != f12;
        this.f44104d = f12;
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
