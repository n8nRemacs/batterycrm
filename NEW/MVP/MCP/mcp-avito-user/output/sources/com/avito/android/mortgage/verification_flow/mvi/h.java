package com.avito.android.mortgage.verification_flow.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage.verification_flow.mvi.entity.VerificationFlowInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import s10.C47959c;
import s10.InterfaceC47957a;
import s10.InterfaceC47958b;

/* compiled from: VerificationFlowFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ls10/a;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction;", "Ls10/c;", "Ls10/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.l<q<InterfaceC47957a, VerificationFlowInternalAction, C47959c, InterfaceC47958b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f203920l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f203921m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f203922n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f203923o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f203924p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, f fVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar) {
        super(1);
        this.f203920l = aVar;
        this.f203921m = fVar;
        this.f203922n = cVar;
        this.f203923o = screenPerformanceTracker;
        this.f203924p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC47957a, VerificationFlowInternalAction, C47959c, InterfaceC47958b> qVar) {
        q<InterfaceC47957a, VerificationFlowInternalAction, C47959c, InterfaceC47958b> qVar2 = qVar;
        qVar2.f92009e = this.f203920l;
        qVar2.f92010f = this.f203921m;
        qVar2.f92008d = this.f203922n;
        qVar2.f92011g = new o(this.f203923o, this.f203924p);
        return G0.f406611a;
    }
}
