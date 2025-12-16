package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class FeatureSet implements Serializable {
    private List<String> ids;
    private boolean ids__is_initialized;
    private NativeObject nativeObject;

    public FeatureSet() {
        this.ids__is_initialized = false;
    }

    private native List<String> getIds__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::FeatureSet";
    }

    private native NativeObject init(List<String> list);

    @N
    public synchronized List<String> getIds() {
        try {
            if (!this.ids__is_initialized) {
                this.ids = getIds__Native();
                this.ids__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.ids;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getIds(), false, (ArchivingHandler) new StringHandler());
            return;
        }
        List<String> listAdd = archive.add((List) this.ids, false, (ArchivingHandler) new StringHandler());
        this.ids = listAdd;
        this.ids__is_initialized = true;
        this.nativeObject = init(listAdd);
    }

    public FeatureSet(@N List<String> list) {
        this.ids__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.ids = list;
            this.ids__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"ids\" cannot be null");
    }

    private FeatureSet(NativeObject nativeObject) {
        this.ids__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
