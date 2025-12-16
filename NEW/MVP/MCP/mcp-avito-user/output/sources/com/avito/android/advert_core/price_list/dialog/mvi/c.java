package com.avito.android.advert_core.price_list.dialog.mvi;

import Y41.l;
import com.avito.android.advert_core.price_list.dialog.mvi.entity.AdvertPriceListBottomSheetDialogInternalAction;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertPriceListBottomSheetDialogFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "", "Lcom/avito/android/advert_core/price_list/dialog/mvi/entity/AdvertPriceListBottomSheetDialogInternalAction;", "LN9/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements l<q<Object, AdvertPriceListBottomSheetDialogInternalAction, N9.a, Object>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f84083l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f84084m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f84085n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ScreenPerformanceTracker screenPerformanceTracker, f fVar) {
        super(1);
        this.f84083l = aVar;
        this.f84084m = screenPerformanceTracker;
        this.f84085n = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<Object, AdvertPriceListBottomSheetDialogInternalAction, N9.a, Object> qVar) {
        q<Object, AdvertPriceListBottomSheetDialogInternalAction, N9.a, Object> qVar2 = qVar;
        qVar2.f92008d = this.f84083l;
        qVar2.f92011g = new o(this.f84084m, this.f84085n);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
