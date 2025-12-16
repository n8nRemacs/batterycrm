package com.avito.android.user_advert.advert.items.service_subscription_banner;

import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SubscriptionBannerPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f310203l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f310204m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, c cVar) {
        super(0);
        this.f310203l = fVar;
        this.f310204m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f310203l;
        MyAdvertDetailsActivity myAdvertDetailsActivity = fVar.f310207d;
        if (myAdvertDetailsActivity != null) {
            myAdvertDetailsActivity.a(this.f310204m.f310202g);
        }
        fVar.f310205b.c(new m90.d("Карточка селлера", "landing"));
        return G0.f406611a;
    }
}
