package com.avito.android.util;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.AnalyticParams;
import com.avito.android.CalledFrom;
import kotlin.Metadata;

/* compiled from: Bundles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-app_core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class H {
    @Y61.l
    public static final AnalyticParams a(@Y61.k Bundle bundle) {
        return (AnalyticParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("analytic_params", AnalyticParams.class) : bundle.getParcelable("analytic_params"));
    }

    @Y61.l
    public static final CalledFrom b(@Y61.k Bundle bundle) {
        return (CalledFrom) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("called_from", CalledFrom.class) : bundle.getParcelable("called_from"));
    }

    public static final void c(@Y61.k Bundle bundle, @Y61.l CalledFrom calledFrom) {
        bundle.putParcelable("called_from", calledFrom);
    }
}
