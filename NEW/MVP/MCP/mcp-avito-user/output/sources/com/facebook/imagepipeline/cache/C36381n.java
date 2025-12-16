package com.facebook.imagepipeline.cache;

import java.io.InputStream;

/* compiled from: BufferedDiskCache.java */
/* renamed from: com.facebook.imagepipeline.cache.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
class C36381n implements com.facebook.cache.common.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ YW0.d f340244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36378k f340245b;

    public C36381n(C36378k c36378k, YW0.d dVar) {
        this.f340245b = c36378k;
        this.f340244a = dVar;
    }

    @Override // com.facebook.cache.common.k
    public final void a(com.facebook.common.internal.f fVar) {
        InputStream inputStreamF = this.f340244a.f();
        inputStreamF.getClass();
        this.f340245b.f340234c.a(inputStreamF, fVar);
    }
}
