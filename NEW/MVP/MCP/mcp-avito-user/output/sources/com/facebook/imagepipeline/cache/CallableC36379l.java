package com.facebook.imagepipeline.cache;

import java.util.concurrent.Callable;

/* compiled from: BufferedDiskCache.java */
/* renamed from: com.facebook.imagepipeline.cache.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
class CallableC36379l implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.facebook.cache.common.c f340242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36378k f340243c;

    public CallableC36379l(C36378k c36378k, com.facebook.cache.common.c cVar) {
        this.f340243c = c36378k;
        this.f340242b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        C36378k c36378k = this.f340243c;
        M m12 = c36378k.f340237f;
        com.facebook.cache.common.c cVar = this.f340242b;
        m12.d(cVar);
        c36378k.f340232a.b(cVar);
        return null;
    }
}
