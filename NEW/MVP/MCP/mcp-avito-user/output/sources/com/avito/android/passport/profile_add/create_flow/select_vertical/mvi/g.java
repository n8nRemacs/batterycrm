package com.avito.android.passport.profile_add.create_flow.select_vertical.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.entity.SelectVerticalInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectVerticalFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LU50/a;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "LU50/c;", "LU50/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.l<q<U50.a, SelectVerticalInternalAction, U50.c, U50.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f211970l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f211971m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f211972n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f211973o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f211974p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f211970l = eVar;
        this.f211971m = cVar;
        this.f211972n = screenPerformanceTracker;
        this.f211973o = lVar;
        this.f211974p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<U50.a, SelectVerticalInternalAction, U50.c, U50.b> qVar) {
        q<U50.a, SelectVerticalInternalAction, U50.c, U50.b> qVar2 = qVar;
        qVar2.f92008d = this.f211970l;
        qVar2.f92009e = this.f211971m;
        qVar2.f92011g = new o(this.f211972n, this.f211973o);
        qVar2.f92010f = this.f211974p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
