package com.yandex.mapkit.transport.masstransit;

import AK.c;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class Thread implements BaseMetadata, Serializable {
    private String description;
    private boolean description__is_initialized;
    private List<Stop> essentialStops;
    private boolean essentialStops__is_initialized;

    /* renamed from: id, reason: collision with root package name */
    private String f377478id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;

    public Thread() {
        this.id__is_initialized = false;
        this.essentialStops__is_initialized = false;
        this.description__is_initialized = false;
    }

    private native String getDescription__Native();

    private native List<Stop> getEssentialStops__Native();

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Thread";
    }

    private native NativeObject init(String str, List<Stop> list, String str2);

    @P
    public synchronized String getDescription() {
        try {
            if (!this.description__is_initialized) {
                this.description = getDescription__Native();
                this.description__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.description;
    }

    @N
    public synchronized List<Stop> getEssentialStops() {
        try {
            if (!this.essentialStops__is_initialized) {
                this.essentialStops = getEssentialStops__Native();
                this.essentialStops__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.essentialStops;
    }

    @N
    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.f377478id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f377478id;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add((List) getEssentialStops(), false, (ArchivingHandler) new ClassHandler(Stop.class));
            archive.add(getDescription(), true);
            return;
        }
        this.f377478id = archive.add(this.f377478id, false);
        this.id__is_initialized = true;
        this.essentialStops = c.x(Stop.class, archive, this.essentialStops, false);
        this.essentialStops__is_initialized = true;
        String strAdd = archive.add(this.description, true);
        this.description = strAdd;
        this.description__is_initialized = true;
        this.nativeObject = init(this.f377478id, this.essentialStops, strAdd);
    }

    public Thread(@N String str, @N List<Stop> list, @P String str2) {
        this.id__is_initialized = false;
        this.essentialStops__is_initialized = false;
        this.description__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(str, list, str2);
            this.f377478id = str;
            this.id__is_initialized = true;
            this.essentialStops = list;
            this.essentialStops__is_initialized = true;
            this.description = str2;
            this.description__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"essentialStops\" cannot be null");
    }

    private Thread(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.essentialStops__is_initialized = false;
        this.description__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
