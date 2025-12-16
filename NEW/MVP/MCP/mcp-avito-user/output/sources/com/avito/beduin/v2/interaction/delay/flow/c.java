package com.avito.beduin.v2.interaction.delay.flow;

import Y41.p;
import Y61.k;
import Y61.l;
import dU0.f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DelayInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.delay.flow.DelayInteractionHandler$handle$1", f = "DelayInteractionHandler.kt", i = {0, 0}, l = {22, 23}, m = "invokeSuspend", n = {"$this$flow", "it"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public f f337281q;

    /* renamed from: r, reason: collision with root package name */
    public int f337282r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f337283s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f337284t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f337284t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f337284t, continuation);
        cVar.f337283s = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f337282r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r8)
            goto L5e
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            dU0.f r1 = r7.f337281q
            java.lang.Object r3 = r7.f337283s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r8)
            goto L50
        L24:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f337283s
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            com.avito.beduin.v2.interaction.delay.flow.b r1 = r7.f337284t
            Y41.a<dU0.f> r4 = r1.f337278b
            com.avito.beduin.v2.interaction.delay.flow.a r4 = (com.avito.beduin.v2.interaction.delay.flow.a) r4
            java.lang.Object r4 = r4.invoke()
            dU0.f r4 = (dU0.f) r4
            if (r4 == 0) goto L5e
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnit.f410633e
            int r1 = r1.f337277a
            long r5 = kotlin.time.g.g(r1, r5)
            r7.f337283s = r8
            r7.f337281q = r4
            r7.f337282r = r3
            java.lang.Object r1 = kotlinx.coroutines.C43131e0.c(r5, r7)
            if (r1 != r0) goto L4e
            return r0
        L4e:
            r3 = r8
            r1 = r4
        L50:
            r8 = 0
            r7.f337283s = r8
            r7.f337281q = r8
            r7.f337282r = r2
            java.lang.Object r8 = r3.emit(r1, r7)
            if (r8 != r0) goto L5e
            return r0
        L5e:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.delay.flow.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
