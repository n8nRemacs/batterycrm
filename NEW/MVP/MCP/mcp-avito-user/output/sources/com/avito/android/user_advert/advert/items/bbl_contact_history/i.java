package com.avito.android.user_advert.advert.items.bbl_contact_history;

import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BblContactHistoryPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/bbl_contact_history/i;", "Lcom/avito/android/user_advert/advert/items/bbl_contact_history/g;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309297b;

    @Inject
    public i() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((d) eVar).uO(new h(this), (a) aVar);
    }

    @Override // com.avito.android.user_advert.advert.items.bbl_contact_history.g
    public final void b1(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309297b = myAdvertDetailsActivity;
    }

    @Override // com.avito.android.user_advert.advert.items.bbl_contact_history.g
    public final void c0() {
        this.f309297b = null;
    }
}
