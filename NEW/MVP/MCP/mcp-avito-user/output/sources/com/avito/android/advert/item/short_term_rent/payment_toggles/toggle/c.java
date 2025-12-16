package com.avito.android.advert.item.short_term_rent.payment_toggles.toggle;

import com.avito.android.advert.item.short_term_rent.payment_toggles.b;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsTravelPaymentTogglePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsTravelPaymentToggleItem f80121l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f80122m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AdvertDetailsTravelPaymentToggleItem advertDetailsTravelPaymentToggleItem, e eVar) {
        super(0);
        this.f80121l = advertDetailsTravelPaymentToggleItem;
        this.f80122m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f80121l.f80111d;
        if (deepLink != null) {
            e eVar = this.f80122m;
            eVar.f80125b.a(new b.a(deepLink));
        }
        return G0.f406611a;
    }
}
