package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import Di0.AbstractC13405c;
import Di0.InterfaceC13403a;
import Di0.InterfaceC13404b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RecallMeFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LDi0/a;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "LDi0/c;", "LDi0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC13403a, RecallMeInternalAction, AbstractC13405c, InterfaceC13404b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f252192l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f252193m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f252194n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f252195o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, n nVar) {
        super(1);
        this.f252192l = aVar;
        this.f252193m = screenPerformanceTracker;
        this.f252194n = pVar;
        this.f252195o = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC13403a, RecallMeInternalAction, AbstractC13405c, InterfaceC13404b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC13403a, RecallMeInternalAction, AbstractC13405c, InterfaceC13404b> qVar2 = qVar;
        qVar2.f92009e = this.f252192l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f252193m, this.f252194n);
        qVar2.f92010f = this.f252195o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
