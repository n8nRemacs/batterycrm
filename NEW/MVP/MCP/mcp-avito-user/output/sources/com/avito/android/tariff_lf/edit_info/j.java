package com.avito.android.tariff_lf.edit_info;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_lf.edit_info.deeplink.TariffEditInfoLink;
import kotlin.Metadata;

/* compiled from: TariffEditInfoFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/j;", "LA50/b;", "Lcom/avito/android/tariff_lf/edit_info/deeplink/TariffEditInfoLink;", "<init>", "()V", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements A50.b<TariffEditInfoLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        EditInfoFragment.f298742F0.getClass();
        EditInfoFragment editInfoFragment = new EditInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putString("checkout_context", ((TariffEditInfoLink) deepLink).f298774b);
        editInfoFragment.setArguments(bundle);
        return editInfoFragment;
    }
}
