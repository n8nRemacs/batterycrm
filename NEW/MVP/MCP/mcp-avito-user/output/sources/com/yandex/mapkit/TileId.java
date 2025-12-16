package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class TileId implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private int f377443x;

    /* renamed from: y, reason: collision with root package name */
    private int f377444y;

    /* renamed from: z, reason: collision with root package name */
    private int f377445z;

    public TileId(int i12, int i13, int i14) {
        this.f377443x = i12;
        this.f377444y = i13;
        this.f377445z = i14;
    }

    public int getX() {
        return this.f377443x;
    }

    public int getY() {
        return this.f377444y;
    }

    public int getZ() {
        return this.f377445z;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f377443x = archive.add(this.f377443x);
        this.f377444y = archive.add(this.f377444y);
        this.f377445z = archive.add(this.f377445z);
    }

    public TileId() {
    }
}
