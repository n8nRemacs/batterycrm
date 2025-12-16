package com.avito.android.activeOrders;

import com.avito.android.remote.model.TypedResult;
import com.facebook.imageutils.JfifUtil;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.activeOrders.UpdatedActiveOrdersInteractorImpl$observeOrderUpdateEvents$$inlined$flatMapLatest$1", f = "UpdatedActiveOrdersInteractorImpl.kt", i = {}, l = {JfifUtil.MARKER_SOI, 189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class l extends SuspendLambda implements Y41.q<InterfaceC43172j<? super TypedResult<OrdersNeedActionResponse>>, M40.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f68232q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f68233r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f68234s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f68235t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Continuation continuation, r rVar) {
        super(3, continuation);
        this.f68235t = rVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super TypedResult<OrdersNeedActionResponse>> interfaceC43172j, M40.a aVar, Continuation<? super G0> continuation) {
        l lVar = new l(continuation, this.f68235t);
        lVar.f68233r = interfaceC43172j;
        lVar.f68234s = aVar;
        return lVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f68232q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r6)
            goto L5c
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlinx.coroutines.flow.j r1 = r5.f68233r
            kotlin.C42729a0.b(r6)
            goto L46
        L20:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.flow.j r1 = r5.f68233r
            java.lang.Object r6 = r5.f68234s
            M40.a r6 = (M40.a) r6
            java.lang.Boolean r6 = r6.getIsActionRequired()
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            boolean r6 = kotlin.jvm.internal.L.f(r6, r4)
            if (r6 == 0) goto L4c
            com.avito.android.activeOrders.r r6 = r5.f68235t
            com.avito.android.activeOrders.c r6 = r6.f68252b
            r5.f68233r = r1
            r5.f68232q = r3
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L46
            return r0
        L46:
            kotlinx.coroutines.flow.w r3 = new kotlinx.coroutines.flow.w
            r3.<init>(r6)
            goto L50
        L4c:
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.C43175k.w()
        L50:
            r6 = 0
            r5.f68233r = r6
            r5.f68232q = r2
            java.lang.Object r6 = kotlinx.coroutines.flow.C43175k.u(r5, r3, r1)
            if (r6 != r0) goto L5c
            return r0
        L5c:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.activeOrders.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
