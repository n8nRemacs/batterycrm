package com.avito.android.advert.item.service_booking;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f79831l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingItem f79832m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ServiceBookingItem serviceBookingItem) {
        super(0);
        this.f79831l = fVar;
        this.f79832m = serviceBookingItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f79831l;
        fVar.f79835d.a(this.f79832m.f79814e.f79823d);
        fVar.f79833b.A();
        return G0.f406611a;
    }
}
