package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoV2Actor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.v2.mvi.CpxPromoV2Actor$processHelpClick$1", f = "CpxPromoV2Actor.kt", i = {}, l = {464}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoV2InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f127709q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127710r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2State f127711s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CpxPromoV2State cpxPromoV2State, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f127711s = cpxPromoV2State;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f127711s, continuation);
        hVar.f127710r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DeepLink deepLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f127709q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f127710r;
            CpxPromoV2 cpxPromoV2 = this.f127711s.f127626d;
            if (cpxPromoV2 != null && (deepLink = cpxPromoV2.f127481c.f441547b) != null) {
                CpxPromoV2InternalAction.OpenDeeplink openDeeplink = new CpxPromoV2InternalAction.OpenDeeplink(deepLink, null, 2, null);
                this.f127709q = 1;
                if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
