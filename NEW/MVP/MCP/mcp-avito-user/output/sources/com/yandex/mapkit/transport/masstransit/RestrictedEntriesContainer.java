package com.yandex.mapkit.transport.masstransit;

import AK.c;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class RestrictedEntriesContainer implements Serializable {
    private List<RestrictedEntry> entries;
    private boolean entries__is_initialized;
    private NativeObject nativeObject;

    public RestrictedEntriesContainer() {
        this.entries__is_initialized = false;
    }

    private native List<RestrictedEntry> getEntries__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RestrictedEntriesContainer";
    }

    private native NativeObject init(List<RestrictedEntry> list);

    @N
    public synchronized List<RestrictedEntry> getEntries() {
        try {
            if (!this.entries__is_initialized) {
                this.entries = getEntries__Native();
                this.entries__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.entries;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            c.z(RestrictedEntry.class, archive, getEntries(), false);
            return;
        }
        List<RestrictedEntry> listX = c.x(RestrictedEntry.class, archive, this.entries, false);
        this.entries = listX;
        this.entries__is_initialized = true;
        this.nativeObject = init(listX);
    }

    public RestrictedEntriesContainer(@N List<RestrictedEntry> list) {
        this.entries__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.entries = list;
            this.entries__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"entries\" cannot be null");
    }

    private RestrictedEntriesContainer(NativeObject nativeObject) {
        this.entries__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
