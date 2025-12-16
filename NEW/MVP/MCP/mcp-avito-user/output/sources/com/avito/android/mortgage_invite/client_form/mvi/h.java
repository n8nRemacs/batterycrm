package com.avito.android.mortgage_invite.client_form.mvi;

import com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicationClientFormBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f205255a;

    /* renamed from: b, reason: collision with root package name */
    public final u f205256b;

    public h(dagger.internal.l lVar, u uVar) {
        this.f205255a = lVar;
        this.f205256b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((ApplicationClientFormArguments) this.f205255a.f393949a, (com.avito.android.mortgage_invite.client_form.domain.k) this.f205256b.get());
    }
}
