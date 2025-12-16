package com.avito.android.guests_selector.items.adults_stepper;

import Y41.l;
import Y61.k;
import gI.InterfaceC40585a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdultsStepperPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/guests_selector/items/adults_stepper/d;", "LTV0/d;", "Lcom/avito/android/guests_selector/items/adults_stepper/f;", "Lcom/avito/android/guests_selector/items/adults_stepper/AdultsStepperItem;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<f, AdultsStepperItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40585a, G0> f161463b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC40585a, G0> lVar) {
        this.f161463b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdultsStepperItem adultsStepperItem = (AdultsStepperItem) aVar;
        fVar.p1(adultsStepperItem.f161452b);
        fVar.e2(adultsStepperItem.f161453c);
        fVar.Br(adultsStepperItem.f161454d);
        fVar.S10(adultsStepperItem.f161455e);
        fVar.AI(adultsStepperItem.f161456f);
        fVar.K(new c(this));
    }
}
