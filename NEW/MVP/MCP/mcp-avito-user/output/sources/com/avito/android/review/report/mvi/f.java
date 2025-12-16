package com.avito.android.review.report.mvi;

import cn0.AbstractC27228a;
import cn0.AbstractC27229b;
import cn0.C27230c;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.review.report.mvi.entity.ComfortableDealReviewsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComfortableDealReviewsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcn0/a;", "Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction;", "Lcn0/c;", "Lcn0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.l<q<AbstractC27228a, ComfortableDealReviewsInternalAction, C27230c, AbstractC27229b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f255415l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f255416m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f255417n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f255418o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f255419p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f255415l = dVar;
        this.f255416m = aVar;
        this.f255417n = screenPerformanceTracker;
        this.f255418o = kVar;
        this.f255419p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<AbstractC27228a, ComfortableDealReviewsInternalAction, C27230c, AbstractC27229b> qVar) {
        q<AbstractC27228a, ComfortableDealReviewsInternalAction, C27230c, AbstractC27229b> qVar2 = qVar;
        qVar2.f92009e = this.f255415l;
        qVar2.f92008d = this.f255416m;
        qVar2.f92011g = new o(this.f255417n, this.f255418o);
        qVar2.f92010f = this.f255419p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
