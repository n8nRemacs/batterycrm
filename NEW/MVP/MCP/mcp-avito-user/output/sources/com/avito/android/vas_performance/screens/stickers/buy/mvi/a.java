package com.avito.android.vas_performance.screens.stickers.buy.mvi;

import KL0.a;
import Y41.p;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StickersBuyActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.vas_performance.screens.stickers.buy.mvi.StickersBuyActor$process$1", f = "StickersBuyActor.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY, 33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super StickersBuyInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f320696q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f320697r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ KL0.c f320698s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f320699t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ KL0.a f320700u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(KL0.c cVar, b bVar, KL0.a aVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f320698s = cVar;
        this.f320699t = bVar;
        this.f320700u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f320698s, this.f320699t, this.f320700u, continuation);
        aVar.f320697r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StickersBuyInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f320696q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f320697r;
            KL0.c cVar = this.f320698s;
            List<com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a> listA = NL0.a.a(cVar.f9408e);
            if (listA.isEmpty()) {
                DeepLink deepLink = cVar.f9412i;
                n openDeepLink = deepLink != null ? new StickersBuyInternalAction.OpenDeepLink(deepLink) : new StickersBuyInternalAction.CloseScreen(true);
                this.f320696q = 2;
                if (interfaceC43172j.emit(openDeepLink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.c cVar2 = this.f320699t.f320701a;
                List<com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a> list = listA;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a) it.next()).f320661b);
                }
                InterfaceC43160i<StickersBuyInternalAction> interfaceC43160iA = cVar2.a(((a.b) this.f320700u).f9396a, C42745f0.P0(arrayList));
                this.f320696q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
