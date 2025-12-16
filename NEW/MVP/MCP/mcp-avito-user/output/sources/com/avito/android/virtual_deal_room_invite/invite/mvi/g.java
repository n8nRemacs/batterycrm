package com.avito.android.virtual_deal_room_invite.invite.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import nO0.C44303d;
import nO0.InterfaceC44300a;
import nO0.InterfaceC44302c;

/* compiled from: InviteFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LnO0/a;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "LnO0/d;", "LnO0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<q<InterfaceC44300a, InviteInternalAction, C44303d, InterfaceC44302c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f327085l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f327086m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f327087n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f327088o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f327089p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f327085l = eVar;
        this.f327086m = bVar;
        this.f327087n = screenPerformanceTracker;
        this.f327088o = lVar;
        this.f327089p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC44300a, InviteInternalAction, C44303d, InterfaceC44302c> qVar) {
        q<InterfaceC44300a, InviteInternalAction, C44303d, InterfaceC44302c> qVar2 = qVar;
        qVar2.f92008d = this.f327085l;
        qVar2.f92009e = this.f327086m;
        qVar2.f92011g = new o(this.f327087n, this.f327088o);
        qVar2.f92010f = this.f327089p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
