package com.avito.android.cv_actualization.view.code_input.mvi.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvActualizationTimerInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f131201a;

    public d(u uVar) {
        this.f131201a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.code_confirmation.code_confirmation.timer.a) this.f131201a.get());
    }
}
