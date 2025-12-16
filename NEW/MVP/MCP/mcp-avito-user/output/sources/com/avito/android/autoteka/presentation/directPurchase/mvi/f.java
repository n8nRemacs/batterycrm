package com.avito.android.autoteka.presentation.directPurchase.mvi;

import com.avito.android.autoteka.deeplinks.DirectPurchaseDetails;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaDirectPurchaseFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f97299a;

    /* renamed from: b, reason: collision with root package name */
    public final l f97300b;

    public f(c cVar, l lVar) {
        this.f97299a = cVar;
        this.f97300b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f97299a.get();
        DirectPurchaseDetails directPurchaseDetails = (DirectPurchaseDetails) this.f97300b.f393949a;
        return new e("AutotekaDirectPurchase", new Kf.d(new com.avito.android.autoteka.items.directPurchase.c(null, directPurchaseDetails.getTitle(), directPurchaseDetails.getDescription(), directPurchaseDetails.getPrimaryButton(), directPurchaseDetails.getSecondaryButton(), 1, null)), new d(bVar));
    }
}
