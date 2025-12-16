package com.avito.android.virtual_deal_room.client_room.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.virtual_deal_room.client_room.mvi.entity.ClientRoomInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientRoomFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LEN0/a;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "LEN0/c;", "LEN0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements Y41.l<q<EN0.a, ClientRoomInternalAction, EN0.c, EN0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f326403l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f326404m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f326405n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f326406o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f326407p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f326403l = gVar;
        this.f326404m = eVar;
        this.f326405n = screenPerformanceTracker;
        this.f326406o = nVar;
        this.f326407p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<EN0.a, ClientRoomInternalAction, EN0.c, EN0.b> qVar) {
        q<EN0.a, ClientRoomInternalAction, EN0.c, EN0.b> qVar2 = qVar;
        qVar2.f92008d = this.f326403l;
        qVar2.f92009e = this.f326404m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f326405n, this.f326406o);
        qVar2.f92010f = this.f326407p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
