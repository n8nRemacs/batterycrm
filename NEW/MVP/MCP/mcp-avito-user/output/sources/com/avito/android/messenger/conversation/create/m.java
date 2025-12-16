package com.avito.android.messenger.conversation.create;

import com.avito.android.messenger.channels.mvi.data.M;
import com.avito.android.messenger.channels.mvi.data.W;
import com.avito.android.messenger.channels.mvi.data.Y;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateChannelInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w0> f189584a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f189585b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<M> f189586c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ChannelSyncAgent> f189587d;

    /* renamed from: e, reason: collision with root package name */
    public final W f189588e;

    public m(Provider provider, Provider provider2, Provider provider3, Provider provider4, W w12) {
        this.f189584a = provider;
        this.f189585b = provider2;
        this.f189586c = provider3;
        this.f189587d = provider4;
        this.f189588e = w12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f189584a.get(), this.f189585b.get(), this.f189586c.get(), this.f189587d.get(), (Y) this.f189588e.get());
    }
}
