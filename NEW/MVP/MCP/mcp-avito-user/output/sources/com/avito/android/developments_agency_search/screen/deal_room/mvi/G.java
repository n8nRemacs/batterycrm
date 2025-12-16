package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import com.avito.android.advert.item.blocks.items_factories.C28081y0;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import com.avito.android.util.P2;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DealRoomReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LCw/c;", "invoke", "()LCw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class G extends kotlin.jvm.internal.N implements Y41.a<C13364c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13364c f137578l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O f137579m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DealRoomInternalAction f137580n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C13364c c13364c, O o12, DealRoomInternalAction dealRoomInternalAction) {
        super(0);
        this.f137578l = c13364c;
        this.f137579m = o12;
        this.f137580n = dealRoomInternalAction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final C13364c invoke() {
        P2<GetDealRoomInfoResponse> bVar;
        C13364c c13364c = this.f137578l;
        P2<GetDealRoomInfoResponse> p22 = c13364c.f2779b;
        boolean z12 = p22 instanceof P2.b;
        DealRoomInternalAction dealRoomInternalAction = this.f137580n;
        if (z12) {
            DealRoomInternalAction.g gVar = (DealRoomInternalAction.g) dealRoomInternalAction;
            bVar = new P2.b(this.f137579m.f137597d.invoke((GetDealRoomInfoResponse) ((P2.b) p22).f318720a, gVar.f137654b, gVar.f137655c));
        } else {
            bVar = p22;
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(c13364c.f2781d);
        linkedHashSetO0.removeIf(new C28081y0(new F(dealRoomInternalAction), 6));
        return C13364c.a(this.f137578l, bVar, null, linkedHashSetO0, null, null, 58);
    }
}
