package com.avito.android.tariff_lf.package_info;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_lf.package_info.deeplink.TariffPackageInfoLink;
import kotlin.Metadata;

/* compiled from: TariffPackageInfoFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/d;", "LA50/b;", "Lcom/avito/android/tariff_lf/package_info/deeplink/TariffPackageInfoLink;", "<init>", "()V", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements A50.b<TariffPackageInfoLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        TariffPackageInfoLink tariffPackageInfoLink = (TariffPackageInfoLink) deepLink;
        TariffPackageInfoFragment.f299161z0.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("contract_id", tariffPackageInfoLink.f299178b);
        bundle.putString("package_id", tariffPackageInfoLink.f299179c);
        TariffPackageInfoFragment tariffPackageInfoFragment = new TariffPackageInfoFragment();
        tariffPackageInfoFragment.setArguments(bundle);
        return tariffPackageInfoFragment;
    }
}
