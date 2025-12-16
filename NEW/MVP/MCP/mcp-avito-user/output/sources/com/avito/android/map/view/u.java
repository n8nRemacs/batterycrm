package com.avito.android.map.view;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.alignment.AvitoMapHorizontalAlignment;
import com.avito.android.avito_map.alignment.AvitoMapVerticalAlignment;
import com.avito.android.avito_map.marker.MarkerItem;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MapViewInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/view/u;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface u {

    /* compiled from: MapViewInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void a();

    void b(@Y61.k MarkerItem.MyLocation myLocation);

    void c(@Y61.k LatLngBounds latLngBounds, boolean z12, boolean z13);

    void clearDrawing();

    void d(@Y61.k List list, int i12, float f12, float f13);

    void e(@Y61.k Y41.l lVar, @Y61.k View view, @Y61.k FragmentManager fragmentManager);

    void f(@Y61.k List<? extends MarkerItem> list);

    @Y61.l
    AvitoMap g();

    @Y61.l
    Float h();

    void i(float f12);

    void j(@Y61.k LatLng latLng, @Y61.l Float f12);

    void k(@Y61.k List<AvitoMapPoint> list, int i12, int i13, float f12, float f13);

    void l(@Y61.k LatLng latLng, @Y61.l Float f12);

    void setLogoAlignment(@Y61.k AvitoMapHorizontalAlignment avitoMapHorizontalAlignment, @Y61.k AvitoMapVerticalAlignment avitoMapVerticalAlignment);
}
