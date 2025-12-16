package com.avito.android.verification.verification_fetch_invoice.mvi;

import OM0.b;
import Y41.p;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.verification.verification_fetch_invoice.mvi.entity.FetchInvoiceInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FetchInvoiceActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_fetch_invoice.mvi.FetchInvoiceActor$process$2", f = "FetchInvoiceActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super FetchInvoiceInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a f325194q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ OM0.b f325195r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OM0.b bVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.f325194q = aVar;
        this.f325195r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f325195r, this.f325194q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FetchInvoiceInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f325194q.f325190b;
        ((b.a) this.f325195r).getClass();
        b.a.a(aVar, null, null, null, 6);
        return G0.f406611a;
    }
}
