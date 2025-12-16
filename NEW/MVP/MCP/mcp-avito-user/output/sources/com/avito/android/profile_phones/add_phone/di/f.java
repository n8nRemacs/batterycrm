package com.avito.android.profile_phones.add_phone.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AddPhoneScreenPerformanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f226836a;

    public f(l lVar) {
        this.f226836a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f226836a.f393949a;
        e.f226835a.getClass();
        return new C28478k(AddPhoneScreen.f226834d, rVar, null, 4, null);
    }
}
