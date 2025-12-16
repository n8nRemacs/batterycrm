package com.avito.android.messenger.channels.mvi.interactor;

import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ChannelsErrorInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.channels.mvi.interactor.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31771i implements dagger.internal.h<C31770h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w0> f187650a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f187651b;

    public C31771i(Provider<w0> provider, Provider<InterfaceC35745a5> provider2) {
        this.f187650a = provider;
        this.f187651b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31770h(this.f187650a.get(), this.f187651b.get());
    }
}
