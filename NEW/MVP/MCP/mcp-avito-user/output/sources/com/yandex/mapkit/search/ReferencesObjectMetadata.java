package com.yandex.mapkit.search;

import AK.c;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class ReferencesObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<ReferenceType> references;
    private boolean references__is_initialized;

    public ReferencesObjectMetadata() {
        this.references__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ReferencesObjectMetadata";
    }

    private native List<ReferenceType> getReferences__Native();

    private native NativeObject init(List<ReferenceType> list);

    @N
    public synchronized List<ReferenceType> getReferences() {
        try {
            if (!this.references__is_initialized) {
                this.references = getReferences__Native();
                this.references__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.references;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            c.z(ReferenceType.class, archive, getReferences(), false);
            return;
        }
        List<ReferenceType> listX = c.x(ReferenceType.class, archive, this.references, false);
        this.references = listX;
        this.references__is_initialized = true;
        this.nativeObject = init(listX);
    }

    public ReferencesObjectMetadata(@N List<ReferenceType> list) {
        this.references__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.references = list;
            this.references__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"references\" cannot be null");
    }

    private ReferencesObjectMetadata(NativeObject nativeObject) {
        this.references__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
