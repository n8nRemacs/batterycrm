package com.avito.android.serp.adapter.alert_banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AlertBannerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f268919a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f268920b;

    public k(dagger.internal.f fVar, u uVar) {
        this.f268919a = uVar;
        this.f268920b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Ax.e) this.f268919a.get(), dagger.internal.g.b(this.f268920b));
    }
}
