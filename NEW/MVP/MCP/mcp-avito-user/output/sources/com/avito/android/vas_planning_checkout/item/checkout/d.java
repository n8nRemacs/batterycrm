package com.avito.android.vas_planning_checkout.item.checkout;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlanCheckoutPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f322927l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PlanCheckoutItem f322928m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, PlanCheckoutItem planCheckoutItem) {
        super(0);
        this.f322927l = fVar;
        this.f322928m = planCheckoutItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f322927l;
        fVar.f322932c.r4(this.f322928m);
        return G0.f406611a;
    }
}
