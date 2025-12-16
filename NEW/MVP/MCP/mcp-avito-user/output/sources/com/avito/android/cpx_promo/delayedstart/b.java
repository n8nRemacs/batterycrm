package com.avito.android.cpx_promo.delayedstart;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.cpx_promo.delayedstart.deeplink.CpxPromoDelayedStartLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: CpxPromoDelayedStartFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/b;", "LA50/b;", "Lcom/avito/android/cpx_promo/delayedstart/deeplink/CpxPromoDelayedStartLink;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements A50.b<CpxPromoDelayedStartLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        CpxPromoDelayedStartFragment.f126813r0.getClass();
        CpxPromoDelayedStartFragment cpxPromoDelayedStartFragment = new CpxPromoDelayedStartFragment();
        C35966w1.a(cpxPromoDelayedStartFragment, -1, new a(((CpxPromoDelayedStartLink) deepLink).f126832b));
        return cpxPromoDelayedStartFragment;
    }
}
