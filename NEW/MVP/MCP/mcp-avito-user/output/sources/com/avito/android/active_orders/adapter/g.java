package com.avito.android.active_orders.adapter;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47691c;

/* compiled from: HomeActiveOrdersItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders/adapter/g;", "Lcom/avito/android/active_orders/adapter/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f68272b;

    @Inject
    public g(@Y61.k d dVar) {
        this.f68272b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        HomeActiveOrdersItemImpl homeActiveOrdersItemImpl = (HomeActiveOrdersItemImpl) aVar;
        DeepLink deepLink = homeActiveOrdersItemImpl.f68256d;
        d dVar = this.f68272b;
        if (deepLink != null) {
            InterfaceC47691c.a.a(dVar.f68268a.get(), deepLink, null, 14);
        }
        iVar.US(homeActiveOrdersItemImpl.f68257e, dVar, i12, homeActiveOrdersItemImpl.f68258f);
    }
}
