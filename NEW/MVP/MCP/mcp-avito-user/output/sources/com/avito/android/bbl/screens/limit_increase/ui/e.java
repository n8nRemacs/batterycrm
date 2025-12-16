package com.avito.android.bbl.screens.limit_increase.ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.bbl.screens.limit_increase.deeplink.LimitIncreaseLink;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: LimitIncreaseFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/ui/e;", "LA50/b;", "Lcom/avito/android/bbl/screens/limit_increase/deeplink/LimitIncreaseLink;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements A50.b<LimitIncreaseLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        LimitIncreaseLink limitIncreaseLink = (LimitIncreaseLink) deepLink;
        LimitIncreaseFragment.f99814s0.getClass();
        Bundle bundle = new Bundle();
        bundle.putLong("item_id", limitIncreaseLink.f99735b);
        bundle.putBoolean("closable", limitIncreaseLink.f99736c);
        bundle.putString("context", limitIncreaseLink.f99737d);
        LimitIncreaseFragment limitIncreaseFragment = new LimitIncreaseFragment();
        limitIncreaseFragment.setArguments(bundle);
        return limitIncreaseFragment;
    }
}
