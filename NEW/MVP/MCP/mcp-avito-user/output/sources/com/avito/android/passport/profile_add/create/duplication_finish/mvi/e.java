package com.avito.android.passport.profile_add.create.duplication_finish.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.create.duplication_finish.mvi.entity.BusinessVerificationDuplicationFinishInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BusinessVerificationDuplicationFinishFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LP50/a;", "Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction;", "LP50/c;", "LP50/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements l<q<P50.a, BusinessVerificationDuplicationFinishInternalAction, P50.c, P50.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f211314l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f211315m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f211316n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f211317o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f211318p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f211314l = cVar;
        this.f211315m = aVar;
        this.f211316n = screenPerformanceTracker;
        this.f211317o = jVar;
        this.f211318p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<P50.a, BusinessVerificationDuplicationFinishInternalAction, P50.c, P50.b> qVar) {
        q<P50.a, BusinessVerificationDuplicationFinishInternalAction, P50.c, P50.b> qVar2 = qVar;
        qVar2.f92008d = this.f211314l;
        qVar2.f92009e = this.f211315m;
        qVar2.f92011g = new o(this.f211316n, this.f211317o);
        qVar2.f92010f = this.f211318p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
