package com.avito.android.publish.cpa_tariff.mvi;

import Kd0.AbstractC14304b;
import Kd0.InterfaceC14303a;
import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpaTariffActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LKd0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.cpa_tariff.mvi.CpaTariffActor$process$1", f = "CpaTariffActor.kt", i = {1}, l = {19, 21, 22}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC14304b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f232451q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f232452r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14303a f232453s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f232454t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC14303a interfaceC14303a, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f232453s = interfaceC14303a;
        this.f232454t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f232453s, this.f232454t, continuation);
        aVar.f232452r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AbstractC14304b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[RETURN] */
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
            int r1 = r7.f232451q
            Kd0.a r2 = r7.f232453s
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L28
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            goto L24
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            java.lang.Object r1 = r7.f232452r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L5a
        L24:
            kotlin.C42729a0.b(r8)
            goto L74
        L28:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f232452r
            r1 = r8
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            boolean r8 = r2 instanceof Kd0.InterfaceC14303a.C0581a
            if (r8 == 0) goto L3f
            Kd0.b$a r8 = Kd0.AbstractC14304b.a.f9544a
            r7.f232451q = r5
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L74
            return r0
        L3f:
            boolean r8 = r2 instanceof Kd0.InterfaceC14303a.b
            if (r8 == 0) goto L74
            Kd0.b$h r8 = new Kd0.b$h
            r5 = r2
            Kd0.a$b r5 = (Kd0.InterfaceC14303a.b) r5
            java.lang.String r6 = r5.f9542a
            java.lang.String r5 = r5.f9543b
            r8.<init>(r6, r5)
            r7.f232452r = r1
            r7.f232451q = r4
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L5a
            return r0
        L5a:
            com.avito.android.publish.cpa_tariff.mvi.b r8 = r7.f232454t
            com.avito.android.publish.cpa_tariff.mvi.domain.e r8 = r8.f232455a
            Kd0.a$b r2 = (Kd0.InterfaceC14303a.b) r2
            java.lang.String r4 = r2.f9542a
            java.lang.String r2 = r2.f9543b
            kotlinx.coroutines.flow.i r8 = r8.a(r4, r2)
            r2 = 0
            r7.f232452r = r2
            r7.f232451q = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r1)
            if (r8 != r0) goto L74
            return r0
        L74:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.cpa_tariff.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
