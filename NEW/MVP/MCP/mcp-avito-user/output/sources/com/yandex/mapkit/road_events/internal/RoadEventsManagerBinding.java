package com.yandex.mapkit.road_events.internal;

import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.mapkit.road_events.RoadEventsManager;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class RoadEventsManagerBinding implements RoadEventsManager {
    private final NativeObject nativeObject;

    public RoadEventsManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events.RoadEventsManager
    @N
    public native EventInfoSession requestEventInfo(@N String str, @N EventInfoSession.EventInfoListener eventInfoListener);
}
