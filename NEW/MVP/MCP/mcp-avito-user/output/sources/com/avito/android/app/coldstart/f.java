package com.avito.android.app.coldstart;

import Y61.k;
import android.app.Application;
import com.avito.android.ab_tests.configs.DegradeApplicationColdStartTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;

/* compiled from: ApplicationColdStartupTimeMeasureTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/coldstart/f;", "", "_avito_analytics-coldstart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f91359a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Application f91360b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DegradeApplicationColdStartTestGroup f91361c;

    public f(@k InterfaceC28373a interfaceC28373a, @k Application application, @k DegradeApplicationColdStartTestGroup degradeApplicationColdStartTestGroup) {
        this.f91359a = interfaceC28373a;
        this.f91360b = application;
        this.f91361c = degradeApplicationColdStartTestGroup;
    }
}
