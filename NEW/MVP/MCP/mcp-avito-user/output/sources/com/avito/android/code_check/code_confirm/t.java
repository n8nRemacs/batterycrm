package com.avito.android.code_check.code_confirm;

import com.avito.android.code_check_public.screen.c;
import javax.inject.Provider;

/* compiled from: CodeConfirmModule_ProvideInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class t implements dagger.internal.h<c.b> {

    /* renamed from: a, reason: collision with root package name */
    public final r f118782a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.code_check_public.screen.c> f118783b;

    public t(r rVar, Provider<com.avito.android.code_check_public.screen.c> provider) {
        this.f118782a = rVar;
        this.f118783b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.code_check_public.screen.c cVar = this.f118783b.get();
        this.f118782a.getClass();
        c.b bVar = cVar.f119337e;
        dagger.internal.t.d(bVar);
        return bVar;
    }
}
