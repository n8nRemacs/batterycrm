package com.avito.android.mortgage_invite.contact_info.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicationContactInfoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.contact_info.domain.d f205720a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.contact_info.domain.b f205721b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.contact_info.domain.validation.g f205722c;

    /* renamed from: d, reason: collision with root package name */
    public final Z10.c f205723d;

    public f(com.avito.android.mortgage_invite.contact_info.domain.d dVar, com.avito.android.mortgage_invite.contact_info.domain.b bVar, com.avito.android.mortgage_invite.contact_info.domain.validation.g gVar, Z10.c cVar) {
        this.f205720a = dVar;
        this.f205721b = bVar;
        this.f205722c = gVar;
        this.f205723d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.mortgage_invite.contact_info.domain.c) this.f205720a.get(), (com.avito.android.mortgage_invite.contact_info.domain.a) this.f205721b.get(), (com.avito.android.mortgage_invite.contact_info.domain.validation.f) this.f205722c.get(), (Z10.a) this.f205723d.get());
    }
}
