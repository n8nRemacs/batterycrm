package com.avito.android.service_orders.list;

import android.os.Bundle;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.Lifecycle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.Metadata;

/* compiled from: ServiceOrdersListFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/a;", "Landroidx/lifecycle/q;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f279208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeepLink f279209c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f279210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f279211e;

    public a(com.avito.android.deeplink_handler.handler.composite.a aVar, DeepLink deepLink, Bundle bundle, Lifecycle lifecycle) {
        this.f279208b = aVar;
        this.f279209c = deepLink;
        this.f279210d = bundle;
        this.f279211e = lifecycle;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onResume(@Y61.k InterfaceC22983P interfaceC22983P) {
        b.a.a(this.f279208b, this.f279209c, null, this.f279210d, 2);
        this.f279211e.c(this);
    }
}
