package com.avito.android.delivery_abuse.price_reduction.mvi;

import Bv.InterfaceC13188a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.delivery_abuse.price_reduction.mvi.entity.PriceReductionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PriceReductionActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LBv/a;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction;", "LBv/c;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC13188a, PriceReductionInternalAction, Bv.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_abuse.price_reduction.domain.a f134887a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final yv.c f134888b;

    @Inject
    public c(@Y61.k com.avito.android.delivery_abuse.price_reduction.domain.a aVar, @Y61.k yv.c cVar) {
        this.f134887a = aVar;
        this.f134888b = cVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PriceReductionInternalAction> b(InterfaceC13188a interfaceC13188a, Bv.c cVar) {
        InterfaceC13188a interfaceC13188a2 = interfaceC13188a;
        if (interfaceC13188a2 instanceof InterfaceC13188a.c) {
            return C43175k.G(new a(this, interfaceC13188a2, null));
        }
        if (!(interfaceC13188a2 instanceof InterfaceC13188a.C0078a)) {
            if (interfaceC13188a2 instanceof InterfaceC13188a.b) {
                return C43175k.G(new b(2, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        this.f134888b.b();
        InterfaceC13188a.C0078a c0078a = (InterfaceC13188a.C0078a) interfaceC13188a2;
        return this.f134887a.a(c0078a.f1779a, c0078a.f1780b, c0078a.f1781c);
    }
}
