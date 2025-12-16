package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import Xz.C17068c;
import Xz.InterfaceC17066a;
import Xz.InterfaceC17067b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EvidenceDetailsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LXz/a;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "LXz/c;", "LXz/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class q extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC17066a, EvidenceDetailsInternalAction, C17068c, InterfaceC17067b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f149090l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f149091m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f149092n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f149093o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f149094p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, v vVar, t tVar) {
        super(1);
        this.f149090l = eVar;
        this.f149091m = cVar;
        this.f149092n = screenPerformanceTracker;
        this.f149093o = vVar;
        this.f149094p = tVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC17066a, EvidenceDetailsInternalAction, C17068c, InterfaceC17067b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC17066a, EvidenceDetailsInternalAction, C17068c, InterfaceC17067b> qVar2 = qVar;
        qVar2.f92008d = this.f149090l;
        qVar2.f92009e = this.f149091m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f149092n, this.f149093o);
        qVar2.f92010f = this.f149094p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
