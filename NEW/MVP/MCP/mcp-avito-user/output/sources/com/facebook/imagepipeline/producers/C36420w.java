package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;

/* compiled from: EncodedCacheKeyMultiplexProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36420w extends S<Pair<com.facebook.cache.common.c, ImageRequest.RequestLevel>, YW0.d> {

    /* renamed from: e, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.o f340751e;

    public C36420w(com.facebook.imagepipeline.cache.o oVar, i0 i0Var) {
        super(i0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt");
        this.f340751e = oVar;
    }

    @Override // com.facebook.imagepipeline.producers.S
    @I41.h
    public final Closeable c(@I41.h Closeable closeable) {
        return YW0.d.a((YW0.d) closeable);
    }

    @Override // com.facebook.imagepipeline.producers.S
    public final Pair d(k0 k0Var) {
        return Pair.create(this.f340751e.b(k0Var.j(), k0Var.a()), k0Var.n());
    }
}
