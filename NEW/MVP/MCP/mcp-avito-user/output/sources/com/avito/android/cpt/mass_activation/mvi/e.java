package com.avito.android.cpt.mass_activation.mvi;

import Vr.InterfaceC15709a;
import Vr.InterfaceC15710b;
import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.cpt.mass_activation.mvi.entity.CptMassActivationInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CptMassActivationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LVr/a;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction;", "LVr/c;", "LVr/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements l<q<InterfaceC15709a, CptMassActivationInternalAction, Vr.c, InterfaceC15710b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f126585l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f126586m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f126587n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f126588o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f126589p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f126585l = cVar;
        this.f126586m = aVar;
        this.f126587n = screenPerformanceTracker;
        this.f126588o = jVar;
        this.f126589p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC15709a, CptMassActivationInternalAction, Vr.c, InterfaceC15710b> qVar) {
        q<InterfaceC15709a, CptMassActivationInternalAction, Vr.c, InterfaceC15710b> qVar2 = qVar;
        qVar2.f92008d = this.f126585l;
        qVar2.f92009e = this.f126586m;
        qVar2.f92011g = new o(this.f126587n, this.f126588o);
        qVar2.f92010f = this.f126589p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
