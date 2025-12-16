package com.avito.android.mortgage.document_requirements.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DocumentRequirementsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lb00/a;", "Lcom/avito/android/mortgage/document_requirements/mvi/entity/DocumentRequirementsInternalAction;", "Lb00/b;", "", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements l<q, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f198984l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f198985m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f198986n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f198987o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, ScreenPerformanceTracker screenPerformanceTracker, h hVar, c cVar) {
        super(1);
        this.f198984l = aVar;
        this.f198985m = screenPerformanceTracker;
        this.f198986n = hVar;
        this.f198987o = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(q qVar) {
        q qVar2 = qVar;
        qVar2.f92009e = this.f198984l;
        qVar2.f92011g = new o(this.f198985m, this.f198986n);
        qVar2.f92008d = this.f198987o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
