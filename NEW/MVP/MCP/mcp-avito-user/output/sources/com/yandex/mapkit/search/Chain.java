package com.yandex.mapkit.search;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class Chain implements Serializable {

    /* renamed from: id, reason: collision with root package name */
    private String f377463id;
    private String name;

    public Chain(@N String str, @N String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        this.f377463id = str;
        this.name = str2;
    }

    @N
    public String getId() {
        return this.f377463id;
    }

    @N
    public String getName() {
        return this.name;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f377463id = archive.add(this.f377463id, false);
        this.name = archive.add(this.name, false);
    }

    public Chain() {
    }
}
