package com.avito.android.code_check.code_confirm;

import com.avito.android.code_check_public.screen.d;

/* compiled from: CodeConfirmModule_ProvideResendInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class w implements dagger.internal.h<d.b> {

    /* renamed from: a, reason: collision with root package name */
    public final r f118801a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f118802b;

    public w(r rVar, dagger.internal.u uVar) {
        this.f118801a = rVar;
        this.f118802b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.code_check_public.screen.c cVar = (com.avito.android.code_check_public.screen.c) this.f118802b.get();
        this.f118801a.getClass();
        d.b bVar = cVar.f119338f;
        dagger.internal.t.d(bVar);
        return bVar;
    }
}
