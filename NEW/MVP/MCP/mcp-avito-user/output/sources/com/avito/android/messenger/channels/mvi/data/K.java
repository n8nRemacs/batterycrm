package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.AbstractC33042a;
import com.avito.android.persistence.messenger.G0;
import com.avito.android.persistence.messenger.InterfaceC33095n0;
import com.avito.android.persistence.messenger.Q2;
import com.avito.android.persistence.messenger.Y0;
import javax.inject.Provider;

/* compiled from: ChannelRepoImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class K implements dagger.internal.h<C31714w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AbstractC33042a> f187178a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G0> f187179b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Q2> f187180c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Y0> f187181d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC33095n0> f187182e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f187183f;

    public K(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f187178a = provider;
        this.f187179b = provider2;
        this.f187180c = provider3;
        this.f187181d = provider4;
        this.f187182e = provider5;
        this.f187183f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31714w(this.f187178a.get(), this.f187179b.get(), this.f187180c.get(), this.f187181d.get(), this.f187182e.get(), (InterfaceC31697e) this.f187183f.get());
    }
}
