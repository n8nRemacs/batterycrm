package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.short_term_rent.bookingform.promocode.mvi.entity.PromoCodeInternalAction;
import ew0.C40171e;
import ew0.InterfaceC40169c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PromoCodeActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "Lew0/c;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "Lew0/e;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC40169c, PromoCodeInternalAction, C40171e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f282166a;

    @Inject
    public g(@Y61.k a aVar) {
        this.f282166a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PromoCodeInternalAction> b(InterfaceC40169c interfaceC40169c, C40171e c40171e) {
        InterfaceC40169c interfaceC40169c2 = interfaceC40169c;
        C40171e c40171e2 = c40171e;
        if (interfaceC40169c2 instanceof InterfaceC40169c.C11116c) {
            return new C43210w(new PromoCodeInternalAction.UpdatePromoCodeInput(((InterfaceC40169c.C11116c) interfaceC40169c2).f395461a));
        }
        if (interfaceC40169c2 instanceof InterfaceC40169c.d) {
            return C43175k.G(new f(c40171e2, (InterfaceC40169c.d) interfaceC40169c2, null));
        }
        if (interfaceC40169c2 instanceof InterfaceC40169c.a) {
            return C43175k.G(new d(c40171e2, this, null));
        }
        if (interfaceC40169c2 instanceof InterfaceC40169c.b) {
            return C43175k.G(new e(c40171e2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
