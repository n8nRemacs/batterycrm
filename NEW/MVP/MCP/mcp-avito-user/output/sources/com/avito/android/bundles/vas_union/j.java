package com.avito.android.bundles.vas_union;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_union.deeplink.VasUnionLink;
import kotlin.Metadata;

/* compiled from: VasUnionFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bundles/vas_union/j;", "LA50/b;", "Lcom/avito/android/vas_union/deeplink/VasUnionLink;", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements A50.b<VasUnionLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        VasUnionLink vasUnionLink = (VasUnionLink) deepLink;
        VasUnionFragment.f108455B0.getClass();
        VasUnionFragment vasUnionFragment = new VasUnionFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("closable", vasUnionLink.f323125c);
        bundle.putString("checkoutContext", vasUnionLink.f323124b);
        bundle.putString("currentFlow", vasUnionLink.f323126d);
        vasUnionFragment.setArguments(bundle);
        return vasUnionFragment;
    }
}
