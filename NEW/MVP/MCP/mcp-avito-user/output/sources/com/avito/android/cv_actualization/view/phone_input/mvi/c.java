package com.avito.android.cv_actualization.view.phone_input.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.cv_actualization.view.phone_input.mvi.entity.JsxCvActualizationPhoneInputInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import tt.AbstractC48713a;
import tt.AbstractC48714b;

/* compiled from: JsxCvActualizationPhoneInputFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ltt/a;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "Ltt/c;", "Ltt/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements l<q<AbstractC48713a, JsxCvActualizationPhoneInputInternalAction, tt.c, AbstractC48714b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f131285l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f131286m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f131287n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f131288o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ScreenPerformanceTracker screenPerformanceTracker, h hVar, f fVar) {
        super(1);
        this.f131285l = aVar;
        this.f131286m = screenPerformanceTracker;
        this.f131287n = hVar;
        this.f131288o = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<AbstractC48713a, JsxCvActualizationPhoneInputInternalAction, tt.c, AbstractC48714b> qVar) {
        q<AbstractC48713a, JsxCvActualizationPhoneInputInternalAction, tt.c, AbstractC48714b> qVar2 = qVar;
        qVar2.f92009e = this.f131285l;
        qVar2.f92011g = new o(this.f131286m, this.f131287n);
        qVar2.f92010f = this.f131288o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
