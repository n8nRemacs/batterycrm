package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.z;
import j.N;
import java.io.InputStream;

/* compiled from: InputStreamRewinder.java */
/* loaded from: classes5.dex */
public final class k implements e<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final z f338870a;

    /* compiled from: InputStreamRewinder.java */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.j f338871a;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
            this.f338871a = jVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @N
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @N
        public final e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f338871a);
        }
    }

    public k(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        z zVar = new z(inputStream, jVar);
        this.f338870a = zVar;
        zVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    @N
    public final InputStream a() {
        z zVar = this.f338870a;
        zVar.reset();
        return zVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        this.f338870a.b();
    }
}
