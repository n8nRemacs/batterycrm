package com.avito.android.publish.screen.step.params.mvi;

import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PublishDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.params.mvi.PublishDetailsActor$processViewAction$10", f = "PublishDetailsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.publish.screen.step.params.mvi.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34114h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PublishDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y f241476q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34114h(y yVar, Continuation<? super C34114h> continuation) {
        super(2, continuation);
        this.f241476q = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C34114h(this.f241476q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PublishDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34114h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f241476q.f241505a.e7();
        return G0.f406611a;
    }
}
