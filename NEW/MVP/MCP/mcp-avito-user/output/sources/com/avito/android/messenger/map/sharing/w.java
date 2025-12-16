package com.avito.android.messenger.map.sharing;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.messenger.map.sharing.K;
import com.avito.android.remote.model.messenger.geo.GeoSearchSuggest;
import kotlin.Metadata;

/* compiled from: SharingMapPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/w;", "LS20/a;", "Lcom/avito/android/messenger/map/sharing/K$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface w extends S20.a<K.d> {
    @Y61.k
    com.avito.android.util.architecture_components.D Gd();

    void Ja(boolean z12);

    @Y61.k
    com.avito.android.util.architecture_components.D Oc();

    void S8();

    @Y61.k
    com.avito.android.util.architecture_components.D c1();

    void l5(@Y61.k GeoSearchSuggest geoSearchSuggest);

    void l6();

    void u(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition, boolean z12);

    void x(boolean z12);

    void y(@Y61.k AvitoMapPoint avitoMapPoint);
}
