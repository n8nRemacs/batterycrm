package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.messenger.channels.mvi.data.InterfaceC31700h;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: LocallyDeletedChannelsSyncAgentImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.channels.mvi.sync.x0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31869x0 implements dagger.internal.h<C31859s0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f188581a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f188582b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f188583c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ChannelSyncAgent> f188584d;

    public C31869x0(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f188581a = provider;
        this.f188582b = uVar;
        this.f188583c = provider2;
        this.f188584d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31859s0(this.f188581a.get(), (InterfaceC31700h) this.f188582b.get(), this.f188583c.get(), this.f188584d.get());
    }
}
