package com.avito.android.cv_actualization.view.phone_select.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvActualizationPhoneSelectActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cv_actualization.view.phone_select.domain.phone_update.d f131353a;

    public b(com.avito.android.cv_actualization.view.phone_select.domain.phone_update.d dVar) {
        this.f131353a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.cv_actualization.view.phone_select.domain.phone_update.c) this.f131353a.get());
    }
}
