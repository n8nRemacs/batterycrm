package com.avito.android.screens.bbip_private.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rp0.C47707c;
import rp0.InterfaceC47705a;
import rp0.InterfaceC47706b;

/* compiled from: BbipPrivateFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lrp0/a;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lrp0/c;", "Lrp0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<q<InterfaceC47705a, BbipPrivateInternalAction, C47707c, InterfaceC47706b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f260610l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f260611m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f260612n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f260613o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f260614p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f260610l = eVar;
        this.f260611m = aVar;
        this.f260612n = screenPerformanceTracker;
        this.f260613o = lVar;
        this.f260614p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC47705a, BbipPrivateInternalAction, C47707c, InterfaceC47706b> qVar) {
        q<InterfaceC47705a, BbipPrivateInternalAction, C47707c, InterfaceC47706b> qVar2 = qVar;
        qVar2.f92008d = this.f260610l;
        qVar2.f92009e = this.f260611m;
        qVar2.f92011g = new o(this.f260612n, this.f260613o);
        qVar2.f92010f = this.f260614p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
