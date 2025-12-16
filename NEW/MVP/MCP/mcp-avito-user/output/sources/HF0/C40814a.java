package hF0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.travel_payment_selector.deeplink.TravelPaymentSelectorDeeplink;
import com.avito.android.travel_payment_selector.view.PaymentSelectorFragmentDialog;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PaymentSelectorDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LhF0/a;", "Lev/b;", "Lcom/avito/android/travel_payment_selector/deeplink/TravelPaymentSelectorDeeplink;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hF0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40814a extends AbstractC40162b<TravelPaymentSelectorDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f397127d;

    @Inject
    public C40814a(@k a.d dVar) {
        this.f397127d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        TravelPaymentSelectorDeeplink travelPaymentSelectorDeeplink = (TravelPaymentSelectorDeeplink) deepLink;
        PaymentSelectorFragmentDialog.f302702s0.getClass();
        PaymentSelectorFragmentDialog paymentSelectorFragmentDialog = new PaymentSelectorFragmentDialog();
        Bundle bundle2 = new Bundle();
        bundle2.putString("key_booking_id", travelPaymentSelectorDeeplink.f302559b);
        Long l12 = travelPaymentSelectorDeeplink.f302560c;
        if (l12 != null) {
            bundle2.putLong("key_mcid", l12.longValue());
        }
        paymentSelectorFragmentDialog.setArguments(bundle2);
        this.f397127d.w1(paymentSelectorFragmentDialog, "travel_payment_selector_dialog");
        return AbstractC14250d.c.f9171c;
    }
}
