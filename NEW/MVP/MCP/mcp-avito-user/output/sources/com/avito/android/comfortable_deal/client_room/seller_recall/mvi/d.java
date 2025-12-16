package com.avito.android.comfortable_deal.client_room.seller_recall.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallInternalAction;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallState;
import ip.InterfaceC42085a;
import ip.InterfaceC42086b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SellerRecallFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lip/a;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallState;", "Lip/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements l<q<InterfaceC42085a, SellerRecallInternalAction, SellerRecallState, InterfaceC42086b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f119984l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f119985m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f119986n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f119987o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ScreenPerformanceTracker screenPerformanceTracker, i iVar, g gVar) {
        super(1);
        this.f119984l = bVar;
        this.f119985m = screenPerformanceTracker;
        this.f119986n = iVar;
        this.f119987o = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC42085a, SellerRecallInternalAction, SellerRecallState, InterfaceC42086b> qVar) {
        q<InterfaceC42085a, SellerRecallInternalAction, SellerRecallState, InterfaceC42086b> qVar2 = qVar;
        qVar2.f92009e = this.f119984l;
        qVar2.f92011g = new o(this.f119985m, this.f119986n);
        qVar2.f92010f = this.f119987o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
