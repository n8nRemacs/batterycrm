package com.avito.android.user_address.map.view;

import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.user_address.map.mvi.A;
import com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState;
import kotlin.Metadata;

/* compiled from: UserAddressMapView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/view/c;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements AvitoMap.MapMoveEndListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d<UserAddressAddNewAddressMviState> f307942b;

    public c(d<UserAddressAddNewAddressMviState> dVar) {
        this.f307942b = dVar;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
    public final void onMapSettled(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition) {
        AvitoMapCameraPosition mapCameraPosition;
        d<UserAddressAddNewAddressMviState> dVar = this.f307942b;
        AvitoMap avitoMap = dVar.f307944c;
        if (avitoMap == null || (mapCameraPosition = avitoMap.getMapCameraPosition()) == null) {
            return;
        }
        com.avito.android.user_address.map.e eVar = dVar.f307953l;
        if (eVar == null) {
            eVar = null;
        }
        eVar.accept(new A.r(mapCameraPosition));
    }
}
