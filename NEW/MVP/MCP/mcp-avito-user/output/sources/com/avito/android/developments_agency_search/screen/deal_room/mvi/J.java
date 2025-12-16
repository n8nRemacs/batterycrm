package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;

/* compiled from: DealRoomReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LCw/c;", "invoke", "()LCw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class J extends kotlin.jvm.internal.N implements Y41.a<C13364c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13364c f137586l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DealRoomInternalAction.h f137587m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C13364c c13364c, DealRoomInternalAction.h hVar) {
        super(0);
        this.f137586l = c13364c;
        this.f137587m = hVar;
    }

    @Override // Y41.a
    public final C13364c invoke() {
        Set<C13364c.b> set = this.f137586l.f2781d;
        DealRoomInternalAction.h hVar = this.f137587m;
        return C13364c.a(this.f137586l, null, null, b1.i(set, new C13364c.b(hVar.getF137662b(), hVar.getF137663c())), null, null, 59);
    }
}
