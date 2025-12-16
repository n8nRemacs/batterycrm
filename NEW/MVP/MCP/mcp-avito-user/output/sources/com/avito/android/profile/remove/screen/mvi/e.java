package com.avito.android.profile.remove.screen.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.profile.remove.screen.mvi.entity.ProfileRemoveItemsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileRemoveItemsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LM90/a;", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction;", "LM90/c;", "LM90/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.l<q<M90.a, ProfileRemoveItemsInternalAction, M90.c, M90.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f224171l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f224172m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f224173n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f224174o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f224175p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f224171l = cVar;
        this.f224172m = aVar;
        this.f224173n = screenPerformanceTracker;
        this.f224174o = jVar;
        this.f224175p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<M90.a, ProfileRemoveItemsInternalAction, M90.c, M90.b> qVar) {
        q<M90.a, ProfileRemoveItemsInternalAction, M90.c, M90.b> qVar2 = qVar;
        qVar2.f92008d = this.f224171l;
        qVar2.f92009e = this.f224172m;
        qVar2.f92011g = new o(this.f224173n, this.f224174o);
        qVar2.f92010f = this.f224175p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
