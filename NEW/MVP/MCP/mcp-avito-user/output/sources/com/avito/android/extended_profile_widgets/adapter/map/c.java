package com.avito.android.extended_profile_widgets.adapter.map;

import com.avito.android.avito_map.AvitoMap;
import kotlin.Metadata;

/* compiled from: MapItemPresenter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/map/c;", "LTV0/d;", "Lcom/avito/android/extended_profile_widgets/adapter/map/g;", "Lcom/avito/android/extended_profile_widgets/adapter/map/MapItem;", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface c extends TV0.d<g, MapItem>, AvitoMap.MapClickListener, AvitoMap.MarkerClickListener {
    void onDestroyView();

    void onLowMemory();

    void onStart();

    void onStop();
}
