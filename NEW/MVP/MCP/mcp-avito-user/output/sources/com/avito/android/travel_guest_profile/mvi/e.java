package com.avito.android.travel_guest_profile.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.travel_guest_profile.mvi.entity.TravelGuestProfileInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TravelGuestProfileFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LQE0/a;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "LQE0/d;", "LQE0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.l<q<QE0.a, TravelGuestProfileInternalAction, QE0.d, QE0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f302163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f302164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f302165n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f302166o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f302167p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f302163l = cVar;
        this.f302164m = aVar;
        this.f302165n = screenPerformanceTracker;
        this.f302166o = jVar;
        this.f302167p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<QE0.a, TravelGuestProfileInternalAction, QE0.d, QE0.c> qVar) {
        q<QE0.a, TravelGuestProfileInternalAction, QE0.d, QE0.c> qVar2 = qVar;
        qVar2.f92008d = this.f302163l;
        qVar2.f92009e = this.f302164m;
        qVar2.f92011g = new o(this.f302165n, this.f302166o);
        qVar2.f92010f = this.f302167p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
