package com.avito.android.cart_bundles.feature;

import Om.e;
import Pm.C14806a;
import Pm.C14807b;
import Pm.C14808c;
import Pm.C14809d;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: CartBundlesReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cart_bundles/feature/j;", "Lcom/avito/android/arch/mvi/u;", "LOm/b;", "LOm/d;", "<init>", "()V", "_avito_cart-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements u<Om.b, Om.d> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Om.d a(Om.b bVar, Om.d dVar) {
        Om.b bVar2 = bVar;
        Om.d dVar2 = dVar;
        if (!(bVar2 instanceof Om.e)) {
            throw new IllegalArgumentException(("Only " + Om.e.class.getSimpleName() + " is supported").toString());
        }
        Om.e eVar = (Om.e) bVar2;
        if (!(eVar instanceof e.a)) {
            if (eVar instanceof e.c) {
                ((e.c) bVar2).getClass();
                throw null;
            }
            if (eVar instanceof e.b) {
                return dVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        e.a aVar = (e.a) bVar2;
        C14809d c14809dA = C14809d.a(aVar.f12509a);
        C14806a c14806a = aVar.f12510b;
        Integer numValueOf = Integer.valueOf(c14806a.getDiscount());
        if (c14806a.getItemsLeft() > 0) {
            numValueOf = null;
        }
        return new Om.d(P0.l(dVar2.f12508a, new Q(c14809dA, new C14807b(c14806a.getDiscount(), c14806a.getItemsLeft(), numValueOf != null ? C14808c.a(numValueOf.intValue()) : null, null))));
    }
}
