package com.avito.android.advert_details_items.flats;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFlatsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/flats/d;", "Lcom/avito/android/advert_details_items/flats/c;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.advert.k f84721b;

    @Inject
    public d(@k com.avito.android.advert_core.advert.k kVar) {
        this.f84721b = kVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertDetailsFlatsItem advertDetailsFlatsItem = (AdvertDetailsFlatsItem) aVar;
        AdvertDetailsFlatViewType advertDetailsFlatViewType = advertDetailsFlatsItem.f84661i;
        this.f84721b.w0(advertDetailsFlatViewType);
        AttributedText attributedText = advertDetailsFlatsItem.f84658f;
        fVar.w(attributedText);
        fVar.l30(advertDetailsFlatsItem.f84656d, advertDetailsFlatViewType);
        if (advertDetailsFlatsItem.f84657e) {
            fVar.y1();
        }
        fVar.C4(advertDetailsFlatsItem.f84659g);
        fVar.eD(advertDetailsFlatsItem.f84660h);
        fVar.AZ(attributedText, advertDetailsFlatViewType);
    }
}
