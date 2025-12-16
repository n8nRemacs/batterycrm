package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class ThreadStop implements Serializable {
    private NativeObject nativeObject;
    private Point position;
    private boolean position__is_initialized;
    private Stop stop;
    private boolean stop__is_initialized;

    public ThreadStop() {
        this.stop__is_initialized = false;
        this.position__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::ThreadStop";
    }

    private native Point getPosition__Native();

    private native Stop getStop__Native();

    private native NativeObject init(Stop stop, Point point);

    @N
    public synchronized Point getPosition() {
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

    @N
    public synchronized Stop getStop() {
        try {
            if (!this.stop__is_initialized) {
                this.stop = getStop__Native();
                this.stop__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.stop;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getStop(), false, (Class<Archive>) Stop.class);
            archive.add((Archive) getPosition(), false, (Class<Archive>) Point.class);
            return;
        }
        this.stop = (Stop) archive.add((Archive) this.stop, false, (Class<Archive>) Stop.class);
        this.stop__is_initialized = true;
        Point point = (Point) archive.add((Archive) this.position, false, (Class<Archive>) Point.class);
        this.position = point;
        this.position__is_initialized = true;
        this.nativeObject = init(this.stop, point);
    }

    public ThreadStop(@N Stop stop, @N Point point) {
        this.stop__is_initialized = false;
        this.position__is_initialized = false;
        if (stop == null) {
            throw new IllegalArgumentException("Required field \"stop\" cannot be null");
        }
        if (point != null) {
            this.nativeObject = init(stop, point);
            this.stop = stop;
            this.stop__is_initialized = true;
            this.position = point;
            this.position__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"position\" cannot be null");
    }

    private ThreadStop(NativeObject nativeObject) {
        this.stop__is_initialized = false;
        this.position__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
