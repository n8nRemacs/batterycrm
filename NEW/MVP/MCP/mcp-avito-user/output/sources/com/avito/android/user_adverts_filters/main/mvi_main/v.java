package com.avito.android.user_adverts_filters.main.mvi_main;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction;
import com.avito.android.util.R0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rJ0.InterfaceC47554a;
import rJ0.InterfaceC47555b;

/* compiled from: MainFiltersFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LrJ0/a;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "LrJ0/c;", "LrJ0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class v extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC47554a, MainFiltersInternalAction, rJ0.c, InterfaceC47555b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f316316l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f316317m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y f316318n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f316319o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R0 f316320p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r rVar, ScreenPerformanceTracker screenPerformanceTracker, y yVar, t tVar, R0 r02) {
        super(1);
        this.f316316l = rVar;
        this.f316317m = screenPerformanceTracker;
        this.f316318n = yVar;
        this.f316319o = tVar;
        this.f316320p = r02;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC47554a, MainFiltersInternalAction, rJ0.c, InterfaceC47555b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC47554a, MainFiltersInternalAction, rJ0.c, InterfaceC47555b> qVar2 = qVar;
        qVar2.f92009e = this.f316316l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f316317m, this.f316318n);
        qVar2.f92010f = this.f316319o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        qVar2.f92013i = this.f316320p.c();
        return G0.f406611a;
    }
}
