package com.avito.android.comfortable_deal_invite.lead.interactor;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xq.InterfaceC49982a;

/* compiled from: ComfortableDealInviteInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49982a> f123664a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f123665b;

    public c(Provider<InterfaceC49982a> provider, Provider<R0> provider2) {
        this.f123664a = provider;
        this.f123665b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f123664a.get(), this.f123665b.get());
    }
}
