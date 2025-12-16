package com.avito.android.cv_actualization.view.phone_select.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvActualizationPhoneSelectBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cv_actualization.view.phone_select.domain.phone_loading.d f131355a;

    public d(com.avito.android.cv_actualization.view.phone_select.domain.phone_loading.d dVar) {
        this.f131355a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.cv_actualization.view.phone_select.domain.phone_loading.c) this.f131355a.get());
    }
}
