package com.avito.android.code_check.phone_request;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.PhoneRequestScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneRequestModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final k f119088a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f119089b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f119090c;

    public m(k kVar, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f119088a = kVar;
        this.f119089b = lVar;
        this.f119090c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f119089b.f393949a;
        r rVar = (r) this.f119090c.f393949a;
        this.f119088a.getClass();
        return new C28478k(PhoneRequestScreen.f90449d, rVar, str);
    }
}
