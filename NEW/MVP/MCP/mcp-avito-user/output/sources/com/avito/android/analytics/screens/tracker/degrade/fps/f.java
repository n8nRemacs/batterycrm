package com.avito.android.analytics.screens.tracker.degrade.fps;

import Y61.k;
import android.app.Application;
import com.avito.android.ab_tests.configs.DegradeScrollTestGroup;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: DegradeScroll.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/degrade/fps/f;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f90828a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DegradeScrollTestGroup f90829b;

    @Inject
    public f(@k Application application, @k DegradeScrollTestGroup degradeScrollTestGroup) {
        this.f90828a = application;
        this.f90829b = degradeScrollTestGroup;
    }
}
