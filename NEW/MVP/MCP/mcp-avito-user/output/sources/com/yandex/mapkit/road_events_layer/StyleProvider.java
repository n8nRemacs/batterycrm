package com.yandex.mapkit.road_events_layer;

import j.N;
import j.P;
import j.j0;

/* loaded from: classes7.dex */
public interface StyleProvider {
    @j0
    @P
    HighlightCircleStyle provideHighlightCircleStyle(boolean z12, @N HighlightMode highlightMode);

    @j0
    boolean provideStyle(@N RoadEventStylingProperties roadEventStylingProperties, boolean z12, float f12, @N RoadEventStyle roadEventStyle);
}
