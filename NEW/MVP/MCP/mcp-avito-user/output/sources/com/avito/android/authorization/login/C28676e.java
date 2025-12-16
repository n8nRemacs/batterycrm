package com.avito.android.authorization.login;

import com.avito.android.account.InterfaceC27663a;
import javax.inject.Provider;

/* compiled from: LoginInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.login.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28676e implements dagger.internal.h<C28675d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27663a> f94046a;

    public C28676e(Provider<InterfaceC27663a> provider) {
        this.f94046a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28675d(this.f94046a.get());
    }
}
