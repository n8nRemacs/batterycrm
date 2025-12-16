package com.avito.android.order.feature.mvi;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UniversalMapSelectFailureLink;
import com.avito.android.deep_linking.links.UniversalMapSelectSuccessLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: OrderBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "event", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.order.feature.mvi.OrderBootstrap$observeUniversalMapResult$2", f = "OrderBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class p extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends OrderInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f209688q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f209689r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f209689r = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f209689r, continuation);
        pVar.f209688q = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends OrderInternalAction>> continuation) {
        return ((p) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f209688q).f413261b;
        if (!(interfaceC14249c instanceof WebViewLink.a.c)) {
            return C43175k.w();
        }
        DeepLink deepLink = ((WebViewLink.a.c) interfaceC14249c).f133866b;
        return deepLink instanceof UniversalMapSelectSuccessLink ? this.f209689r.f209692a.a() : deepLink instanceof UniversalMapSelectFailureLink ? new C43210w(new OrderInternalAction.UniversalMapSelectFailure(((UniversalMapSelectFailureLink) deepLink).f133767b)) : C43175k.w();
    }
}
