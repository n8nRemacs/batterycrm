package com.avito.android.avito_map.resolvers;

import Y61.k;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import com.avito.android.avito_map.marker.MarkerItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MarkerAnchorResolver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/avito/android/avito_map/resolvers/MarkerAnchorResolverImpl;", "Lcom/avito/android/avito_map/resolvers/MarkerAnchorResolver;", "()V", "getAnchorForRash", "Lcom/avito/android/avito_map/AvitoMapMarker$Anchor;", "item", "Lcom/avito/android/avito_map/marker/MarkerItem$Rash;", "resolveAnchor", "Lcom/avito/android/avito_map/marker/AvitoMarkerItem;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MarkerAnchorResolverImpl implements MarkerAnchorResolver {
    @Inject
    public MarkerAnchorResolverImpl() {
    }

    private final AvitoMapMarker.Anchor getAnchorForRash(MarkerItem.Rash item) {
        return item.getSelected() ? AvitoMapMarker.Anchor.BOTTOM_CENTER : AvitoMapMarker.Anchor.CENTER;
    }

    @Override // com.avito.android.avito_map.resolvers.MarkerAnchorResolver
    @k
    public AvitoMapMarker.Anchor resolveAnchor(@k AvitoMarkerItem item) {
        if (item instanceof MarkerItem.Pin) {
            return AvitoMapMarker.Anchor.BOTTOM_CENTER;
        }
        if (item instanceof MarkerItem.MyLocation) {
            return AvitoMapMarker.Anchor.CENTER;
        }
        if (item instanceof MarkerItem.Rash) {
            return getAnchorForRash((MarkerItem.Rash) item);
        }
        if (item instanceof MarkerItem.SpecialPin) {
            return AvitoMapMarker.Anchor.BOTTOM_CENTER;
        }
        if (!(item instanceof MarkerItem.LitePin)) {
            return AvitoMapMarker.Anchor.CENTER;
        }
        MarkerItem.LitePin litePin = (MarkerItem.LitePin) item;
        return (L.f(litePin.getType(), "default") || L.f(litePin.getType(), AvitoMapMarkerKt.AMENITY_TYPE_DEFAULT_RED)) ? AvitoMapMarker.Anchor.BOTTOM_CENTER : AvitoMapMarker.Anchor.CENTER;
    }
}
