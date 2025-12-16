package com.avito.android.cpt.pre_activation.mvi;

import Xr.InterfaceC17040a;
import Xr.InterfaceC17041b;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PreActivationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LXr/a;", "Lcom/avito/android/cpt/pre_activation/mvi/entity/PreActivationInternalAction;", "LXr/c;", "LXr/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements Y41.l<q<InterfaceC17040a, PreActivationInternalAction, Xr.c, InterfaceC17041b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f126741l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f126742m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f126743n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f126744o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f126745p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f126741l = fVar;
        this.f126742m = bVar;
        this.f126743n = screenPerformanceTracker;
        this.f126744o = mVar;
        this.f126745p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC17040a, PreActivationInternalAction, Xr.c, InterfaceC17041b> qVar) {
        q<InterfaceC17040a, PreActivationInternalAction, Xr.c, InterfaceC17041b> qVar2 = qVar;
        qVar2.f92008d = this.f126741l;
        qVar2.f92009e = this.f126742m;
        qVar2.f92011g = new o(this.f126743n, this.f126744o);
        qVar2.f92010f = this.f126745p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
