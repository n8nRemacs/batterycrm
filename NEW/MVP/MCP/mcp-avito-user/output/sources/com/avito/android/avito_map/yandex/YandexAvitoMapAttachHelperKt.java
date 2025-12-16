package com.avito.android.avito_map.yandex;

import Y61.k;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapView;
import com.avito.android.avito_map.R;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.mapview.MapView;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: YandexAvitoMapAttachHelper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapView;", "", "mapIsMovable", "Lkotlin/C;", "Lcom/avito/android/avito_map/AvitoMap;", "attachYandexMap", "(Lcom/avito/android/avito_map/AvitoMapView;Z)Lkotlin/C;", "_avito_avito-map_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexAvitoMapAttachHelperKt {
    @k
    @SuppressLint({"InflateParams"})
    public static final InterfaceC42726C<AvitoMap> attachYandexMap(@k AvitoMapView avitoMapView, boolean z12) {
        MapView mapView;
        int childCount = avitoMapView.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                mapView = null;
                break;
            }
            View childAt = avitoMapView.getChildAt(i12);
            if (childAt instanceof MapView) {
                mapView = (MapView) childAt;
                break;
            }
            i12++;
        }
        if (mapView == null) {
            mapView = z12 ? (MapView) ((LayoutInflater) avitoMapView.getContext().getSystemService("layout_inflater")).inflate(R.layout.yandex_map_movable, (ViewGroup) null) : new MapView(avitoMapView.getContext());
            avitoMapView.addView(mapView);
        }
        mapView.onStart();
        MapKitFactory.getInstance().onStart();
        return C42727D.c(new YandexAvitoMapAttachHelperKt$attachYandexMap$1$1(new AvitoYandexMap(mapView, avitoMapView.getContext())));
    }
}
