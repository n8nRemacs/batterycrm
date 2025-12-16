package com.avito.android.str_insurance.screen.mvi;

import Zy0.InterfaceC19622a;
import Zy0.InterfaceC19623b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_insurance.screen.mvi.entity.StrInsuranceInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrInsuranceFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LZy0/a;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "LZy0/c;", "LZy0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC19622a, StrInsuranceInternalAction, Zy0.c, InterfaceC19623b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C35128c f288744l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C35126a f288745m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f288746n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f288747o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f288748p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C35128c c35128c, C35126a c35126a, ScreenPerformanceTracker screenPerformanceTracker, v vVar, t tVar) {
        super(1);
        this.f288744l = c35128c;
        this.f288745m = c35126a;
        this.f288746n = screenPerformanceTracker;
        this.f288747o = vVar;
        this.f288748p = tVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC19622a, StrInsuranceInternalAction, Zy0.c, InterfaceC19623b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC19622a, StrInsuranceInternalAction, Zy0.c, InterfaceC19623b> qVar2 = qVar;
        qVar2.f92008d = this.f288744l;
        qVar2.f92009e = this.f288745m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f288746n, this.f288747o);
        qVar2.f92010f = this.f288748p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
