package com.avito.android.authorization.tfa.code_check.screen_builder;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TfaCodeCheckScreenBuilderForTfa_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.authorization.tfa.code_check.interactor.e f94745a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.authorization.tfa.code_check.interactor.o f94746b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.authorization.tfa.code_check.interactor.k f94747c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f94748d;

    public q(com.avito.android.authorization.tfa.code_check.interactor.e eVar, com.avito.android.authorization.tfa.code_check.interactor.o oVar, com.avito.android.authorization.tfa.code_check.interactor.k kVar, dagger.internal.f fVar) {
        this.f94745a = eVar;
        this.f94746b = oVar;
        this.f94747c = kVar;
        this.f94748d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((com.avito.android.authorization.tfa.code_check.interactor.c) this.f94745a.get(), (com.avito.android.authorization.tfa.code_check.interactor.m) this.f94746b.get(), (com.avito.android.authorization.tfa.code_check.interactor.g) this.f94747c.get(), (InterfaceC28373a) this.f94748d.get());
    }
}
