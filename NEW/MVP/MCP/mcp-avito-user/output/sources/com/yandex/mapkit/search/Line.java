package com.yandex.mapkit.search;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class Line implements Serializable {
    private String name;

    public Line(@N String str) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        this.name = str;
    }

    @N
    public String getName() {
        return this.name;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.name = archive.add(this.name, false);
    }

    public Line() {
    }
}
