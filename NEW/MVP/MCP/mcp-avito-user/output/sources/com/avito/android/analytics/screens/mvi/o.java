package com.avito.android.analytics.screens.mvi;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.u;
import com.avito.android.util.V2;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TrackableReducer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/analytics/screens/mvi/o;", "Lcom/avito/android/analytics/screens/mvi/n;", "InternalAction", "Lcom/avito/android/analytics/screens/mvi/q;", "State", "Lcom/avito/android/arch/mvi/u;", "a", "_avito_analytics-screens-mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o<InternalAction extends n, State extends q> implements u<InternalAction, State> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f90660b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u<InternalAction, State> f90661c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<String, InternalAction> f90662d = new ConcurrentHashMap<>();

    /* compiled from: TrackableReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/analytics/screens/mvi/o$a;", "", "<init>", "()V", "", "PREFIX", "Ljava/lang/String;", "_avito_analytics-screens-mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public o(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k u<InternalAction, State> uVar) {
        this.f90660b = screenPerformanceTracker;
        this.f90661c = uVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Object a(Object obj, Object obj2) {
        n nVar = (n) obj;
        q qVar = (q) obj2;
        boolean z12 = nVar instanceof TrackableLoadingStarted;
        ScreenPerformanceTracker screenPerformanceTracker = this.f90660b;
        if (z12) {
            String f146467d = ((s) nVar).getF212874d();
            if (f146467d == null) {
                f146467d = screenPerformanceTracker.getF90716d();
            }
            this.f90662d.put(f146467d, nVar);
        } else if (nVar instanceof TrackableContent) {
            String f146467d2 = ((s) nVar).getF212874d();
            if (f146467d2 == null) {
                f146467d2 = screenPerformanceTracker.getF90716d();
            }
            b(null, f146467d2);
        } else if (nVar instanceof TrackableError) {
            String f146467d3 = ((s) nVar).getF212874d();
            if (f146467d3 == null) {
                f146467d3 = screenPerformanceTracker.getF90716d();
            }
            b(((TrackableError) nVar).getF295751c(), f146467d3);
        }
        boolean z13 = (nVar instanceof TrackableContent) || (nVar instanceof TrackableError) || (nVar instanceof TrackablePreloadedContent);
        String strConcat = "reducer.".concat(nVar.getClass().getSimpleName());
        p pVar = new p(this, nVar, qVar);
        screenPerformanceTracker.D(strConcat, z13);
        Object objInvoke = pVar.invoke();
        screenPerformanceTracker.A(strConcat, z13);
        return (q) objInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.avito.android.analytics.screens.J$a] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.avito.android.analytics.screens.J$b] */
    /* JADX WARN: Type inference failed for: r10v2 */
    public final void b(J.a aVar, String str) {
        long jA2;
        InternalAction internalactionRemove = this.f90662d.remove(str);
        TrackableLoadingStarted trackableLoadingStarted = internalactionRemove instanceof TrackableLoadingStarted ? (TrackableLoadingStarted) internalactionRemove : null;
        if (trackableLoadingStarted == null) {
            V2.f318762a.e("'" + str + "': content loading end tracked, but loading was never started. 'TrackableContent' action should start after 'TrackableLoadingStarted'.", null);
            return;
        }
        ScreenPerformanceTracker.LoadingType f220627f = trackableLoadingStarted.getF315371e();
        if (f220627f == null) {
            f220627f = ScreenPerformanceTracker.LoadingType.f90785b;
        }
        ScreenPerformanceTracker.LoadingType loadingType = f220627f;
        Long lE2 = trackableLoadingStarted.e();
        if (lE2 != null) {
            jA2 = lE2.longValue();
        } else {
            com.avito.android.time.c.f301452a.getClass();
            jA2 = com.avito.android.time.c.f301453b.a();
        }
        if (aVar == 0) {
            aVar = J.b.f90385a;
        }
        ScreenPerformanceTracker.a.e(this.f90660b, str, loadingType, aVar, jA2 - trackableLoadingStarted.f90640c, 8);
    }
}
