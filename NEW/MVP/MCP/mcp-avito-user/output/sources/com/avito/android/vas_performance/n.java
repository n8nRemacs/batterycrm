package com.avito.android.vas_performance;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.deeplink.PerformanceVasLink;
import com.avito.android.vas_performance.ui.PerformanceVasFragment;
import kotlin.Metadata;

/* compiled from: PerformanceVasFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_performance/n;", "LA50/b;", "Lcom/avito/android/vas_performance/deeplink/PerformanceVasLink;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n implements A50.b<PerformanceVasLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        PerformanceVasLink performanceVasLink = (PerformanceVasLink) deepLink;
        PerformanceVasFragment.f321384B0.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("closable", performanceVasLink.f319863d);
        bundle.putString("checkout_context", performanceVasLink.f319862c);
        bundle.putString("advert_id", performanceVasLink.f319861b);
        bundle.putString("currentFlow", performanceVasLink.f319864e);
        PerformanceVasFragment performanceVasFragment = new PerformanceVasFragment();
        performanceVasFragment.setArguments(bundle);
        return performanceVasFragment;
    }
}
