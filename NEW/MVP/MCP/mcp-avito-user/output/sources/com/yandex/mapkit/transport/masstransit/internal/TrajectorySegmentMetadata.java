package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class TrajectorySegmentMetadata implements BaseMetadata, Serializable {
    private int duration;
    private boolean duration__is_initialized;
    private NativeObject nativeObject;
    private long time;
    private boolean time__is_initialized;

    public TrajectorySegmentMetadata() {
        this.time__is_initialized = false;
        this.duration__is_initialized = false;
    }

    private native int getDuration__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::internal::TrajectorySegmentMetadata";
    }

    private native long getTime__Native();

    private native NativeObject init(long j12, int i12);

    public synchronized int getDuration() {
        try {
            if (!this.duration__is_initialized) {
                this.duration = getDuration__Native();
                this.duration__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.duration;
    }

    public synchronized long getTime() {
        try {
            if (!this.time__is_initialized) {
                this.time = getTime__Native();
                this.time__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.time;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getTime());
            archive.add(getDuration());
            return;
        }
        this.time = archive.add(this.time);
        this.time__is_initialized = true;
        int iAdd = archive.add(this.duration);
        this.duration = iAdd;
        this.duration__is_initialized = true;
        this.nativeObject = init(this.time, iAdd);
    }

    public TrajectorySegmentMetadata(long j12, int i12) {
        this.time__is_initialized = false;
        this.duration__is_initialized = false;
        this.nativeObject = init(j12, i12);
        this.time = j12;
        this.time__is_initialized = true;
        this.duration = i12;
        this.duration__is_initialized = true;
    }

    private TrajectorySegmentMetadata(NativeObject nativeObject) {
        this.time__is_initialized = false;
        this.duration__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
