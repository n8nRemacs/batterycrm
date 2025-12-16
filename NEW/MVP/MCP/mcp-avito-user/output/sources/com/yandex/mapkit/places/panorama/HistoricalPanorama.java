package com.yandex.mapkit.places.panorama;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class HistoricalPanorama implements Serializable {
    private String name;
    private String panoramaId;
    private long timestamp;

    public HistoricalPanorama(@N String str, @N String str2, long j12) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"panoramaId\" cannot be null");
        }
        this.name = str;
        this.panoramaId = str2;
        this.timestamp = j12;
    }

    @N
    public String getName() {
        return this.name;
    }

    @N
    public String getPanoramaId() {
        return this.panoramaId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.name = archive.add(this.name, false);
        this.panoramaId = archive.add(this.panoramaId, false);
        this.timestamp = archive.add(this.timestamp);
    }

    public HistoricalPanorama() {
    }
}
