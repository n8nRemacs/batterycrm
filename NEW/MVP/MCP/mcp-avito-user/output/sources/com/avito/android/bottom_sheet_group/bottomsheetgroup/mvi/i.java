package com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi;

import bk.InterfaceC25669a;
import bk.InterfaceC25670b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.entity.BottomSheetGroupInternalAction;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.entity.BottomSheetGroupState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetGroupFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lbk/a;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupState;", "Lbk/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i extends N implements Y41.l<q<InterfaceC25669a, BottomSheetGroupInternalAction, BottomSheetGroupState, InterfaceC25670b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f107270l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f107271m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f107272n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f107273o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f107274p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f107270l = gVar;
        this.f107271m = eVar;
        this.f107272n = screenPerformanceTracker;
        this.f107273o = nVar;
        this.f107274p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC25669a, BottomSheetGroupInternalAction, BottomSheetGroupState, InterfaceC25670b> qVar) {
        q<InterfaceC25669a, BottomSheetGroupInternalAction, BottomSheetGroupState, InterfaceC25670b> qVar2 = qVar;
        qVar2.f92008d = this.f107270l;
        qVar2.f92009e = this.f107271m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f107272n, this.f107273o);
        qVar2.f92010f = this.f107274p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
