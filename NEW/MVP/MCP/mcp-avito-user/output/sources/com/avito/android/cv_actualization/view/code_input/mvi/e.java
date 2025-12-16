package com.avito.android.cv_actualization.view.code_input.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.cv_actualization.view.code_input.mvi.entity.JsxCvActualizationCodeInputInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qt.AbstractC47436a;

/* compiled from: JsxCvActualizationCodeInputFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lqt/a;", "Lcom/avito/android/cv_actualization/view/code_input/mvi/entity/JsxCvActualizationCodeInputInternalAction;", "Lqt/c;", "Lqt/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements l<q<AbstractC47436a, JsxCvActualizationCodeInputInternalAction, qt.c, qt.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f131202l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f131203m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f131204n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f131205o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f131206p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar, c cVar) {
        super(1);
        this.f131202l = aVar;
        this.f131203m = screenPerformanceTracker;
        this.f131204n = jVar;
        this.f131205o = hVar;
        this.f131206p = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<AbstractC47436a, JsxCvActualizationCodeInputInternalAction, qt.c, qt.b> qVar) {
        q<AbstractC47436a, JsxCvActualizationCodeInputInternalAction, qt.c, qt.b> qVar2 = qVar;
        qVar2.f92009e = this.f131202l;
        qVar2.f92011g = new o(this.f131203m, this.f131204n);
        qVar2.f92010f = this.f131205o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        qVar2.f92008d = this.f131206p;
        return G0.f406611a;
    }
}
