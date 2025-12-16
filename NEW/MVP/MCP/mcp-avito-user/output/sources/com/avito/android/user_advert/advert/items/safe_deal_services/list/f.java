package com.avito.android.user_advert.advert.items.safe_deal_services.list;

import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.safe_deal_services.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SafeDealServiceListItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/list/f;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/list/c;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f310059b;

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c.a aVar2 = (c.a) aVar;
        hVar.b(aVar2.f310029c);
        hVar.j(aVar2.f310030d);
        com.avito.android.user_advert.advert.items.safe_deal_services.d dVar = com.avito.android.user_advert.advert.items.safe_deal_services.d.f310050a;
        d dVar2 = new d(this);
        dVar.getClass();
        hVar.Ub(com.avito.android.user_advert.advert.items.safe_deal_services.d.a(null, null, dVar2));
        hVar.Eh(aVar2.f310032f, aVar2.f310033g);
        hVar.S(new e(aVar2.f310031e, this));
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.list.c
    public final void U4(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310059b = myAdvertDetailsActivity;
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.list.c
    public final void c0() {
        this.f310059b = null;
    }
}
