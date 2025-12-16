package com.avito.android.ui.view;

import android.view.animation.Interpolator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f12) {
        float f13 = f12 - 1.0f;
        return (f13 * f13 * f13 * f13 * f13) + 1.0f;
    }
}
