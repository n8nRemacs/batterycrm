package com.avito.android.vas_performance;

import Zx.C19616a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.deeplink.VisualVasLink;
import com.avito.android.vas_performance.screens.visual.VisualVasFragment;
import kotlin.Metadata;

/* compiled from: VisualVasFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/M;", "LA50/b;", "Lcom/avito/android/vas_performance/deeplink/VisualVasLink;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class M implements A50.b<VisualVasLink> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C19616a f319853a;

    public M(@Y61.k C19616a c19616a) {
        this.f319853a = c19616a;
    }

    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        VisualVasLink visualVasLink = (VisualVasLink) deepLink;
        C19616a c19616a = this.f319853a;
        c19616a.getClass();
        kotlin.reflect.n<Object> nVar = C19616a.f20576q[1];
        boolean zBooleanValue = ((Boolean) c19616a.f20578c.a().invoke()).booleanValue();
        String str = visualVasLink.f319873c;
        String str2 = visualVasLink.f319875e;
        String str3 = visualVasLink.f319872b;
        boolean z12 = visualVasLink.f319874d;
        if (zBooleanValue) {
            VisualVasFragment.f320947J0.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("closable", z12);
            bundle.putString("checkout_context", str);
            bundle.putString("advert_id", str3);
            bundle.putString("current_flow", str2);
            VisualVasFragment visualVasFragment = new VisualVasFragment();
            visualVasFragment.setArguments(bundle);
            return visualVasFragment;
        }
        com.avito.android.vas_performance.ui.visual_legacy.VisualVasFragment.f322074I0.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("closable", z12);
        bundle2.putString("checkout_context", str);
        bundle2.putString("advert_id", str3);
        bundle2.putString("current_flow", str2);
        com.avito.android.vas_performance.ui.visual_legacy.VisualVasFragment visualVasFragment2 = new com.avito.android.vas_performance.ui.visual_legacy.VisualVasFragment();
        visualVasFragment2.setArguments(bundle2);
        return visualVasFragment2;
    }
}
