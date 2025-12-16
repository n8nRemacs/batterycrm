package com.avito.android.user_advert.advert.items.realty.reliable_owner;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReliableOwnerItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/reliable_owner/f;", "Lcom/avito/android/user_advert/advert/items/realty/reliable_owner/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f309938b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f309939c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C41981q0 f309940d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.tariff.cpa.configure_info.items.feature.e f309941e;

    @Inject
    public f(@k x xVar) {
        this.f309938b = xVar;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f309939c = cVar;
        this.f309940d = new C41981q0(cVar);
        this.f309941e = new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 13);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        MyAdvertDetails.ReliableOwner reliableOwner = ((a) aVar).f309928c;
        List<MyAdvertDetails.ReliableOwner.Insight> insights = reliableOwner.getInsights();
        com.avito.android.tariff.cpa.configure_info.items.feature.e eVar2 = this.f309941e;
        if (insights != null) {
            Iterator<T> it = insights.iterator();
            while (it.hasNext()) {
                ((MyAdvertDetails.ReliableOwner.Insight) it.next()).getText().setOnDeepLinkClickListener(eVar2);
            }
        }
        AttributedText footer = reliableOwner.getFooter();
        if (footer != null) {
            footer.setOnDeepLinkClickListener(eVar2);
        }
        hVar.Kc(reliableOwner.getStyle());
        hVar.setTitle(reliableOwner.getTitle());
        hVar.Oh(reliableOwner.getProgressBar());
        hVar.Xc(reliableOwner.getInsights());
        hVar.uf(reliableOwner.getAction(), reliableOwner.getSecondaryAction(), new e(this));
        hVar.Uc(reliableOwner.getFooter());
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f309940d;
    }
}
