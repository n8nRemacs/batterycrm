package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yt.AbstractC50297a;
import yt.AbstractC50298b;
import yt.C50299c;

/* compiled from: JsxActualizationBottomSheetFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lyt/a;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/entity/JsxActualizationBottomSheetInternalAction;", "Lyt/c;", "Lyt/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.l<q<AbstractC50297a, JsxActualizationBottomSheetInternalAction, C50299c, AbstractC50298b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f131519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f131520m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f131521n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f131522o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f131519l = eVar;
        this.f131520m = screenPerformanceTracker;
        this.f131521n = lVar;
        this.f131522o = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<AbstractC50297a, JsxActualizationBottomSheetInternalAction, C50299c, AbstractC50298b> qVar) {
        q<AbstractC50297a, JsxActualizationBottomSheetInternalAction, C50299c, AbstractC50298b> qVar2 = qVar;
        qVar2.f92009e = this.f131519l;
        qVar2.f92011g = new o(this.f131520m, this.f131521n);
        qVar2.f92010f = this.f131522o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
