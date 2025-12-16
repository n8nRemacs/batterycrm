package com.avito.android.job.cv_info_actualization.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvInfoActualizationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.job.cv_info_actualization.mvi.action_handler.d f174177a;

    public h(com.avito.android.job.cv_info_actualization.mvi.action_handler.d dVar) {
        this.f174177a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.job.cv_info_actualization.mvi.action_handler.c) this.f174177a.get());
    }
}
