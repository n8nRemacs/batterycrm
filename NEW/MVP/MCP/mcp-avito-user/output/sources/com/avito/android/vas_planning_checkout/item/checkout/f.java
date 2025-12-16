package com.avito.android.vas_planning_checkout.item.checkout;

import Y61.k;
import com.avito.android.vas_planning_checkout.InterfaceC36080a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PlanCheckoutPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/checkout/f;", "LTV0/d;", "Lcom/avito/android/vas_planning_checkout/item/checkout/h;", "Lcom/avito/android/vas_planning_checkout/item/checkout/PlanCheckoutItem;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements TV0.d<h, PlanCheckoutItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC36080a f322931b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f322932c;

    @Inject
    public f(@k InterfaceC36080a interfaceC36080a, @k a aVar) {
        this.f322931b = interfaceC36080a;
        this.f322932c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        PlanCheckoutItem planCheckoutItem = (PlanCheckoutItem) aVar;
        hVar.e(planCheckoutItem.f322912c);
        hVar.p(planCheckoutItem.f322913d);
        hVar.Z0(planCheckoutItem.f322914e);
        hVar.x(com.avito.android.image_loader.b.b(planCheckoutItem.f322915f));
        hVar.I1(planCheckoutItem.f322920k);
        hVar.m4(this.f322931b.getF322818a());
        boolean z12 = planCheckoutItem.f322918i;
        boolean z13 = planCheckoutItem.f322917h;
        if (z12) {
            hVar.av(z13);
        } else {
            hVar.YA(z13);
        }
        hVar.XQ(new d(this, planCheckoutItem));
        hVar.Eg(new e(this, planCheckoutItem));
    }
}
