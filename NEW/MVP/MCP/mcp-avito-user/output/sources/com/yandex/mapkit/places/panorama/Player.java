package com.yandex.mapkit.places.panorama;

import com.yandex.mapkit.geometry.Direction;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Span;
import com.yandex.mapkit.logo.Logo;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface Player {
    void addCompanyTapListener(@N CompanyTapListener companyTapListener);

    void addDirectionChangeListener(@N DirectionChangeListener directionChangeListener);

    void addErrorListener(@N ErrorListener errorListener);

    void addPanoramaChangeListener(@N PanoramaChangeListener panoramaChangeListener);

    void addSpanChangeListener(@N SpanChangeListener spanChangeListener);

    boolean companiesEnabled();

    @N
    Direction direction();

    void disableCompanies();

    void disableLoadingWheel();

    void disableMarkers();

    void disableMove();

    void disableRotation();

    void disableZoom();

    void enableCompanies();

    void enableLoadingWheel();

    void enableMarkers();

    void enableMove();

    void enableRotation();

    void enableZoom();

    @N
    Logo getLogo();

    @N
    List<HistoricalPanorama> historicalPanoramas();

    boolean isValid();

    boolean loadingWheelEnabled();

    void lookAt(@N Point point);

    boolean markersEnabled();

    boolean moveEnabled();

    void onMemoryWarning();

    void openPanorama(@N String str);

    void openUserPanoramaWithLocalDataSource(@N PanoramaDescription panoramaDescription, @N TileImageFactory tileImageFactory, @N IconImageFactory iconImageFactory, @N UserPanoramaEventListener userPanoramaEventListener);

    void openUserPanoramaWithNetworkDataSource(@N PanoramaDescription panoramaDescription, @N TileUrlProvider tileUrlProvider, @N IconUrlProvider iconUrlProvider, @N UserPanoramaEventListener userPanoramaEventListener);

    @N
    String panoramaId();

    @N
    Point position();

    void removeCompanyTapListener(@N CompanyTapListener companyTapListener);

    void removeDirectionChangeListener(@N DirectionChangeListener directionChangeListener);

    void removeErrorListener(@N ErrorListener errorListener);

    void removePanoramaChangeListener(@N PanoramaChangeListener panoramaChangeListener);

    void removeSpanChangeListener(@N SpanChangeListener spanChangeListener);

    void reset();

    boolean rotationEnabled();

    void setDirection(@N Direction direction);

    void setSpan(@N Span span);

    @N
    Span span();

    boolean zoomEnabled();
}
