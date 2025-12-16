package com.bumptech.glide.load.engine;

import j.N;
import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: classes5.dex */
final class f implements com.bumptech.glide.load.h {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.h f339008b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.h f339009c;

    public f(com.bumptech.glide.load.h hVar, com.bumptech.glide.load.h hVar2) {
        this.f339008b = hVar;
        this.f339009c = hVar2;
    }

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        this.f339008b.b(messageDigest);
        this.f339009c.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f339008b.equals(fVar.f339008b) && this.f339009c.equals(fVar.f339009c);
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return this.f339009c.hashCode() + (this.f339008b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f339008b + ", signature=" + this.f339009c + '}';
    }
}
