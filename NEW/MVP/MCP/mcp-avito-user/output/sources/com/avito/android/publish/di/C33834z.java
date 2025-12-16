package com.avito.android.publish.di;

import com.avito.android.publish.C0;
import javax.inject.Provider;

/* compiled from: PublishModule_ProvidePublishResultMediatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.di.z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33834z implements dagger.internal.h<com.avito.android.publish.view.result_handler.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235301a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f235302b;

    public C33834z(C33824o c33824o, Provider<C0> provider) {
        this.f235301a = c33824o;
        this.f235302b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0 c02 = this.f235302b.get();
        this.f235301a.getClass();
        return new com.avito.android.publish.view.result_handler.e(new C33825p(c02));
    }
}
