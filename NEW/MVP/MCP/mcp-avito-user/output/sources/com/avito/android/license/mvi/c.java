package com.avito.android.license.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.license.mvi.entity.LicenseInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LicenseFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0001*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lkotlin/G0;", "Lcom/avito/android/license/mvi/entity/LicenseInternalAction;", "LYV/a;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements l<q<G0, LicenseInternalAction, YV.a, G0>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f181529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f181530m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f181531n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ScreenPerformanceTracker screenPerformanceTracker, f fVar) {
        super(1);
        this.f181529l = aVar;
        this.f181530m = screenPerformanceTracker;
        this.f181531n = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<G0, LicenseInternalAction, YV.a, G0> qVar) {
        q<G0, LicenseInternalAction, YV.a, G0> qVar2 = qVar;
        qVar2.f92008d = this.f181529l;
        qVar2.f92011g = new o(this.f181530m, this.f181531n);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
