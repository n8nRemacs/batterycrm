package com.avito.android.tariff.cpa.info;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.deeplink.TariffCpaInfoLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: CpaInfoFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpa/info/f;", "LA50/b;", "Lcom/avito/android/tariff/deeplink/TariffCpaInfoLink;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements A50.b<TariffCpaInfoLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        TariffCpaInfoLink tariffCpaInfoLink = (TariffCpaInfoLink) deepLink;
        CpaInfoFragment.f294596A0.getClass();
        CpaInfoFragment cpaInfoFragment = new CpaInfoFragment();
        C35966w1.a(cpaInfoFragment, -1, new b(tariffCpaInfoLink.f297373b, tariffCpaInfoLink.f297374c));
        return cpaInfoFragment;
    }
}
