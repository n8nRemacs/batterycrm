package com.avito.android.screens.bbip_private;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.screens.bbip_private.deeplink.BbipPrivateDeepLink;
import com.avito.android.screens.bbip_private_v2.ui.BbipPrivateV2Fragment;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: BbipPrivateFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/screens/bbip_private/f;", "LA50/b;", "Lcom/avito/android/screens/bbip_private/deeplink/BbipPrivateDeepLink;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements A50.b<BbipPrivateDeepLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        BbipPrivateDeepLink bbipPrivateDeepLink = (BbipPrivateDeepLink) deepLink;
        String str = bbipPrivateDeepLink.f260481c;
        boolean z12 = bbipPrivateDeepLink.f260482d;
        String str2 = bbipPrivateDeepLink.f260480b;
        if (!z12) {
            BbipPrivateFragment.f260443G0.getClass();
            BbipPrivateFragment bbipPrivateFragment = new BbipPrivateFragment();
            C35966w1.a(bbipPrivateFragment, -1, new b(str2, str));
            return bbipPrivateFragment;
        }
        BbipPrivateV2Fragment.f261118t0.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("context", str);
        bundle.putString("itemId", str2);
        BbipPrivateV2Fragment bbipPrivateV2Fragment = new BbipPrivateV2Fragment();
        bbipPrivateV2Fragment.setArguments(bundle);
        return bbipPrivateV2Fragment;
    }
}
