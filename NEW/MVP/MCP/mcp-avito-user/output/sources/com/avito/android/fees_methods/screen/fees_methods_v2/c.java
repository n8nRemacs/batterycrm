package com.avito.android.fees_methods.screen.fees_methods_v2;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fees_methods.deeplink.FeesMethodsV3DeepLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: FeesMethodsV2FragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/c;", "LA50/b;", "Lcom/avito/android/fees_methods/deeplink/FeesMethodsV3DeepLink;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements A50.b<FeesMethodsV3DeepLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        FeesMethodsV3DeepLink feesMethodsV3DeepLink = (FeesMethodsV3DeepLink) deepLink;
        FeesMethodsV2Fragment.f158167y0.getClass();
        FeesMethodsV2Fragment feesMethodsV2Fragment = new FeesMethodsV2Fragment();
        C35966w1.a(feesMethodsV2Fragment, -1, new b(feesMethodsV3DeepLink.f157945b, feesMethodsV3DeepLink.f157946c));
        return feesMethodsV2Fragment;
    }
}
