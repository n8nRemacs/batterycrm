package com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi;

import com.avito.android.passport.network.model.BusinessVrfDuplication;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BusinessVrfDuplicationReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f212573a;

    public n(dagger.internal.l lVar) {
        this.f212573a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((BusinessVrfDuplication) this.f212573a.f393949a);
    }
}
