package com.avito.android.mortgage.pre_approval.result.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PreApprovalResultFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LW00/a;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "LX00/a;", "LW00/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.l<q<W00.a, PreApprovalResultInternalAction, X00.a, W00.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f202137l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f202138m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f202139n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f202140o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f f202141p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, a aVar, f fVar) {
        super(1);
        this.f202137l = dVar;
        this.f202138m = screenPerformanceTracker;
        this.f202139n = kVar;
        this.f202140o = aVar;
        this.f202141p = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<W00.a, PreApprovalResultInternalAction, X00.a, W00.c> qVar) {
        q<W00.a, PreApprovalResultInternalAction, X00.a, W00.c> qVar2 = qVar;
        qVar2.f92008d = this.f202137l;
        qVar2.f92011g = new o(this.f202138m, this.f202139n);
        qVar2.f92009e = this.f202140o;
        qVar2.f92010f = this.f202141p;
        return G0.f406611a;
    }
}
