package com.avito.android.fees_methods.screen.fees_by_package.ui;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fees_methods.deeplink.FeesByPackageDeeplink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: FeesByPackageFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/ui/f;", "LA50/b;", "Lcom/avito/android/fees_methods/deeplink/FeesByPackageDeeplink;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements A50.b<FeesByPackageDeeplink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        FeesByPackageDeeplink feesByPackageDeeplink = (FeesByPackageDeeplink) deepLink;
        FeesByPackageFragment.f158064s0.getClass();
        FeesByPackageFragment feesByPackageFragment = new FeesByPackageFragment();
        C35966w1.a(feesByPackageFragment, -1, new a(feesByPackageDeeplink.f157943b, feesByPackageDeeplink.f157944c));
        return feesByPackageFragment;
    }
}
