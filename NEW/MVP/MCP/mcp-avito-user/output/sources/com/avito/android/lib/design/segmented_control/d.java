package com.avito.android.lib.design.segmented_control;

import Y61.k;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ControlView.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R*\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0019R*\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0005\u0010\nR\u0014\u0010!\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0014\u0010#\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010¨\u0006$"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/d;", "Landroid/view/View;", "Landroid/content/res/ColorStateList;", "color", "Lkotlin/G0;", "setSegmentColor", "(Landroid/content/res/ColorStateList;)V", "", "visibility", "setVisibility", "(I)V", "", "<set-?>", "d", "F", "getSegmentOffset", "()F", "segmentOffset", "e", "getSegmentWidth", "segmentWidth", "value", "f", "getSegmentCornerRadius", "setSegmentCornerRadius", "(F)V", "segmentCornerRadius", "g", "I", "getSegmentColor", "()I", "segmentColor", "getSegmentLeft", "segmentLeft", "getSegmentRight", "segmentRight", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends View {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f180241h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f180242b;

    /* renamed from: c, reason: collision with root package name */
    public final ValueAnimator f180243c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float segmentOffset;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float segmentWidth;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float segmentCornerRadius;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int segmentColor;

    public d(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f180242b = paint;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f180243c = valueAnimatorOfFloat;
    }

    private final float getSegmentLeft() {
        return getLayoutDirection() == 1 ? (getWidth() - this.segmentWidth) - this.segmentOffset : this.segmentOffset;
    }

    private final float getSegmentRight() {
        return getLayoutDirection() == 1 ? getWidth() - this.segmentOffset : this.segmentOffset + this.segmentWidth;
    }

    public final int getSegmentColor() {
        return this.segmentColor;
    }

    public final float getSegmentCornerRadius() {
        return this.segmentCornerRadius;
    }

    public final float getSegmentOffset() {
        return this.segmentOffset;
    }

    public final float getSegmentWidth() {
        return this.segmentWidth;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        float segmentLeft = getSegmentLeft();
        float segmentRight = getSegmentRight();
        float height = getHeight();
        float f12 = this.segmentCornerRadius;
        canvas.drawRoundRect(segmentLeft, 0.0f, segmentRight, height, f12, f12, this.f180242b);
    }

    public final void setSegmentColor(int i12) {
        if (this.segmentColor != i12) {
            this.segmentColor = i12;
            this.f180242b.setColor(i12);
            invalidate();
        }
    }

    public final void setSegmentCornerRadius(float f12) {
        if (this.segmentCornerRadius == f12) {
            return;
        }
        this.segmentCornerRadius = f12;
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        this.f180243c.cancel();
    }

    public final void setSegmentColor(@k ColorStateList color) {
        setSegmentColor(color.getColorForState(getDrawableState(), color.getDefaultColor()));
    }
}
