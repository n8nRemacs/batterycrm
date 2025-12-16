package com.avito.android.advert.item.compatibility.v3;

import com.avito.android.advert.item.spare_parts.data.SparePartsCompatibilityV3Holder;
import com.avito.android.util.P2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GarageCompatibilityV3Presenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/advert/item/spare_parts/data/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/util/P2;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.compatibility.v3.GarageCompatibilityV3PresenterImpl$loadSparePartsIfNeeded$1", f = "GarageCompatibilityV3Presenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class m extends SuspendLambda implements Y41.p<P2<? super com.avito.android.advert.item.spare_parts.data.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f74475q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f74476r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f74477s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ GarageCompatibilityV3Item f74478t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, l lVar, GarageCompatibilityV3Item garageCompatibilityV3Item, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f74476r = qVar;
        this.f74477s = lVar;
        this.f74478t = garageCompatibilityV3Item;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f74476r, this.f74477s, this.f74478t, continuation);
        mVar.f74475q = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(P2<? super com.avito.android.advert.item.spare_parts.data.a> p22, Continuation<? super G0> continuation) {
        return ((m) create(p22, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        P2 p22 = (P2) this.f74475q;
        boolean z12 = p22 instanceof P2.c;
        q qVar = this.f74476r;
        if (z12) {
            qVar.c0();
        } else {
            boolean z13 = p22 instanceof P2.b;
            l lVar = this.f74477s;
            if (z13) {
                P2.b bVar = (P2.b) p22;
                SparePartsCompatibilityV3Holder f80440b = ((com.avito.android.advert.item.spare_parts.data.a) bVar.f318720a).getF80440b();
                lVar.f74472h = f80440b;
                lVar.O(qVar, f80440b, this.f74478t.f74397d);
                lVar.f74466b.b(((com.avito.android.advert.item.spare_parts.data.a) bVar.f318720a).getF80442d());
            } else if (p22 instanceof P2.a) {
                lVar.f74473i = true;
                qVar.hide();
            }
        }
        return G0.f406611a;
    }
}
