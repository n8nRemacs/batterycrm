package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;

/* compiled from: BitmapMemoryCacheKeyMultiplexProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36405g extends S<Pair<com.facebook.cache.common.c, ImageRequest.RequestLevel>, com.facebook.common.references.a<YW0.b>> {

    /* renamed from: e, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.o f340671e;

    public C36405g(com.facebook.imagepipeline.cache.o oVar, C36406h c36406h) {
        super(c36406h, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f340671e = oVar;
    }

    @Override // com.facebook.imagepipeline.producers.S
    @I41.h
    public final Closeable c(@I41.h Closeable closeable) {
        return com.facebook.common.references.a.b((com.facebook.common.references.a) closeable);
    }

    @Override // com.facebook.imagepipeline.producers.S
    public final Pair d(k0 k0Var) {
        return Pair.create(this.f340671e.c(k0Var.j(), k0Var.a()), k0Var.n());
    }
}
