package com.yandex.mapkit.road_events.internal;

import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class EventInfoSessionBinding implements EventInfoSession {
    private final NativeObject nativeObject;

    public EventInfoSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events.EventInfoSession
    public native void cancel();

    @Override // com.yandex.mapkit.road_events.EventInfoSession
    public native void retry(@N EventInfoSession.EventInfoListener eventInfoListener);
}
