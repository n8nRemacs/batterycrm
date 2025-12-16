package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import com.avito.android.advert.item.blocks.items_factories.C28081y0;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DealRoomReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LCw/c;", "invoke", "()LCw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class N extends kotlin.jvm.internal.N implements Y41.a<C13364c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13364c f137593l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DealRoomInternalAction.h f137594m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C13364c c13364c, DealRoomInternalAction.h hVar) {
        super(0);
        this.f137593l = c13364c;
        this.f137594m = hVar;
    }

    @Override // Y41.a
    public final C13364c invoke() {
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(this.f137593l.f2781d);
        linkedHashSetO0.removeIf(new C28081y0(new M(this.f137594m), 8));
        return C13364c.a(this.f137593l, null, null, linkedHashSetO0, null, null, 59);
    }
}
