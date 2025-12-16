package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import bh.AbstractC25650c;
import bh.InterfaceC25648a;
import bh.InterfaceC25649b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.BarcodeScannerInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BarcodeScannerFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lbh/a;", "Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerInternalAction;", "Lbh/c;", "Lbh/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC25648a, BarcodeScannerInternalAction, AbstractC25650c, InterfaceC25649b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f99016l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f99017m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f99018n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f99019o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f99020p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j f99021q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, f fVar, ScreenPerformanceTracker screenPerformanceTracker, r rVar, p pVar, j jVar) {
        super(1);
        this.f99016l = hVar;
        this.f99017m = fVar;
        this.f99018n = screenPerformanceTracker;
        this.f99019o = rVar;
        this.f99020p = pVar;
        this.f99021q = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC25648a, BarcodeScannerInternalAction, AbstractC25650c, InterfaceC25649b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC25648a, BarcodeScannerInternalAction, AbstractC25650c, InterfaceC25649b> qVar2 = qVar;
        qVar2.f92008d = this.f99016l;
        qVar2.f92009e = this.f99017m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f99018n, this.f99019o);
        qVar2.f92010f = this.f99020p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        qVar2.f92014j = new com.avito.android.arch.mvi.r(true, true);
        this.f99021q.b();
        return G0.f406611a;
    }
}
