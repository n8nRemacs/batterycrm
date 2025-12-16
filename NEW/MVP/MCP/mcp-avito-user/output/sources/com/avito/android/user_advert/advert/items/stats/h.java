package com.avito.android.user_advert.advert.items.stats;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertStatsContact;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertStatsPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/stats/h;", "Lcom/avito/android/user_advert/advert/items/stats/f;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f310297b;

    @Inject
    public h() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        d dVar = (d) eVar;
        a aVar2 = (a) aVar;
        dVar.pE(aVar2.f310282c, aVar2.f310283d);
        Integer num = aVar2.f310284e;
        dVar.Py(num != null ? num.intValue() : 0);
        AdvertStatsContact advertStatsContact = aVar2.f310286g;
        if (advertStatsContact != null) {
            dVar.SB(advertStatsContact.getTotal(), advertStatsContact.getToday());
        } else {
            dVar.c10();
        }
        DeepLink deepLink = aVar2.f310285f;
        if (deepLink != null) {
            dVar.ye(new g(this, aVar2, deepLink));
        }
    }

    @Override // com.avito.android.user_advert.advert.items.stats.f
    public final void Y1(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310297b = myAdvertDetailsActivity;
    }

    @Override // com.avito.android.user_advert.advert.items.stats.f
    public final void c0() {
        this.f310297b = null;
    }
}
