package com.avito.android.analytics.screens.utils;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.O;
import io.reactivex.rxjava3.internal.operators.single.C42016n;
import kotlin.G0;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: ObservableTracker.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_analytics-screens_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D {
    public static io.reactivex.rxjava3.internal.observers.y a(I i12, ScreenPerformanceTracker screenPerformanceTracker, String str, Y41.l lVar, Y41.l lVar2, int i13) {
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90786c;
        if ((i13 & 2) != 0) {
            str = screenPerformanceTracker.getF305951e();
        }
        if ((i13 & 16) != 0) {
            loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        }
        io.reactivex.rxjava3.core.z zVarF = i12.F();
        n nVar = new n(screenPerformanceTracker, str, loadingType);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        return (io.reactivex.rxjava3.internal.observers.y) zVarF.J(interfaceC43543a, nVar).v0(new o(screenPerformanceTracker, str, loadingType, lVar), new q(screenPerformanceTracker, str, loadingType, lVar2), interfaceC43543a);
    }

    public static io.reactivex.rxjava3.internal.observers.y b(O o12, ScreenPerformanceTracker screenPerformanceTracker, String str, Y41.l lVar, Y41.l lVar2, int i12) {
        if ((i12 & 2) != 0) {
            str = screenPerformanceTracker.getF305951e();
        }
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        n nVar = new n(screenPerformanceTracker, str, loadingType);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        return (io.reactivex.rxjava3.internal.observers.y) o12.J(interfaceC43543a, nVar).v0(new o(screenPerformanceTracker, str, loadingType, lVar), new q(screenPerformanceTracker, str, loadingType, lVar2), interfaceC43543a);
    }

    public static io.reactivex.rxjava3.internal.observers.y c(C42016n c42016n, ScreenPerformanceTracker screenPerformanceTracker, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4) {
        String f305951e = screenPerformanceTracker.getF305951e();
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        io.reactivex.rxjava3.core.z<T> zVarF = c42016n.F();
        r rVar = new r(screenPerformanceTracker, f305951e);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        return (io.reactivex.rxjava3.internal.observers.y) zVarF.J(interfaceC43543a, rVar).v0(new u(screenPerformanceTracker, f305951e, lVar2, lVar, lVar3), new w(screenPerformanceTracker, f305951e, lVar4), interfaceC43543a);
    }

    public static final void d(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k String str, @Y61.k J.a aVar, @Y61.k ScreenPerformanceTracker.LoadingType loadingType, @Y61.k Y41.a<G0> aVar2) {
        ScreenPerformanceTracker.a.d(screenPerformanceTracker, str, loadingType, aVar, null, 8);
        screenPerformanceTracker.m(str);
        aVar2.invoke();
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, str, aVar, null, 4);
    }

    public static final void e(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType, @Y61.k Y41.a<G0> aVar) {
        ScreenPerformanceTracker.a.d(screenPerformanceTracker, str, loadingType, null, null, 12);
        screenPerformanceTracker.m(str);
        aVar.invoke();
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, str, null, null, 6);
    }
}
