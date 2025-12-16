package com.facebook.imagepipeline.producers;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DiskCacheReadProducer.java */
/* renamed from: com.facebook.imagepipeline.producers.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C36417t extends C36401e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f340734a;

    public C36417t(AtomicBoolean atomicBoolean) {
        this.f340734a = atomicBoolean;
    }

    @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
    public final void c() {
        this.f340734a.set(true);
    }
}
