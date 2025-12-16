package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: ChannelsListInconsistencyTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Y implements dagger.internal.h<X> {

    /* renamed from: a, reason: collision with root package name */
    public final C30713g1 f188417a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f188418b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.messenger.channels.mvi.data.b0 f188419c;

    public Y(C30713g1 c30713g1, dagger.internal.f fVar, com.avito.android.messenger.channels.mvi.data.b0 b0Var) {
        this.f188417a = c30713g1;
        this.f188418b = fVar;
        this.f188419c = b0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30277e1 c30277e1 = (C30277e1) this.f188417a.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f188418b.get();
        this.f188419c.get();
        return new X(interfaceC28373a, c30277e1);
    }
}
