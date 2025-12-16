package com.avito.android.gig_motivation_payment.ui.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vH.InterfaceC49211a;

/* compiled from: MotivationPaymentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_motivation_payment.ui.mvi.MotivationPaymentActor$process$1", f = "MotivationPaymentActor.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MotivationPaymentInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f160221q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f160222r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49211a f160223s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f160224t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC49211a interfaceC49211a, h hVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f160223s = interfaceC49211a;
        this.f160224t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f160223s, this.f160224t, continuation);
        dVar.f160222r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MotivationPaymentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f160221q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f160222r;
            InterfaceC49211a.e eVar = (InterfaceC49211a.e) this.f160223s;
            sH.j jVar = eVar.f440631b;
            if (jVar != null) {
                MotivationPaymentInternalAction.f fVar = new MotivationPaymentInternalAction.f(jVar);
                this.f160221q = 1;
                if (interfaceC43172j.emit(fVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                DeepLink deepLink = eVar.f440630a;
                if (deepLink != null) {
                    b.a.a(this.f160224t.f160241b, deepLink, null, null, 6);
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
