package com.avito.android.messenger.conversation.create;

import com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker;
import com.avito.android.messenger.conversation.create.CreateChannelPresenter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateChannelPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final m f189618a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<MessengerSuccessRateTracker> f189619b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f189620c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f189621d;

    public r(m mVar, Provider provider, dagger.internal.l lVar, Provider provider2) {
        this.f189618a = mVar;
        this.f189619b = provider;
        this.f189620c = lVar;
        this.f189621d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((c) this.f189618a.get(), this.f189619b.get(), (CreateChannelPresenter.State) this.f189620c.f393949a, this.f189621d.get());
    }
}
