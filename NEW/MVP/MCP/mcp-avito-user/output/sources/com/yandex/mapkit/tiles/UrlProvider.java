package com.yandex.mapkit.tiles;

import com.yandex.mapkit.TileId;
import com.yandex.mapkit.Version;
import j.InterfaceC42148d;
import j.N;
import java.util.Map;

/* loaded from: classes7.dex */
public interface UrlProvider {
    @N
    @InterfaceC42148d
    String formatUrl(@N TileId tileId, @N Version version, @N Map<String, String> map);
}
