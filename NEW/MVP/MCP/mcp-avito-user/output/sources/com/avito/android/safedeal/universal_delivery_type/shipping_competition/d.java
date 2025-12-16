package com.avito.android.safedeal.universal_delivery_type.shipping_competition;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.C28484f;
import com.avito.android.analytics.screens.tracker.InterfaceC28483e;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalDeliveryTypeShippingCompetitionPerformanceTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/d;", "Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28499v f256769a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o f256770b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public InterfaceC28483e f256771c;

    @Inject
    public d(@k InterfaceC28499v interfaceC28499v, @k o oVar) {
        this.f256769a = interfaceC28499v;
        this.f256770b = oVar;
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.shipping_competition.c
    public final void a(long j12) {
        this.f256769a.a(j12);
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.shipping_competition.c
    public final void b() {
        InterfaceC28483e interfaceC28483e = this.f256771c;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, J.b.f90385a);
        }
        this.f256771c = null;
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.shipping_competition.c
    public final void c() {
        C28484f c28484fH = this.f256770b.h("display-shipping-competition-tab");
        c28484fH.start();
        this.f256771c = c28484fH;
    }
}
