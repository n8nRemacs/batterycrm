package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class TollPost implements Serializable {

    /* renamed from: id, reason: collision with root package name */
    private Long f377447id;
    private Boolean nonTransactional;
    private PolylinePosition position;
    private Double time_with_traffic;

    public TollPost(@N PolylinePosition polylinePosition, @P Long l12, @P Double d12, @P Boolean bool) {
        if (polylinePosition == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.position = polylinePosition;
        this.f377447id = l12;
        this.time_with_traffic = d12;
        this.nonTransactional = bool;
    }

    @P
    public Long getId() {
        return this.f377447id;
    }

    @P
    public Boolean getNonTransactional() {
        return this.nonTransactional;
    }

    @N
    public PolylinePosition getPosition() {
        return this.position;
    }

    @P
    public Double getTime_with_traffic() {
        return this.time_with_traffic;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.f377447id = archive.add(this.f377447id, true);
        this.time_with_traffic = archive.add(this.time_with_traffic, true);
        this.nonTransactional = archive.add(this.nonTransactional, true);
    }

    public TollPost() {
    }
}
