package com.avito.android.mortgage_invite.contact_info.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicationContactInfoReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.contact_info.mvi.builder.c f205746a;

    public o(com.avito.android.mortgage_invite.contact_info.mvi.builder.c cVar) {
        this.f205746a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((com.avito.android.mortgage_invite.contact_info.mvi.builder.a) this.f205746a.get());
    }
}
