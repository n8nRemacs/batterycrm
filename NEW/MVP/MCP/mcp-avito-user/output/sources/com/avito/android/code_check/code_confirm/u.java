package com.avito.android.code_check.code_confirm;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.CodeConfirmScreen;

/* compiled from: CodeConfirmModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class u implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final r f118797a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f118798b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f118799c;

    public u(r rVar, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f118797a = rVar;
        this.f118798b = lVar;
        this.f118799c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f118798b.f393949a;
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f118799c.f393949a;
        this.f118797a.getClass();
        return new C28478k(CodeConfirmScreen.f90325d, rVar, str);
    }
}
