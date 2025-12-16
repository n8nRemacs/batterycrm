package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DealRoomReducer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/O;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "LCw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class O implements com.avito.android.arch.mvi.u<DealRoomInternalAction, C13364c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.deal_room.use_case.e f137595b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.deal_room.use_case.g f137596c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.deal_room.use_case.a f137597d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.deal_room.use_case.c f137598e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Q f137599f;

    @Inject
    public O(@Y61.k com.avito.android.developments_agency_search.screen.deal_room.use_case.e eVar, @Y61.k com.avito.android.developments_agency_search.screen.deal_room.use_case.g gVar, @Y61.k com.avito.android.developments_agency_search.screen.deal_room.use_case.a aVar, @Y61.k com.avito.android.developments_agency_search.screen.deal_room.use_case.c cVar, @Y61.k Q q12) {
        this.f137595b = eVar;
        this.f137596c = gVar;
        this.f137597d = aVar;
        this.f137598e = cVar;
        this.f137599f = q12;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C13364c a(DealRoomInternalAction dealRoomInternalAction, C13364c c13364c) {
        C13364c c13364cA;
        DealRoomInternalAction dealRoomInternalAction2 = dealRoomInternalAction;
        C13364c c13364c2 = c13364c;
        boolean z12 = dealRoomInternalAction2 instanceof DealRoomInternalAction.MainInfoLoading;
        Q q12 = this.f137599f;
        if (z12) {
            return q12.a(new I((DealRoomInternalAction.MainInfoLoading) dealRoomInternalAction2, c13364c2));
        }
        if (dealRoomInternalAction2 instanceof DealRoomInternalAction.c.f) {
            return q12.a(new D(c13364c2, this, dealRoomInternalAction2));
        }
        if (dealRoomInternalAction2 instanceof DealRoomInternalAction.p) {
            return q12.a(new E(c13364c2, dealRoomInternalAction2));
        }
        if (dealRoomInternalAction2 instanceof DealRoomInternalAction.i) {
            return C13364c.a(c13364c2, null, null, null, null, null, 47);
        }
        if (dealRoomInternalAction2 instanceof DealRoomInternalAction.q) {
            return C13364c.a(c13364c2, null, null, null, ((DealRoomInternalAction.q) dealRoomInternalAction2).f137675b, null, 55);
        }
        if (!(dealRoomInternalAction2 instanceof DealRoomInternalAction.h)) {
            return dealRoomInternalAction2 instanceof DealRoomInternalAction.g ? q12.a(new G(c13364c2, this, dealRoomInternalAction2)) : dealRoomInternalAction2 instanceof DealRoomInternalAction.d.f ? q12.a(new H(c13364c2, this, dealRoomInternalAction2)) : c13364c2;
        }
        DealRoomInternalAction.h hVar = (DealRoomInternalAction.h) dealRoomInternalAction2;
        if (hVar instanceof DealRoomInternalAction.h.a) {
            c13364cA = q12.a(new J(c13364c2, hVar));
        } else if (hVar instanceof DealRoomInternalAction.h.b) {
            c13364cA = q12.a(new L(c13364c2, this, hVar));
        } else {
            if (!(hVar instanceof DealRoomInternalAction.h.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c13364cA = q12.a(new N(c13364c2, hVar));
        }
        return c13364cA;
    }
}
