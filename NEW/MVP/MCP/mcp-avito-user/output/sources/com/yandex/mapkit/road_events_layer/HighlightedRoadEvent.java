package com.yandex.mapkit.road_events_layer;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class HighlightedRoadEvent implements Serializable {
    private String eventId;
    private HighlightMode mode;

    public HighlightedRoadEvent(@N String str, @N HighlightMode highlightMode) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"eventId\" cannot be null");
        }
        if (highlightMode == null) {
            throw new IllegalArgumentException("Required field \"mode\" cannot be null");
        }
        this.eventId = str;
        this.mode = highlightMode;
    }

    @N
    public String getEventId() {
        return this.eventId;
    }

    @N
    public HighlightMode getMode() {
        return this.mode;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.eventId = archive.add(this.eventId, false);
        this.mode = (HighlightMode) archive.add((Archive) this.mode, false, (Class<Archive>) HighlightMode.class);
    }

    public HighlightedRoadEvent() {
    }
}
