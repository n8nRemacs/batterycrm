package com.avito.android.payment_list.mvi;

import E60.a;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PaymentListActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/payment_list/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LE60/a;", "LE60/b;", "LE60/d;", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements com.avito.android.arch.mvi.a<E60.a, E60.b, E60.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f214993a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.payment_list.domain.a f214994b;

    @Inject
    public g(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.payment_list.domain.a aVar2) {
        this.f214993a = aVar;
        this.f214994b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<E60.b> b(E60.a aVar, E60.d dVar) {
        E60.a aVar2 = aVar;
        if (aVar2 instanceof a.b) {
            return C43175k.G(new c(2, null));
        }
        if (aVar2 instanceof a.d) {
            return C43175k.G(new d(this, null));
        }
        if (aVar2 instanceof a.C0216a) {
            return C43175k.G(new e(this, aVar2, null));
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new f(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
