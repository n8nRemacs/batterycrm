package com.avito.android.bundles;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.bundles.deeplink.BundlesLink;
import com.avito.android.bundles.ui.VasBundlesFragment;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: VasBundlesFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bundles/e;", "LA50/b;", "Lcom/avito/android/bundles/deeplink/BundlesLink;", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements A50.b<BundlesLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        BundlesLink bundlesLink = (BundlesLink) deepLink;
        VasBundlesFragment.f108335A0.getClass();
        VasBundlesFragment vasBundlesFragment = new VasBundlesFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("closable", bundlesLink.f108251c);
        bundle.putString("checkoutContext", bundlesLink.f108250b);
        bundle.putString("currentFlow", bundlesLink.f108252d);
        vasBundlesFragment.setArguments(bundle);
        return vasBundlesFragment;
    }
}
