package com.avito.android.job.cv_info_actualization.mvi.domain;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvInfoActualizationUpdateCvInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<PP.a> f174156a;

    /* renamed from: b, reason: collision with root package name */
    public final l f174157b;

    public j(l lVar, Provider provider) {
        this.f174156a = provider;
        this.f174157b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(dagger.internal.g.b(this.f174156a), (String) this.f174157b.f393949a);
    }
}
