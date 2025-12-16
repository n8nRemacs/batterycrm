package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.gm;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public class RoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final gm f383163a;

    public RoundImageView(@N Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        this.f383163a.a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        this.f383163a.a();
    }

    public RoundImageView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@N Context context, @P AttributeSet attributeSet, int i12) {
        float dimensionPixelSize;
        super(context, attributeSet, i12);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalRoundImageView, i12, 0);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalRoundImageView_monetization_internal_corner_radius, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            dimensionPixelSize = 0.0f;
        }
        this.f383163a = new gm(this, dimensionPixelSize);
    }
}
