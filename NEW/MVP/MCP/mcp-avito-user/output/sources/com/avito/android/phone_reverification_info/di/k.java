package com.avito.android.phone_reverification_info.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneReverificationModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f216098a;

    public k(l lVar) {
        this.f216098a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f216098a.f393949a;
        h.f216096a.getClass();
        return new C28478k(PhoneReverificationInfoScreen.f216056d, rVar, "phoneReverificationInfo");
    }
}
