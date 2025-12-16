package com.avito.android.extended_profile_selection_create.name.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.extended_profile_selection_create.name.mvi.entity.ExtendedProfileSetSelectionNameInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileSetSelectionNameFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LKA/a;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "LKA/c;", "LKA/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.l<q<KA.a, ExtendedProfileSetSelectionNameInternalAction, KA.c, KA.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f151915l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f151916m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f151917n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f151918o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f151919p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f151915l = eVar;
        this.f151916m = cVar;
        this.f151917n = screenPerformanceTracker;
        this.f151918o = lVar;
        this.f151919p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<KA.a, ExtendedProfileSetSelectionNameInternalAction, KA.c, KA.b> qVar) {
        q<KA.a, ExtendedProfileSetSelectionNameInternalAction, KA.c, KA.b> qVar2 = qVar;
        qVar2.f92008d = this.f151915l;
        qVar2.f92009e = this.f151916m;
        qVar2.f92011g = new o(this.f151917n, this.f151918o);
        qVar2.f92010f = this.f151919p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
