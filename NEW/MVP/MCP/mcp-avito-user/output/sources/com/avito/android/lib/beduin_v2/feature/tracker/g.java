package com.avito.android.lib.beduin_v2.feature.tracker;

import com.avito.android.remote.analytics.B;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkRequestTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/tracker/g;", "", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f176380a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B f176381b;

    @Inject
    public g(@Y61.k @Named("BeduinBaseUrl") String str, @Y61.k B b12) {
        this.f176380a = str;
        this.f176381b = b12;
    }
}
