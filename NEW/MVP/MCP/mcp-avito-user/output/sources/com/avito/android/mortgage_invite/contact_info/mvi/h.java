package com.avito.android.mortgage_invite.contact_info.mvi;

import com.avito.android.mortgage_invite.contact_info.model.ApplicationContactInfoArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicationContactInfoBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.contact_info.domain.d f205731a;

    /* renamed from: b, reason: collision with root package name */
    public final Z10.c f205732b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f205733c;

    public h(com.avito.android.mortgage_invite.contact_info.domain.d dVar, Z10.c cVar, dagger.internal.l lVar) {
        this.f205731a = dVar;
        this.f205732b = cVar;
        this.f205733c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.mortgage_invite.contact_info.domain.c) this.f205731a.get(), (Z10.a) this.f205732b.get(), (ApplicationContactInfoArguments) this.f205733c.f393949a);
    }
}
