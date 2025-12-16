package com.avito.android.verification.verification_fetch_invoice.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.verification.verification_fetch_invoice.mvi.entity.FetchInvoiceInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FetchInvoiceFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LOM0/b;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "LOM0/d;", "LOM0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.l<q<OM0.b, FetchInvoiceInternalAction, OM0.d, OM0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f325212l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f325213m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f325214n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f325215o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f325216p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f325212l = fVar;
        this.f325213m = aVar;
        this.f325214n = screenPerformanceTracker;
        this.f325215o = mVar;
        this.f325216p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<OM0.b, FetchInvoiceInternalAction, OM0.d, OM0.c> qVar) {
        q<OM0.b, FetchInvoiceInternalAction, OM0.d, OM0.c> qVar2 = qVar;
        qVar2.f92008d = this.f325212l;
        qVar2.f92009e = this.f325213m;
        qVar2.f92011g = new o(this.f325214n, this.f325215o);
        qVar2.f92010f = this.f325216p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
