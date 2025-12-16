package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacFinishedFeedbackScreenFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LWK/a;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenState;", "LWK/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements l<q<WK.a, IacFinishedFeedbackScreenInternalAction, IacFinishedFeedbackScreenState, WK.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f166688l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f166689m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f166690n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f166691o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, e eVar) {
        super(1);
        this.f166688l = cVar;
        this.f166689m = screenPerformanceTracker;
        this.f166690n = jVar;
        this.f166691o = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<WK.a, IacFinishedFeedbackScreenInternalAction, IacFinishedFeedbackScreenState, WK.b> qVar) {
        q<WK.a, IacFinishedFeedbackScreenInternalAction, IacFinishedFeedbackScreenState, WK.b> qVar2 = qVar;
        qVar2.f92009e = this.f166688l;
        qVar2.f92011g = new o(this.f166689m, this.f166690n);
        qVar2.f92010f = this.f166691o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
