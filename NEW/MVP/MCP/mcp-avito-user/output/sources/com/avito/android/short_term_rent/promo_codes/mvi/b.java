package com.avito.android.short_term_rent.promo_codes.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.short_term_rent.promo_codes.mvi.entity.StrSoftBookingPromoCodesInternalAction;
import com.avito.android.short_term_rent.utils.m;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import nw0.InterfaceC44484a;

/* compiled from: StrSoftBookingPromoCodesActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lnw0/a;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "Lnw0/c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC44484a, StrSoftBookingPromoCodesInternalAction, nw0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.promo_codes.mvi.domain.a f282439a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f282440b;

    @Inject
    public b(@Y61.k com.avito.android.short_term_rent.promo_codes.mvi.domain.a aVar, @Y61.k m mVar) {
        this.f282439a = aVar;
        this.f282440b = mVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrSoftBookingPromoCodesInternalAction> b(InterfaceC44484a interfaceC44484a, nw0.c cVar) {
        C43210w c43210w;
        InterfaceC44484a interfaceC44484a2 = interfaceC44484a;
        nw0.c cVar2 = cVar;
        if (interfaceC44484a2 instanceof InterfaceC44484a.e) {
            return new C43210w(new StrSoftBookingPromoCodesInternalAction.ChangeInputPromoCodeValue(((InterfaceC44484a.e) interfaceC44484a2).f419230a.toUpperCase(Locale.ROOT)));
        }
        if (interfaceC44484a2 instanceof InterfaceC44484a.c) {
            c43210w = new C43210w(StrSoftBookingPromoCodesInternalAction.CloseScreen.f282463b);
        } else {
            if (interfaceC44484a2 instanceof InterfaceC44484a.C12152a) {
                return (InterfaceC43160i) this.f282439a.invoke(((InterfaceC44484a.C12152a) interfaceC44484a2).f419226a);
            }
            if (interfaceC44484a2 instanceof InterfaceC44484a.f) {
                return C43175k.G(new a(cVar2, interfaceC44484a2, null));
            }
            if (interfaceC44484a2 instanceof InterfaceC44484a.d) {
                c43210w = new C43210w(new StrSoftBookingPromoCodesInternalAction.SetResult(cVar2.f419249l));
            } else {
                if (!(interfaceC44484a2 instanceof InterfaceC44484a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new StrSoftBookingPromoCodesInternalAction.DisablePromoCode(this.f282440b.getF283033j()));
            }
        }
        return c43210w;
    }
}
