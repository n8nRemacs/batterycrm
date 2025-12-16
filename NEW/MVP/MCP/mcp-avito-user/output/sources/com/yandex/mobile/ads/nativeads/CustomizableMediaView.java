package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ii1;
import j.I;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public class CustomizableMediaView extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    @I
    private static final int f392528e = R.layout.monetization_ads_internal_outstream_controls_default;

    /* renamed from: a, reason: collision with root package name */
    @I
    private int f392529a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final int f392530b;

    /* renamed from: c, reason: collision with root package name */
    private int f392531c;

    /* renamed from: d, reason: collision with root package name */
    private int f392532d;

    public CustomizableMediaView(@N Context context) {
        this(context, null);
    }

    public final int a() {
        return this.f392529a;
    }

    @P
    public final int b() {
        return this.f392530b;
    }

    public int getHeightMeasureSpec() {
        return this.f392532d;
    }

    public int getWidthMeasureSpec() {
        return this.f392531c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        this.f392531c = i12;
        this.f392532d = i13;
    }

    public void setVideoControls(@I int i12) {
        this.f392529a = i12;
    }

    public CustomizableMediaView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CustomizableMediaView(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalMediaView);
            this.f392529a = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalMediaView_monetization_internal_video_controls_layout, f392528e);
            this.f392530b = ii1.a(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        this.f392529a = f392528e;
        this.f392530b = 0;
    }
}
