package com.avito.android.autoteka.presentation.choosingPurchase.mvi;

import Hf.InterfaceC13983a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.entity.AutotekaChoosingPurchaseInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaChoosingPurchaseFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LHf/a;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "LHf/c;", "LHf/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC13983a, AutotekaChoosingPurchaseInternalAction, Hf.c, Hf.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f97196l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f97197m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f97198n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f97199o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, b bVar, n nVar, ScreenPerformanceTracker screenPerformanceTracker) {
        super(1);
        this.f97196l = fVar;
        this.f97197m = bVar;
        this.f97198n = nVar;
        this.f97199o = screenPerformanceTracker;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC13983a, AutotekaChoosingPurchaseInternalAction, Hf.c, Hf.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC13983a, AutotekaChoosingPurchaseInternalAction, Hf.c, Hf.b> qVar2 = qVar;
        qVar2.f92008d = this.f97196l;
        qVar2.f92009e = this.f97197m;
        qVar2.f92010f = this.f97198n;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f97199o, p.f97212b);
        return G0.f406611a;
    }
}
