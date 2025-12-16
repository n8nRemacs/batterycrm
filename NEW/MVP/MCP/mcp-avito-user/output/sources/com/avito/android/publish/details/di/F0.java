package com.avito.android.publish.details.di;

import com.avito.android.util.InterfaceC35745a5;

/* compiled from: PublishDetailsTagsModule_ProvideTagsViewModelFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class F0 implements dagger.internal.h<com.avito.android.publish.details.tags.f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f233628a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233629b;

    public F0(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f233628a = uVar;
        this.f233629b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.details.tags.a aVar = (com.avito.android.publish.details.tags.a) this.f233628a.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f233629b.get();
        C0.f233612a.getClass();
        return new com.avito.android.publish.details.tags.f(aVar, interfaceC35745a5);
    }
}
