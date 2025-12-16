package com.avito.android.seller_promotions.konveyor.payloads;

import Y61.l;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.seller_promotions.konveyor.snippet.d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SellerPromotionsPayloadCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/payloads/a;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.recycler.data_aware.a {
    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF162211b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF162211b()) : null) || !(aVar instanceof d) || !(aVar2 instanceof d)) {
            return null;
        }
        d dVar = (d) aVar;
        d dVar2 = (d) aVar2;
        boolean z12 = dVar2.f267841i;
        Stepper stepper = dVar2.f267840h;
        if (!d.a(dVar, null, stepper, z12, 1855).equals(aVar2)) {
            return null;
        }
        boolean z13 = dVar2.f267841i;
        Boolean boolValueOf = Boolean.valueOf(z13);
        if (z13 == dVar.f267841i) {
            boolValueOf = null;
        }
        return new c(boolValueOf, L.f(stepper, dVar.f267840h) ? null : stepper);
    }
}
