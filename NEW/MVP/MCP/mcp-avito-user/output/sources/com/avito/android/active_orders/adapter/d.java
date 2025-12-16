package com.avito.android.active_orders.adapter;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import javax.inject.Inject;
import js0.d;
import kotlin.Metadata;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: HomeActiveOrdersItemListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders/adapter/d;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f68268a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f68269b;

    @Inject
    public d(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k h31.e eVar) {
        this.f68268a = eVar;
        this.f68269b = gVar;
    }

    public final void a(@Y61.k DeepLink deepLink, int i12, @Y61.l Analytics analytics) {
        d.a.a(this.f68269b, Integer.valueOf(i12), "activeOrdersWidget", null, null, null, null, null, analytics, 124);
        InterfaceC47691c.a.a(this.f68268a.get(), deepLink, null, 14);
    }
}
