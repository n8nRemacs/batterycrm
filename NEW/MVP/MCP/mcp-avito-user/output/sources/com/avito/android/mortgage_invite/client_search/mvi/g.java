package com.avito.android.mortgage_invite.client_search.mvi;

import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientSearchBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f205449a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.client_search.domain.c f205450b;

    public g(dagger.internal.l lVar, com.avito.android.mortgage_invite.client_search.domain.c cVar) {
        this.f205449a = lVar;
        this.f205450b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((MortgageClientSearchArguments) this.f205449a.f393949a, (com.avito.android.mortgage_invite.client_search.domain.b) this.f205450b.get());
    }
}
