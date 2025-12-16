package com.yandex.mapkit.search;

import AK.c;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class Availability implements Serializable {
    private int days;
    private boolean days__is_initialized;
    private NativeObject nativeObject;
    private List<TimeRange> timeRanges;
    private boolean timeRanges__is_initialized;

    public Availability() {
        this.days__is_initialized = false;
        this.timeRanges__is_initialized = false;
    }

    private native int getDays__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Availability";
    }

    private native List<TimeRange> getTimeRanges__Native();

    private native NativeObject init(int i12, List<TimeRange> list);

    public synchronized int getDays() {
        try {
            if (!this.days__is_initialized) {
                this.days = getDays__Native();
                this.days__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.days;
    }

    @N
    public synchronized List<TimeRange> getTimeRanges() {
        try {
            if (!this.timeRanges__is_initialized) {
                this.timeRanges = getTimeRanges__Native();
                this.timeRanges__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.timeRanges;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(Integer.valueOf(getDays()), false);
            c.z(TimeRange.class, archive, getTimeRanges(), false);
            return;
        }
        this.days = archive.add(Integer.valueOf(this.days), false).intValue();
        this.days__is_initialized = true;
        List<TimeRange> listX = c.x(TimeRange.class, archive, this.timeRanges, false);
        this.timeRanges = listX;
        this.timeRanges__is_initialized = true;
        this.nativeObject = init(this.days, listX);
    }

    public Availability(int i12, @N List<TimeRange> list) {
        this.days__is_initialized = false;
        this.timeRanges__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(i12, list);
            this.days = i12;
            this.days__is_initialized = true;
            this.timeRanges = list;
            this.timeRanges__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"timeRanges\" cannot be null");
    }

    private Availability(NativeObject nativeObject) {
        this.days__is_initialized = false;
        this.timeRanges__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
