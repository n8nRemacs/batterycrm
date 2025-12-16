package com.yandex.mapkit.search.search_layer;

import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.search.BusinessFilter;
import com.yandex.mapkit.search.FilterCollection;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchMetadata;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.runtime.image.ImageProvider;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public interface SearchLayer {
    void addPlacemarkListener(@N PlacemarkListener placemarkListener);

    void addSearchResultListener(@N SearchResultListener searchResultListener);

    void clear();

    void deselectPlacemark();

    void enableMapMoveOnSearchResponse(boolean z12);

    void enableRequestsOnMapMoves(boolean z12);

    void fetchNextPage();

    void forceUpdateIcon(@N String str, @N PlacemarkIconType placemarkIconType, @N ImageProvider imageProvider, @N IconStyle iconStyle);

    void forceUpdateMapObjects();

    @N
    List<SearchResultItem> getSearchResultsList();

    boolean hasNextPage();

    boolean isValid();

    boolean isVisible();

    void obtainAdIcons(boolean z12);

    void removePlacemarkListener(@N PlacemarkListener placemarkListener);

    void removeSearchResultListener(@N SearchResultListener searchResultListener);

    void resetAssetsProvider();

    void resetSort();

    void resubmit();

    void searchByUri(@N String str, @N SearchOptions searchOptions);

    @P
    SearchMetadata searchMetadata();

    void selectPlacemark(@N String str);

    @P
    String selectedPlacemarkId();

    void setAssetsProvider(@N AssetsProvider assetsProvider);

    void setFilterCollection(@P FilterCollection filterCollection);

    @Deprecated
    void setFilters(@N List<BusinessFilter> list);

    void setInsets(int i12, int i13, int i14, int i15);

    void setPolylinePosition(@N PolylinePosition polylinePosition);

    void setSearchManager(@N SearchManager searchManager);

    void setSortByDistance(@N Geometry geometry);

    void setVisible(boolean z12);

    void submitQuery(@N String str, @N Geometry geometry, @N SearchOptions searchOptions);

    void submitQuery(@N String str, @N SearchOptions searchOptions);
}
