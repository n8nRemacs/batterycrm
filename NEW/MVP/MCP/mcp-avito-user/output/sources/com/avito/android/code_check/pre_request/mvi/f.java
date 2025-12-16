package com.avito.android.code_check.pre_request.mvi;

import So.InterfaceC15208a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.code_check.pre_request.mvi.entity.PreRequestInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PreRequestFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction;", "LSo/b;", "LSo/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.l<q<Object, PreRequestInternalAction, So.b, InterfaceC15208a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f119214l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f119215m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f119216n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f119217o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f119214l = aVar;
        this.f119215m = screenPerformanceTracker;
        this.f119216n = kVar;
        this.f119217o = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<Object, PreRequestInternalAction, So.b, InterfaceC15208a> qVar) {
        q<Object, PreRequestInternalAction, So.b, InterfaceC15208a> qVar2 = qVar;
        qVar2.f92008d = this.f119214l;
        qVar2.f92011g = new o(this.f119215m, this.f119216n);
        qVar2.f92010f = this.f119217o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
