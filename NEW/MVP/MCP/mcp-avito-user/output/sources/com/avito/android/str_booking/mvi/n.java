package com.avito.android.str_booking.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.str_booking.mvi.entity.StrBookingInternalAction;
import com.avito.android.str_booking.mvi.entity.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrBookingOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_booking/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "Lcom/avito/android/str_booking/mvi/entity/b;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements t<StrBookingInternalAction, com.avito.android.str_booking.mvi.entity.b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final com.avito.android.str_booking.mvi.entity.b b(StrBookingInternalAction strBookingInternalAction) {
        StrBookingInternalAction strBookingInternalAction2 = strBookingInternalAction;
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.OpenWebView) {
            return new b.h(((StrBookingInternalAction.OpenWebView) strBookingInternalAction2).f285765b);
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.OpenDeeplink.Link) {
            return new b.e.C8555b(((StrBookingInternalAction.OpenDeeplink.Link) strBookingInternalAction2).f285761b);
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.OpenDeeplink.Deeplink) {
            return new b.e.a(((StrBookingInternalAction.OpenDeeplink.Deeplink) strBookingInternalAction2).f285760b);
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.CallUser) {
            return new b.C8554b(((StrBookingInternalAction.CallUser) strBookingInternalAction2).f285748b);
        }
        if (strBookingInternalAction2.equals(StrBookingInternalAction.CloseScreen.f285749b)) {
            return b.c.f285799a;
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.ShowConfirmBottomSheet) {
            StrBookingInternalAction.ShowConfirmBottomSheet showConfirmBottomSheet = (StrBookingInternalAction.ShowConfirmBottomSheet) strBookingInternalAction2;
            return new b.j(showConfirmBottomSheet.f285767b, showConfirmBottomSheet.f285768c, showConfirmBottomSheet.f285769d, showConfirmBottomSheet.f285770e, showConfirmBottomSheet.f285771f);
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.OpenGalleryScreen) {
            StrBookingInternalAction.OpenGalleryScreen openGalleryScreen = (StrBookingInternalAction.OpenGalleryScreen) strBookingInternalAction2;
            return new b.f(openGalleryScreen.f285762b, openGalleryScreen.f285763c);
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.OpenMap) {
            return new b.g(((StrBookingInternalAction.OpenMap) strBookingInternalAction2).f285764b);
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.AnimateInfoClick) {
            return b.a.f285797a;
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.ShowFooter) {
            return b.k.f285813a;
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.HideFooter) {
            return b.d.f285800a;
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.GetRequestSuccess) {
            return b.i.f285807a;
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.PostRequestSuccess) {
            return b.i.f285807a;
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.StartPolling) {
            return new b.n(((StrBookingInternalAction.StartPolling) strBookingInternalAction2).f285774b);
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.StopPolling) {
            return b.o.f285817a;
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.ShowStartAnimation) {
            return new b.m(((StrBookingInternalAction.ShowStartAnimation) strBookingInternalAction2).f285773b);
        }
        if (strBookingInternalAction2 instanceof StrBookingInternalAction.OnBoardingTooltipInfoLoaded) {
            return new b.l(((StrBookingInternalAction.OnBoardingTooltipInfoLoaded) strBookingInternalAction2).f285759b);
        }
        return null;
    }
}
