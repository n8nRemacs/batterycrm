package com.avito.android.short_term_rent.bookingform.mvi;

import com.avito.android.component.toast.f;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import cw0.InterfaceC39424a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BookingFormOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/A;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lcw0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class A implements com.avito.android.arch.mvi.t<BookingFormInternalAction, InterfaceC39424a> {
    @Inject
    public A() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39424a b(BookingFormInternalAction bookingFormInternalAction) {
        BookingFormInternalAction bookingFormInternalAction2 = bookingFormInternalAction;
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.OpenDeepLink) {
            BookingFormInternalAction.OpenDeepLink openDeepLink = (BookingFormInternalAction.OpenDeepLink) bookingFormInternalAction2;
            return new InterfaceC39424a.c(openDeepLink.f281803b, openDeepLink.f281804c);
        }
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.PerformBookingRedirect) {
            return new InterfaceC39424a.d(((BookingFormInternalAction.PerformBookingRedirect) bookingFormInternalAction2).f281807b);
        }
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.ShowErrorInSnackbar) {
            return new InterfaceC39424a.g(((BookingFormInternalAction.ShowErrorInSnackbar) bookingFormInternalAction2).f281814b, f.a.f125253a, false, 4, null);
        }
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.ShowSnackbar) {
            BookingFormInternalAction.ShowSnackbar showSnackbar = (BookingFormInternalAction.ShowSnackbar) bookingFormInternalAction2;
            return new InterfaceC39424a.g(showSnackbar.f281818b, f.a.f125253a, showSnackbar.f281820d);
        }
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.ScrollToItem) {
            BookingFormInternalAction.ScrollToItem scrollToItem = (BookingFormInternalAction.ScrollToItem) bookingFormInternalAction2;
            return new InterfaceC39424a.e(scrollToItem.f281812b, scrollToItem.f281813c);
        }
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.HideKeyboard) {
            return InterfaceC39424a.b.f393054a;
        }
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.CloseScreen) {
            return InterfaceC39424a.C11000a.f393053a;
        }
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.ShowRetroBadgeHint) {
            return new InterfaceC39424a.f(((BookingFormInternalAction.ShowRetroBadgeHint) bookingFormInternalAction2).f281817b);
        }
        return null;
    }
}
