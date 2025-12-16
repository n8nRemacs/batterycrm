package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Settings;

/* compiled from: StrSoftBookingReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/B;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/state/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class B implements com.avito.android.arch.mvi.u<StrSoftBookingInternalAction, com.avito.android.short_term_rent.soft_booking.mvi.state.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.soft_booking.mvi.state.b f282668b;

    @Inject
    public B(@Y61.k com.avito.android.short_term_rent.soft_booking.mvi.state.b bVar) {
        this.f282668b = bVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.short_term_rent.soft_booking.mvi.state.a a(StrSoftBookingInternalAction strSoftBookingInternalAction, com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar) {
        StrSoftBookingInternalAction strSoftBookingInternalAction2 = strSoftBookingInternalAction;
        com.avito.android.short_term_rent.soft_booking.mvi.state.a aVarA = aVar;
        if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.SetupXHash) {
            aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, null, null, null, null, null, null, null, null, ((StrSoftBookingInternalAction.SetupXHash) strSoftBookingInternalAction2).f282731b, null, null, null, null, null, null, null, 130815);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.CalculateDetails) {
            StrSoftBookingInternalAction.CalculateDetails calculateDetails = (StrSoftBookingInternalAction.CalculateDetails) strSoftBookingInternalAction2;
            pw0.k kVar = calculateDetails.f282716j;
            aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, null, calculateDetails.f282708b, calculateDetails.f282709c, calculateDetails.f282710d, calculateDetails.f282711e, calculateDetails.f282712f, calculateDetails.f282713g, null, null, Boolean.valueOf(L.f(kVar != null ? kVar.f428884b : null, "noRefund")), calculateDetails.f282714h, calculateDetails.f282715i, kVar, calculateDetails.f282717k, calculateDetails.f282718l, calculateDetails.f282719m, 65921);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.Loading) {
            StrSoftBookingInternalAction.Loading loading = (StrSoftBookingInternalAction.Loading) strSoftBookingInternalAction2;
            boolean z12 = loading instanceof StrSoftBookingInternalAction.Loading.Show;
            pw0.f fVar = aVarA.f282793b;
            if (z12) {
                fVar.getClass();
                aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, new pw0.f(true, ((StrSoftBookingInternalAction.Loading.Show) strSoftBookingInternalAction2).f282724b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070);
            } else {
                if (!loading.equals(StrSoftBookingInternalAction.Loading.Hide.f282723b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, new pw0.f(false, fVar.f428874b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070);
            }
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.DateRangeFieldChanged) {
            aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131067);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.ContactFieldChanged) {
            aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, null, null, null, ((StrSoftBookingInternalAction.ContactFieldChanged) strSoftBookingInternalAction2).f282721b, null, null, null, null, null, null, null, null, null, null, null, null, 131063);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.RequestError) {
            aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, null, ((StrSoftBookingInternalAction.RequestError) strSoftBookingInternalAction2).f282729b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131069);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.UpdateSelectedPayment) {
            aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, null, null, null, null, null, ((StrSoftBookingInternalAction.UpdateSelectedPayment) strSoftBookingInternalAction2).f282737b, null, null, null, null, null, null, null, null, null, null, 131039);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.ContactsFieldError) {
            aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, null, null, null, ((StrSoftBookingInternalAction.ContactsFieldError) strSoftBookingInternalAction2).f282722b, null, null, null, null, null, null, null, null, null, null, null, null, 131063);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.ClearErrors) {
            aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.UpdateSelectedPromoCode) {
            aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, null, null, null, null, null, null, ((StrSoftBookingInternalAction.UpdateSelectedPromoCode) strSoftBookingInternalAction2).f282738b, null, null, null, null, null, null, null, null, null, 131007);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.UpdateSelectedPaymentMethod) {
            aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 129023);
        } else if (strSoftBookingInternalAction2 instanceof StrSoftBookingInternalAction.AnimationLoaderAvailable) {
            aVarA = com.avito.android.short_term_rent.soft_booking.mvi.state.a.a(aVarA, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        return this.f282668b.a(aVarA);
    }
}
