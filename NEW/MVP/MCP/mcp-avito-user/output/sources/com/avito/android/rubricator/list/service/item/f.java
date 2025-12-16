package com.avito.android.rubricator.list.service.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.rubricator.list.service.model.ServiceListItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/list/service/item/f;", "Lcom/avito/android/rubricator/list/service/item/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f255996b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f255997c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f255998d;

    @Inject
    public f(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a aVar2, @k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f255996b = aVar;
        this.f255997c = aVar2;
        this.f255998d = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ServiceListItem serviceListItem = (ServiceListItem) aVar;
        ((h) eVar).NP(serviceListItem, new e(this, serviceListItem));
    }
}
