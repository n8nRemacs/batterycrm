package com.avito.android.advert.item.rent_agreement;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.RentAgreement;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RentAgreementPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/rent_agreement/e;", "Lcom/avito/android/advert/item/rent_agreement/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f78574b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A6.a f78575c;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k A6.a aVar2) {
        this.f78574b = aVar;
        this.f78575c = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        RentAgreementItem rentAgreementItem = (RentAgreementItem) aVar;
        RentAgreement rentAgreement = rentAgreementItem.f78566e;
        gVar.Fk(rentAgreement.getButtonTitle(), rentAgreement.getButtonTextIconName());
        gVar.a(new d(this, rentAgreementItem));
    }
}
