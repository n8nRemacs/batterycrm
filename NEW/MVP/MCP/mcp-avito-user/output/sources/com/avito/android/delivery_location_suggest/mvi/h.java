package com.avito.android.delivery_location_suggest.mvi;

import Gv.InterfaceC13920a;
import Gv.InterfaceC13921b;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryLocationSuggestFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LGv/a;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "LGv/c;", "LGv/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements Y41.l<q<InterfaceC13920a, DeliveryLocationSuggestInternalAction, Gv.c, InterfaceC13921b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f135180l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f135181m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f135182n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f135183o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f135184p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f135180l = fVar;
        this.f135181m = aVar;
        this.f135182n = screenPerformanceTracker;
        this.f135183o = mVar;
        this.f135184p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13920a, DeliveryLocationSuggestInternalAction, Gv.c, InterfaceC13921b> qVar) {
        q<InterfaceC13920a, DeliveryLocationSuggestInternalAction, Gv.c, InterfaceC13921b> qVar2 = qVar;
        qVar2.f92008d = this.f135180l;
        qVar2.f92009e = this.f135181m;
        qVar2.f92011g = new o(this.f135182n, this.f135183o);
        qVar2.f92010f = this.f135184p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
