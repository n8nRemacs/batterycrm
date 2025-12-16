package com.avito.android.trx_promo_impl.item.discount_v2;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoStrDiscountV2BannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f304278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f304279m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, g gVar) {
        super(0);
        this.f304278l = cVar;
        this.f304279m = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f304278l.f304277f;
        if (deepLink != null) {
            this.f304279m.f304282b.invoke(deepLink);
        }
        return G0.f406611a;
    }
}
