package com.bumptech.glide.load.engine;

import j.N;
import java.security.MessageDigest;

/* compiled from: EngineKey.java */
/* loaded from: classes5.dex */
class p implements com.bumptech.glide.load.h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f339145b;

    /* renamed from: c, reason: collision with root package name */
    public final int f339146c;

    /* renamed from: d, reason: collision with root package name */
    public final int f339147d;

    /* renamed from: e, reason: collision with root package name */
    public final Class<?> f339148e;

    /* renamed from: f, reason: collision with root package name */
    public final Class<?> f339149f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.load.h f339150g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.util.b f339151h;

    /* renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.load.k f339152i;

    /* renamed from: j, reason: collision with root package name */
    public int f339153j;

    public p(Object obj, com.bumptech.glide.load.h hVar, int i12, int i13, com.bumptech.glide.util.b bVar, Class cls, Class cls2, com.bumptech.glide.load.k kVar) {
        com.bumptech.glide.util.k.c(obj, "Argument must not be null");
        this.f339145b = obj;
        com.bumptech.glide.util.k.c(hVar, "Signature must not be null");
        this.f339150g = hVar;
        this.f339146c = i12;
        this.f339147d = i13;
        com.bumptech.glide.util.k.c(bVar, "Argument must not be null");
        this.f339151h = bVar;
        com.bumptech.glide.util.k.c(cls, "Resource class must not be null");
        this.f339148e = cls;
        com.bumptech.glide.util.k.c(cls2, "Transcode class must not be null");
        this.f339149f = cls2;
        com.bumptech.glide.util.k.c(kVar, "Argument must not be null");
        this.f339152i = kVar;
    }

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f339145b.equals(pVar.f339145b) && this.f339150g.equals(pVar.f339150g) && this.f339147d == pVar.f339147d && this.f339146c == pVar.f339146c && this.f339151h.equals(pVar.f339151h) && this.f339148e.equals(pVar.f339148e) && this.f339149f.equals(pVar.f339149f) && this.f339152i.equals(pVar.f339152i);
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        if (this.f339153j == 0) {
            int iHashCode = this.f339145b.hashCode();
            this.f339153j = iHashCode;
            int iHashCode2 = ((((this.f339150g.hashCode() + (iHashCode * 31)) * 31) + this.f339146c) * 31) + this.f339147d;
            this.f339153j = iHashCode2;
            int iHashCode3 = this.f339151h.hashCode() + (iHashCode2 * 31);
            this.f339153j = iHashCode3;
            int iHashCode4 = this.f339148e.hashCode() + (iHashCode3 * 31);
            this.f339153j = iHashCode4;
            int iHashCode5 = this.f339149f.hashCode() + (iHashCode4 * 31);
            this.f339153j = iHashCode5;
            this.f339153j = this.f339152i.f339200b.hashCode() + (iHashCode5 * 31);
        }
        return this.f339153j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f339145b + ", width=" + this.f339146c + ", height=" + this.f339147d + ", resourceClass=" + this.f339148e + ", transcodeClass=" + this.f339149f + ", signature=" + this.f339150g + ", hashCode=" + this.f339153j + ", transformations=" + this.f339151h + ", options=" + this.f339152i + '}';
    }
}
