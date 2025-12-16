package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PanelSoaActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LMI0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$updateSoaStats$1", f = "PanelSoaActor.kt", i = {0, 1}, l = {183, 184, 185}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class w extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MI0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313633q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f313634r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f313635s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, Continuation<? super w> continuation) {
        super(2, continuation);
        this.f313635s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        w wVar = new w(this.f313635s, continuation);
        wVar.f313634r = obj;
        return wVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MI0.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((w) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f313633q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r7)
            goto L62
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r1 = r6.f313634r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L54
        L25:
            java.lang.Object r1 = r6.f313634r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L47
        L2d:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f313634r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            MI0.b$m r1 = new MI0.b$m
            java.lang.String r5 = r6.f313635s
            r1.<init>(r5)
            r6.f313634r = r7
            r6.f313633q = r4
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L46
            return r0
        L46:
            r1 = r7
        L47:
            r6.f313634r = r1
            r6.f313633q = r3
            r3 = 6000(0x1770, double:2.9644E-320)
            java.lang.Object r7 = kotlinx.coroutines.C43131e0.b(r3, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            MI0.b$j r7 = MI0.b.j.f10568a
            r3 = 0
            r6.f313634r = r3
            r6.f313633q = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L62
            return r0
        L62:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
