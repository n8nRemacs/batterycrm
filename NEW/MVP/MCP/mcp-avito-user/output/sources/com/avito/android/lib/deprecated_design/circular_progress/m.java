package com.avito.android.lib.deprecated_design.circular_progress;

import android.view.animation.Interpolator;
import kotlin.Metadata;

/* compiled from: LookupTableInterpolator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/m;", "Landroid/view/animation/Interpolator;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class m implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final float[] f177922a;

    /* renamed from: b, reason: collision with root package name */
    public final float f177923b;

    public m(@Y61.k float[] fArr) {
        this.f177922a = fArr;
        this.f177923b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f12) {
        if (f12 >= 1.0f) {
            return 1.0f;
        }
        if (f12 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f177922a;
        int iMin = Math.min((int) ((fArr.length - 1) * f12), fArr.length - 2);
        float f13 = this.f177923b;
        float f14 = (f12 - (iMin * f13)) / f13;
        float f15 = fArr[iMin];
        return androidx.appcompat.app.r.c(fArr[iMin + 1], f15, f14, f15);
    }
}
