package com.avito.android.advert_amenities.amenity;

import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AmenityItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_amenities/amenity/g;", "Lcom/avito/android/advert_amenities/amenity/f;", "<init>", "()V", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements f {
    @Inject
    public g() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Integer numM;
        i iVar = (i) eVar;
        AmenityItem amenityItem = (AmenityItem) aVar;
        String str = amenityItem.f81131c;
        iVar.O4(Integer.valueOf((str == null || (numM = com.avito.android.lib.util.f.m(str)) == null) ? R.attr.textIconDone : numM.intValue()));
        iVar.r(amenityItem.f81132d);
    }
}
