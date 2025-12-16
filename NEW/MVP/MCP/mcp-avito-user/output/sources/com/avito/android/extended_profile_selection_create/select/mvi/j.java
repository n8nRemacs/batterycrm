package com.avito.android.extended_profile_selection_create.select.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateInternalAction;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileSelectionCreateFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LRA/a;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateState;", "LRA/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j extends N implements Y41.l<q<RA.a, ExtendedProfileSelectionCreateInternalAction, ExtendedProfileSelectionCreateState, RA.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f152390l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f152391m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f152392n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f152393o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f152394p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, f fVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f152390l = hVar;
        this.f152391m = fVar;
        this.f152392n = screenPerformanceTracker;
        this.f152393o = oVar;
        this.f152394p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<RA.a, ExtendedProfileSelectionCreateInternalAction, ExtendedProfileSelectionCreateState, RA.b> qVar) {
        q<RA.a, ExtendedProfileSelectionCreateInternalAction, ExtendedProfileSelectionCreateState, RA.b> qVar2 = qVar;
        qVar2.f92008d = this.f152390l;
        qVar2.f92009e = this.f152391m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f152392n, this.f152393o);
        qVar2.f92010f = this.f152394p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
