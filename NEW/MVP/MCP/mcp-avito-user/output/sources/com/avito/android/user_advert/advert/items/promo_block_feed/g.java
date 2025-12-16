package com.avito.android.user_advert.advert.items.promo_block_feed;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.adverts.PromoBlockData;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBlockItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/promo_block_feed/g;", "Lcom/avito/android/user_advert/advert/items/promo_block_feed/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.groupable_item.b f309865b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f309866c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f309867d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f309868e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f309869f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpa.configure_info.items.feature.e f309870g;

    @Inject
    public g(@Y61.k com.avito.android.lib.util.groupable_item.b bVar, @Y61.k x xVar) {
        this.f309865b = bVar;
        this.f309866c = xVar;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f309867d = cVar;
        this.f309868e = new C41981q0(cVar);
        this.f309870g = new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 12);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.tariff.cpa.configure_info.items.feature.e eVar2;
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        this.f309865b.a(iVar, aVar2);
        PromoBlockData promoBlockData = aVar2.f309851d;
        Iterator<T> it = promoBlockData.getInsights().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            eVar2 = this.f309870g;
            if (!zHasNext) {
                break;
            } else {
                ((PromoBlockData.Insight) it.next()).getText().setOnDeepLinkClickListener(eVar2);
            }
        }
        AttributedText footer = promoBlockData.getFooter();
        if (footer != null) {
            footer.setOnDeepLinkClickListener(eVar2);
        }
        iVar.Dq(promoBlockData.getStyle(), promoBlockData.getTheme());
        iVar.setTitle(promoBlockData.getTitle());
        iVar.CG(promoBlockData.getProgressBar());
        iVar.Xc(promoBlockData.getInsights());
        iVar.Ut(aVar2.f309852e);
        iVar.Qd(new e(this, aVar2));
        iVar.hN(new f(this), promoBlockData.getActions());
        iVar.Uc(promoBlockData.getFooter());
    }

    @Override // com.avito.android.user_advert.advert.items.promo_block_feed.d
    public final void b3(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309869f = myAdvertDetailsActivity;
    }

    @Override // com.avito.android.user_advert.advert.items.promo_block_feed.d
    public final void c0() {
        this.f309869f = null;
    }

    @Override // com.avito.android.deep_linking.K
    @Y61.k
    public final z<DeepLink> k() {
        return this.f309868e;
    }
}
