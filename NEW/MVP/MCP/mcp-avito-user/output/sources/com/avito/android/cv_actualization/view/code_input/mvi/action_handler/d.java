package com.avito.android.cv_actualization.view.code_input.mvi.action_handler;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvActualizationRetryClickedActionHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f131184a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.cv_actualization.view.code_input.e> f131185b;

    /* renamed from: c, reason: collision with root package name */
    public final u f131186c;

    public d(l lVar, u uVar, Provider provider) {
        this.f131184a = lVar;
        this.f131185b = provider;
        this.f131186c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f131184a.f393949a, this.f131185b.get(), (com.avito.android.cv_actualization.view.code_input.mvi.domain.c) this.f131186c.get());
    }
}
