package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;

/* compiled from: DealRoomReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LCw/c;", "invoke", "()LCw/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class I extends kotlin.jvm.internal.N implements Y41.a<C13364c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DealRoomInternalAction.MainInfoLoading f137584l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C13364c f137585m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(DealRoomInternalAction.MainInfoLoading mainInfoLoading, C13364c c13364c) {
        super(0);
        this.f137584l = mainInfoLoading;
        this.f137585m = c13364c;
    }

    @Override // Y41.a
    public final C13364c invoke() {
        P2 aVar;
        P2 p22;
        DealRoomInternalAction.MainInfoLoading mainInfoLoading = this.f137584l;
        if (mainInfoLoading instanceof DealRoomInternalAction.MainInfoLoading.StartLoading) {
            p22 = P2.c.f318721a;
        } else {
            if (mainInfoLoading instanceof DealRoomInternalAction.MainInfoLoading.Loaded) {
                aVar = new P2.b(((DealRoomInternalAction.MainInfoLoading.Loaded) mainInfoLoading).f137632b);
            } else {
                if (!(mainInfoLoading instanceof DealRoomInternalAction.MainInfoLoading.LoadingError)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new P2.a(com.avito.android.error.z.n(((DealRoomInternalAction.MainInfoLoading.LoadingError) mainInfoLoading).f137633b));
            }
            p22 = aVar;
        }
        return C13364c.a(this.f137585m, p22, B0.f406639b, null, null, null, 60);
    }
}
