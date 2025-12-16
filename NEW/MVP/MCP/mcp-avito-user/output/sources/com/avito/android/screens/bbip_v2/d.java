package com.avito.android.screens.bbip_v2;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.screens.bbip.deep_linking.BbipV2DeepLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: BbipV2FragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/screens/bbip_v2/d;", "LA50/b;", "Lcom/avito/android/screens/bbip/deep_linking/BbipV2DeepLink;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements A50.b<BbipV2DeepLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        BbipV2DeepLink bbipV2DeepLink = (BbipV2DeepLink) deepLink;
        BbipV2Fragment.f261405B0.getClass();
        BbipV2Fragment bbipV2Fragment = new BbipV2Fragment();
        C35966w1.a(bbipV2Fragment, -1, new b(bbipV2DeepLink.f260210b, bbipV2DeepLink.f260211c));
        return bbipV2Fragment;
    }
}
