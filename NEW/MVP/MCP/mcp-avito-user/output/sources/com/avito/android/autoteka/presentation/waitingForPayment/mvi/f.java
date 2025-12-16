package com.avito.android.autoteka.presentation.waitingForPayment.mvi;

import Uf.InterfaceC15514a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentInternalAction;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaWaitingForPaymentFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LUf/a;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState;", "LUf/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.l<q<InterfaceC15514a, AutotekaWaitingForPaymentInternalAction, AutotekaWaitingForPaymentState, Uf.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f97898l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f97899m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f97900n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f97901o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f97902p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f97898l = dVar;
        this.f97899m = bVar;
        this.f97900n = screenPerformanceTracker;
        this.f97901o = kVar;
        this.f97902p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC15514a, AutotekaWaitingForPaymentInternalAction, AutotekaWaitingForPaymentState, Uf.b> qVar) {
        q<InterfaceC15514a, AutotekaWaitingForPaymentInternalAction, AutotekaWaitingForPaymentState, Uf.b> qVar2 = qVar;
        qVar2.f92008d = this.f97898l;
        qVar2.f92009e = this.f97899m;
        qVar2.f92011g = new o(this.f97900n, this.f97901o);
        qVar2.f92010f = this.f97902p;
        return G0.f406611a;
    }
}
