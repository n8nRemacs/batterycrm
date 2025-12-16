package com.avito.android.messenger.channels.mvi.di;

import com.avito.android.C30277e1;
import com.avito.android.messenger.channels.analytics.i;
import com.avito.android.messenger.channels.mvi.di.C;
import javax.inject.Provider;

/* compiled from: ChannelsModule_ProvideMessengerRefreshTimeTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class z implements dagger.internal.h<com.avito.android.messenger.channels.analytics.i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C30277e1> f187450a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.messenger.channels.analytics.l f187451b;

    public z(Provider provider, com.avito.android.messenger.channels.analytics.l lVar) {
        this.f187450a = provider;
        this.f187451b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30277e1 c30277e1C = ((C.c.C5490C) this.f187450a).f187362a.C();
        com.avito.android.messenger.channels.analytics.k kVar = (com.avito.android.messenger.channels.analytics.k) this.f187451b.get();
        r.f187438a.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[31];
        return ((Boolean) c30277e1C.f144955E.a().invoke()).booleanValue() ? kVar : new i.a();
    }
}
