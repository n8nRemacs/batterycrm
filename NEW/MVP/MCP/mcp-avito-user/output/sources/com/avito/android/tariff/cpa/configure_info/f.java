package com.avito.android.tariff.cpa.configure_info;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpa.configure_info.deeplink.CpaConfigureInfoLink;
import kotlin.Metadata;

/* compiled from: CpaConfigureInfoFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_info/f;", "LA50/b;", "Lcom/avito/android/tariff/cpa/configure_info/deeplink/CpaConfigureInfoLink;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements A50.b<CpaConfigureInfoLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        CpaConfigureInfoFragment.f294438y0.getClass();
        CpaConfigureInfoFragment cpaConfigureInfoFragment = new CpaConfigureInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putString("cpaContext", ((CpaConfigureInfoLink) deepLink).f294458b);
        cpaConfigureInfoFragment.setArguments(bundle);
        return cpaConfigureInfoFragment;
    }
}
