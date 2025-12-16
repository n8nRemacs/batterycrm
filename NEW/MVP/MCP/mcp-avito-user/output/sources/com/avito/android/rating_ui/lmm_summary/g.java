package com.avito.android.rating_ui.lmm_summary;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingLLMSummaryPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f250094a;

    /* renamed from: b, reason: collision with root package name */
    public final l f250095b;

    public g(l lVar, l lVar2) {
        this.f250094a = lVar;
        this.f250095b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Y41.l) this.f250094a.f393949a, (Y41.l) this.f250095b.f393949a);
    }
}
