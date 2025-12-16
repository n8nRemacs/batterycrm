package com.avito.beduin.v2.handler.flow.processor;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.beduin.v2.logger.LogLevel;
import eU0.C40052a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: InteractionsProcessor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"I", "Lkotlinx/coroutines/flow/i;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/i;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$flattenDebounce$1", f = "InteractionsProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<InterfaceC43160i<Object>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C40052a f337210q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C40052a c40052a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f337210q = c40052a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f337210q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43160i<Object> interfaceC43160i, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43160i, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (1 >= RU0.b.f14469c) {
            RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":InteractionsProcessor"), "~ before debounce " + this.f337210q);
        }
        return G0.f406611a;
    }
}
