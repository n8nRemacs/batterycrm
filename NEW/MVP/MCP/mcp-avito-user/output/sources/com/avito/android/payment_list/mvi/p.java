package com.avito.android.payment_list.mvi;

import E60.b;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: PaymentListReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/payment_list/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "LE60/b;", "LE60/d;", "<init>", "()V", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements u<E60.b, E60.d> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final E60.d a(E60.b bVar, E60.d dVar) {
        E60.b bVar2 = bVar;
        E60.d dVar2 = dVar;
        if (bVar2 instanceof b.C0217b) {
            b.C0217b c0217b = (b.C0217b) bVar2;
            return E60.d.a(dVar2, c0217b.f3773a, false, true, false, false, c0217b.f3774b, 16);
        }
        if (bVar2 instanceof b.e) {
            b.e eVar = (b.e) bVar2;
            return new E60.d(C42745f0.h0(eVar.f3777a, dVar2.f3783a), false, true, false, false, eVar.f3778b);
        }
        if (bVar2 instanceof b.g) {
            return E60.d.a(dVar2, null, false, false, false, true, false, 47);
        }
        if (bVar2 instanceof b.d) {
            return E60.d.a(dVar2, null, false, false, false, false, false, 47);
        }
        if (bVar2 instanceof b.f) {
            return E60.d.a(dVar2, null, true, false, false, false, false, 33);
        }
        if (bVar2 instanceof b.c) {
            return E60.d.a(dVar2, null, false, false, true, false, false, 33);
        }
        if (bVar2 instanceof b.a) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
