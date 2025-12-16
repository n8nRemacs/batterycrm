package com.avito.android.category_with_params.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.category_with_params.mvi.entity.CategoryWithParamsInternalAction;
import com.avito.android.category_with_params.mvi.entity.CategoryWithParamsState;
import fo.InterfaceC40453a;
import fo.InterfaceC40454b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryWithParamsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lfo/a;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsState;", "Lfo/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.l<q<InterfaceC40453a, CategoryWithParamsInternalAction, CategoryWithParamsState, InterfaceC40454b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f117699l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f117700m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f117701n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f117702o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f117703p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f117699l = dVar;
        this.f117700m = bVar;
        this.f117701n = screenPerformanceTracker;
        this.f117702o = kVar;
        this.f117703p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40453a, CategoryWithParamsInternalAction, CategoryWithParamsState, InterfaceC40454b> qVar) {
        q<InterfaceC40453a, CategoryWithParamsInternalAction, CategoryWithParamsState, InterfaceC40454b> qVar2 = qVar;
        qVar2.f92008d = this.f117699l;
        qVar2.f92009e = this.f117700m;
        qVar2.f92011g = new o(this.f117701n, this.f117702o);
        qVar2.f92010f = this.f117703p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
