package com.avito.android.comfortable_deal.clients.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kp.C43481g;
import kp.InterfaceC43475a;
import kp.InterfaceC43480f;

/* compiled from: ClientsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lkp/a;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lkp/g;", "Lkp/f;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC43475a, ClientsInternalAction, C43481g, InterfaceC43480f>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f120357l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f120358m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f120359n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f120360o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f120361p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, n nVar) {
        super(1);
        this.f120357l = iVar;
        this.f120358m = gVar;
        this.f120359n = screenPerformanceTracker;
        this.f120360o = pVar;
        this.f120361p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC43475a, ClientsInternalAction, C43481g, InterfaceC43480f> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC43475a, ClientsInternalAction, C43481g, InterfaceC43480f> qVar2 = qVar;
        qVar2.f92008d = this.f120357l;
        qVar2.f92009e = this.f120358m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f120359n, this.f120360o);
        qVar2.f92010f = this.f120361p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
