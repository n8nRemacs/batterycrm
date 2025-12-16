package com.avito.android.cart_similar_items.konveyor.payloads;

import Y61.l;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CartSimilarItemsPayloadCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/payloads/a;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.recycler.data_aware.a {
    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF113526b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF113526b()) : null) || !(aVar instanceof com.avito.android.cart_similar_items.konveyor.snippet.c) || !(aVar2 instanceof com.avito.android.cart_similar_items.konveyor.snippet.c)) {
            return null;
        }
        com.avito.android.cart_similar_items.konveyor.snippet.c cVar = (com.avito.android.cart_similar_items.konveyor.snippet.c) aVar;
        com.avito.android.cart_similar_items.konveyor.snippet.c cVar2 = (com.avito.android.cart_similar_items.konveyor.snippet.c) aVar2;
        boolean z12 = cVar2.f115879h;
        Stepper stepper = cVar2.f115878g;
        if (!com.avito.android.cart_similar_items.konveyor.snippet.c.a(cVar, stepper, z12, 927).equals(aVar2)) {
            return null;
        }
        boolean z13 = cVar2.f115879h;
        Boolean boolValueOf = Boolean.valueOf(z13);
        if (z13 == cVar.f115879h) {
            boolValueOf = null;
        }
        return new c(boolValueOf, L.f(stepper, cVar.f115878g) ? null : stepper);
    }
}
