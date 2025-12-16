package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.entity.SleepingPlacesInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import wf0.C49618c;
import wf0.InterfaceC49616a;
import wf0.InterfaceC49617b;

/* compiled from: SleepingPlacesFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lwf0/a;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/entity/SleepingPlacesInternalAction;", "Lwf0/c;", "Lwf0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements l<q<InterfaceC49616a, SleepingPlacesInternalAction, C49618c, InterfaceC49617b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.c f244962l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.a f244963m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f244964n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.g f244965o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.e f244966p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.c cVar, com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.a aVar, ScreenPerformanceTracker screenPerformanceTracker, com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.g gVar, com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.e eVar) {
        super(1);
        this.f244962l = cVar;
        this.f244963m = aVar;
        this.f244964n = screenPerformanceTracker;
        this.f244965o = gVar;
        this.f244966p = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC49616a, SleepingPlacesInternalAction, C49618c, InterfaceC49617b> qVar) {
        q<InterfaceC49616a, SleepingPlacesInternalAction, C49618c, InterfaceC49617b> qVar2 = qVar;
        qVar2.f92008d = this.f244962l;
        qVar2.f92009e = this.f244963m;
        qVar2.f92011g = new o(this.f244964n, this.f244965o);
        qVar2.f92010f = this.f244966p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
