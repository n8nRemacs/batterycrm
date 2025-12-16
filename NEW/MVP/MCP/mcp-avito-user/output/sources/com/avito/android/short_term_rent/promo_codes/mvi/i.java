package com.avito.android.short_term_rent.promo_codes.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.short_term_rent.promo_codes.mvi.entity.StrSoftBookingPromoCodesInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import nw0.InterfaceC44485b;

/* compiled from: StrSoftBookingPromoCodesOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "Lnw0/b;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements t<StrSoftBookingPromoCodesInternalAction, InterfaceC44485b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44485b b(StrSoftBookingPromoCodesInternalAction strSoftBookingPromoCodesInternalAction) {
        StrSoftBookingPromoCodesInternalAction strSoftBookingPromoCodesInternalAction2 = strSoftBookingPromoCodesInternalAction;
        if (strSoftBookingPromoCodesInternalAction2 instanceof StrSoftBookingPromoCodesInternalAction.RequestFocus) {
            return new InterfaceC44485b.C12153b(((StrSoftBookingPromoCodesInternalAction.RequestFocus) strSoftBookingPromoCodesInternalAction2).f282465b);
        }
        if (strSoftBookingPromoCodesInternalAction2 instanceof StrSoftBookingPromoCodesInternalAction.ShowApplyError) {
            PrintableText printableTextF = com.avito.android.printable_text.b.f(((StrSoftBookingPromoCodesInternalAction.ShowApplyError) strSoftBookingPromoCodesInternalAction2).f282467b.getMessage());
            f.c.f125255c.getClass();
            return new InterfaceC44485b.d(printableTextF, f.c.a.b());
        }
        if (strSoftBookingPromoCodesInternalAction2 instanceof StrSoftBookingPromoCodesInternalAction.SetResult) {
            return new InterfaceC44485b.c(((StrSoftBookingPromoCodesInternalAction.SetResult) strSoftBookingPromoCodesInternalAction2).f282466b);
        }
        if (strSoftBookingPromoCodesInternalAction2 instanceof StrSoftBookingPromoCodesInternalAction.CloseScreen) {
            return InterfaceC44485b.a.f419232a;
        }
        return null;
    }
}
