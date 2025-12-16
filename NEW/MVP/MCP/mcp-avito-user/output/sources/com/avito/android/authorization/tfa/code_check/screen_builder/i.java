package com.avito.android.authorization.tfa.code_check.screen_builder;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TfaCodeCheckScreenBuilderForAntihack_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.authorization.tfa.code_check.interactor.e f94728a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.authorization.tfa.code_check.interactor.o f94729b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.authorization.tfa.code_check.interactor.k f94730c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f94731d;

    public i(com.avito.android.authorization.tfa.code_check.interactor.e eVar, com.avito.android.authorization.tfa.code_check.interactor.o oVar, com.avito.android.authorization.tfa.code_check.interactor.k kVar, dagger.internal.f fVar) {
        this.f94728a = eVar;
        this.f94729b = oVar;
        this.f94730c = kVar;
        this.f94731d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.authorization.tfa.code_check.interactor.c) this.f94728a.get(), (com.avito.android.authorization.tfa.code_check.interactor.m) this.f94729b.get(), (com.avito.android.authorization.tfa.code_check.interactor.g) this.f94730c.get(), (InterfaceC28373a) this.f94731d.get());
    }
}
