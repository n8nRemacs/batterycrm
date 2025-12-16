package com.avito.android.advert.item.description_header;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import ur.InterfaceC49101b;

/* compiled from: AdvertDetailsDescriptionHeaderPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/description_header/d;", "Lcom/avito/android/advert/item/description_header/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC49101b f75160b;

    @Inject
    public d(@k InterfaceC49101b interfaceC49101b) {
        this.f75160b = interfaceC49101b;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int iIntValue;
        g gVar = (g) eVar;
        AdvertDetailsDescriptionHeaderItem advertDetailsDescriptionHeaderItem = (AdvertDetailsDescriptionHeaderItem) aVar;
        if (this.f75160b.d()) {
            Integer num = advertDetailsDescriptionHeaderItem.f75150e;
            iIntValue = num != null ? num.intValue() : 0;
        } else {
            iIntValue = 28;
        }
        gVar.setTitle(advertDetailsDescriptionHeaderItem.f75149d);
        gVar.k3(iIntValue);
        Integer num2 = advertDetailsDescriptionHeaderItem.f75152g;
        if (num2 != null) {
            gVar.M8(num2.intValue());
        }
        Integer num3 = advertDetailsDescriptionHeaderItem.f75151f;
        if (num3 != null) {
            gVar.J2(num3.intValue());
        }
    }
}
