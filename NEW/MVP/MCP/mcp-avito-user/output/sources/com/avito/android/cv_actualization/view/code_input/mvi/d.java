package com.avito.android.cv_actualization.view.code_input.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvActualizationCodeInputBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f131191a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.cv_actualization.view.code_input.mvi.domain.c> f131192b;

    public d(l lVar, Provider provider) {
        this.f131191a = lVar;
        this.f131192b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(((Long) this.f131191a.f393949a).longValue(), this.f131192b.get());
    }
}
