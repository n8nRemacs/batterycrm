package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.PooledByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import uW0.C48986a;

/* compiled from: BufferedDiskCache.java */
/* renamed from: com.facebook.imagepipeline.cache.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
class CallableC36377j implements Callable<YW0.d> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f340229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.facebook.cache.common.c f340230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36378k f340231d;

    public CallableC36377j(C36378k c36378k, AtomicBoolean atomicBoolean, com.facebook.cache.common.c cVar) {
        this.f340231d = c36378k;
        this.f340229b = atomicBoolean;
        this.f340230c = cVar;
    }

    @Override // java.util.concurrent.Callable
    @I41.h
    public final YW0.d call() throws InterruptedException {
        PooledByteBuffer pooledByteBufferA;
        if (this.f340229b.get()) {
            throw new CancellationException();
        }
        C36378k c36378k = this.f340231d;
        M m12 = c36378k.f340237f;
        com.facebook.cache.common.c cVar = this.f340230c;
        YW0.d dVarA = m12.a(cVar);
        A a12 = c36378k.f340238g;
        if (dVarA != null) {
            C48986a.g(cVar.a(), C36378k.class, "Found image for %s in staging area");
            a12.getClass();
        } else {
            C48986a.g(cVar.a(), C36378k.class, "Did not find image for %s in staging area");
            a12.getClass();
            dVarA = null;
            try {
                pooledByteBufferA = C36378k.a(c36378k, cVar);
            } catch (Exception unused) {
            }
            if (pooledByteBufferA == null) {
                return dVarA;
            }
            com.facebook.common.references.a aVarM = com.facebook.common.references.a.m(pooledByteBufferA);
            try {
                dVarA = new YW0.d(aVarM);
            } finally {
                com.facebook.common.references.a.c(aVarM);
            }
        }
        if (Thread.interrupted()) {
            C48986a.d(C36378k.class, "Host thread was interrupted, decreasing reference count");
            dVarA.close();
            throw new InterruptedException();
        }
        return dVarA;
    }
}
