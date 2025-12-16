package com.yandex.mapkit.map;

import com.yandex.mapkit.ZoomRange;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.layers.TileFormat;
import com.yandex.mapkit.tiles.TileProvider;
import com.yandex.mapkit.tiles.UrlProvider;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface BaseTileDataSourceBuilder extends BaseDataSourceBuilder {
    void setProjection(@N Projection projection);

    void setTileFormat(@N TileFormat tileFormat);

    void setTileProvider(@N TileProvider tileProvider);

    void setTileUrlProvider(@N UrlProvider urlProvider);

    void setZoomRanges(@N List<ZoomRange> list);
}
