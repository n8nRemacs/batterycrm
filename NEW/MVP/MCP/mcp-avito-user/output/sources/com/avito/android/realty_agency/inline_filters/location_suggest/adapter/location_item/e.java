package com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import ji0.InterfaceC42386a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/adapter/location_item/e;", "LTV0/d;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/adapter/location_item/g;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/adapter/location_item/a;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC42386a, G0> f251652b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC42386a, G0> lVar) {
        this.f251652b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.J(aVar2.f251641d);
        gVar.Cf(aVar2.f251642e);
        gVar.hV(aVar2.f251643f);
        gVar.setChecked(aVar2.f251644g);
        gVar.a(new d(gVar, aVar2, this));
    }
}
