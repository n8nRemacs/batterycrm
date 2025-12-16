package com.avito.android.authorization.complete_registration.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.arch.mvi.r;
import com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction;
import ee.InterfaceC40093a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompleteRegistrationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lee/a;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lee/c;", "Lee/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<q<InterfaceC40093a, CompleteRegistrationInternalAction, ee.c, ee.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f93457l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f93458m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f93459n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f93460o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f93457l = aVar;
        this.f93458m = screenPerformanceTracker;
        this.f93459n = mVar;
        this.f93460o = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40093a, CompleteRegistrationInternalAction, ee.c, ee.b> qVar) {
        q<InterfaceC40093a, CompleteRegistrationInternalAction, ee.c, ee.b> qVar2 = qVar;
        qVar2.f92009e = this.f93457l;
        qVar2.f92011g = new o(this.f93458m, this.f93459n);
        qVar2.f92010f = this.f93460o;
        qVar2.f92014j = new r(false, true, 1, null);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
