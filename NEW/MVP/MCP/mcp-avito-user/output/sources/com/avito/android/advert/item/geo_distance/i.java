package com.avito.android.advert.item.geo_distance;

import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.component.toast.util.c;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: AdvertDetailsAddressGeoDistanceItemPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class i extends H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        g gVar = (g) this.receiver;
        gVar.getClass();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
        f.c.f125255c.getClass();
        c.a.a(gVar.f75690c, null, R.string.advert_details_address_geo_distance_error, null, null, toastBarPosition, f.c.a.b(), 61);
        return G0.f406611a;
    }
}
