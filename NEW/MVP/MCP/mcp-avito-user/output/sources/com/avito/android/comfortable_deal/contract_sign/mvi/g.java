package com.avito.android.comfortable_deal.contract_sign.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import pp.C47122c;
import pp.InterfaceC47120a;
import pp.InterfaceC47121b;

/* compiled from: ContractSignFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lpp/a;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lpp/c;", "Lpp/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.l<q<InterfaceC47120a, ContractSignInternalAction, C47122c, InterfaceC47121b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f120869l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f120870m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f120871n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f120872o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f120873p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f120869l = eVar;
        this.f120870m = cVar;
        this.f120871n = screenPerformanceTracker;
        this.f120872o = lVar;
        this.f120873p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC47120a, ContractSignInternalAction, C47122c, InterfaceC47121b> qVar) {
        q<InterfaceC47120a, ContractSignInternalAction, C47122c, InterfaceC47121b> qVar2 = qVar;
        qVar2.f92008d = this.f120869l;
        qVar2.f92009e = this.f120870m;
        qVar2.f92011g = new o(this.f120871n, this.f120872o);
        qVar2.f92010f = this.f120873p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
