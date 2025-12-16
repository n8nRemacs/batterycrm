package com.avito.android.autoteka.presentation.report.mvi;

import Pf.InterfaceC14780a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.autoteka.presentation.report.mvi.entity.AutotekaReportInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaReportFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LPf/a;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "LPf/c;", "LPf/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.l<q<InterfaceC14780a, AutotekaReportInternalAction, Pf.c, Pf.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f97741l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f97742m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f97743n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f97744o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f97745p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f97741l = fVar;
        this.f97742m = dVar;
        this.f97743n = screenPerformanceTracker;
        this.f97744o = mVar;
        this.f97745p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14780a, AutotekaReportInternalAction, Pf.c, Pf.b> qVar) {
        q<InterfaceC14780a, AutotekaReportInternalAction, Pf.c, Pf.b> qVar2 = qVar;
        qVar2.f92008d = this.f97741l;
        qVar2.f92009e = this.f97742m;
        qVar2.f92011g = new o(this.f97743n, this.f97744o);
        qVar2.f92010f = this.f97745p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
