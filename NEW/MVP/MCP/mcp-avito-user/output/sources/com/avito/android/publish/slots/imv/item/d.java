package com.avito.android.publish.slots.imv.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.category_parameters.slot.imv.MarketValueItem;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InstantMarketValueItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/slots/imv/item/d;", "LTV0/d;", "Lcom/avito/android/publish/slots/imv/item/e;", "LJO/g;", "Lcom/avito/android/deep_linking/K;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<e, JO.g>, K {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC33535v f244275b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<List<SuggestAction>> f244276c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f244277d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C41981q0 f244278e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C41981q0 f244279f;

    public d(@k InterfaceC33535v interfaceC33535v) {
        this.f244275b = interfaceC33535v;
        com.jakewharton.rxrelay3.c<List<SuggestAction>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f244276c = cVar;
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f244277d = cVar2;
        this.f244278e = new C41981q0(cVar2);
        this.f244279f = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        JO.g gVar = (JO.g) aVar;
        boolean z12 = gVar.f8951d;
        if (!z12) {
            this.f244275b.e0(gVar.f8952e);
        }
        if (gVar.f8953f) {
            z12 = false;
        }
        eVar2.u5(z12);
        eVar2.Af();
        for (MarketValueItem marketValueItem : gVar.f8950c) {
            if (marketValueItem instanceof MarketValueItem.Description) {
                MarketValueItem.Description description = (MarketValueItem.Description) marketValueItem;
                description.getText().setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 13));
                eVar2.NV(description.getText());
            } else if (marketValueItem instanceof MarketValueItem.Notification) {
                eVar2.YX(((MarketValueItem.Notification) marketValueItem).getInfo());
            } else if (marketValueItem instanceof MarketValueItem.Bubbles) {
                eVar2.MN(new c(this), ((MarketValueItem.Bubbles) marketValueItem).getList());
            }
        }
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f244278e;
    }
}
