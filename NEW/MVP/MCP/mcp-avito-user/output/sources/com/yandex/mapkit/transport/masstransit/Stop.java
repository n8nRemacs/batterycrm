package com.yandex.mapkit.transport.masstransit;

import AK.c;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class Stop implements BaseMetadata, Serializable {
    private String additionalName;
    private boolean additionalName__is_initialized;
    private StopFeatureMask features;
    private boolean features__is_initialized;

    /* renamed from: id, reason: collision with root package name */
    private String f377477id;
    private boolean id__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private List<TransportContour> transportContours;
    private boolean transportContours__is_initialized;

    public Stop() {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.additionalName__is_initialized = false;
        this.features__is_initialized = false;
        this.transportContours__is_initialized = false;
    }

    private native String getAdditionalName__Native();

    private native StopFeatureMask getFeatures__Native();

    private native String getId__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Stop";
    }

    private native List<TransportContour> getTransportContours__Native();

    private native NativeObject init(String str, String str2, String str3, StopFeatureMask stopFeatureMask, List<TransportContour> list);

    @P
    public synchronized String getAdditionalName() {
        try {
            if (!this.additionalName__is_initialized) {
                this.additionalName = getAdditionalName__Native();
                this.additionalName__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.additionalName;
    }

    @P
    public synchronized StopFeatureMask getFeatures() {
        try {
            if (!this.features__is_initialized) {
                this.features = getFeatures__Native();
                this.features__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.features;
    }

    @N
    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.f377477id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f377477id;
    }

    @N
    public synchronized String getName() {
        try {
            if (!this.name__is_initialized) {
                this.name = getName__Native();
                this.name__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.name;
    }

    @N
    public synchronized List<TransportContour> getTransportContours() {
        try {
            if (!this.transportContours__is_initialized) {
                this.transportContours = getTransportContours__Native();
                this.transportContours__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.transportContours;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add(getName(), false);
            archive.add(getAdditionalName(), true);
            archive.add((Archive) getFeatures(), true, (Class<Archive>) StopFeatureMask.class);
            c.z(TransportContour.class, archive, getTransportContours(), false);
            return;
        }
        this.f377477id = archive.add(this.f377477id, false);
        this.id__is_initialized = true;
        this.name = archive.add(this.name, false);
        this.name__is_initialized = true;
        this.additionalName = archive.add(this.additionalName, true);
        this.additionalName__is_initialized = true;
        this.features = (StopFeatureMask) archive.add((Archive) this.features, true, (Class<Archive>) StopFeatureMask.class);
        this.features__is_initialized = true;
        List<TransportContour> listX = c.x(TransportContour.class, archive, this.transportContours, false);
        this.transportContours = listX;
        this.transportContours__is_initialized = true;
        this.nativeObject = init(this.f377477id, this.name, this.additionalName, this.features, listX);
    }

    public Stop(@N String str, @N String str2, @P String str3, @P StopFeatureMask stopFeatureMask, @N List<TransportContour> list) {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.additionalName__is_initialized = false;
        this.features__is_initialized = false;
        this.transportContours__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(str, str2, str3, stopFeatureMask, list);
            this.f377477id = str;
            this.id__is_initialized = true;
            this.name = str2;
            this.name__is_initialized = true;
            this.additionalName = str3;
            this.additionalName__is_initialized = true;
            this.features = stopFeatureMask;
            this.features__is_initialized = true;
            this.transportContours = list;
            this.transportContours__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"transportContours\" cannot be null");
    }

    private Stop(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.additionalName__is_initialized = false;
        this.features__is_initialized = false;
        this.transportContours__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
