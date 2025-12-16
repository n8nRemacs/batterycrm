package com.avito.android.player.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.player.mvi.entity.PlayerInternalAction;
import com.avito.android.player.mvi.entity.PlayerMviState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlayerFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LD80/a;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "Lcom/avito/android/player/mvi/entity/PlayerMviState;", "LD80/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<q<D80.a, PlayerInternalAction, PlayerMviState, D80.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f220189l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f220190m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f220191n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f220192o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f220193p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f220189l = eVar;
        this.f220190m = aVar;
        this.f220191n = screenPerformanceTracker;
        this.f220192o = lVar;
        this.f220193p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<D80.a, PlayerInternalAction, PlayerMviState, D80.b> qVar) {
        q<D80.a, PlayerInternalAction, PlayerMviState, D80.b> qVar2 = qVar;
        qVar2.f92008d = this.f220189l;
        qVar2.f92009e = this.f220190m;
        qVar2.f92011g = new o(this.f220191n, this.f220192o);
        qVar2.f92010f = this.f220193p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
