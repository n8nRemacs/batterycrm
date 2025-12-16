package com.avito.android.loyalty.ui.badge_details_v3.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.loyalty.ui.badge_details_v3.mvi.entity.BadgeDetailsV3InternalAction;
import fX.C40354b;
import fX.InterfaceC40353a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BadgeDetailsV3FeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LfX/a;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "LfX/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.l<q<InterfaceC40353a, BadgeDetailsV3InternalAction, C40354b, G0>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f183340l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f183341m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f183342n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f183343o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f183344p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f183340l = dVar;
        this.f183341m = bVar;
        this.f183342n = screenPerformanceTracker;
        this.f183343o = kVar;
        this.f183344p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40353a, BadgeDetailsV3InternalAction, C40354b, G0> qVar) {
        q<InterfaceC40353a, BadgeDetailsV3InternalAction, C40354b, G0> qVar2 = qVar;
        qVar2.f92008d = this.f183340l;
        qVar2.f92009e = this.f183341m;
        qVar2.f92011g = new o(this.f183342n, this.f183343o);
        qVar2.f92010f = this.f183344p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
