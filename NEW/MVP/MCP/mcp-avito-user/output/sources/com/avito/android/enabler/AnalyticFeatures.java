package com.avito.android.enabler;

import Y61.k;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: AnalyticFeatures.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/enabler/AnalyticFeatures;", "", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/enabler/RemoteFeature;", "getTouchedFeatures", "()Lio/reactivex/rxjava3/core/z;", "touchedFeatures", "", "getHasCacheForCurrentVersion", "()Z", "hasCacheForCurrentVersion", "_common_features-enabler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface AnalyticFeatures {
    boolean getHasCacheForCurrentVersion();

    @k
    z<RemoteFeature<Object>> getTouchedFeatures();
}
