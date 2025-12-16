package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.motion.widget.C22737c;
import androidx.constraintlayout.motion.widget.InterfaceC22739e;
import j.X;

/* compiled from: MotionLabel.java */
/* loaded from: classes.dex */
public class e extends View implements InterfaceC22739e {

    /* renamed from: b, reason: collision with root package name */
    public int f44112b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f44113c;

    /* renamed from: d, reason: collision with root package name */
    public float f44114d;

    /* renamed from: e, reason: collision with root package name */
    public float f44115e;

    /* renamed from: f, reason: collision with root package name */
    public float f44116f;

    /* renamed from: g, reason: collision with root package name */
    public float f44117g;

    /* renamed from: h, reason: collision with root package name */
    public String f44118h;

    /* renamed from: i, reason: collision with root package name */
    public int f44119i;

    /* renamed from: j, reason: collision with root package name */
    public int f44120j;

    /* renamed from: k, reason: collision with root package name */
    public int f44121k;

    /* renamed from: l, reason: collision with root package name */
    public float f44122l;

    /* renamed from: m, reason: collision with root package name */
    public float f44123m;

    /* renamed from: n, reason: collision with root package name */
    public float f44124n;

    /* renamed from: o, reason: collision with root package name */
    public float f44125o;

    /* renamed from: p, reason: collision with root package name */
    public float f44126p;

    /* renamed from: q, reason: collision with root package name */
    public float f44127q;

    /* renamed from: r, reason: collision with root package name */
    public float f44128r;

    /* renamed from: s, reason: collision with root package name */
    public float f44129s;

    /* renamed from: t, reason: collision with root package name */
    public float f44130t;

    /* compiled from: MotionLabel.java */
    public class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* compiled from: MotionLabel.java */
    public class b extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    private float getHorizontalOffset() {
        Float.isNaN(this.f44117g);
        this.f44118h.length();
        throw null;
    }

    private float getVerticalOffset() {
        Float.isNaN(this.f44117g);
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC22739e
    public final void a(float f12, float f13, float f14, float f15) {
        int i12 = (int) (f12 + 0.5f);
        this.f44122l = f12 - i12;
        int i13 = (int) (f14 + 0.5f);
        int i14 = i13 - i12;
        int i15 = (int) (f15 + 0.5f);
        int i16 = (int) (f13 + 0.5f);
        int i17 = i15 - i16;
        if (getMeasuredHeight() == i17 && getMeasuredWidth() == i14) {
            super.layout(i12, i16, i13, i15);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
            super.layout(i12, i16, i13, i15);
        }
    }

    public final void b() {
        Float.isNaN(this.f44127q);
        Float.isNaN(this.f44128r);
        Float.isNaN(this.f44129s);
        Float.isNaN(this.f44130t);
        throw null;
    }

    public float getRound() {
        return this.f44115e;
    }

    public float getRoundPercent() {
        return this.f44114d;
    }

    public float getScaleFromTextSize() {
        return this.f44117g;
    }

    public float getTextBackgroundPanX() {
        return this.f44127q;
    }

    public float getTextBackgroundPanY() {
        return this.f44128r;
    }

    public float getTextBackgroundRotate() {
        return this.f44130t;
    }

    public float getTextBackgroundZoom() {
        return this.f44129s;
    }

    public int getTextOutlineColor() {
        return this.f44112b;
    }

    public float getTextPanX() {
        return this.f44125o;
    }

    public float getTextPanY() {
        return this.f44126p;
    }

    public float getTextureHeight() {
        return this.f44123m;
    }

    public float getTextureWidth() {
        return this.f44124n;
    }

    public Typeface getTypeface() {
        throw null;
    }

    @Override // android.view.View
    public final void layout(int i12, int i13, int i14, int i15) {
        super.layout(i12, i13, i14, i15);
        boolean zIsNaN = Float.isNaN(this.f44117g);
        float f12 = zIsNaN ? 1.0f : this.f44116f / this.f44117g;
        boolean z12 = this.f44113c;
        if (z12 || !zIsNaN) {
            if (z12 || f12 != 1.0f) {
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f12 = Float.isNaN(this.f44117g) ? 1.0f : this.f44116f / this.f44117g;
        super.onDraw(canvas);
        boolean z12 = this.f44113c;
        if (!z12 && f12 == 1.0f) {
            canvas.drawText(this.f44118h, this.f44122l + this.f44119i + getHorizontalOffset(), this.f44120j + getVerticalOffset(), null);
        } else {
            if (z12) {
                throw null;
            }
            getHorizontalOffset();
            getVerticalOffset();
            throw null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        this.f44119i = getPaddingLeft();
        getPaddingRight();
        this.f44120j = getPaddingTop();
        getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            this.f44118h.getClass();
            throw null;
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i12) {
        if ((i12 & 8388615) == 0) {
            i12 |= 8388611;
        }
        if ((i12 & 112) == 0) {
            i12 |= 48;
        }
        if (i12 != this.f44121k) {
            invalidate();
        }
        this.f44121k = i12;
        int i13 = i12 & 112;
        if (i13 == 48) {
            this.f44126p = -1.0f;
        } else if (i13 != 80) {
            this.f44126p = 0.0f;
        } else {
            this.f44126p = 1.0f;
        }
        int i14 = i12 & 8388615;
        if (i14 != 3) {
            if (i14 != 5) {
                if (i14 != 8388611) {
                    if (i14 != 8388613) {
                        this.f44125o = 0.0f;
                        return;
                    }
                }
            }
            this.f44125o = 1.0f;
            return;
        }
        this.f44125o = -1.0f;
    }

    @X
    public void setRound(float f12) {
        if (Float.isNaN(f12)) {
            this.f44115e = f12;
            float f13 = this.f44114d;
            this.f44114d = -1.0f;
            setRoundPercent(f13);
            return;
        }
        boolean z12 = this.f44115e != f12;
        this.f44115e = f12;
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
        boolean z12 = this.f44114d != f12;
        this.f44114d = f12;
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

    public void setScaleFromTextSize(float f12) {
        this.f44117g = f12;
    }

    public void setText(CharSequence charSequence) {
        this.f44118h = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f12) {
        this.f44127q = f12;
        b();
        throw null;
    }

    public void setTextBackgroundPanY(float f12) {
        this.f44128r = f12;
        b();
        throw null;
    }

    public void setTextBackgroundRotate(float f12) {
        this.f44130t = f12;
        b();
        throw null;
    }

    public void setTextBackgroundZoom(float f12) {
        this.f44129s = f12;
        b();
        throw null;
    }

    public void setTextFillColor(int i12) {
        invalidate();
    }

    public void setTextOutlineColor(int i12) {
        this.f44112b = i12;
        this.f44113c = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f12) {
        this.f44113c = true;
        if (Float.isNaN(f12)) {
            this.f44113c = false;
        }
        invalidate();
    }

    public void setTextPanX(float f12) {
        this.f44125o = f12;
        invalidate();
    }

    public void setTextPanY(float f12) {
        this.f44126p = f12;
        invalidate();
    }

    public void setTextSize(float f12) {
        this.f44116f = f12;
        C22737c.a();
        Float.isNaN(this.f44117g);
        throw null;
    }

    public void setTextureHeight(float f12) {
        this.f44123m = f12;
        b();
        throw null;
    }

    public void setTextureWidth(float f12) {
        this.f44124n = f12;
        b();
        throw null;
    }

    public void setTypeface(Typeface typeface) {
        throw null;
    }
}
