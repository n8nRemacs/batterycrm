package com.yandex.mapkit.navigation;

import AK.c;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class JamStyle implements Serializable {
    private List<JamTypeColor> colors;
    private boolean colors__is_initialized;
    private NativeObject nativeObject;

    public JamStyle() {
        this.colors__is_initialized = false;
    }

    private native List<JamTypeColor> getColors__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::JamStyle";
    }

    private native NativeObject init(List<JamTypeColor> list);

    @N
    public synchronized List<JamTypeColor> getColors() {
        try {
            if (!this.colors__is_initialized) {
                this.colors = getColors__Native();
                this.colors__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.colors;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            c.z(JamTypeColor.class, archive, getColors(), false);
            return;
        }
        List<JamTypeColor> listX = c.x(JamTypeColor.class, archive, this.colors, false);
        this.colors = listX;
        this.colors__is_initialized = true;
        this.nativeObject = init(listX);
    }

    public JamStyle(@N List<JamTypeColor> list) {
        this.colors__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.colors = list;
            this.colors__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"colors\" cannot be null");
    }

    private JamStyle(NativeObject nativeObject) {
        this.colors__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
