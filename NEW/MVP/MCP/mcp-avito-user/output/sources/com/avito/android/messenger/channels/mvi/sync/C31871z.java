package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ChannelSyncOnPushAgentImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.channels.mvi.sync.z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31871z implements dagger.internal.h<C31864v> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f188586a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f188587b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f188588c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.sync.K> f188589d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f188590e;

    public C31871z(dagger.internal.f fVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f188586a = provider;
        this.f188587b = fVar;
        this.f188588c = uVar;
        this.f188589d = provider2;
        this.f188590e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31864v(this.f188586a.get(), dagger.internal.g.b(this.f188587b), dagger.internal.g.a(dagger.internal.w.a(this.f188588c)), dagger.internal.g.b(this.f188589d), this.f188590e.get());
    }
}
