package com.avito.android.avito_map.resolvers;

import Y61.k;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.avito_map.marker.MarkerWithBrand;
import com.avito.android.avito_map.marker.MarkerWithFavorite;
import com.avito.android.avito_map.marker.MarkerWithHighlight;
import com.avito.android.avito_map.marker.MarkerWithPrice;
import com.avito.android.avito_map.marker.SelectableMarker;
import com.avito.android.remote.model.search.map.Highlight;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MarkerZIndexResolver.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/avito/android/avito_map/resolvers/MarkerZIndexResolverImpl;", "Lcom/avito/android/avito_map/resolvers/MarkerZIndexResolver;", "()V", "getMarkerZIndexForLitePin", "", "marker", "Lcom/avito/android/avito_map/marker/MarkerItem$LitePin;", "getMarkerZIndexForPin", "Lcom/avito/android/avito_map/marker/MarkerItem;", "getMarkerZIndexForRash", "resolveZIndex", "item", "Lcom/avito/android/avito_map/marker/AvitoMarkerItem;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MarkerZIndexResolverImpl implements MarkerZIndexResolver {
    @Inject
    public MarkerZIndexResolverImpl() {
    }

    private final float getMarkerZIndexForLitePin(MarkerItem.LitePin marker) {
        String type = marker.getType();
        int iHashCode = type.hashCode();
        return (iHashCode == 93818879 ? !type.equals(AvitoMapMarkerKt.AMENITY_TYPE_BLACK) : iHashCode == 678639248 ? !type.equals(AvitoMapMarkerKt.AMENITY_TYPE_DEFAULT_RED) : !(iHashCode == 1544803905 && type.equals("default"))) ? 0.0f : 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float getMarkerZIndexForPin(MarkerItem marker) {
        if (((SelectableMarker) marker).getSelected()) {
            return 7.0f;
        }
        if ((marker instanceof MarkerWithBrand) && ((MarkerWithBrand) marker).getBrand() != null) {
            return 6.0f;
        }
        if ((marker instanceof MarkerWithFavorite) && ((MarkerWithFavorite) marker).isFavorite()) {
            return 5.0f;
        }
        boolean z12 = marker instanceof MarkerWithHighlight;
        if ((z12 && ((MarkerWithHighlight) marker).getHighlight() == Highlight.Violet) || (z12 && ((MarkerWithHighlight) marker).getHighlight() == Highlight.Green)) {
            return 4.0f;
        }
        return (!(marker instanceof MarkerWithPrice) || ((MarkerWithPrice) marker).getPrice() == null) ? 2.0f : 3.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float getMarkerZIndexForRash(MarkerItem marker) {
        return ((SelectableMarker) marker).getSelected() ? 7.0f : 1.0f;
    }

    @Override // com.avito.android.avito_map.resolvers.MarkerZIndexResolver
    public float resolveZIndex(@k AvitoMarkerItem item) {
        if (item instanceof MarkerItem.MyLocation) {
            return 8.0f;
        }
        if (item instanceof MarkerItem.Pin) {
            return getMarkerZIndexForPin((MarkerItem) item);
        }
        if (item instanceof MarkerItem.Rash) {
            return getMarkerZIndexForRash((MarkerItem) item);
        }
        if (item instanceof MarkerItem.SpecialPin) {
            return 2.0f;
        }
        if (item instanceof MarkerItem.LitePin) {
            return getMarkerZIndexForLitePin((MarkerItem.LitePin) item);
        }
        return 1.0f;
    }
}
