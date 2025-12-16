package com.yandex.mapkit.road_events_layer;

import com.yandex.mapkit.road_events.EventTag;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface RoadEventStylingProperties {
    @N
    List<EventTag> getTags();

    boolean hasSignificanceGreaterOrEqual(@N RoadEventSignificance roadEventSignificance);

    boolean isInFuture();

    boolean isOnRoute();

    boolean isSelected();

    boolean isUserEvent();

    boolean isValid();
}
