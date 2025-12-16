package com.avito.android.developments_agency_search.screen.deal_room;

import Cw.InterfaceC13362a;
import com.avito.android.developments_agency_search.screen.deal_room.DealRoomFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DealRoomFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/edit_client/e;", "clientForm", "", "noteText", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/developments_agency_search/screen/deal_room/edit_client/e;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class p extends N implements Y41.p<com.avito.android.developments_agency_search.screen.deal_room.edit_client.e, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DealRoomFragment f137803l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(DealRoomFragment dealRoomFragment) {
        super(2);
        this.f137803l = dealRoomFragment;
    }

    @Override // Y41.p
    public final G0 invoke(com.avito.android.developments_agency_search.screen.deal_room.edit_client.e eVar, String str) {
        DealRoomFragment.a aVar = DealRoomFragment.f137222z0;
        DealRoomFragment dealRoomFragment = this.f137803l;
        dealRoomFragment.q5().accept(new InterfaceC13362a.c.b(eVar));
        dealRoomFragment.q5().accept(new InterfaceC13362a.h(str));
        return G0.f406611a;
    }
}
