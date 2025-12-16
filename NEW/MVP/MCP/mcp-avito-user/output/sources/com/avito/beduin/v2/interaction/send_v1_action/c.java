package com.avito.beduin.v2.interaction.send_v1_action;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.beduin.v2.interaction.send_v1_action.b;
import dU0.f;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SendV1ActionsInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.send_v1_action.SendV1ActionsInteractionHandler$handle$1", f = "SendV1ActionsInteractionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f337832q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f337833r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, b bVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f337832q = dVar;
        this.f337833r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f337832q, this.f337833r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        d dVar = this.f337832q;
        com.avito.beduin.v2.serialization.json.e eVar = new com.avito.beduin.v2.serialization.json.e(dVar.f337835d);
        b.a[] aVarArr = this.f337833r.f337828a;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (b.a aVar : aVarArr) {
            arrayList.add(new e(aVar.f337829a, eVar.a(aVar.f337830b)));
        }
        dVar.f337834c.a((e[]) arrayList.toArray(new e[0]));
        return G0.f406611a;
    }
}
