package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.component.toast.f;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import ow0.InterfaceC44952b;

/* compiled from: StrSoftBookingOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/z;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Low0/b;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z implements com.avito.android.arch.mvi.t<StrSoftBookingInternalAction, InterfaceC44952b> {
    @Inject
    public z() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44952b b(StrSoftBookingInternalAction strSoftBookingInternalAction) {
        InterfaceC44952b hVar;
        StrSoftBookingInternalAction strSoftBookingInternalAction2 = strSoftBookingInternalAction;
        if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.CloseScreen) {
            return InterfaceC44952b.a.f422364a;
        }
        if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.ShowGuestOptions) {
            hVar = new InterfaceC44952b.e(((StrSoftBookingInternalAction.ShowGuestOptions) strSoftBookingInternalAction2).f282732b.f428851e);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.ShowGuestsSelector) {
            hVar = new InterfaceC44952b.f(((StrSoftBookingInternalAction.ShowGuestsSelector) strSoftBookingInternalAction2).f282733b);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.PaymentByUrl) {
            hVar = new InterfaceC44952b.c(((StrSoftBookingInternalAction.PaymentByUrl) strSoftBookingInternalAction2).f282727b);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.OpenDeeplink) {
            hVar = new InterfaceC44952b.C12249b(((StrSoftBookingInternalAction.OpenDeeplink) strSoftBookingInternalAction2).f282725b);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.PaymentProcessError) {
            String message = ((StrSoftBookingInternalAction.PaymentProcessError) strSoftBookingInternalAction2).f282728b.getMessage();
            f.c.f125255c.getClass();
            hVar = new InterfaceC44952b.h(message, f.c.a.b(), false, 4, null);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.Scroll) {
            hVar = new InterfaceC44952b.d(((StrSoftBookingInternalAction.Scroll) strSoftBookingInternalAction2).f282730b);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.ShowPromoCodesDialog) {
            hVar = new InterfaceC44952b.g(((StrSoftBookingInternalAction.ShowPromoCodesDialog) strSoftBookingInternalAction2).f282736b);
        } else {
            if (!(strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.ShowPromoCodeMessage)) {
                return null;
            }
            StrSoftBookingInternalAction.ShowPromoCodeMessage showPromoCodeMessage = (StrSoftBookingInternalAction.ShowPromoCodeMessage) strSoftBookingInternalAction2;
            hVar = new InterfaceC44952b.h(f.a.f125253a, showPromoCodeMessage.f282734b, showPromoCodeMessage.f282735c);
        }
        return hVar;
    }
}
