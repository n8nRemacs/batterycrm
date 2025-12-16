package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BeduinActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.mvi.BeduinActor$process$5", f = "BeduinActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BeduinInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f176252q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40047a f176253r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, InterfaceC40047a interfaceC40047a, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f176252q = gVar;
        this.f176253r = interfaceC40047a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f176252q, this.f176253r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BeduinInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        g gVar = this.f176252q;
        new com.avito.beduin.v2.avito.component.items_controller.i(gVar.f176289e.getF336542f());
        ((InterfaceC40047a.d) this.f176253r).getClass();
        gVar.f176289e.c();
        throw null;
    }
}
