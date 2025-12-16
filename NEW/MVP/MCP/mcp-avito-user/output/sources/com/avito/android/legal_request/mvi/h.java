package com.avito.android.legal_request.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.arch.mvi.r;
import com.avito.android.legal_request.mvi.entity.LegalRequestInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sR.C48100c;
import sR.InterfaceC48098a;
import sR.InterfaceC48099b;

/* compiled from: LegalRequestFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LsR/a;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "LsR/c;", "LsR/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.l<q<InterfaceC48098a, LegalRequestInternalAction, C48100c, InterfaceC48099b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f175278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f175279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f175280n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f175281o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f175282p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, f fVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f175278l = dVar;
        this.f175279m = fVar;
        this.f175280n = screenPerformanceTracker;
        this.f175281o = mVar;
        this.f175282p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC48098a, LegalRequestInternalAction, C48100c, InterfaceC48099b> qVar) {
        q<InterfaceC48098a, LegalRequestInternalAction, C48100c, InterfaceC48099b> qVar2 = qVar;
        qVar2.f92009e = this.f175278l;
        qVar2.f92008d = this.f175279m;
        qVar2.f92011g = new o(this.f175280n, this.f175281o);
        qVar2.f92010f = this.f175282p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        r.f92017c.getClass();
        qVar2.f92014j = new r(r.f92018d.f92019a, true);
        return G0.f406611a;
    }
}
