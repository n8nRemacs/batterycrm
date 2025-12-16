package com.avito.android.reputation.ui.mvi;

import Rm0.InterfaceC15059a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReputationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LRm0/a;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "LRm0/c;", "LRm0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.l<q<InterfaceC15059a, ReputationInternalAction, Rm0.c, Rm0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f255067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f255068m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f255069n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f255070o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f255071p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f255067l = dVar;
        this.f255068m = bVar;
        this.f255069n = screenPerformanceTracker;
        this.f255070o = kVar;
        this.f255071p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC15059a, ReputationInternalAction, Rm0.c, Rm0.b> qVar) {
        q<InterfaceC15059a, ReputationInternalAction, Rm0.c, Rm0.b> qVar2 = qVar;
        qVar2.f92008d = this.f255067l;
        qVar2.f92009e = this.f255068m;
        qVar2.f92011g = new o(this.f255069n, this.f255070o);
        qVar2.f92010f = this.f255071p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
