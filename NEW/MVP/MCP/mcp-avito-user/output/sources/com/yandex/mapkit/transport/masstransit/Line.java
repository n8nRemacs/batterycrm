package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class Line implements BaseMetadata, Serializable {

    /* renamed from: id, reason: collision with root package name */
    private String f377475id;
    private boolean id__is_initialized;
    private boolean isNight;
    private boolean isNight__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private String shortName;
    private boolean shortName__is_initialized;
    private Style style;
    private boolean style__is_initialized;
    private String transportSystemId;
    private boolean transportSystemId__is_initialized;
    private String uri;
    private boolean uri__is_initialized;
    private List<String> vehicleTypes;
    private boolean vehicleTypes__is_initialized;

    public Line() {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.vehicleTypes__is_initialized = false;
        this.style__is_initialized = false;
        this.isNight__is_initialized = false;
        this.uri__is_initialized = false;
        this.shortName__is_initialized = false;
        this.transportSystemId__is_initialized = false;
    }

    private native String getId__Native();

    private native boolean getIsNight__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Line";
    }

    private native String getShortName__Native();

    private native Style getStyle__Native();

    private native String getTransportSystemId__Native();

    private native String getUri__Native();

    private native List<String> getVehicleTypes__Native();

    private native NativeObject init(String str, String str2, List<String> list, Style style, boolean z12, String str3, String str4, String str5);

    @N
    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.f377475id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f377475id;
    }

    public synchronized boolean getIsNight() {
        try {
            if (!this.isNight__is_initialized) {
                this.isNight = getIsNight__Native();
                this.isNight__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.isNight;
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

    @P
    public synchronized String getShortName() {
        try {
            if (!this.shortName__is_initialized) {
                this.shortName = getShortName__Native();
                this.shortName__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.shortName;
    }

    @P
    public synchronized Style getStyle() {
        try {
            if (!this.style__is_initialized) {
                this.style = getStyle__Native();
                this.style__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.style;
    }

    @P
    public synchronized String getTransportSystemId() {
        try {
            if (!this.transportSystemId__is_initialized) {
                this.transportSystemId = getTransportSystemId__Native();
                this.transportSystemId__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.transportSystemId;
    }

    @P
    public synchronized String getUri() {
        try {
            if (!this.uri__is_initialized) {
                this.uri = getUri__Native();
                this.uri__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.uri;
    }

    @N
    public synchronized List<String> getVehicleTypes() {
        try {
            if (!this.vehicleTypes__is_initialized) {
                this.vehicleTypes = getVehicleTypes__Native();
                this.vehicleTypes__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.vehicleTypes;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add(getName(), false);
            archive.add((List) getVehicleTypes(), false, (ArchivingHandler) new StringHandler());
            archive.add((Archive) getStyle(), true, (Class<Archive>) Style.class);
            archive.add(getIsNight());
            archive.add(getUri(), true);
            archive.add(getShortName(), true);
            archive.add(getTransportSystemId(), true);
            return;
        }
        this.f377475id = archive.add(this.f377475id, false);
        this.id__is_initialized = true;
        this.name = archive.add(this.name, false);
        this.name__is_initialized = true;
        this.vehicleTypes = archive.add((List) this.vehicleTypes, false, (ArchivingHandler) new StringHandler());
        this.vehicleTypes__is_initialized = true;
        this.style = (Style) archive.add((Archive) this.style, true, (Class<Archive>) Style.class);
        this.style__is_initialized = true;
        this.isNight = archive.add(this.isNight);
        this.isNight__is_initialized = true;
        this.uri = archive.add(this.uri, true);
        this.uri__is_initialized = true;
        this.shortName = archive.add(this.shortName, true);
        this.shortName__is_initialized = true;
        String strAdd = archive.add(this.transportSystemId, true);
        this.transportSystemId = strAdd;
        this.transportSystemId__is_initialized = true;
        this.nativeObject = init(this.f377475id, this.name, this.vehicleTypes, this.style, this.isNight, this.uri, this.shortName, strAdd);
    }

    public static class Style implements Serializable {
        private Integer color;

        public Style(@P Integer num) {
            this.color = num;
        }

        @P
        public Integer getColor() {
            return this.color;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.color = archive.add(this.color, true);
        }

        public Style() {
        }
    }

    public Line(@N String str, @N String str2, @N List<String> list, @P Style style, boolean z12, @P String str3, @P String str4, @P String str5) {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.vehicleTypes__is_initialized = false;
        this.style__is_initialized = false;
        this.isNight__is_initialized = false;
        this.uri__is_initialized = false;
        this.shortName__is_initialized = false;
        this.transportSystemId__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(str, str2, list, style, z12, str3, str4, str5);
            this.f377475id = str;
            this.id__is_initialized = true;
            this.name = str2;
            this.name__is_initialized = true;
            this.vehicleTypes = list;
            this.vehicleTypes__is_initialized = true;
            this.style = style;
            this.style__is_initialized = true;
            this.isNight = z12;
            this.isNight__is_initialized = true;
            this.uri = str3;
            this.uri__is_initialized = true;
            this.shortName = str4;
            this.shortName__is_initialized = true;
            this.transportSystemId = str5;
            this.transportSystemId__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"vehicleTypes\" cannot be null");
    }

    private Line(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.vehicleTypes__is_initialized = false;
        this.style__is_initialized = false;
        this.isNight__is_initialized = false;
        this.uri__is_initialized = false;
        this.shortName__is_initialized = false;
        this.transportSystemId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
