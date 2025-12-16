package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: DealRoomReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LCw/c;", "invoke", "()LCw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class D extends kotlin.jvm.internal.N implements Y41.a<C13364c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13364c f137572l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O f137573m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DealRoomInternalAction f137574n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C13364c c13364c, O o12, DealRoomInternalAction dealRoomInternalAction) {
        super(0);
        this.f137572l = c13364c;
        this.f137573m = o12;
        this.f137574n = dealRoomInternalAction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final C13364c invoke() {
        P2<GetDealRoomInfoResponse> bVar;
        P2<GetDealRoomInfoResponse> p22 = this.f137572l.f2779b;
        if (p22 instanceof P2.b) {
            com.avito.android.developments_agency_search.screen.deal_room.use_case.e eVar = this.f137573m.f137595b;
            GetDealRoomInfoResponse getDealRoomInfoResponse = (GetDealRoomInfoResponse) ((P2.b) p22).f318720a;
            DealRoomInternalAction.c.f fVar = (DealRoomInternalAction.c.f) this.f137574n;
            bVar = new P2.b(eVar.invoke(getDealRoomInfoResponse, fVar.f137643b, fVar.f137644c));
        } else {
            bVar = p22;
        }
        return C13364c.a(this.f137572l, bVar, null, null, null, null, 62);
    }
}
