package com.avito.android.code_check.pre_request;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.PreRequestScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PreRequestModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final e f119182a;

    /* renamed from: b, reason: collision with root package name */
    public final l f119183b;

    /* renamed from: c, reason: collision with root package name */
    public final l f119184c;

    public g(e eVar, l lVar, l lVar2) {
        this.f119182a = eVar;
        this.f119183b = lVar;
        this.f119184c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f119183b.f393949a;
        r rVar = (r) this.f119184c.f393949a;
        this.f119182a.getClass();
        return new C28478k(PreRequestScreen.f90451d, rVar, str);
    }
}
