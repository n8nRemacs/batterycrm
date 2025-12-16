package com.avito.android.code_check.phone_request.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhoneRequestBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f119124a;

    /* renamed from: b, reason: collision with root package name */
    public final u f119125b;

    public i(u uVar, u uVar2) {
        this.f119124a = uVar;
        this.f119125b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((InterfaceC43160i) this.f119124a.get(), (com.avito.android.code_check.d) this.f119125b.get());
    }
}
