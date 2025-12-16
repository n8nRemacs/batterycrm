package com.avito.android.service_booking_details;

import Bt0.InterfaceC13184a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ServiceBookingItemDetailsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_details.ServiceBookingItemDetailsView$collectAttributedTextLinks$1", f = "ServiceBookingItemDetailsView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class q extends SuspendLambda implements Y41.p<DeepLink, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f277480q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f277481r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f277481r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f277481r, continuation);
        qVar.f277480q = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(DeepLink deepLink, Continuation<? super G0> continuation) {
        return ((q) create(deepLink, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        DeepLink deepLink = (DeepLink) this.f277480q;
        Y41.l<? super InterfaceC13184a, G0> lVar = this.f277481r.f277474q;
        if (lVar != null) {
            lVar.invoke(new InterfaceC13184a.d(deepLink));
        }
        return G0.f406611a;
    }
}
