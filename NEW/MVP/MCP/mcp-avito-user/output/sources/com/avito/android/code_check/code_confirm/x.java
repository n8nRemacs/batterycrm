package com.avito.android.code_check.code_confirm;

import To.InterfaceC15383a;
import javax.inject.Provider;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CodeConfirmModule_ProvideResultFlowFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class x implements dagger.internal.h<InterfaceC43160i<InterfaceC15383a>> {

    /* renamed from: a, reason: collision with root package name */
    public final r f118803a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.code_check_public.screen.c> f118804b;

    public x(r rVar, Provider<com.avito.android.code_check_public.screen.c> provider) {
        this.f118803a = rVar;
        this.f118804b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.code_check_public.screen.c cVar = this.f118804b.get();
        this.f118803a.getClass();
        InterfaceC43160i<InterfaceC15383a> interfaceC43160i = cVar.f119339g;
        dagger.internal.t.d(interfaceC43160i);
        return interfaceC43160i;
    }
}
