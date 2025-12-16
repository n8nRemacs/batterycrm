package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.g;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: DiskStorageCacheFactory.java */
@Nullsafe
/* loaded from: classes12.dex */
public class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public e f340287a;

    public final com.facebook.cache.disk.g a(com.facebook.cache.disk.d dVar) {
        this.f340287a.getClass();
        com.facebook.cache.disk.h hVar = new com.facebook.cache.disk.h(dVar.f339758a, dVar.f339760c, dVar.f339759b, dVar.f339765h);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new com.facebook.cache.disk.g(hVar, dVar.f339764g, new g.b(dVar.f339763f, dVar.f339762e, dVar.f339761d), dVar.f339766i, dVar.f339765h, dVar.f339767j, executorServiceNewSingleThreadExecutor);
    }
}
