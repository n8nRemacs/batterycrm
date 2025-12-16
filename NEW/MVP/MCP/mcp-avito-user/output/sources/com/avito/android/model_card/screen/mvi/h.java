package com.avito.android.model_card.screen.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.model_card.screen.mvi.entity.ModelCardInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ModelCardFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LFZ/a;", "Lcom/avito/android/model_card/screen/mvi/entity/ModelCardInternalAction;", "LFZ/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.l<q<FZ.a, ModelCardInternalAction, FZ.c, G0>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f198105l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f198106m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f198107n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f198108o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar) {
        super(1);
        this.f198105l = fVar;
        this.f198106m = aVar;
        this.f198107n = screenPerformanceTracker;
        this.f198108o = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<FZ.a, ModelCardInternalAction, FZ.c, G0> qVar) {
        q<FZ.a, ModelCardInternalAction, FZ.c, G0> qVar2 = qVar;
        qVar2.f92008d = this.f198105l;
        qVar2.f92009e = this.f198106m;
        qVar2.f92011g = new o(this.f198107n, this.f198108o);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
