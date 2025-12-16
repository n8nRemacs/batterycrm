package com.avito.android.code_check.code_confirm;

import com.avito.android.code_check.code_confirm.E;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: CodeConfirmViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.code_check.phone_request.mvi.l f118624a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.code_check.code_confirm.mvi.l f118625b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.code_check.code_confirm.timer.mvi.f f118626c;

    /* renamed from: d, reason: collision with root package name */
    public final D f118627d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f118628e;

    public B(com.avito.android.code_check.phone_request.mvi.l lVar, com.avito.android.code_check.code_confirm.mvi.l lVar2, com.avito.android.code_check.code_confirm.timer.mvi.f fVar, D d12, Provider provider) {
        this.f118624a = lVar;
        this.f118625b = lVar2;
        this.f118626c = fVar;
        this.f118627d = d12;
        this.f118628e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.code_check.phone_request.mvi.k kVar = (com.avito.android.code_check.phone_request.mvi.k) this.f118624a.get();
        com.avito.android.code_check.code_confirm.mvi.k kVar2 = (com.avito.android.code_check.code_confirm.mvi.k) this.f118625b.get();
        com.avito.android.code_check.code_confirm.timer.mvi.e eVar = (com.avito.android.code_check.code_confirm.timer.mvi.e) this.f118626c.get();
        this.f118627d.getClass();
        return new A(kVar, kVar2, eVar, new C(), ((E.b.d) this.f118628e).f118680a.c());
    }
}
