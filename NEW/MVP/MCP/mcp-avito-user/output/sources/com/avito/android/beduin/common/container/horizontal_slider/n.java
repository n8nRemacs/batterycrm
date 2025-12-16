package com.avito.android.beduin.common.container.horizontal_slider;

import android.view.animation.Interpolator;
import kotlin.Metadata;

/* compiled from: EaseInOutTwiceInterpolator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/n;", "Landroid/view/animation/Interpolator;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f12) {
        double dSin;
        int i12;
        if (f12 >= 1.0f) {
            return 1.0f;
        }
        if (f12 <= 0.0f) {
            return 0.0f;
        }
        if (f12 < 0.5d) {
            dSin = Math.sin(((f12 * 2) - 0.5d) * 3.141592653589793d);
            i12 = 1;
        } else {
            dSin = Math.sin(((f12 * 2) + 0.5d) * 3.141592653589793d);
            i12 = 3;
        }
        return ((float) (dSin + i12)) * 0.25f;
    }
}
