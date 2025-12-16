package com.avito.android.advert_details_items.work_time;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsServicesWorkTimePresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/work_time/e;", "Lcom/avito/android/advert_details_items/work_time/c;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f85781b;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f85781b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertDetailsServicesWorkTimeItem advertDetailsServicesWorkTimeItem = (AdvertDetailsServicesWorkTimeItem) aVar;
        gVar.aE(advertDetailsServicesWorkTimeItem.f85769b);
        gVar.hx(advertDetailsServicesWorkTimeItem.f85770c);
        gVar.s50(new d(this), advertDetailsServicesWorkTimeItem.f85771d);
    }
}
