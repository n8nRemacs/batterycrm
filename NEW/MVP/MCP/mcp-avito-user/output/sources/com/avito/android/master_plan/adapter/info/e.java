package com.avito.android.master_plan.adapter.info;

import Y41.p;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InfoItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/adapter/info/e;", "Lcom/avito/android/master_plan/adapter/info/c;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<DeepLink, String, G0> f186006b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k p<? super DeepLink, ? super String, G0> pVar) {
        this.f186006b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        InfoItem infoItem = (InfoItem) aVar;
        gVar.setTitle(infoItem.f185997c);
        gVar.j(infoItem.f185998d);
        gVar.c(new d(infoItem, this));
    }
}
