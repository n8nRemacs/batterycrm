package com.avito.android.advert.item.similars_button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSimilarsButtonPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/similars_button/g;", "Lcom/avito/android/advert/item/similars_button/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f80356b;

    @Inject
    public g(@k i iVar) {
        this.f80356b = iVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) eVar;
        AdvertDetailsSimilarsButtonItem advertDetailsSimilarsButtonItem = (AdvertDetailsSimilarsButtonItem) aVar;
        aVar2.setText(advertDetailsSimilarsButtonItem.f80339b);
        if (advertDetailsSimilarsButtonItem.f80341d) {
            aVar2.X10();
        }
        aVar2.c(new f(this, advertDetailsSimilarsButtonItem));
    }
}
