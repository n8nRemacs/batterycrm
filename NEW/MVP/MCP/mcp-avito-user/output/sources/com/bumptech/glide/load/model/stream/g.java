package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.k;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import j.N;
import java.io.InputStream;
import java.net.URL;

/* compiled from: UrlLoader.java */
/* loaded from: classes5.dex */
public class g implements n<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final n<com.bumptech.glide.load.model.g, InputStream> f339297a;

    /* compiled from: UrlLoader.java */
    public static class a implements o<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<URL, InputStream> b(r rVar) {
            return new g(rVar.b(com.bumptech.glide.load.model.g.class, InputStream.class));
        }
    }

    public g(n<com.bumptech.glide.load.model.g, InputStream> nVar) {
        this.f339297a = nVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a<InputStream> a(@N URL url, int i12, int i13, @N k kVar) {
        return this.f339297a.a(new com.bumptech.glide.load.model.g(url), i12, i13, kVar);
    }

    @Override // com.bumptech.glide.load.model.n
    public final /* bridge */ /* synthetic */ boolean b(@N URL url) {
        return true;
    }
}
