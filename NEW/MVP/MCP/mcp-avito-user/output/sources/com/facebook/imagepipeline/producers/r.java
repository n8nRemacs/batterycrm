package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: DelegatingConsumer.java */
@Nullsafe
/* loaded from: classes15.dex */
public abstract class r<I, O> extends AbstractC36395b<I> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36410l<O> f340716b;

    public r(InterfaceC36410l<O> interfaceC36410l) {
        this.f340716b = interfaceC36410l;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC36395b
    public void g() {
        this.f340716b.b();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC36395b
    public void h(Throwable th2) {
        this.f340716b.a(th2);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC36395b
    public void j(float f12) {
        this.f340716b.d(f12);
    }
}
