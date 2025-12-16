package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import com.avito.android.short_term_rent.bookingform.promocode.mvi.entity.PromoCodeInternalAction;
import ew0.InterfaceC40170d;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PromoCodeOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "Lew0/d;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements com.avito.android.arch.mvi.t<PromoCodeInternalAction, InterfaceC40170d> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40170d b(PromoCodeInternalAction promoCodeInternalAction) {
        PromoCodeInternalAction promoCodeInternalAction2 = promoCodeInternalAction;
        if (promoCodeInternalAction2 instanceof PromoCodeInternalAction.CloseScreenWithResult) {
            PromoCodeInternalAction.CloseScreenWithResult closeScreenWithResult = (PromoCodeInternalAction.CloseScreenWithResult) promoCodeInternalAction2;
            return new InterfaceC40170d.a(closeScreenWithResult.f282148b, closeScreenWithResult.f282149c);
        }
        if (promoCodeInternalAction2 instanceof PromoCodeInternalAction.ShowToast) {
            return new InterfaceC40170d.b(((PromoCodeInternalAction.ShowToast) promoCodeInternalAction2).f282158b);
        }
        return null;
    }
}
