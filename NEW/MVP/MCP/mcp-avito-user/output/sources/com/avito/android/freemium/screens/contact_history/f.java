package com.avito.android.freemium.screens.contact_history;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.freemium.screens.contact_history.deeplink.FreemiumContactHistoryLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: FreemiumContactHistoryFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/freemium/screens/contact_history/f;", "LA50/b;", "Lcom/avito/android/freemium/screens/contact_history/deeplink/FreemiumContactHistoryLink;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements A50.b<FreemiumContactHistoryLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        FreemiumContactHistoryFragment.f158934s0.getClass();
        FreemiumContactHistoryFragment freemiumContactHistoryFragment = new FreemiumContactHistoryFragment();
        C35966w1.a(freemiumContactHistoryFragment, -1, new a(((FreemiumContactHistoryLink) deepLink).f158952b));
        return freemiumContactHistoryFragment;
    }
}
