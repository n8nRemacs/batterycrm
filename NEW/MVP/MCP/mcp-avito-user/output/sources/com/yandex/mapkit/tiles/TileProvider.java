package com.yandex.mapkit.tiles;

import com.yandex.mapkit.RawTile;
import com.yandex.mapkit.TileId;
import com.yandex.mapkit.Version;
import j.N;
import j.l0;
import java.util.Map;

/* loaded from: classes7.dex */
public interface TileProvider {
    @N
    @l0
    RawTile load(@N TileId tileId, @N Version version, @N Map<String, String> map, @N String str);
}
