package com.avito.android.important_addresses_selection.presentation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.important_addresses_selection.presentation.mvi.entity.ImportantAddressesSelectionInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImportantAddressesSelectionFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LSM/a;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "LSM/c;", "LSM/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements Y41.l<com.avito.android.arch.mvi.q<SM.a, ImportantAddressesSelectionInternalAction, SM.c, SM.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f169877l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f169878m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f169879n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f169880o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f169877l = bVar;
        this.f169878m = screenPerformanceTracker;
        this.f169879n = jVar;
        this.f169880o = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<SM.a, ImportantAddressesSelectionInternalAction, SM.c, SM.b> qVar) {
        com.avito.android.arch.mvi.q<SM.a, ImportantAddressesSelectionInternalAction, SM.c, SM.b> qVar2 = qVar;
        qVar2.f92009e = this.f169877l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f169878m, this.f169879n);
        qVar2.f92010f = this.f169880o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
