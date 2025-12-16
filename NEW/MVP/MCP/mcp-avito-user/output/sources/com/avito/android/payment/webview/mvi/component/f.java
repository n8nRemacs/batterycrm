package com.avito.android.payment.webview.mvi.component;

import com.avito.android.payment.webview.mvi.entity.WebPaymentMviState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import x60.InterfaceC49775a;

/* compiled from: WebPaymentMviActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx60/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lx60/b;", "<anonymous>", "(Lx60/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.payment.webview.mvi.component.WebPaymentMviActor$process$processActionsFlow$1", f = "WebPaymentMviActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC49775a, Continuation<? super InterfaceC43160i<? extends x60.b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f214890q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f214891r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<WebPaymentMviState> f214892s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(a aVar, Y41.a<? extends WebPaymentMviState> aVar2, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f214891r = aVar;
        this.f214892s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f214891r, this.f214892s, continuation);
        fVar.f214890q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC49775a interfaceC49775a, Continuation<? super InterfaceC43160i<? extends x60.b>> continuation) {
        return ((f) create(interfaceC49775a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f214891r.b((InterfaceC49775a) this.f214890q, this.f214892s.invoke());
    }
}
