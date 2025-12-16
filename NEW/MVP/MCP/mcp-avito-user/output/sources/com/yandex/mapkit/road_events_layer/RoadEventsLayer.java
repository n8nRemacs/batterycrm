package com.yandex.mapkit.road_events_layer;

import com.yandex.mapkit.road_events.EventTag;
import j.N;

/* loaded from: classes7.dex */
public interface RoadEventsLayer {
    void addListener(@N RoadEventsLayerListener roadEventsLayerListener);

    void deselectRoadEvent();

    boolean isValid();

    void removeListener(@N RoadEventsLayerListener roadEventsLayerListener);

    void selectRoadEvent(@N String str);

    void setRoadEventVisibleOnRoute(@N EventTag eventTag, boolean z12);
}
