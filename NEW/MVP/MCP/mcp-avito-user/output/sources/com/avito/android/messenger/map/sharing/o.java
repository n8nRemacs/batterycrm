package com.avito.android.messenger.map.sharing;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SharingMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "newCameraPosition", "Lkotlin/G0;", "accept", "(Lcom/avito/android/avito_map/AvitoMapCameraPosition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharingMapFragment f196748b;

    public o(SharingMapFragment sharingMapFragment) {
        this.f196748b = sharingMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
        SharingMapFragment sharingMapFragment = this.f196748b;
        w wVar = sharingMapFragment.f196694n0;
        if (wVar == null) {
            wVar = null;
        }
        wVar.u(avitoMapCameraPosition, false);
        sharingMapFragment.f196691D0 = avitoMapCameraPosition.getMapPoint();
    }
}
