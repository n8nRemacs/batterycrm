package com.yandex.mapkit.road_events_layer.internal;

import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import com.yandex.mapkit.road_events_layer.RoadEventsLayerListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import j.N;

/* loaded from: classes7.dex */
public class RoadEventsLayerBinding implements RoadEventsLayer {
    private final NativeObject nativeObject;
    protected Subscription<RoadEventsLayerListener> roadEventsLayerListenerSubscription = new Subscription<RoadEventsLayerListener>() { // from class: com.yandex.mapkit.road_events_layer.internal.RoadEventsLayerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(RoadEventsLayerListener roadEventsLayerListener) {
            return RoadEventsLayerBinding.createRoadEventsLayerListener(roadEventsLayerListener);
        }
    };

    public RoadEventsLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createRoadEventsLayerListener(RoadEventsLayerListener roadEventsLayerListener);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void addListener(@N RoadEventsLayerListener roadEventsLayerListener);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void deselectRoadEvent();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void removeListener(@N RoadEventsLayerListener roadEventsLayerListener);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void selectRoadEvent(@N String str);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void setRoadEventVisibleOnRoute(@N EventTag eventTag, boolean z12);
}
