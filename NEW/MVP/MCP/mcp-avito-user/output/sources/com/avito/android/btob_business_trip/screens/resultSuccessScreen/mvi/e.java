package com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi;

import Ak.C13046c;
import Ak.InterfaceC13044a;
import Ak.InterfaceC13045b;
import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi.entity.B2bBusinessTripSuccessScreenInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: B2bBusinessTripSuccessScreenFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LAk/a;", "Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenInternalAction;", "LAk/c;", "LAk/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements l<q<InterfaceC13044a, B2bBusinessTripSuccessScreenInternalAction, C13046c, InterfaceC13045b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f108101l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f108102m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f108103n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f108104o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f108105p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f108101l = cVar;
        this.f108102m = aVar;
        this.f108103n = screenPerformanceTracker;
        this.f108104o = jVar;
        this.f108105p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13044a, B2bBusinessTripSuccessScreenInternalAction, C13046c, InterfaceC13045b> qVar) {
        q<InterfaceC13044a, B2bBusinessTripSuccessScreenInternalAction, C13046c, InterfaceC13045b> qVar2 = qVar;
        qVar2.f92008d = this.f108101l;
        qVar2.f92009e = this.f108102m;
        qVar2.f92011g = new o(this.f108103n, this.f108104o);
        qVar2.f92010f = this.f108105p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
