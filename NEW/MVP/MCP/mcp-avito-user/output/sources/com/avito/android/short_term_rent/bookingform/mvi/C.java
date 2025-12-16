package com.avito.android.short_term_rent.bookingform.mvi;

import aw0.C24186b;
import aw0.C24187c;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import cw0.C39425b;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BookingFormReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/C;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lcw0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C implements com.avito.android.arch.mvi.u<BookingFormInternalAction, C39425b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H f281755b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f281756c;

    @Inject
    public C(@Y61.k H h12, @Y61.k E e12) {
        this.f281755b = h12;
        this.f281756c = e12;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C39425b a(BookingFormInternalAction bookingFormInternalAction, C39425b c39425b) {
        boolean z12;
        BookingFormInternalAction bookingFormInternalAction2 = bookingFormInternalAction;
        C39425b c39425b2 = c39425b;
        boolean z13 = bookingFormInternalAction2 instanceof BookingFormInternalAction.ContentLoading;
        H h12 = this.f281755b;
        if (z13) {
            return h12.a(C39425b.a(c39425b2, null, C39425b.InterfaceC11001b.C11002b.f393073a, 0L, false, null, null, 61));
        }
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.ContentLoaded) {
            BookingFormInternalAction.ContentLoaded contentLoaded = (BookingFormInternalAction.ContentLoaded) bookingFormInternalAction2;
            return h12.a(C39425b.a(c39425b2, contentLoaded.f281796b, new C39425b.InterfaceC11001b.c(contentLoaded.f281797c), 0L, false, null, null, 60));
        }
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.ContentError) {
            return h12.a(C39425b.a(c39425b2, null, C39425b.InterfaceC11001b.a.f393072a, 0L, false, null, null, 61));
        }
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.Progress) {
            BookingFormInternalAction.Progress progress = (BookingFormInternalAction.Progress) bookingFormInternalAction2;
            if (progress instanceof BookingFormInternalAction.Progress.Show) {
                z12 = true;
            } else {
                if (!(progress instanceof BookingFormInternalAction.Progress.Hide)) {
                    throw new NoWhenBranchMatchedException();
                }
                z12 = false;
            }
            return h12.a(C39425b.a(c39425b2, null, null, 0L, z12, null, null, 55));
        }
        if (bookingFormInternalAction2 instanceof BookingFormInternalAction.DateRangeChanged) {
            C24186b c24186b = c39425b2.f393066b;
            C24187c c24187c = c24186b != null ? c24186b.f56778b : null;
            if (c24187c == null) {
                return c39425b2;
            }
            BookingFormInternalAction.DateRangeChanged dateRangeChanged = (BookingFormInternalAction.DateRangeChanged) bookingFormInternalAction2;
            return C39425b.a(c39425b2, C24186b.a(c24186b, C24187c.a(c24187c, dateRangeChanged.f281798b, dateRangeChanged.f281799c), null, null, null, null, null, null, null, 2045), null, 0L, false, null, null, 62);
        }
        boolean z14 = bookingFormInternalAction2 instanceof BookingFormInternalAction.GuestsSelectionChanged;
        C24186b c24186b2 = c39425b2.f393066b;
        if (z14) {
            return c24186b2 != null ? C39425b.a(c39425b2, C24186b.a(c24186b2, null, ((BookingFormInternalAction.GuestsSelectionChanged) bookingFormInternalAction2).f281800b, null, null, null, null, null, null, 2043), null, 0L, false, null, null, 62) : c39425b2;
        }
        if (!(bookingFormInternalAction2 instanceof BookingFormInternalAction.UpdateInputs)) {
            if (bookingFormInternalAction2 instanceof BookingFormInternalAction.MoveToPage) {
                return h12.a(C39425b.a(c39425b2, null, null, ((BookingFormInternalAction.MoveToPage) bookingFormInternalAction2).f281802b, false, null, null, 59));
            }
            if (bookingFormInternalAction2 instanceof BookingFormInternalAction.PromoCodeChanged) {
                return h12.a(C39425b.a(c39425b2, c24186b2 != null ? C24186b.a(c24186b2, null, null, null, ((BookingFormInternalAction.PromoCodeChanged) bookingFormInternalAction2).f281810b, null, null, null, null, 2031) : null, null, 0L, false, null, null, 62));
            }
            if (bookingFormInternalAction2 instanceof BookingFormInternalAction.BonusesChanged) {
                return h12.a(C39425b.a(c39425b2, c24186b2 != null ? C24186b.a(c24186b2, null, null, null, null, ((BookingFormInternalAction.BonusesChanged) bookingFormInternalAction2).f281792b, null, null, null, 2015) : null, null, 0L, false, null, null, 62));
            }
            if (bookingFormInternalAction2 instanceof BookingFormInternalAction.RefundToggleChanged) {
                return h12.a(C39425b.a(c39425b2, c24186b2 != null ? C24186b.a(c24186b2, null, null, null, null, null, Boolean.valueOf(((BookingFormInternalAction.RefundToggleChanged) bookingFormInternalAction2).f281811b), null, null, 1791) : null, null, 0L, false, null, null, 62));
            }
            return bookingFormInternalAction2 instanceof BookingFormInternalAction.PaymentMethodChanged ? C39425b.a(c39425b2, null, null, 0L, false, null, ((BookingFormInternalAction.PaymentMethodChanged) bookingFormInternalAction2).f281806b, 31) : c39425b2;
        }
        C39425b.InterfaceC11001b interfaceC11001b = c39425b2.f393067c;
        C39425b.InterfaceC11001b.c cVar = interfaceC11001b instanceof C39425b.InterfaceC11001b.c ? (C39425b.InterfaceC11001b.c) interfaceC11001b : null;
        Map<String, aw0.e> map = c24186b2 != null ? c24186b2.f56780d : null;
        if (cVar == null || c24186b2 == null || map == null) {
            return c39425b2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        BookingFormInternalAction.UpdateInputs updateInputs = (BookingFormInternalAction.UpdateInputs) bookingFormInternalAction2;
        Map<String, aw0.e> map2 = updateInputs.f281821b;
        linkedHashMap.putAll(map2);
        return h12.a(C39425b.a(c39425b2, C24186b.a(c24186b2, null, null, linkedHashMap, null, null, null, null, null, 2039), new C39425b.InterfaceC11001b.c(this.f281756c.a(map2, updateInputs.f281822c, cVar.f393074a)), 0L, false, null, null, 60));
    }
}
