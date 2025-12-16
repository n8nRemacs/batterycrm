package com.avito.android.extended_profile_map;

import AA.a;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapMoveReason;
import kotlin.Metadata;

/* compiled from: ExtendedProfileMapView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/u;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class u implements AvitoMap.MapMoveStartListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f151326b;

    public u(w wVar) {
        this.f151326b = wVar;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapMoveStartListener
    public final void onMapMoveStarted(@Y61.k AvitoMapMoveReason avitoMapMoveReason) {
        if (avitoMapMoveReason == AvitoMapMoveReason.GESTURE) {
            this.f151326b.f151331e.invoke(a.e.f164a);
        }
    }
}
