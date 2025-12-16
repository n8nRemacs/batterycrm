package com.yandex.mapkit.search;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class Sort implements Serializable {
    private SortOrigin origin;
    private SortType type;

    public Sort(@N SortType sortType, @P SortOrigin sortOrigin) {
        if (sortType == null) {
            throw new IllegalArgumentException("Required field \"type\" cannot be null");
        }
        this.type = sortType;
        this.origin = sortOrigin;
    }

    @P
    public SortOrigin getOrigin() {
        return this.origin;
    }

    @N
    public SortType getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (SortType) archive.add((Archive) this.type, false, (Class<Archive>) SortType.class);
        this.origin = (SortOrigin) archive.add((Archive) this.origin, true, (Class<Archive>) SortOrigin.class);
    }

    public Sort() {
    }
}
