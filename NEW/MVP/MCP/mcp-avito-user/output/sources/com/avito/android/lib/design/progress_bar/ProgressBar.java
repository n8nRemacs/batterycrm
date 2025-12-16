package com.avito.android.lib.design.progress_bar;

import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import j.InterfaceC42156l;
import j.InterfaceC42161q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: ProgressBar.kt */
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R*\u0010\u001f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R*\u0010#\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R*\u0010'\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R*\u0010/\u001a\u00020(2\u0006\u0010\t\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/avito/android/lib/design/progress_bar/ProgressBar;", "Landroid/view/View;", "Landroid/graphics/RectF;", "j", "Landroid/graphics/RectF;", "getFillBounds$_design_modules_components", "()Landroid/graphics/RectF;", "fillBounds", "", "value", "k", "Z", "isFairProgress", "()Z", "setFairProgress", "(Z)V", "", "l", "I", "getBarHeight", "()I", "setBarHeight", "(I)V", "barHeight", "m", "getEmptyColor", "setEmptyColor", "emptyColor", "n", "getSeparatorColor", "setSeparatorColor", "separatorColor", "o", "getSeparatorWidth", "setSeparatorWidth", "separatorWidth", "p", "getFillColor", "setFillColor", "fillColor", "", "q", "F", "getProgress", "()F", "setProgress", "(F)V", "progress", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProgressBar extends View {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f180081b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final float[] f180082c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RectF f180083d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Path f180084e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public RectF f180085f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Path f180086g;

    /* renamed from: h, reason: collision with root package name */
    public float f180087h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f180088i;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    public final RectF fillBounds;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean isFairProgress;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int barHeight;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int emptyColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int separatorColor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42161q
    public int separatorWidth;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public int fillColor;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public float progress;

    @j
    public ProgressBar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @SuppressLint({"ResourceType"})
    public final boolean a() {
        return this.separatorWidth > 0 && this.progress > 0.0f;
    }

    public final void b() {
        RectF rectF = this.f180083d;
        float fWidth = rectF.width() * this.progress;
        if (!this.isFairProgress) {
            float f12 = this.f180087h;
            if (0.0f >= fWidth || fWidth >= f12) {
                float fWidth2 = rectF.width() - this.f180087h;
                float fWidth3 = rectF.width();
                if (fWidth2 < fWidth && fWidth < fWidth3) {
                    fWidth = rectF.width() - this.f180087h;
                }
            } else {
                fWidth = f12;
            }
        }
        float f13 = this.progress == 1.0f ? this.f180087h : 0.0f;
        float f14 = this.f180087h;
        float[] fArr = this.f180082c;
        boolean z12 = false;
        fArr[0] = f14;
        fArr[1] = f14;
        fArr[2] = f13;
        fArr[3] = f13;
        fArr[4] = f13;
        fArr[5] = f13;
        fArr[6] = f14;
        fArr[7] = f14;
        float f15 = rectF.top;
        float f16 = rectF.bottom;
        RectF rectF2 = this.fillBounds;
        rectF2.set(0.0f, f15, fWidth, f16);
        Path path = this.f180086g;
        path.reset();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, fArr, direction);
        float f17 = this.f180087h;
        fArr[0] = f17;
        fArr[1] = f17;
        fArr[2] = f17;
        fArr[3] = f17;
        fArr[4] = f17;
        fArr[5] = f17;
        fArr[6] = f17;
        fArr[7] = f17;
        Path path2 = this.f180084e;
        path2.reset();
        path2.addRoundRect(rectF, fArr, direction);
        if (a()) {
            this.f180085f = new RectF(fWidth, 0.0f, this.separatorWidth + fWidth, rectF.height());
        }
        float f18 = rectF2.right;
        float f19 = this.f180087h;
        float f22 = rectF.right - f19;
        if (f19 < f18 && f18 < f22) {
            z12 = true;
        }
        this.f180088i = !z12;
    }

    public final int getBarHeight() {
        return this.barHeight;
    }

    public final int getEmptyColor() {
        return this.emptyColor;
    }

    @k
    /* renamed from: getFillBounds$_design_modules_components, reason: from getter */
    public final RectF getFillBounds() {
        return this.fillBounds;
    }

    public final int getFillColor() {
        return this.fillColor;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getSeparatorColor() {
        return this.separatorColor;
    }

    public final int getSeparatorWidth() {
        return this.separatorWidth;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        boolean z12 = this.f180088i;
        Path path = this.f180086g;
        RectF rectF = this.f180083d;
        Paint paint = this.f180081b;
        if (!z12) {
            float f12 = this.f180087h;
            paint.setColor(this.emptyColor);
            G0 g02 = G0.f406611a;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            paint.setColor(this.fillColor);
            canvas.drawPath(path, paint);
            if (a()) {
                RectF rectF2 = this.f180085f;
                paint.setColor(this.separatorColor);
                canvas.drawRect(rectF2, paint);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(this.f180084e);
        float f13 = this.f180087h;
        paint.setColor(this.emptyColor);
        G0 g03 = G0.f406611a;
        canvas.drawRoundRect(rectF, f13, f13, paint);
        paint.setColor(this.fillColor);
        canvas.drawPath(path, paint);
        if (a()) {
            RectF rectF3 = this.f180085f;
            paint.setColor(this.separatorColor);
            canvas.drawRect(rectF3, paint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        float f12 = (r5 - this.barHeight) / 2.0f;
        RectF rectF = this.f180083d;
        rectF.set(0.0f, f12, i14 - i12, (i15 - i13) - f12);
        this.f180087h = rectF.height() / 2;
        b();
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int iMin = 0;
        int size = mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? 0 : View.MeasureSpec.getSize(i12) : this.barHeight * 5 : View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        if (mode2 == Integer.MIN_VALUE) {
            iMin = Math.min(this.barHeight, View.MeasureSpec.getSize(i13));
        } else if (mode2 == 0) {
            iMin = this.barHeight;
        } else if (mode2 == 1073741824) {
            iMin = View.MeasureSpec.getSize(i13);
        }
        setMeasuredDimension(size, iMin);
    }

    public final void setBarHeight(int i12) {
        this.barHeight = i12;
        requestLayout();
    }

    public final void setEmptyColor(int i12) {
        if (this.emptyColor != i12) {
            this.emptyColor = i12;
            postInvalidateOnAnimation();
        }
    }

    public final void setFairProgress(boolean z12) {
        if (this.isFairProgress != z12) {
            this.isFairProgress = z12;
            b();
            postInvalidateOnAnimation();
        }
    }

    public final void setFillColor(int i12) {
        if (this.fillColor != i12) {
            this.fillColor = i12;
            postInvalidateOnAnimation();
        }
    }

    public final void setProgress(float f12) {
        this.progress = s.f(f12, 0.0f, 1.0f);
        b();
        postInvalidateOnAnimation();
    }

    public final void setSeparatorColor(int i12) {
        if (this.separatorColor != i12) {
            this.separatorColor = i12;
            postInvalidateOnAnimation();
        }
    }

    public final void setSeparatorWidth(int i12) {
        this.separatorWidth = i12;
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProgressBar(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.progressBar : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_ProgressBar : i13;
        super(context, attributeSet, i12);
        this.f180081b = new Paint(1);
        this.f180082c = new float[8];
        this.f180083d = new RectF();
        this.f180084e = new Path();
        this.f180085f = new RectF();
        this.f180086g = new Path();
        this.fillBounds = new RectF();
        this.isFairProgress = true;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178989q0, i12, i13);
        setEmptyColor(typedArrayObtainStyledAttributes.getColor(1, this.emptyColor));
        setFillColor(typedArrayObtainStyledAttributes.getColor(2, this.fillColor));
        setSeparatorColor(typedArrayObtainStyledAttributes.getColor(5, this.separatorColor));
        setSeparatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, this.separatorWidth));
        setProgress(typedArrayObtainStyledAttributes.getFloat(4, this.progress));
        setBarHeight(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, this.barHeight));
        setFairProgress(typedArrayObtainStyledAttributes.getBoolean(3, this.isFairProgress));
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            invalidate();
        }
    }
}
