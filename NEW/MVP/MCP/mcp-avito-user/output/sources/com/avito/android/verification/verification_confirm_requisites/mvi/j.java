package com.avito.android.verification.verification_confirm_requisites.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmRequisitesFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LLM0/a;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "LLM0/c;", "LLM0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<q<LM0.a, ConfirmRequisitesInternalAction, LM0.c, LM0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f325003l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f325004m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f325005n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f325006o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f325007p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f325003l = hVar;
        this.f325004m = aVar;
        this.f325005n = screenPerformanceTracker;
        this.f325006o = oVar;
        this.f325007p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<LM0.a, ConfirmRequisitesInternalAction, LM0.c, LM0.b> qVar) {
        q<LM0.a, ConfirmRequisitesInternalAction, LM0.c, LM0.b> qVar2 = qVar;
        qVar2.f92008d = this.f325003l;
        qVar2.f92009e = this.f325004m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f325005n, this.f325006o);
        qVar2.f92010f = this.f325007p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
