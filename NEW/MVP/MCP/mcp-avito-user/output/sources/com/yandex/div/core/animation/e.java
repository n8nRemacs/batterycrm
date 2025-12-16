package com.yandex.div.core.animation;

import Y61.k;
import android.view.animation.Interpolator;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: LookupTableInterpolator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/animation/e;", "Landroid/view/animation/Interpolator;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class e implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final float[] f367279a;

    /* renamed from: b, reason: collision with root package name */
    public final float f367280b;

    public e(@k float[] fArr) {
        this.f367279a = fArr;
        this.f367280b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f12) {
        if (f12 <= 0.0f) {
            return 0.0f;
        }
        if (f12 >= 1.0f) {
            return 1.0f;
        }
        float[] fArr = this.f367279a;
        int length = (int) ((fArr.length - 1) * f12);
        int length2 = fArr.length - 2;
        if (length > length2) {
            length = length2;
        }
        float f13 = this.f367280b;
        float f14 = (f12 - (length * f13)) / f13;
        float f15 = fArr[length];
        return r.c(fArr[length + 1], f15, f14, f15);
    }
}
