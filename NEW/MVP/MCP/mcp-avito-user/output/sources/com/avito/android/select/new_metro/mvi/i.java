package com.avito.android.select.new_metro.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroState;
import iq0.InterfaceC42091a;
import iq0.InterfaceC42092b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectMetroFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Liq0/a;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroState;", "Liq0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC42091a, SelectMetroInternalAction, SelectMetroState, InterfaceC42092b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f266278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f266279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f266280n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f266281o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f266282p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f266278l = gVar;
        this.f266279m = eVar;
        this.f266280n = screenPerformanceTracker;
        this.f266281o = oVar;
        this.f266282p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC42091a, SelectMetroInternalAction, SelectMetroState, InterfaceC42092b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC42091a, SelectMetroInternalAction, SelectMetroState, InterfaceC42092b> qVar2 = qVar;
        qVar2.f92008d = this.f266278l;
        qVar2.f92009e = this.f266279m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f266280n, this.f266281o);
        qVar2.f92010f = this.f266282p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
