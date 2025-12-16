package com.avito.android.vas_discount.v2.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.vas_discount.v2.VasDiscountV2Screen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasDiscountV2Module_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f319780a;

    public e(dagger.internal.l lVar) {
        this.f319780a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f319780a.f393949a;
        d.f319779a.getClass();
        return new C28478k(VasDiscountV2Screen.f319746d, rVar, null, 4, null);
    }
}
