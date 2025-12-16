package com.avito.android.lib.deprecated_design.circular_progress;

import android.animation.ValueAnimator;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_deprecated-components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r {
    public static final void a(int i12) {
        if (i12 < 0 || i12 > 360) {
            u0 u0Var = u0.f406856a;
            throw new IllegalArgumentException(String.format("Illegal angle %d: must be >=0 and <=360", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1)));
        }
    }

    public static final float b(@Y61.k ValueAnimator valueAnimator, boolean z12) {
        float currentPlayTime = valueAnimator.getDuration() > 0 ? valueAnimator.getCurrentPlayTime() / valueAnimator.getDuration() : 0.0f;
        if (z12 && valueAnimator.getCurrentPlayTime() > valueAnimator.getDuration()) {
            currentPlayTime -= (float) Math.floor(currentPlayTime);
        }
        return valueAnimator.getInterpolator().getInterpolation(Math.min(currentPlayTime, 1.0f));
    }
}
