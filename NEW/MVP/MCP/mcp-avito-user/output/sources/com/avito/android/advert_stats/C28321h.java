package com.avito.android.advert_stats;

import Xa.C16984a;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.os.C22777e;
import com.avito.android.advert_stats.AdvertStatsFragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.paid_services.PaidServicesLink;
import com.avito.android.remote.model.Action;
import com.avito.android.util.architecture_components.C35751e;
import com.avito.android.vas_performance.deeplink.PerformanceVasLink;
import eH0.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: AdvertStatsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert_stats.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28321h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertStatsFragment f86670l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Action f86671m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28321h(AdvertStatsFragment advertStatsFragment, Action action) {
        super(0);
        this.f86670l = advertStatsFragment;
        this.f86671m = action;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertStatsFragment.a aVar = AdvertStatsFragment.f85994z0;
        r rVarQ5 = this.f86670l.q5();
        DeepLink deepLink = this.f86671m.getDeepLink();
        boolean z12 = deepLink instanceof PaidServicesLink;
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = rVarQ5.f86850O;
        InterfaceC28373a interfaceC28373a = rVarQ5.f86851P;
        if (z12) {
            if (deepLink instanceof PerformanceVasLink) {
                interfaceC28373a.c(new Xa.e(rVarQ5.f86844E));
            }
            Intent flags = c.a.a(rVarQ5.f86848M, rVarQ5.f86844E, null, false, false, 30).setFlags(603979776);
            Bundle bundle = new Bundle();
            bundle.putParcelable("up_intent", flags);
            G0 g02 = G0.f406611a;
            b.a.a(aVar2, deepLink, null, bundle, 2);
        } else if (deepLink instanceof MyAdvertLink.Activate) {
            MyAdvertLink.Activate activate = (MyAdvertLink.Activate) deepLink;
            rVarQ5.f86855T.setValue(new com.avito.android.util.architecture_components.F(new C35751e(rVarQ5.f86848M.e(activate.f133463c, activate.f133465e).setFlags(603979776))));
        } else if (deepLink instanceof MyAdvertLink.EditLink) {
            MyAdvertLink.EditLink editLink = (MyAdvertLink.EditLink) deepLink;
            if (editLink.f()) {
                interfaceC28373a.c(new C16984a(editLink.getF133462b()));
            }
            Intent intentA = rVarQ5.f86849N.a(editLink.getF133462b(), null, false);
            intentA.setFlags(603979776);
            b.a.a(aVar2, deepLink, null, C22777e.b(new Q("up_intent", intentA)), 2);
        } else {
            b.a.a(aVar2, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}
