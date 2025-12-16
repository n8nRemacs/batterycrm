package com.avito.android.code_check.phone_request;

import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhoneRequestModule_ProvideResultFlowFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<InterfaceC43160i<To.d>> {

    /* renamed from: a, reason: collision with root package name */
    public final k f119141a;

    /* renamed from: b, reason: collision with root package name */
    public final u f119142b;

    public o(k kVar, u uVar) {
        this.f119141a = kVar;
        this.f119142b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.code_check_public.screen.d dVar = (com.avito.android.code_check_public.screen.d) this.f119142b.get();
        this.f119141a.getClass();
        InterfaceC43160i<To.d> interfaceC43160i = dVar.f119365f;
        t.d(interfaceC43160i);
        return interfaceC43160i;
    }
}
