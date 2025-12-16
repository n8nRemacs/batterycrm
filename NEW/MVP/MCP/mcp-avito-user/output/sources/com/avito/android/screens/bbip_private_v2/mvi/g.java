package com.avito.android.screens.bbip_private_v2.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import tp0.InterfaceC48700a;
import tp0.InterfaceC48701b;

/* compiled from: BbipPrivateV2FeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ltp0/a;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State;", "Ltp0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<q<InterfaceC48700a, BbipPrivateV2InternalAction, BbipPrivateV2State, InterfaceC48701b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f261099l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f261100m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f261101n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f261102o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f261103p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f261099l = eVar;
        this.f261100m = aVar;
        this.f261101n = screenPerformanceTracker;
        this.f261102o = lVar;
        this.f261103p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC48700a, BbipPrivateV2InternalAction, BbipPrivateV2State, InterfaceC48701b> qVar) {
        q<InterfaceC48700a, BbipPrivateV2InternalAction, BbipPrivateV2State, InterfaceC48701b> qVar2 = qVar;
        qVar2.f92008d = this.f261099l;
        qVar2.f92009e = this.f261100m;
        qVar2.f92011g = new o(this.f261101n, this.f261102o);
        qVar2.f92010f = this.f261103p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
