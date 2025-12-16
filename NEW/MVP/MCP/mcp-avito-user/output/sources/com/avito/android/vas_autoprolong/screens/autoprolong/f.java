package com.avito.android.vas_autoprolong.screens.autoprolong;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35966w1;
import com.avito.android.vas_autoprolong.screens.autoprolong.deeplink.AutoprolongDeepLink;
import kotlin.Metadata;

/* compiled from: AutoprolongFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/f;", "LA50/b;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/deeplink/AutoprolongDeepLink;", "<init>", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements A50.b<AutoprolongDeepLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        AutoprolongDeepLink autoprolongDeepLink = (AutoprolongDeepLink) deepLink;
        AutoprolongFragment.f319456s0.getClass();
        AutoprolongFragment autoprolongFragment = new AutoprolongFragment();
        C35966w1.a(autoprolongFragment, -1, new a(autoprolongDeepLink.f319476b, autoprolongDeepLink.f319477c));
        return autoprolongFragment;
    }
}
