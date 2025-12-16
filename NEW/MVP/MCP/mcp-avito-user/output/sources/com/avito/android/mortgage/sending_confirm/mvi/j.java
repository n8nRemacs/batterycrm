package com.avito.android.mortgage.sending_confirm.mvi;

import dagger.internal.x;
import dagger.internal.y;
import l10.InterfaceC43527a;

/* compiled from: SendingConfirmReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final l10.c f203584a;

    public j(l10.c cVar) {
        this.f203584a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((InterfaceC43527a) this.f203584a.get());
    }
}
