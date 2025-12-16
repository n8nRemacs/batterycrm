package com.avito.android.document_verification_status_screen.mvi;

import Fx.AbstractC13848a;
import Fx.AbstractC13849b;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VerificationStatusActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LFx/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.document_verification_status_screen.mvi.VerificationStatusActor$process$2", f = "VerificationStatusActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AbstractC13849b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f144841q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC13848a f144842r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, AbstractC13848a abstractC13848a, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f144841q = eVar;
        this.f144842r = abstractC13848a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f144841q, this.f144842r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AbstractC13849b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b.a.a(this.f144841q.f144848a, ((AbstractC13848a.d) this.f144842r).f6044a, null, null, 6);
        return G0.f406611a;
    }
}
