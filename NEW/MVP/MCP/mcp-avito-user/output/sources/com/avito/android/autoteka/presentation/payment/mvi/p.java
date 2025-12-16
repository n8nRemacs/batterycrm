package com.avito.android.autoteka.presentation.payment.mvi;

import Nf.InterfaceC14568a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaPaymentFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LNf/a;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState;", "LNf/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class p extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC14568a, AutotekaPaymentInternalAction, AutotekaPaymentState, Nf.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f97507l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f97508m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f97509n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A f97510o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s f97511p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, i iVar, ScreenPerformanceTracker screenPerformanceTracker, A a12, s sVar) {
        super(1);
        this.f97507l = mVar;
        this.f97508m = iVar;
        this.f97509n = screenPerformanceTracker;
        this.f97510o = a12;
        this.f97511p = sVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC14568a, AutotekaPaymentInternalAction, AutotekaPaymentState, Nf.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC14568a, AutotekaPaymentInternalAction, AutotekaPaymentState, Nf.b> qVar2 = qVar;
        qVar2.f92008d = this.f97507l;
        qVar2.f92009e = this.f97508m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f97509n, this.f97510o);
        qVar2.f92010f = this.f97511p;
        return G0.f406611a;
    }
}
