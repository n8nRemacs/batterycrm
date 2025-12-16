package com.avito.android.mortgage_invite.lead.mvi;

import com.avito.android.P;
import d20.C39487a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import m20.InterfaceC43866b;

/* compiled from: ApplicationLeadActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<P> f205899a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C39487a> f205900b;

    /* renamed from: c, reason: collision with root package name */
    public final m20.d f205901c;

    public c(Provider provider, Provider provider2, m20.d dVar) {
        this.f205899a = provider;
        this.f205900b = provider2;
        this.f205901c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f205899a.get(), this.f205900b.get(), (InterfaceC43866b) this.f205901c.get());
    }
}
