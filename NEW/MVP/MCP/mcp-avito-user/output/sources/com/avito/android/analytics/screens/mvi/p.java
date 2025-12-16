package com.avito.android.analytics.screens.mvi;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.u;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrackableReducer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/analytics/screens/mvi/n;", "InternalAction", "Lcom/avito/android/analytics/screens/mvi/q;", "State", "invoke", "()Lcom/avito/android/analytics/screens/mvi/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class p extends N implements Y41.a<q> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o<n, q> f90663l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f90664m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f90665n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o<n, q> oVar, n nVar, q qVar) {
        super(0);
        this.f90663l = oVar;
        this.f90664m = nVar;
        this.f90665n = qVar;
    }

    @Override // Y41.a
    public final q invoke() {
        r rVar;
        o<n, q> oVar = this.f90663l;
        u<InternalAction, State> uVar = oVar.f90661c;
        q qVar = this.f90665n;
        n nVar = this.f90664m;
        q qVar2 = (q) uVar.a(nVar, qVar);
        boolean z12 = nVar instanceof TrackableContent;
        ScreenPerformanceTracker screenPerformanceTracker = oVar.f90660b;
        if (z12) {
            String f303160d = ((t) nVar).getF303160d();
            if (f303160d == null) {
                f303160d = screenPerformanceTracker.getF90716d();
            }
            rVar = new r(f303160d, J.b.f90385a);
        } else if (nVar instanceof TrackablePreloadedContent) {
            String f303160d2 = ((t) nVar).getF303160d();
            if (f303160d2 == null) {
                f303160d2 = screenPerformanceTracker.getF90716d();
            }
            rVar = new r(f303160d2, J.b.f90385a);
        } else if (nVar instanceof TrackableError) {
            String f303160d3 = ((t) nVar).getF303160d();
            if (f303160d3 == null) {
                f303160d3 = screenPerformanceTracker.getF90716d();
            }
            rVar = new r(f303160d3, ((TrackableError) nVar).getF295751c());
        } else {
            rVar = null;
        }
        qVar2.setPerfTrackerParams(rVar);
        return qVar2;
    }
}
