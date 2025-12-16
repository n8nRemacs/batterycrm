package com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BusinessVrfDuplicationProfileCreationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LZ50/a;", "Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/entity/BusinessVrfDuplicationInternalAction;", "LZ50/c;", "LZ50/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.l<q<Z50.a, BusinessVrfDuplicationInternalAction, Z50.c, Z50.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f211257l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f211258m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f211259n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f211260o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f211261p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f211257l = fVar;
        this.f211258m = aVar;
        this.f211259n = screenPerformanceTracker;
        this.f211260o = mVar;
        this.f211261p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<Z50.a, BusinessVrfDuplicationInternalAction, Z50.c, Z50.b> qVar) {
        q<Z50.a, BusinessVrfDuplicationInternalAction, Z50.c, Z50.b> qVar2 = qVar;
        qVar2.f92008d = this.f211257l;
        qVar2.f92009e = this.f211258m;
        qVar2.f92011g = new o(this.f211259n, this.f211260o);
        qVar2.f92010f = this.f211261p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
