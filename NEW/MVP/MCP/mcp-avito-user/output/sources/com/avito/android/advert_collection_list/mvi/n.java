package com.avito.android.advert_collection_list.mvi;

import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction;
import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListState;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertCollectionListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LQ7/a;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListState;", "LQ7/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class n extends N implements Y41.l<com.avito.android.arch.mvi.q<Q7.a, AdvertCollectionListInternalAction, AdvertCollectionListState, Q7.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f82286l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f82287m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f82288n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s f82289o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f82290p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, s sVar, q qVar) {
        super(1);
        this.f82286l = kVar;
        this.f82287m = gVar;
        this.f82288n = screenPerformanceTracker;
        this.f82289o = sVar;
        this.f82290p = qVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<Q7.a, AdvertCollectionListInternalAction, AdvertCollectionListState, Q7.b> qVar) {
        com.avito.android.arch.mvi.q<Q7.a, AdvertCollectionListInternalAction, AdvertCollectionListState, Q7.b> qVar2 = qVar;
        qVar2.f92008d = this.f82286l;
        qVar2.f92009e = this.f82287m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f82288n, this.f82289o);
        qVar2.f92010f = this.f82290p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
