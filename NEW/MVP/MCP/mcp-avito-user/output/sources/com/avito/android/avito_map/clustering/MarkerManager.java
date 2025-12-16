package com.avito.android.avito_map.clustering;

import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapMarkerOptions;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public class MarkerManager implements AvitoMap.MarkerExactClickListener {
    private final Map<AvitoMapMarker, Collection> mAllMarkers = new HashMap();
    private final AvitoMap mMap;

    public class Collection {
        private AvitoMap.MarkerExactClickListener mMarkerClickListener;
        private final Set<AvitoMapMarker> mMarkers = new HashSet();

        public Collection() {
        }

        public AvitoMapMarker addMarker(AvitoMapMarkerOptions avitoMapMarkerOptions) {
            AvitoMapMarker avitoMapMarkerAddMarker = MarkerManager.this.mMap.addMarker(avitoMapMarkerOptions);
            this.mMarkers.add(avitoMapMarkerAddMarker);
            MarkerManager.this.mAllMarkers.put(avitoMapMarkerAddMarker, this);
            return avitoMapMarkerAddMarker;
        }

        public void clear() {
            for (AvitoMapMarker avitoMapMarker : this.mMarkers) {
                MarkerManager.this.mMap.removeMarker(avitoMapMarker, false);
                MarkerManager.this.mAllMarkers.remove(avitoMapMarker);
            }
            this.mMarkers.clear();
        }

        public java.util.Collection<AvitoMapMarker> getMarkers() {
            return Collections.unmodifiableCollection(this.mMarkers);
        }

        public boolean remove(AvitoMapMarker avitoMapMarker) {
            if (!this.mMarkers.remove(avitoMapMarker)) {
                return false;
            }
            MarkerManager.this.mAllMarkers.remove(avitoMapMarker);
            MarkerManager.this.mMap.removeMarker(avitoMapMarker, false);
            return true;
        }

        public void setOnMarkerClickListener(AvitoMap.MarkerExactClickListener markerExactClickListener) {
            this.mMarkerClickListener = markerExactClickListener;
        }
    }

    public MarkerManager(AvitoMap avitoMap) {
        this.mMap = avitoMap;
    }

    public Collection newCollection() {
        return new Collection();
    }

    @Override // com.avito.android.avito_map.AvitoMap.MarkerExactClickListener
    public boolean onMarkerClicked(AvitoMapMarker avitoMapMarker) {
        Collection collection = this.mAllMarkers.get(avitoMapMarker);
        return (collection == null || collection.mMarkerClickListener == null || !collection.mMarkerClickListener.onMarkerClicked(avitoMapMarker)) ? false : true;
    }

    public boolean remove(AvitoMapMarker avitoMapMarker) {
        Collection collection = this.mAllMarkers.get(avitoMapMarker);
        return collection != null && collection.remove(avitoMapMarker);
    }
}
