package com.avito.android.messenger.conversation.mvi.multi_message;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiMessageInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<u> f193709a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f193710b;

    public l(Provider<u> provider, Provider<com.avito.android.server_time.f> provider2) {
        this.f193709a = provider;
        this.f193710b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f193709a.get(), this.f193710b.get());
    }
}
