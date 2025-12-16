package com.avito.android.job.cv_info_actualization.mvi.action_handler;

import com.avito.android.job.cv_info_actualization.mvi.domain.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvInfoActualizationLoadInitialInfoActionHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.job.cv_info_actualization.mvi.domain.h f174097a;

    public d(com.avito.android.job.cv_info_actualization.mvi.domain.h hVar) {
        this.f174097a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((g) this.f174097a.get());
    }
}
