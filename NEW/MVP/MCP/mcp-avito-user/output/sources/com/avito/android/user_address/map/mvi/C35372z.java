package com.avito.android.user_address.map.mvi;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: UserAddressMapFlowUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-address_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_address.map.mvi.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35372z {
    @Y61.k
    public static final C43152f0 a(@Y61.k com.avito.android.user_address.map.domain.d dVar, @Y61.k AvitoMapCameraPosition avitoMapCameraPosition, @Y61.k UserAddressAddNewAddressMviState userAddressAddNewAddressMviState, @Y61.k com.avito.android.user_address.map.view.e eVar) {
        return new C43152f0(C43175k.G(new r(userAddressAddNewAddressMviState, avitoMapCameraPosition, dVar, null)), new C35365s(eVar, null));
    }

    @Y61.k
    public static final C43152f0 b(@Y61.k com.avito.android.user_address.map.domain.d dVar, int i12) {
        return new C43152f0(C43175k.G(new C35370x(dVar, i12, null)), new C35371y(3, null));
    }
}
