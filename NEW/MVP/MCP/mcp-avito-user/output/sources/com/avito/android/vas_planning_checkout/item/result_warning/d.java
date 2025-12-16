package com.avito.android.vas_planning_checkout.item.result_warning;

import Y61.k;
import com.avito.android.deep_linking.links.w;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanningResultWarningItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/result_warning/d;", "Lcom/avito/android/vas_planning_checkout/item/result_warning/c;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f322998b;

    @Inject
    public d(@k w wVar) {
        this.f322998b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        fVar.PL((VasPlanningResultWarningItem) aVar);
        fVar.hT(this.f322998b);
    }
}
