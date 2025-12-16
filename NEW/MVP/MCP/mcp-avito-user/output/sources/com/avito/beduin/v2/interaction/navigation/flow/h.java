package com.avito.beduin.v2.interaction.navigation.flow;

import com.avito.android.util.V2;
import fT.C40335a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CloseInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.navigation.flow.CloseInteractionHandler$handle$1", f = "CloseInteractionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f337527q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f337528r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, i iVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f337527q = fVar;
        this.f337528r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f337527q, this.f337528r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        G0 g02;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        f fVar = this.f337527q;
        ResultStatus resultStatus = fVar.f337524a;
        i iVar = this.f337528r;
        if (resultStatus != null) {
            C40335a c40335a = iVar.f337529c;
            s sVar = fVar.f337525b;
            if (sVar == null) {
                sVar = new s(new r[0]);
            }
            c40335a.b(resultStatus, sVar);
        }
        FV0.a aVar = iVar.f337529c.f395883b;
        if (aVar != null) {
            aVar.close();
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            V2.f318762a.j("AvitoCloseWithResultClient", "BeduinHost not attached to client, close wasn't complete", null);
        }
        return G0.f406611a;
    }
}
