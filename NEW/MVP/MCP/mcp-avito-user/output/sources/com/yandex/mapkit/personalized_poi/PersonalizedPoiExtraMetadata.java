package com.yandex.mapkit.personalized_poi;

import AK.c;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class PersonalizedPoiExtraMetadata implements BaseMetadata, Serializable {
    private List<PersonalizedPoiExtraMetadataEntry> data;
    private boolean data__is_initialized;
    private NativeObject nativeObject;

    public PersonalizedPoiExtraMetadata() {
        this.data__is_initialized = false;
    }

    private native List<PersonalizedPoiExtraMetadataEntry> getData__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::personalized_poi::PersonalizedPoiExtraMetadata";
    }

    private native NativeObject init(List<PersonalizedPoiExtraMetadataEntry> list);

    @N
    public synchronized List<PersonalizedPoiExtraMetadataEntry> getData() {
        try {
            if (!this.data__is_initialized) {
                this.data = getData__Native();
                this.data__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            c.z(PersonalizedPoiExtraMetadataEntry.class, archive, getData(), false);
            return;
        }
        List<PersonalizedPoiExtraMetadataEntry> listX = c.x(PersonalizedPoiExtraMetadataEntry.class, archive, this.data, false);
        this.data = listX;
        this.data__is_initialized = true;
        this.nativeObject = init(listX);
    }

    public PersonalizedPoiExtraMetadata(@N List<PersonalizedPoiExtraMetadataEntry> list) {
        this.data__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.data = list;
            this.data__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"data\" cannot be null");
    }

    private PersonalizedPoiExtraMetadata(NativeObject nativeObject) {
        this.data__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
