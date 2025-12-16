package com.avito.android.category.mvi;

import Pn.InterfaceC14813a;
import Pn.InterfaceC14814b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.category.mvi.entity.CategoryInternalAction;
import com.avito.android.category.mvi.entity.CategoryState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LPn/a;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "Lcom/avito/android/category/mvi/entity/CategoryState;", "LPn/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC14813a, CategoryInternalAction, CategoryState, InterfaceC14814b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f116708l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f116709m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f116710n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f116711o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f116712p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, f fVar, ScreenPerformanceTracker screenPerformanceTracker, q qVar, n nVar) {
        super(1);
        this.f116708l = hVar;
        this.f116709m = fVar;
        this.f116710n = screenPerformanceTracker;
        this.f116711o = qVar;
        this.f116712p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC14813a, CategoryInternalAction, CategoryState, InterfaceC14814b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC14813a, CategoryInternalAction, CategoryState, InterfaceC14814b> qVar2 = qVar;
        qVar2.f92008d = this.f116708l;
        qVar2.f92009e = this.f116709m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f116710n, this.f116711o);
        qVar2.f92010f = this.f116712p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
