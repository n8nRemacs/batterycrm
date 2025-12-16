package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListInternalAction;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import et.InterfaceC40155a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CvListBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListState;", "Let/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.l<com.avito.android.arch.mvi.q<com.avito.android.crm_paid_cvs.features.cv_list.entity.a, CvListInternalAction, CvListState, InterfaceC40155a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f130565l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f130566m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f130567n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f130568o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f130569p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f130565l = dVar;
        this.f130566m = bVar;
        this.f130567n = screenPerformanceTracker;
        this.f130568o = oVar;
        this.f130569p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<com.avito.android.crm_paid_cvs.features.cv_list.entity.a, CvListInternalAction, CvListState, InterfaceC40155a> qVar) {
        com.avito.android.arch.mvi.q<com.avito.android.crm_paid_cvs.features.cv_list.entity.a, CvListInternalAction, CvListState, InterfaceC40155a> qVar2 = qVar;
        qVar2.f92008d = this.f130565l;
        qVar2.f92009e = this.f130566m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f130567n, this.f130568o);
        qVar2.f92010f = this.f130569p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
