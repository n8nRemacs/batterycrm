package com.avito.android.cpx_promo.priceinput.mvi;

import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoPriceInputActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f127324a;

    public b(l lVar) {
        this.f127324a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((CpxPromoPriceInputContent) this.f127324a.f393949a);
    }
}
