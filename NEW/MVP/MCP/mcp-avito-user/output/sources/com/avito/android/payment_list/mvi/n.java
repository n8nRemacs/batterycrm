package com.avito.android.payment_list.mvi;

import E60.b;
import E60.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PaymentListOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/payment_list/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "LE60/b;", "LE60/c;", "<init>", "()V", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements t<E60.b, E60.c> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final E60.c b(E60.b bVar) {
        E60.b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            return c.a.f3781a;
        }
        if (bVar2 instanceof b.d) {
            return c.b.f3782a;
        }
        if (bVar2 instanceof b.C0217b ? true : bVar2.equals(b.f.f3779a) ? true : bVar2.equals(b.c.f3775a) ? true : bVar2.equals(b.g.f3780a) ? true : bVar2 instanceof b.e) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
