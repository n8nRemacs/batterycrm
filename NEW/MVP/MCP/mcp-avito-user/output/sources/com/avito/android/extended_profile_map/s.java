package com.avito.android.extended_profile_map;

import AA.a;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapTarget;
import kotlin.Metadata;

/* compiled from: ExtendedProfileMapView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/s;", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s implements AvitoMap.MapClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f151324b;

    public s(w wVar) {
        this.f151324b = wVar;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapClickListener
    public final void onMapClicked(@Y61.k AvitoMapTarget avitoMapTarget) {
        this.f151324b.f151331e.invoke(a.C0011a.f160a);
    }
}
