package com.avito.android.avito_map.lite;

import Y61.k;
import Y61.l;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MapLiteModeView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001JU\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH&¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000fH&¢\u0006\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/avito/android/avito_map/lite/MapLiteModeView;", "", "Lcom/avito/android/avito_map/AvitoMapPoint;", "mainPoint", "", "Lcom/avito/android/avito_map/marker/AvitoMarkerItem;", "pins", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "clickListener", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "markerClickListener", "", "centerToMainPoint", "fitPinsToBounds", "addPinOnMainPoint", "Lkotlin/G0;", "bindView", "(Lcom/avito/android/avito_map/AvitoMapPoint;Ljava/util/List;Lcom/avito/android/avito_map/AvitoMap$MapClickListener;Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;ZZZ)V", "onStart", "()V", "onStop", "onDestroyView", "onLowMemory", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface MapLiteModeView {

    /* compiled from: MapLiteModeView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void bindView$default(MapLiteModeView mapLiteModeView, AvitoMapPoint avitoMapPoint, List list, AvitoMap.MapClickListener mapClickListener, AvitoMap.MarkerClickListener markerClickListener, boolean z12, boolean z13, boolean z14, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindView");
            }
            mapLiteModeView.bindView(avitoMapPoint, list, mapClickListener, markerClickListener, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13, (i12 & 64) != 0 ? true : z14);
        }
    }

    void bindView(@l AvitoMapPoint mainPoint, @k List<? extends AvitoMarkerItem> pins, @k AvitoMap.MapClickListener clickListener, @k AvitoMap.MarkerClickListener markerClickListener, boolean centerToMainPoint, boolean fitPinsToBounds, boolean addPinOnMainPoint);

    void onDestroyView();

    void onLowMemory();

    void onStart();

    void onStop();
}
