package com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameInternalAction;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SetProfileNameFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LV50/a;", "Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameInternalAction;", "Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameState;", "LV50/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.l<q<V50.a, SetProfileNameInternalAction, SetProfileNameState, V50.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f212184l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f212185m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f212186n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f212187o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f212188p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f212184l = hVar;
        this.f212185m = eVar;
        this.f212186n = screenPerformanceTracker;
        this.f212187o = oVar;
        this.f212188p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<V50.a, SetProfileNameInternalAction, SetProfileNameState, V50.b> qVar) {
        q<V50.a, SetProfileNameInternalAction, SetProfileNameState, V50.b> qVar2 = qVar;
        qVar2.f92008d = this.f212184l;
        qVar2.f92009e = this.f212185m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f212186n, this.f212187o);
        qVar2.f92010f = this.f212188p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
