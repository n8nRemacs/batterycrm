package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.util.k;
import j.N;

/* compiled from: SimpleResource.java */
/* loaded from: classes5.dex */
public class b<T> implements w<T> {

    /* renamed from: b, reason: collision with root package name */
    public final T f339318b;

    public b(@N T t12) {
        k.c(t12, "Argument must not be null");
        this.f339318b = t12;
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final Class<T> b() {
        return (Class<T>) this.f339318b.getClass();
    }

    @Override // com.bumptech.glide.load.engine.w
    @N
    public final T get() {
        return this.f339318b;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.w
    public final void c() {
    }
}
