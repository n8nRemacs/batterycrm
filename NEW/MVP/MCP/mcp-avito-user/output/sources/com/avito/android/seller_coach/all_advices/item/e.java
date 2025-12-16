package com.avito.android.seller_coach.all_advices.item;

import Eq0.AbstractC13521a;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvicesItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/item/e;", "Lcom/avito/android/seller_coach/all_advices/item/c;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<AbstractC13521a> f267346b = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((g) eVar).Cm((UserAdvertsHintItem) aVar, new d(1, this, e.class, "onItemClick", "onItemClick(Lcom/avito/android/seller_coach/adverts_hint/item/UserAdvertsHintItem;)V", 0));
    }

    @Override // com.avito.android.seller_coach.all_advices.item.c
    /* renamed from: r7, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF267346b() {
        return this.f267346b;
    }
}
