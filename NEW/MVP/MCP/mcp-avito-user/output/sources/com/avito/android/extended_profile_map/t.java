package com.avito.android.extended_profile_map;

import AA.a;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.extended_profile_map.ExtendedProfileMapFragment;
import kotlin.Metadata;

/* compiled from: ExtendedProfileMapView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/t;", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class t implements AvitoMap.MarkerClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f151325b;

    public t(w wVar) {
        this.f151325b = wVar;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MarkerClickListener
    public final void onMarkerClicked(@Y61.l Object obj) {
        ExtendedProfileAddress extendedProfileAddress = obj instanceof ExtendedProfileAddress ? (ExtendedProfileAddress) obj : null;
        if (extendedProfileAddress != null) {
            ((ExtendedProfileMapFragment.c) this.f151325b.f151331e).invoke(new a.h(extendedProfileAddress));
        }
    }
}
