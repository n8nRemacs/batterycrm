package com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi;

import ce.C27181b;
import ce.InterfaceC27180a;
import com.avito.android.arch.mvi.q;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.FactorUnavailableReasonAction;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.FactorUnavailableReasonInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FactorUnavailableReasonFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonAction;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction;", "Lce/b;", "Lce/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i extends N implements Y41.l<q<FactorUnavailableReasonAction, FactorUnavailableReasonInternalAction, C27181b, InterfaceC27180a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f93177l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f93178m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f93179n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f93180o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, a aVar, n nVar, l lVar) {
        super(1);
        this.f93177l = gVar;
        this.f93178m = aVar;
        this.f93179n = nVar;
        this.f93180o = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<FactorUnavailableReasonAction, FactorUnavailableReasonInternalAction, C27181b, InterfaceC27180a> qVar) {
        q<FactorUnavailableReasonAction, FactorUnavailableReasonInternalAction, C27181b, InterfaceC27180a> qVar2 = qVar;
        qVar2.f92008d = this.f93177l;
        qVar2.f92009e = this.f93178m;
        qVar2.f92011g = this.f93179n;
        qVar2.f92010f = this.f93180o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
