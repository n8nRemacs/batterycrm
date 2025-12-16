package com.avito.android.tariff.cpx.configure.landing;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpx.configure.landing.deeplink.TariffCpxConfigureLandingLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: CpxConfigureLandingFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/d;", "LA50/b;", "Lcom/avito/android/tariff/cpx/configure/landing/deeplink/TariffCpxConfigureLandingLink;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements A50.b<TariffCpxConfigureLandingLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        CpxConfigureLandingFragment.f295861E0.getClass();
        CpxConfigureLandingFragment cpxConfigureLandingFragment = new CpxConfigureLandingFragment();
        C35966w1.a(cpxConfigureLandingFragment, -1, new b(((TariffCpxConfigureLandingLink) deepLink).f295892b));
        return cpxConfigureLandingFragment;
    }
}
