package com.avito.android.virtual_deal_room_client_creation.clients.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.virtual_deal_room_client_creation.clients.mvi.entity.ClientsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LNN0/a;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "LNN0/c;", "LNN0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<q<NN0.a, ClientsInternalAction, NN0.c, NN0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f326658l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f326659m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f326660n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f326661o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f326662p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f326658l = dVar;
        this.f326659m = bVar;
        this.f326660n = screenPerformanceTracker;
        this.f326661o = kVar;
        this.f326662p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<NN0.a, ClientsInternalAction, NN0.c, NN0.b> qVar) {
        q<NN0.a, ClientsInternalAction, NN0.c, NN0.b> qVar2 = qVar;
        qVar2.f92008d = this.f326658l;
        qVar2.f92009e = this.f326659m;
        qVar2.f92011g = new o(this.f326660n, this.f326661o);
        qVar2.f92010f = this.f326662p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
