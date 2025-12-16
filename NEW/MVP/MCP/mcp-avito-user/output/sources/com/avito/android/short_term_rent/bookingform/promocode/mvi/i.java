package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragmentOpenParams;
import com.avito.android.short_term_rent.bookingform.promocode.mvi.entity.PromoCodeInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PromoCodeBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements com.avito.android.arch.mvi.b<PromoCodeInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BookingFormPromoCodeDialogFragmentOpenParams f282168a;

    @Inject
    public i(@Y61.k BookingFormPromoCodeDialogFragmentOpenParams bookingFormPromoCodeDialogFragmentOpenParams) {
        this.f282168a = bookingFormPromoCodeDialogFragmentOpenParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PromoCodeInternalAction> a() {
        BookingFormPromoCodeDialogFragmentOpenParams bookingFormPromoCodeDialogFragmentOpenParams = this.f282168a;
        return new C43210w(new PromoCodeInternalAction.Initial(bookingFormPromoCodeDialogFragmentOpenParams.f282077g, bookingFormPromoCodeDialogFragmentOpenParams.f282072b, bookingFormPromoCodeDialogFragmentOpenParams.f282073c, bookingFormPromoCodeDialogFragmentOpenParams.f282074d, bookingFormPromoCodeDialogFragmentOpenParams.f282075e, bookingFormPromoCodeDialogFragmentOpenParams.f282076f));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
