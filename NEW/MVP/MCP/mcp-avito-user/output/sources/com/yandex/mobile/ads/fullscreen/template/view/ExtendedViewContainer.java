package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.a41;
import com.yandex.mobile.ads.impl.gm;
import com.yandex.mobile.ads.impl.lb0;
import com.yandex.mobile.ads.impl.mb0;
import com.yandex.mobile.ads.impl.nb0;
import com.yandex.mobile.ads.impl.wk;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public class ExtendedViewContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final gm f383160a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final nb0 f383161b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private nb0 f383162c;

    public ExtendedViewContainer(@N Context context) {
        this(context, null);
    }

    @N
    private wk a(float f12, float f13) {
        return new wk(new mb0(this, f12), new lb0(this, f13));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f383160a.a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        nb0.a aVarA = this.f383162c.a(i12, i13);
        super.onMeasure(aVarA.f388198a, aVarA.f388199b);
        this.f383160a.a();
    }

    public void setMeasureSpecProvider(@N nb0 nb0Var) {
        this.f383162c = new wk(this.f383161b, nb0Var);
        requestLayout();
        invalidate();
    }

    public ExtendedViewContainer(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(@N Context context, @P AttributeSet attributeSet, int i12) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        super(context, attributeSet, i12);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalExtendedContainer, i12, 0);
            int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_corner_radius, 0);
            dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_left_corner_radius, dimensionPixelSize5);
            dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_left_corner_radius, dimensionPixelSize5);
            this.f383161b = a(typedArrayObtainStyledAttributes.getFloat(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_width, 1.0f), typedArrayObtainStyledAttributes.getFloat(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_height, 1.0f));
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f383161b = new a41();
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
            dimensionPixelSize3 = 0;
            dimensionPixelSize4 = 0;
        }
        this.f383162c = this.f383161b;
        this.f383160a = new gm(this, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize);
        setWillNotDraw(false);
    }
}
