package com.avito.android.passport.profile_add.create_flow.select_specific.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.create_flow.select_specific.mvi.entity.SelectSpecificInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectSpecificFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LT50/a;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/mvi/entity/SelectSpecificInternalAction;", "LT50/c;", "LT50/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.l<q<T50.a, SelectSpecificInternalAction, T50.c, T50.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f211749l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f211750m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f211751n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f211752o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f211753p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f211749l = eVar;
        this.f211750m = cVar;
        this.f211751n = screenPerformanceTracker;
        this.f211752o = lVar;
        this.f211753p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<T50.a, SelectSpecificInternalAction, T50.c, T50.b> qVar) {
        q<T50.a, SelectSpecificInternalAction, T50.c, T50.b> qVar2 = qVar;
        qVar2.f92008d = this.f211749l;
        qVar2.f92009e = this.f211750m;
        qVar2.f92011g = new o(this.f211751n, this.f211752o);
        qVar2.f92010f = this.f211753p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
