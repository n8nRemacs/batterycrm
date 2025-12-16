package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.nativeads.Rating;

/* loaded from: classes8.dex */
public final class rw0 extends FrameLayout implements Rating {

    /* renamed from: a, reason: collision with root package name */
    private float f389685a;

    public rw0(@j.N Context context, @j.P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f389685a = 0.0f;
    }

    @Override // com.yandex.mobile.ads.nativeads.Rating
    public final float getRating() {
        return this.f389685a;
    }

    @Override // com.yandex.mobile.ads.nativeads.Rating
    public void setRating(float f12) {
        this.f389685a = f12;
    }

    public rw0(@j.N Context context, @j.P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f389685a = 0.0f;
    }

    public rw0(@j.N Context context) {
        super(context);
        this.f389685a = 0.0f;
    }
}
