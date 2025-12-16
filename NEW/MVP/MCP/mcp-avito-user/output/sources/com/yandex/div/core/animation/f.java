package com.yandex.div.core.animation;

import Y61.k;
import android.view.animation.Interpolator;
import kotlin.Metadata;

/* compiled from: ReverseInterpolator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/animation/f;", "Landroid/view/animation/Interpolator;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Interpolator f367281a;

    public f(@k Interpolator interpolator) {
        this.f367281a = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f12) {
        return 1.0f - this.f367281a.getInterpolation(1.0f - f12);
    }
}
