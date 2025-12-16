package com.avito.android.advert_details_items.services_discount_and_gifts;

import Da.C13379a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f85664l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f85665m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f85666n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f85667o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Long l12, Long l13, String str, e eVar) {
        super(0);
        this.f85664l = l12;
        this.f85665m = l13;
        this.f85666n = str;
        this.f85667o = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Long l12;
        Long l13 = this.f85664l;
        if (l13 != null && (l12 = this.f85665m) != null && this.f85666n != null) {
            this.f85667o.f85668b.c(new C13379a(l13.longValue(), l12.longValue(), this.f85666n));
        }
        return G0.f406611a;
    }
}
