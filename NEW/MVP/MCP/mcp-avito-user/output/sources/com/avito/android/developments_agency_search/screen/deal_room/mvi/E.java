package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;

/* compiled from: DealRoomReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LCw/c;", "invoke", "()LCw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class E extends kotlin.jvm.internal.N implements Y41.a<C13364c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13364c f137575l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DealRoomInternalAction f137576m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C13364c c13364c, DealRoomInternalAction dealRoomInternalAction) {
        super(0);
        this.f137575l = c13364c;
        this.f137576m = dealRoomInternalAction;
    }

    @Override // Y41.a
    public final C13364c invoke() {
        C13364c c13364c = this.f137575l;
        Set<String> set = c13364c.f2780c;
        DealRoomInternalAction.p pVar = (DealRoomInternalAction.p) this.f137576m;
        boolean zContains = set.contains(pVar.f137674b);
        String str = pVar.f137674b;
        Set<String> set2 = c13364c.f2780c;
        return C13364c.a(this.f137575l, null, zContains ? b1.e(set2, str) : b1.i(set2, str), null, null, null, 61);
    }
}
