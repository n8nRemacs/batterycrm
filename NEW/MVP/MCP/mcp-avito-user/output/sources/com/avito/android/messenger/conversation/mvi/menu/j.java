package com.avito.android.messenger.conversation.mvi.menu;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31700h;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ChannelMenuInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<C32115g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f191452a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.blacklist_reasons.y> f191453b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f191454c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191455d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f191456e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ChannelSyncAgent> f191457f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f191458g;

    public j(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f191452a = provider;
        this.f191453b = provider2;
        this.f191454c = provider3;
        this.f191455d = provider4;
        this.f191456e = provider5;
        this.f191457f = provider6;
        this.f191458g = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32115g(this.f191452a.get(), this.f191453b.get(), this.f191454c.get(), this.f191455d.get(), this.f191456e.get(), this.f191457f.get(), (InterfaceC31700h) this.f191458g.get());
    }
}
