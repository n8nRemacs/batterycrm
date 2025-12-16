package com.yandex.mapkit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import j.N;
import java.util.Map;

/* loaded from: classes7.dex */
public class UserData implements BaseMetadata, Serializable {
    private Map<String, String> data;
    private boolean data__is_initialized;
    private NativeObject nativeObject;

    public UserData() {
        this.data__is_initialized = false;
    }

    private native Map<String, String> getData__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::UserData";
    }

    private native NativeObject init(Map<String, String> map);

    @N
    public synchronized Map<String, String> getData() {
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
            archive.add(getData(), false, new StringHandler(), new StringHandler());
            return;
        }
        Map<String, String> mapAdd = archive.add(this.data, false, new StringHandler(), new StringHandler());
        this.data = mapAdd;
        this.data__is_initialized = true;
        this.nativeObject = init(mapAdd);
    }

    public UserData(@N Map<String, String> map) {
        this.data__is_initialized = false;
        if (map != null) {
            this.nativeObject = init(map);
            this.data = map;
            this.data__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"data\" cannot be null");
    }

    private UserData(NativeObject nativeObject) {
        this.data__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
