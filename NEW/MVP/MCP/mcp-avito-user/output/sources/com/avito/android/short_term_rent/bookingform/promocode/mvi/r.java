package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import com.avito.android.short_term_rent.bookingform.promocode.mvi.entity.PromoCodeInternalAction;
import com.avito.android.short_term_rent.deeplink.PromoCode;
import ew0.C40171e;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PromoCodeReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "Lew0/e;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r implements com.avito.android.arch.mvi.u<PromoCodeInternalAction, C40171e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f282183b;

    @Inject
    public r(@Y61.k t tVar) {
        this.f282183b = tVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40171e a(PromoCodeInternalAction promoCodeInternalAction, C40171e c40171e) {
        List<PromoCode> list;
        List<PromoCode> list2;
        PromoCode promoCode;
        PromoCodeInternalAction promoCodeInternalAction2 = promoCodeInternalAction;
        C40171e c40171e2 = c40171e;
        boolean z12 = promoCodeInternalAction2 instanceof PromoCodeInternalAction.Initial;
        t tVar = this.f282183b;
        if (z12) {
            PromoCodeInternalAction.Initial initial = (PromoCodeInternalAction.Initial) promoCodeInternalAction2;
            List<PromoCode> list3 = initial.f282155g;
            Integer numA = list3 != null ? com.avito.android.short_term_rent.bookingform.b.a(q.f282182l, list3) : null;
            if (list3 != null) {
                promoCode = (PromoCode) (numA != null ? C42745f0.K(numA.intValue(), list3) : null);
            } else {
                promoCode = null;
            }
            C40171e.b bVar = new C40171e.b(initial.f282155g, initial.f282150b, initial.f282151c, initial.f282152d, initial.f282153e, initial.f282154f);
            String code = promoCode != null ? promoCode.getCode() : null;
            if (code == null) {
                code = "";
            }
            C40171e c40171eA = C40171e.a(c40171e2, bVar, new C40171e.c.a(code), numA, false, null, 16);
            tVar.getClass();
            return t.a(c40171eA);
        }
        if (promoCodeInternalAction2 instanceof PromoCodeInternalAction.ValidationLoading) {
            C40171e c40171eA2 = C40171e.a(c40171e2, null, null, null, true, null, 23);
            tVar.getClass();
            return t.a(c40171eA2);
        }
        boolean z13 = promoCodeInternalAction2 instanceof PromoCodeInternalAction.UpdatePromoCodeInput;
        C40171e.b bVar2 = c40171e2.f395468b;
        if (z13) {
            C40171e c40171eA3 = C40171e.a(c40171e2, null, new C40171e.c.a(((PromoCodeInternalAction.UpdatePromoCodeInput) promoCodeInternalAction2).f282159b), (bVar2 == null || (list2 = bVar2.f395478f) == null) ? null : com.avito.android.short_term_rent.bookingform.b.a(new p(promoCodeInternalAction2), list2), false, null, 25);
            tVar.getClass();
            return t.a(c40171eA3);
        }
        if (promoCodeInternalAction2 instanceof PromoCodeInternalAction.ResetPromoCodesSelection) {
            C40171e c40171eA4 = C40171e.a(c40171e2, null, null, null, false, null, 27);
            tVar.getClass();
            return t.a(c40171eA4);
        }
        if (promoCodeInternalAction2 instanceof PromoCodeInternalAction.UpdatePromoCodesSelection) {
            if (bVar2 == null || (list = bVar2.f395478f) == null) {
                return c40171e2;
            }
            int i12 = ((PromoCodeInternalAction.UpdatePromoCodesSelection) promoCodeInternalAction2).f282160b;
            PromoCode promoCode2 = (PromoCode) C42745f0.K(i12, list);
            if (promoCode2 == null) {
                return c40171e2;
            }
            C40171e c40171eA5 = C40171e.a(c40171e2, null, new C40171e.c.a(promoCode2.getCode()), Integer.valueOf(i12), false, null, 25);
            tVar.getClass();
            return t.a(c40171eA5);
        }
        boolean z14 = promoCodeInternalAction2 instanceof PromoCodeInternalAction.ResponseError;
        C40171e.c cVar = c40171e2.f395469c;
        if (z14) {
            C40171e c40171eA6 = C40171e.a(c40171e2, null, new C40171e.c.a(cVar.getF395479a()), null, false, null, 21);
            tVar.getClass();
            return t.a(c40171eA6);
        }
        if (!(promoCodeInternalAction2 instanceof PromoCodeInternalAction.ResponseValidationError)) {
            return c40171e2;
        }
        C40171e c40171eA7 = C40171e.a(c40171e2, null, new C40171e.c.C11117c(cVar.getF395479a(), ((PromoCodeInternalAction.ResponseValidationError) promoCodeInternalAction2).f282157b.f282133a), null, false, null, 21);
        tVar.getClass();
        return t.a(c40171eA7);
    }
}
