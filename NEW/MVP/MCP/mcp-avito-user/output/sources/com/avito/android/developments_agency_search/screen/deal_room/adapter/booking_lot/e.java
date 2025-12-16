package com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot;

import Cw.InterfaceC13362a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BookingLotItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/booking_lot/e;", "LTV0/d;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/booking_lot/g;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/booking_lot/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13362a, G0> f137288b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC13362a, G0> lVar) {
        this.f137288b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.setOpacity(aVar2.f137281k);
        gVar.p(aVar2.f137273c);
        if (aVar2.f137274d != null) {
            gVar.n7(true);
            gVar.i8(new d(this, aVar2));
        } else {
            gVar.n7(false);
            gVar.i8(null);
        }
        gVar.s80(aVar2.f137275e);
        gVar.D2(aVar2.f137276f);
        gVar.C(aVar2.f137277g);
        gVar.T5(aVar2.f137278h);
        gVar.DO(aVar2.f137279i);
        gVar.TV(aVar2.f137280j);
    }
}
