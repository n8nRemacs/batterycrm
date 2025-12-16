package com.avito.android.vas_planning;

import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35966w1;
import com.avito.android.vas_planning.deeplink.VasPlannerLink;
import kotlin.Metadata;

/* compiled from: VasPlanningFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_planning/d;", "LA50/b;", "Lcom/avito/android/vas_planning/deeplink/VasPlannerLink;", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements A50.b<VasPlannerLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        VasPlannerLink vasPlannerLink = (VasPlannerLink) deepLink;
        VasPlanningFragment.f322179z0.getClass();
        VasPlanningFragment vasPlanningFragment = new VasPlanningFragment();
        boolean z12 = vasPlannerLink.f322249d;
        C35966w1.a(vasPlanningFragment, -1, new c(vasPlannerLink.f322247b, vasPlannerLink.f322248c, vasPlannerLink.f322250e, z12));
        return vasPlanningFragment;
    }
}
