package com.avito.android.user_advert.advert.items.service_booking;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SbStatusBlockItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/service_booking/f;", "Lcom/avito/android/user_advert/advert/items/service_booking/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MH0.c f310133b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f310134c;

    @Inject
    public f(@k MH0.c cVar) {
        this.f310133b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f310120c);
        AttributedText attributedText = aVar2.f310121d;
        hVar.u10(attributedText);
        MyAdvertDetails.SbStatusBlock.Action action = aVar2.f310123f;
        hVar.oo(action != null ? action.getTitle() : null, action != null);
        attributedText.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(11, this, aVar2));
        hVar.a0(new e(this, aVar2));
    }

    @Override // com.avito.android.user_advert.advert.items.service_booking.d
    public final void c0() {
        this.f310134c = null;
    }

    @Override // com.avito.android.user_advert.advert.items.service_booking.d
    public final void q5(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310134c = myAdvertDetailsActivity;
    }
}
