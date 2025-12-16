package com.avito.android.advert_details_items.campaigns;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.InterfaceC28130g0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsCampaignsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/campaigns/d;", "Lcom/avito/android/advert_details_items/campaigns/c;", "<init>", "()V", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC28130g0 f84511b;

    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertDetailsCampaignsItem advertDetailsCampaignsItem = (AdvertDetailsCampaignsItem) aVar;
        InterfaceC28130g0 interfaceC28130g0 = this.f84511b;
        if (interfaceC28130g0 == null) {
            interfaceC28130g0 = null;
        }
        fVar.Ey(advertDetailsCampaignsItem.f84502d, interfaceC28130g0);
    }

    @Override // com.avito.android.advert_details_items.campaigns.c
    public final void k6(@k InterfaceC28130g0 interfaceC28130g0) {
        this.f84511b = interfaceC28130g0;
    }
}
