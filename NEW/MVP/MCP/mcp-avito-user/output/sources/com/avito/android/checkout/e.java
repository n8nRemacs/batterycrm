package com.avito.android.checkout;

import androidx.fragment.app.Fragment;
import com.avito.android.checkout.deeplink.CheckoutDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: CheckoutFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/checkout/e;", "LA50/b;", "Lcom/avito/android/checkout/deeplink/CheckoutDeepLink;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements A50.b<CheckoutDeepLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        CheckoutFragment.f118107C0.getClass();
        CheckoutFragment checkoutFragment = new CheckoutFragment();
        C35966w1.a(checkoutFragment, -1, new b(((CheckoutDeepLink) deepLink).f118186b));
        return checkoutFragment;
    }
}
