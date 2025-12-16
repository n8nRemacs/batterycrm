package com.avito.android.advert_collection.mvi;

import com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction;
import com.avito.android.advert_collection.mvi.entity.AdvertCollectionState;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertCollectionFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LI7/a;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionState;", "LI7/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j extends N implements Y41.l<com.avito.android.arch.mvi.q<I7.a, AdvertCollectionInternalAction, AdvertCollectionState, I7.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f81669l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f81670m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f81671n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f81672o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f81673p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f81669l = hVar;
        this.f81670m = eVar;
        this.f81671n = screenPerformanceTracker;
        this.f81672o = oVar;
        this.f81673p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<I7.a, AdvertCollectionInternalAction, AdvertCollectionState, I7.b> qVar) {
        com.avito.android.arch.mvi.q<I7.a, AdvertCollectionInternalAction, AdvertCollectionState, I7.b> qVar2 = qVar;
        qVar2.f92008d = this.f81669l;
        qVar2.f92009e = this.f81670m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f81671n, this.f81672o);
        qVar2.f92010f = this.f81673p;
        AW.a aVar = AW.a.f430a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(aVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
