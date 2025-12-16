package com.avito.android.vas_performance.screens.visual_v2;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.deeplink.VisualVasV2Link;
import kotlin.Metadata;

/* compiled from: VisualVasV2FragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/e;", "LA50/b;", "Lcom/avito/android/vas_performance/deeplink/VisualVasV2Link;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements A50.b<VisualVasV2Link> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        VisualVasV2Link visualVasV2Link = (VisualVasV2Link) deepLink;
        VisualVasV2Fragment.f321158v0.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("closable", visualVasV2Link.f319878d);
        bundle.putLong("item_id", visualVasV2Link.f319876b);
        bundle.putString("checkout_context", visualVasV2Link.f319877c);
        bundle.putString("current_flow", visualVasV2Link.f319879e);
        VisualVasV2Fragment visualVasV2Fragment = new VisualVasV2Fragment();
        visualVasV2Fragment.setArguments(bundle);
        return visualVasV2Fragment;
    }
}
