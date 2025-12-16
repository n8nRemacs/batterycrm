package com.avito.android.mortgage_invite.client_form.mvi;

import com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplicationClientFormActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f205250a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage_invite.client_form.domain.k> f205251b;

    /* renamed from: c, reason: collision with root package name */
    public final u f205252c;

    public f(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f205250a = lVar;
        this.f205251b = provider;
        this.f205252c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((ApplicationClientFormArguments) this.f205250a.f393949a, this.f205251b.get(), (com.avito.android.mortgage_invite.client_form.domain.a) this.f205252c.get());
    }
}
