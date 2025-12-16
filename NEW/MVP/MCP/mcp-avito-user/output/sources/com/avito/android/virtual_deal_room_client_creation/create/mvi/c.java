package com.avito.android.virtual_deal_room_client_creation.create.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.virtual_deal_room_client_creation.create.mvi.entity.CreateInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CreateFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LRN0/a;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "LRN0/c;", "LRN0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements l<q<RN0.a, CreateInternalAction, RN0.c, RN0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f326851l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f326852m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f326853n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f326854o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ScreenPerformanceTracker screenPerformanceTracker, h hVar, f fVar) {
        super(1);
        this.f326851l = aVar;
        this.f326852m = screenPerformanceTracker;
        this.f326853n = hVar;
        this.f326854o = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<RN0.a, CreateInternalAction, RN0.c, RN0.b> qVar) {
        q<RN0.a, CreateInternalAction, RN0.c, RN0.b> qVar2 = qVar;
        qVar2.f92009e = this.f326851l;
        qVar2.f92011g = new o(this.f326852m, this.f326853n);
        qVar2.f92010f = this.f326854o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
