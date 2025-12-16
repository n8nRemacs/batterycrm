package com.yandex.mapkit.road_events;

import com.yandex.mapkit.road_events.EventInfoSession;
import j.N;

/* loaded from: classes7.dex */
public interface RoadEventsManager {
    @N
    EventInfoSession requestEventInfo(@N String str, @N EventInfoSession.EventInfoListener eventInfoListener);
}
