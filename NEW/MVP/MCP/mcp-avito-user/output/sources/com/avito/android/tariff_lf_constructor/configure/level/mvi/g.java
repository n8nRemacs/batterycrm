package com.avito.android.tariff_lf_constructor.configure.level.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.tariff_lf_constructor.configure.level.mvi.entity.ConstructorConfigureLevelInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mD0.C43952d;
import mD0.InterfaceC43949a;
import mD0.InterfaceC43951c;

/* compiled from: ConstructorConfigureLevelFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LmD0/a;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction;", "LmD0/d;", "LmD0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.l<q<InterfaceC43949a, ConstructorConfigureLevelInternalAction, C43952d, InterfaceC43951c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f299839l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f299840m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f299841n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f299842o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f299843p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f299839l = eVar;
        this.f299840m = cVar;
        this.f299841n = screenPerformanceTracker;
        this.f299842o = lVar;
        this.f299843p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC43949a, ConstructorConfigureLevelInternalAction, C43952d, InterfaceC43951c> qVar) {
        q<InterfaceC43949a, ConstructorConfigureLevelInternalAction, C43952d, InterfaceC43951c> qVar2 = qVar;
        qVar2.f92008d = this.f299839l;
        qVar2.f92009e = this.f299840m;
        qVar2.f92011g = new o(this.f299841n, this.f299842o);
        qVar2.f92010f = this.f299843p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
