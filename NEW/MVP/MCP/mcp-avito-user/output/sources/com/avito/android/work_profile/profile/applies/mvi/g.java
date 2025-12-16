package com.avito.android.work_profile.profile.applies.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.work_profile.profile.applies.mvi.entity.AppliesToVacancyInternalAction;
import jQ0.AbstractC42297a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppliesToVacancyFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LjQ0/a;", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction;", "LjQ0/b;", "", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<q<AbstractC42297a, AppliesToVacancyInternalAction, jQ0.b, Object>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f330900l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f330901m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f330902n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f330903o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar) {
        super(1);
        this.f330900l = eVar;
        this.f330901m = cVar;
        this.f330902n = screenPerformanceTracker;
        this.f330903o = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<AbstractC42297a, AppliesToVacancyInternalAction, jQ0.b, Object> qVar) {
        q<AbstractC42297a, AppliesToVacancyInternalAction, jQ0.b, Object> qVar2 = qVar;
        qVar2.f92008d = this.f330900l;
        qVar2.f92009e = this.f330901m;
        qVar2.f92011g = new o(this.f330902n, this.f330903o);
        return G0.f406611a;
    }
}
