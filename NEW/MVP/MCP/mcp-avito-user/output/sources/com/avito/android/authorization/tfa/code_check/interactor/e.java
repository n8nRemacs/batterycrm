package com.avito.android.authorization.tfa.code_check.interactor;

import com.avito.android.account.InterfaceC27663a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TfaCodeCheckCodeConfirmInteractorBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f94670a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.credman.d f94671b;

    public e(Provider provider, com.avito.android.credman.d dVar) {
        this.f94670a = provider;
        this.f94671b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f94670a.get(), (com.avito.android.credman.o) this.f94671b.get());
    }
}
