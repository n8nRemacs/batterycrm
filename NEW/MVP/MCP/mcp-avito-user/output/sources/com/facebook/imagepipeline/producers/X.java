package com.facebook.imagepipeline.producers;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PartialDiskCacheProducer.java */
/* loaded from: classes15.dex */
class X extends C36401e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f340621a;

    public X(AtomicBoolean atomicBoolean) {
        this.f340621a = atomicBoolean;
    }

    @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
    public final void c() {
        this.f340621a.set(true);
    }
}
