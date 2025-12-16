package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class ReferenceType implements Serializable {

    /* renamed from: id, reason: collision with root package name */
    private String f377469id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;
    private String scope;
    private boolean scope__is_initialized;

    public ReferenceType() {
        this.id__is_initialized = false;
        this.scope__is_initialized = false;
    }

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ReferenceType";
    }

    private native String getScope__Native();

    private native NativeObject init(String str, String str2);

    @N
    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.f377469id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f377469id;
    }

    @N
    public synchronized String getScope() {
        try {
            if (!this.scope__is_initialized) {
                this.scope = getScope__Native();
                this.scope__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.scope;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add(getScope(), false);
            return;
        }
        this.f377469id = archive.add(this.f377469id, false);
        this.id__is_initialized = true;
        String strAdd = archive.add(this.scope, false);
        this.scope = strAdd;
        this.scope__is_initialized = true;
        this.nativeObject = init(this.f377469id, strAdd);
    }

    public ReferenceType(@N String str, @N String str2) {
        this.id__is_initialized = false;
        this.scope__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (str2 != null) {
            this.nativeObject = init(str, str2);
            this.f377469id = str;
            this.id__is_initialized = true;
            this.scope = str2;
            this.scope__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"scope\" cannot be null");
    }

    private ReferenceType(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.scope__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
