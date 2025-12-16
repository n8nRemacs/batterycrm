package com.avito.android.advert.item.sx_addresses_header;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSxAddressesHeaderPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/sx_addresses_header/d;", "Lcom/avito/android/advert/item/sx_addresses_header/c;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertDetailsSxAddressesHeaderItem advertDetailsSxAddressesHeaderItem = (AdvertDetailsSxAddressesHeaderItem) aVar;
        Integer num = advertDetailsSxAddressesHeaderItem.f80497e;
        int iIntValue = num != null ? num.intValue() : 0;
        gVar.setTitle(advertDetailsSxAddressesHeaderItem.f80496d);
        gVar.k3(iIntValue);
        Integer num2 = advertDetailsSxAddressesHeaderItem.f80499g;
        if (num2 != null) {
            gVar.M8(num2.intValue());
        }
        Integer num3 = advertDetailsSxAddressesHeaderItem.f80498f;
        if (num3 != null) {
            gVar.J2(num3.intValue());
        }
    }
}
