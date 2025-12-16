package com.avito.android.vas_planning_checkout;

import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35966w1;
import com.avito.android.vas_planning_checkout.deeplink.VasPlannerCheckoutLink;
import kotlin.Metadata;

/* compiled from: VasPlanningCheckoutFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_planning_checkout/I;", "LA50/b;", "Lcom/avito/android/vas_planning_checkout/deeplink/VasPlannerCheckoutLink;", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class I implements A50.b<VasPlannerCheckoutLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        VasPlannerCheckoutLink vasPlannerCheckoutLink = (VasPlannerCheckoutLink) deepLink;
        VasPlanCheckoutFragment.f322802w0.getClass();
        VasPlanCheckoutFragment vasPlanCheckoutFragment = new VasPlanCheckoutFragment();
        boolean z12 = vasPlannerCheckoutLink.f322822d;
        C35966w1.a(vasPlanCheckoutFragment, -1, new C36087h(vasPlannerCheckoutLink.f322820b, vasPlannerCheckoutLink.f322821c, vasPlannerCheckoutLink.f322823e, z12));
        return vasPlanCheckoutFragment;
    }
}
