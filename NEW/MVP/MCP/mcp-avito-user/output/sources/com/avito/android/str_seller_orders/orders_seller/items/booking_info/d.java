package com.avito.android.str_seller_orders.orders_seller.items.booking_info;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import tz0.InterfaceC48745a;

/* compiled from: BookingInfoPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f289414l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f289415m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, e eVar) {
        super(0);
        this.f289414l = cVar;
        this.f289415m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f289414l.f289412j;
        if (deepLink != null) {
            e eVar = this.f289415m;
            eVar.f289416b.invoke(new InterfaceC48745a.c(deepLink));
        }
        return G0.f406611a;
    }
}
