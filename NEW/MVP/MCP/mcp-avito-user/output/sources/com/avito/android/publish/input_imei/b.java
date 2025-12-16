package com.avito.android.publish.input_imei;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: InputImeiFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUV0/a;", "Lcom/avito/conveyor_item/a;", "it", "Lkotlin/G0;", "emit", "(LUV0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputImeiFragment f236226b;

    public b(InputImeiFragment inputImeiFragment) {
        this.f236226b = inputImeiFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        List listM0 = C42745f0.M0(com.avito.konveyor.util.g.b((UV0.a) obj));
        InputImeiFragment inputImeiFragment = this.f236226b;
        ScreenPerformanceTracker screenPerformanceTracker = inputImeiFragment.f236198p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        com.avito.android.recycler.data_aware.c cVar = inputImeiFragment.f236201s0;
        if (cVar == null) {
            cVar = null;
        }
        com.avito.konveyor.util.a.a(cVar, listM0);
        ScreenPerformanceTracker screenPerformanceTracker2 = inputImeiFragment.f236198p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, J.b.f90385a, null, 5);
        return G0.f406611a;
    }
}
