package com.avito.android.select.new_districts.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictInternalAction;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictState;
import eq0.InterfaceC40146a;
import eq0.InterfaceC40147b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FilterSelectDistrictFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Leq0/a;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictInternalAction;", "Lcom/avito/android/select/new_districts/mvi/entity/SelectDistrictState;", "Leq0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements Y41.l<q<InterfaceC40146a, SelectDistrictInternalAction, SelectDistrictState, InterfaceC40147b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f265800l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f265801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f265802n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f265803o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f265804p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f265800l = cVar;
        this.f265801m = aVar;
        this.f265802n = screenPerformanceTracker;
        this.f265803o = kVar;
        this.f265804p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40146a, SelectDistrictInternalAction, SelectDistrictState, InterfaceC40147b> qVar) {
        q<InterfaceC40146a, SelectDistrictInternalAction, SelectDistrictState, InterfaceC40147b> qVar2 = qVar;
        qVar2.f92008d = this.f265800l;
        qVar2.f92009e = this.f265801m;
        qVar2.f92011g = new o(this.f265802n, this.f265803o);
        qVar2.f92010f = this.f265804p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
