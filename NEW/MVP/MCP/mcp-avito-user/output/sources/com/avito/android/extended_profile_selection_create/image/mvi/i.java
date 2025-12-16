package com.avito.android.extended_profile_selection_create.image.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileSetSelectionImageFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LJA/a;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "LJA/c;", "LJA/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class i extends N implements Y41.l<q<JA.a, ExtendedProfileSetSelectionImageInternalAction, JA.c, JA.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f151786l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f151787m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f151788n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f151789o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f151790p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f151786l = gVar;
        this.f151787m = dVar;
        this.f151788n = screenPerformanceTracker;
        this.f151789o = nVar;
        this.f151790p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<JA.a, ExtendedProfileSetSelectionImageInternalAction, JA.c, JA.b> qVar) {
        q<JA.a, ExtendedProfileSetSelectionImageInternalAction, JA.c, JA.b> qVar2 = qVar;
        qVar2.f92008d = this.f151786l;
        qVar2.f92009e = this.f151787m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f151788n, this.f151789o);
        qVar2.f92010f = this.f151790p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
