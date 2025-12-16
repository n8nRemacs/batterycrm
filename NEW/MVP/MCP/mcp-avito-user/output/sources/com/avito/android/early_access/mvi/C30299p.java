package com.avito.android.early_access.mvi;

import Mx.InterfaceC14538a;
import Mx.InterfaceC14539b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import com.avito.android.early_access.mvi.entity.EarlyAccessState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EarlyAccessFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LMx/a;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessState;", "LMx/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.early_access.mvi.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30299p extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC14538a, EarlyAccessInternalAction, EarlyAccessState, InterfaceC14539b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30297n f145521l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C30292i f145522m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f145523n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C30307y f145524o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C30305w f145525p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30299p(C30297n c30297n, C30292i c30292i, ScreenPerformanceTracker screenPerformanceTracker, C30307y c30307y, C30305w c30305w) {
        super(1);
        this.f145521l = c30297n;
        this.f145522m = c30292i;
        this.f145523n = screenPerformanceTracker;
        this.f145524o = c30307y;
        this.f145525p = c30305w;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC14538a, EarlyAccessInternalAction, EarlyAccessState, InterfaceC14539b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC14538a, EarlyAccessInternalAction, EarlyAccessState, InterfaceC14539b> qVar2 = qVar;
        qVar2.f92008d = this.f145521l;
        qVar2.f92009e = this.f145522m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f145523n, this.f145524o);
        qVar2.f92010f = this.f145525p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
