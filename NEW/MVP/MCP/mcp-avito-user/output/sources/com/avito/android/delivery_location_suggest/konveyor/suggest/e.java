package com.avito.android.delivery_location_suggest.konveyor.suggest;

import Gv.InterfaceC13920a;
import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SuggestItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_location_suggest/konveyor/suggest/e;", "LTV0/d;", "Lcom/avito/android/delivery_location_suggest/konveyor/suggest/g;", "Lcom/avito/android/delivery_location_suggest/konveyor/suggest/c;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements TV0.d<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13920a, G0> f135134b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC13920a, G0> lVar) {
        this.f135134b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        c cVar = (c) aVar;
        gVar.JS(cVar.f135129c, cVar.f135130d);
        gVar.u1(new d(cVar, this));
    }
}
