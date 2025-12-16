package com.avito.android.messenger_icebreakers_dialog.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.messenger_icebreakers_dialog.mvi.entity.MessengerIcebreakerInternalAction;
import iZ.C41367c;
import iZ.InterfaceC41365a;
import iZ.InterfaceC41366b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessengerIcebreakerFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LiZ/a;", "Lcom/avito/android/messenger_icebreakers_dialog/mvi/entity/MessengerIcebreakerInternalAction;", "LiZ/c;", "LiZ/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements l<q<InterfaceC41365a, MessengerIcebreakerInternalAction, C41367c, InterfaceC41366b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f197667l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f197668m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f197669n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ScreenPerformanceTracker screenPerformanceTracker, f fVar) {
        super(1);
        this.f197667l = aVar;
        this.f197668m = screenPerformanceTracker;
        this.f197669n = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC41365a, MessengerIcebreakerInternalAction, C41367c, InterfaceC41366b> qVar) {
        q<InterfaceC41365a, MessengerIcebreakerInternalAction, C41367c, InterfaceC41366b> qVar2 = qVar;
        qVar2.f92008d = this.f197667l;
        qVar2.f92011g = new o(this.f197668m, this.f197669n);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
