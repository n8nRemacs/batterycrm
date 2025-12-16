package com.avito.android.messenger.channels.mvi.interactor;

import javax.inject.Provider;

/* compiled from: AssistantSettingsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.channels.mvi.interactor.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31765c implements dagger.internal.h<C31764b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WY.a> f187642a;

    public C31765c(Provider<WY.a> provider) {
        this.f187642a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31764b(dagger.internal.g.a(dagger.internal.w.a(this.f187642a)));
    }
}
