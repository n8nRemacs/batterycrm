package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import j.N;
import j.P;
import java.io.InputStream;

/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes5.dex */
public class b implements n<com.bumptech.glide.load.model.g, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final j<Integer> f339271b = j.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    @P
    public final m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> f339272a;

    /* compiled from: HttpGlideUrlLoader.java */
    public static class a implements o<com.bumptech.glide.load.model.g, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> f339273a = new m<>(500);

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<com.bumptech.glide.load.model.g, InputStream> b(r rVar) {
            return new b(this.f339273a);
        }
    }

    public b() {
        this(null);
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a<InputStream> a(@N com.bumptech.glide.load.model.g gVar, int i12, int i13, @N k kVar) {
        com.bumptech.glide.load.model.g gVar2 = gVar;
        m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> mVar = this.f339272a;
        if (mVar != null) {
            com.bumptech.glide.load.model.g gVar3 = (com.bumptech.glide.load.model.g) mVar.a(gVar2);
            if (gVar3 == null) {
                mVar.b(gVar2, gVar2);
            } else {
                gVar2 = gVar3;
            }
        }
        return new n.a<>(gVar2, new com.bumptech.glide.load.data.j(gVar2, ((Integer) kVar.c(f339271b)).intValue()));
    }

    @Override // com.bumptech.glide.load.model.n
    public final /* bridge */ /* synthetic */ boolean b(@N com.bumptech.glide.load.model.g gVar) {
        return true;
    }

    public b(@P m<com.bumptech.glide.load.model.g, com.bumptech.glide.load.model.g> mVar) {
        this.f339272a = mVar;
    }
}
