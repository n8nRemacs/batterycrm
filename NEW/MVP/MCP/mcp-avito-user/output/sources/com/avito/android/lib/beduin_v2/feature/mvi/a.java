package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction;
import com.avito.beduin.v2.interaction.navigation.flow.C36326a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BeduinActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.mvi.BeduinActor$process$1", f = "BeduinActor.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BeduinInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f176220q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f176221r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f176221r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new a(this.f176221r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BeduinInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f176220q;
        if (i12 == 0) {
            C42729a0.b(obj);
            g gVar = this.f176221r;
            com.avito.beduin.v2.interaction.navigation_controller.c cVar = gVar.f176288d;
            dU0.f fVar = new dU0.f(com.avito.beduin.v2.interaction.navigation.flow.c.f337517b.f393887a, new C36326a(null, null, 3, null), null, 4, null);
            this.f176220q = 1;
            if (gVar.f176287c.a(fVar, this) == coroutine_suspended) {
                return coroutine_suspended;
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
