package com.avito.android.code_check.phone_list;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.PhoneListScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneListModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f119008a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f119009b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f119010c;

    public o(i iVar, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f119008a = iVar;
        this.f119009b = lVar;
        this.f119010c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f119009b.f393949a;
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f119010c.f393949a;
        this.f119008a.getClass();
        return new C28478k(PhoneListScreen.f90448d, rVar, str);
    }
}
