package com.avito.android.publish.slots.cpa_tariff.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: CpaTariffSlotItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/cpa_tariff/item/e;", "Lcom/avito/android/publish/slots/cpa_tariff/item/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<b> f243383b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f243384c;

    public e() {
        com.jakewharton.rxrelay3.c<b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243383b = cVar;
        this.f243384c = cVar;
    }

    @Override // com.avito.android.publish.slots.cpa_tariff.item.c
    @k
    /* renamed from: H6, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF243384c() {
        return this.f243384c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        b bVar = (b) aVar;
        fVar.setTitle(bVar.f243376c);
        fVar.setText(bVar.f243377d);
        fVar.yO(bVar.f243378e, new d(this, bVar));
    }
}
