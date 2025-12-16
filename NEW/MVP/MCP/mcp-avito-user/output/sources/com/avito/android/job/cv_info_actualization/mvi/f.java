package com.avito.android.job.cv_info_actualization.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvInfoActualizationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.job.cv_info_actualization.mvi.action_handler.d f174173a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f174174b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.job.cv_info_actualization.mvi.action_handler.f f174175c;

    public f(com.avito.android.job.cv_info_actualization.mvi.action_handler.d dVar, Provider provider, com.avito.android.job.cv_info_actualization.mvi.action_handler.f fVar) {
        this.f174173a = dVar;
        this.f174174b = provider;
        this.f174175c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.job.cv_info_actualization.mvi.action_handler.c) this.f174173a.get(), this.f174174b.get(), (com.avito.android.job.cv_info_actualization.mvi.action_handler.e) this.f174175c.get());
    }
}
