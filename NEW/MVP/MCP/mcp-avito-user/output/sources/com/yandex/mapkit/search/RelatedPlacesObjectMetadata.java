package com.yandex.mapkit.search;

import AK.c;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class RelatedPlacesObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<PlaceInfo> similarPlaces;
    private boolean similarPlaces__is_initialized;

    public RelatedPlacesObjectMetadata() {
        this.similarPlaces__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::RelatedPlacesObjectMetadata";
    }

    private native List<PlaceInfo> getSimilarPlaces__Native();

    private native NativeObject init(List<PlaceInfo> list);

    @N
    public synchronized List<PlaceInfo> getSimilarPlaces() {
        try {
            if (!this.similarPlaces__is_initialized) {
                this.similarPlaces = getSimilarPlaces__Native();
                this.similarPlaces__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.similarPlaces;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            c.z(PlaceInfo.class, archive, getSimilarPlaces(), false);
            return;
        }
        List<PlaceInfo> listX = c.x(PlaceInfo.class, archive, this.similarPlaces, false);
        this.similarPlaces = listX;
        this.similarPlaces__is_initialized = true;
        this.nativeObject = init(listX);
    }

    public RelatedPlacesObjectMetadata(@N List<PlaceInfo> list) {
        this.similarPlaces__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.similarPlaces = list;
            this.similarPlaces__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"similarPlaces\" cannot be null");
    }

    private RelatedPlacesObjectMetadata(NativeObject nativeObject) {
        this.similarPlaces__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
