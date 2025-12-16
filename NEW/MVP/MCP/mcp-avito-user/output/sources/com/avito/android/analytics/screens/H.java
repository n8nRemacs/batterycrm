package com.avito.android.analytics.screens;

import Ec.InterfaceC13473b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrackerInfoProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/H;", "Lcom/avito/android/analytics/screens/G;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f90370a;

    @Inject
    public H(@Y61.k InterfaceC13473b interfaceC13473b) {
        this.f90370a = interfaceC13473b.b() + ".screen-performance";
    }

    @Override // com.avito.android.analytics.screens.G
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF90370a() {
        return this.f90370a;
    }
}
