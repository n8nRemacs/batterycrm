package com.avito.android.advert.item.compatibility.v2;

import Y41.p;
import com.avito.android.remote.models.SparePartsV2Response;
import com.avito.android.util.P2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GarageCompatibilityV2Presenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/models/SparePartsV2Response;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/util/P2;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.compatibility.v2.GarageCompatibilityV2PresenterImpl$loadSparePartsIfNeeded$1", f = "GarageCompatibilityV2Presenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class g extends SuspendLambda implements p<P2<? super SparePartsV2Response>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f74359q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f74360r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f74361s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, h hVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f74360r = lVar;
        this.f74361s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f74360r, this.f74361s, continuation);
        gVar.f74359q = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(P2<? super SparePartsV2Response> p22, Continuation<? super G0> continuation) {
        return ((g) create(p22, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        P2 p22 = (P2) this.f74359q;
        boolean z12 = p22 instanceof P2.c;
        l lVar = this.f74360r;
        if (z12) {
            lVar.c0();
        } else {
            boolean z13 = p22 instanceof P2.b;
            h hVar = this.f74361s;
            if (z13) {
                SparePartsV2Response sparePartsV2Response = (SparePartsV2Response) ((P2.b) p22).f318720a;
                hVar.f74366f = sparePartsV2Response;
                hVar.k(lVar, sparePartsV2Response);
            } else if (p22 instanceof P2.a) {
                hVar.f74367g = true;
                lVar.hide();
            }
        }
        return G0.f406611a;
    }
}
