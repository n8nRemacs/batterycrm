package com.avito.android.messenger.conversation.mvi.in_app_calls;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChannelIacPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ChannelIacInteractor> f191407a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191408b;

    public j(Provider<ChannelIacInteractor> provider, Provider<InterfaceC35745a5> provider2) {
        this.f191407a = provider;
        this.f191408b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f191407a.get(), this.f191408b.get());
    }
}
