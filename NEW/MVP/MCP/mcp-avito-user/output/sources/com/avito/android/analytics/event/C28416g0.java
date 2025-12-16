package com.avito.android.analytics.event;

import com.avito.android.analytics.C28461l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics_adjust.AdjustTokenWithFirebaseName;
import com.avito.android.analytics_adjust.C28537e;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: OpenAppEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/g0;", "Lcom/avito/android/analytics/j;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.g0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28416g0 implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f90044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28459j f90045c;

    public C28416g0(@Y61.k LinkedHashMap linkedHashMap) {
        this.f90044b = linkedHashMap;
        ParametrizedClickStreamEvent parametrizedClickStreamEvent = new ParametrizedClickStreamEvent(2330, 8, linkedHashMap, null, 8, null);
        AdjustTokenWithFirebaseName adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91183w;
        this.f90045c = C28461l.a(parametrizedClickStreamEvent, com.avito.android.analytics_adjust.t.a(adjustTokenWithFirebaseName), C28537e.b(adjustTokenWithFirebaseName));
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f90045c.getEvents();
    }

    @Y61.k
    public final String toString() {
        return "OpenApp " + this.f90044b;
    }
}
