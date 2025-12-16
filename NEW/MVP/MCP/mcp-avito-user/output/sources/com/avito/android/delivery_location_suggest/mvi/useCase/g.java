package com.avito.android.delivery_location_suggest.mvi.useCase;

import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchSuggestionsUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f135204a;

    /* renamed from: b, reason: collision with root package name */
    public final u f135205b;

    public g(l lVar, u uVar) {
        this.f135204a = lVar;
        this.f135205b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((DeliveryLocationSuggestParams) this.f135204a.f393949a, (com.avito.android.delivery_location_suggest.l) this.f135205b.get());
    }
}
