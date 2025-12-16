package com.avito.android.wallet.page.history.mvi.component;

import VO0.a;
import com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PaymentHistoryActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.page.history.mvi.component.PaymentHistoryActor$process$3", f = "PaymentHistoryActor.kt", i = {}, l = {54, 60, 65, 76}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PaymentHistoryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f328018q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f328019r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VO0.a f328020s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f328021t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ VO0.d f328022u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(VO0.a aVar, a aVar2, VO0.d dVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f328020s = aVar;
        this.f328021t = aVar2;
        this.f328022u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f328020s, this.f328021t, this.f328022u, continuation);
        dVar.f328019r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PaymentHistoryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f328018q;
        boolean z12 = true;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f328019r;
            VO0.a aVar = this.f328020s;
            boolean z13 = aVar instanceof a.d;
            a aVar2 = this.f328021t;
            if (z13) {
                m mVar = aVar2.f328001a;
                mVar.getClass();
                InterfaceC43160i interfaceC43160iG = C43175k.G(new k(mVar, null));
                this.f328018q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (aVar instanceof a.b ? true : L.f(aVar, a.e.f17108a)) {
                    String str = this.f328022u.f17125c;
                    if (str != null && str.length() != 0) {
                        z12 = false;
                    }
                    if (!z12) {
                        m mVar2 = aVar2.f328001a;
                        mVar2.getClass();
                        InterfaceC43160i interfaceC43160iG2 = C43175k.G(new l(mVar2, str, null));
                        this.f328018q = 2;
                        if (C43175k.u(this, interfaceC43160iG2, interfaceC43172j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (aVar instanceof a.c) {
                    PaymentHistoryInternalAction.StartActivity startActivity = new PaymentHistoryInternalAction.StartActivity(aVar2.f328002b.d(((a.c) aVar).f17106a.f17112a));
                    this.f328018q = 3;
                    if (interfaceC43172j.emit(startActivity, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar instanceof a.C1177a) {
                    aVar2.f328003c.c(new MO0.e());
                    PaymentHistoryInternalAction.OpenRefundInfoBanner openRefundInfoBanner = PaymentHistoryInternalAction.OpenRefundInfoBanner.f328075b;
                    this.f328018q = 4;
                    if (interfaceC43172j.emit(openRefundInfoBanner, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
