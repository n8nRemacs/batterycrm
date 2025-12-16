package com.yandex.mapkit.transport.bicycle;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class ViaPoint implements Serializable {
    private NativeObject nativeObject;
    private PolylinePosition position;
    private boolean position__is_initialized;

    public ViaPoint() {
        this.position__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::bicycle::ViaPoint";
    }

    private native PolylinePosition getPosition__Native();

    private native NativeObject init(PolylinePosition polylinePosition);

    @N
    public synchronized PolylinePosition getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getPosition(), false, (Class<Archive>) PolylinePosition.class);
            return;
        }
        PolylinePosition polylinePosition = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.position = polylinePosition;
        this.position__is_initialized = true;
        this.nativeObject = init(polylinePosition);
    }

    public ViaPoint(@N PolylinePosition polylinePosition) {
        this.position__is_initialized = false;
        if (polylinePosition != null) {
            this.nativeObject = init(polylinePosition);
            this.position = polylinePosition;
            this.position__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"position\" cannot be null");
    }

    private ViaPoint(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
