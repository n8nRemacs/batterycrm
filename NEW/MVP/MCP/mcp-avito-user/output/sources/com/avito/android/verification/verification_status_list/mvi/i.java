package com.avito.android.verification.verification_status_list.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.verification.verification_status_list.mvi.entity.StatusListInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StatusListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LYM0/a;", "Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction;", "LYM0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements Y41.l<q<YM0.a, StatusListInternalAction, YM0.b, G0>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f325811l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f325812m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f325813n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f325814o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar) {
        super(1);
        this.f325811l = gVar;
        this.f325812m = cVar;
        this.f325813n = screenPerformanceTracker;
        this.f325814o = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<YM0.a, StatusListInternalAction, YM0.b, G0> qVar) {
        q<YM0.a, StatusListInternalAction, YM0.b, G0> qVar2 = qVar;
        qVar2.f92008d = this.f325811l;
        qVar2.f92009e = this.f325812m;
        qVar2.f92011g = new o(this.f325813n, this.f325814o);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
