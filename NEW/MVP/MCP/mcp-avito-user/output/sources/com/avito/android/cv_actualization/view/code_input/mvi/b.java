package com.avito.android.cv_actualization.view.code_input.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvActualizationCodeInputActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cv_actualization.view.code_input.mvi.action_handler.d f131187a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.cv_actualization.view.code_input.mvi.action_handler.b f131188b;

    public b(com.avito.android.cv_actualization.view.code_input.mvi.action_handler.d dVar, com.avito.android.cv_actualization.view.code_input.mvi.action_handler.b bVar) {
        this.f131187a = dVar;
        this.f131188b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.cv_actualization.view.code_input.mvi.action_handler.c) this.f131187a.get(), (com.avito.android.cv_actualization.view.code_input.mvi.action_handler.a) this.f131188b.get());
    }
}
