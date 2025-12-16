package com.avito.android.publish.analytics;

import Cd0.A0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.remote.model.NavigationKt;
import com.google.gson.Gson;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: ServicesPriceAnalyticsTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/i0;", "Lcom/avito/android/publish/analytics/h0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232248a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232249b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34155z f232250c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Gson f232251d;

    @Inject
    public i0(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k Gson gson) {
        this.f232248a = interfaceC28373a;
        this.f232249b = c50213a;
        this.f232250c = interfaceC34155z;
        this.f232251d = gson;
    }

    @Override // com.avito.android.publish.analytics.h0
    public final void a(@Y61.k com.avito.android.items.a aVar) {
        String f201767b = aVar.getF201767b();
        com.avito.android.items.d dVar = aVar instanceof com.avito.android.items.d ? (com.avito.android.items.d) aVar : null;
        String f117480e = dVar != null ? dVar.getF117480e() : null;
        String str = f117480e == null ? "" : f117480e;
        String f117481f = aVar.getF117481f();
        String str2 = f117481f != null ? f117481f : "";
        InterfaceC34155z interfaceC34155z = this.f232250c;
        List<Integer> categoryIds = interfaceC34155z.U().getCategoryIds();
        List<Map<String, String>> attributes = interfaceC34155z.U().getAttributes();
        this.f232248a.c(new A0(f201767b, str, str2, categoryIds, attributes != null ? NavigationKt.toAnalyticsFormat(attributes, this.f232251d) : null, this.f232249b));
    }
}
