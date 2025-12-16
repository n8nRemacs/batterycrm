package com.bumptech.glide.load.engine;

import j.N;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes5.dex */
final class y implements com.bumptech.glide.load.h {

    /* renamed from: j, reason: collision with root package name */
    public static final com.bumptech.glide.util.h<Class<?>, byte[]> f339180j = new com.bumptech.glide.util.h<>(50);

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.j f339181b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.h f339182c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.load.h f339183d;

    /* renamed from: e, reason: collision with root package name */
    public final int f339184e;

    /* renamed from: f, reason: collision with root package name */
    public final int f339185f;

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f339186g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.load.k f339187h;

    /* renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.load.n<?> f339188i;

    public y(com.bumptech.glide.load.engine.bitmap_recycle.j jVar, com.bumptech.glide.load.h hVar, com.bumptech.glide.load.h hVar2, int i12, int i13, com.bumptech.glide.load.n nVar, Class cls, com.bumptech.glide.load.k kVar) {
        this.f339181b = jVar;
        this.f339182c = hVar;
        this.f339183d = hVar2;
        this.f339184e = i12;
        this.f339185f = i13;
        this.f339188i = nVar;
        this.f339186g = cls;
        this.f339187h = kVar;
    }

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        com.bumptech.glide.load.engine.bitmap_recycle.j jVar = this.f339181b;
        byte[] bArr = (byte[]) jVar.f();
        ByteBuffer.wrap(bArr).putInt(this.f339184e).putInt(this.f339185f).array();
        this.f339183d.b(messageDigest);
        this.f339182c.b(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.n<?> nVar = this.f339188i;
        if (nVar != null) {
            nVar.b(messageDigest);
        }
        this.f339187h.b(messageDigest);
        com.bumptech.glide.util.h<Class<?>, byte[]> hVar = f339180j;
        Class<?> cls = this.f339186g;
        byte[] bArrB = hVar.b(cls);
        if (bArrB == null) {
            bArrB = cls.getName().getBytes(com.bumptech.glide.load.h.f339193a);
            hVar.e(cls, bArrB);
        }
        messageDigest.update(bArrB);
        jVar.i(bArr);
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f339185f == yVar.f339185f && this.f339184e == yVar.f339184e && com.bumptech.glide.util.m.a(this.f339188i, yVar.f339188i) && this.f339186g.equals(yVar.f339186g) && this.f339182c.equals(yVar.f339182c) && this.f339183d.equals(yVar.f339183d) && this.f339187h.equals(yVar.f339187h);
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        int iHashCode = ((((this.f339183d.hashCode() + (this.f339182c.hashCode() * 31)) * 31) + this.f339184e) * 31) + this.f339185f;
        com.bumptech.glide.load.n<?> nVar = this.f339188i;
        if (nVar != null) {
            iHashCode = (iHashCode * 31) + nVar.hashCode();
        }
        return this.f339187h.f339200b.hashCode() + ((this.f339186g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f339182c + ", signature=" + this.f339183d + ", width=" + this.f339184e + ", height=" + this.f339185f + ", decodedResourceClass=" + this.f339186g + ", transformation='" + this.f339188i + "', options=" + this.f339187h + '}';
    }
}
