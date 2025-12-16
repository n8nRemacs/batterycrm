package com.avito.android.messenger.conversation.mvi.platform_actions;

import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: PlatformActionsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f193875a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ChannelSyncAgent> f193876b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f193877c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f193878d;

    public d(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f193875a = provider;
        this.f193876b = provider2;
        this.f193877c = uVar;
        this.f193878d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f193875a.get(), this.f193876b.get(), (InterfaceC32232q) this.f193877c.get(), this.f193878d.get());
    }
}
