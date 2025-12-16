package com.avito.android.short_term_rent.soft_booking.domain;

import com.avito.android.validation.InterfaceC36020m;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactsValidateInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f282599a;

    public c(u uVar) {
        this.f282599a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC36020m) this.f282599a.get());
    }
}
