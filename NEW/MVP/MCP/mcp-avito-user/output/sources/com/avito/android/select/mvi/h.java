package com.avito.android.select.mvi;

import com.avito.android.select.mvi.entity.SelectInternalAction;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import dq0.C39783e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.select.mvi.SelectActor$process$5", f = "SelectActor.kt", i = {0, 3}, l = {UpdateStatusCode.DialogButton.CONFIRM, 102, 104, 107, 118}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f265604q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f265605r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f265606s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C39783e f265607t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, C39783e c39783e, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f265606s = iVar;
        this.f265607t = c39783e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f265606s, this.f265607t, continuation);
        hVar.f265605r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f265604q
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            dq0.e r8 = r11.f265607t
            if (r1 == 0) goto L38
            if (r1 == r6) goto L2f
            if (r1 == r5) goto L1a
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
        L1a:
            kotlin.C42729a0.b(r12)
            goto Lbe
        L1f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L27:
            java.lang.Object r1 = r11.f265605r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r12)
            goto L5d
        L2f:
            java.lang.Object r1 = r11.f265605r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r12)
            goto Laa
        L38:
            kotlin.C42729a0.b(r12)
            java.lang.Object r12 = r11.f265605r
            r1 = r12
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.select.mvi.i r12 = r11.f265606s
            r12.getClass()
            dq0.a r12 = r8.f394146m
            boolean r9 = r12.f394102h
            if (r9 != 0) goto L87
            boolean r10 = r12.f394103i
            if (r10 == 0) goto L50
            goto L87
        L50:
            com.avito.android.select.mvi.entity.SelectInternalAction$HideKeyboard r12 = com.avito.android.select.mvi.entity.SelectInternalAction.HideKeyboard.f265585b
            r11.f265605r = r1
            r11.f265604q = r3
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto L5d
            return r0
        L5d:
            boolean r12 = dq0.C39785g.a(r8)
            if (r12 == 0) goto L75
            java.util.List<com.avito.android.remote.model.ParcelableEntity<java.lang.String>> r12 = r8.f394140g
            java.lang.Object r12 = kotlin.collections.C42745f0.G(r12)
            com.avito.android.remote.model.ParcelableEntity r12 = (com.avito.android.remote.model.ParcelableEntity) r12
            if (r12 == 0) goto L72
            java.util.List r12 = java.util.Collections.singletonList(r12)
            goto L77
        L72:
            kotlin.collections.z0 r12 = kotlin.collections.C42784z0.f406748b
            goto L77
        L75:
            kotlin.collections.z0 r12 = kotlin.collections.C42784z0.f406748b
        L77:
            com.avito.android.select.mvi.entity.SelectInternalAction$Submit r3 = new com.avito.android.select.mvi.entity.SelectInternalAction$Submit
            r3.<init>(r12, r7)
            r11.f265605r = r7
            r11.f265604q = r2
            java.lang.Object r12 = r1.emit(r3, r11)
            if (r12 != r0) goto Lbe
            return r0
        L87:
            if (r9 == 0) goto L9d
            boolean r2 = r12.f394104j
            if (r2 != 0) goto L92
            boolean r12 = r12.f394103i
            if (r12 == 0) goto L92
            goto L9d
        L92:
            com.avito.android.select.mvi.entity.SelectInternalAction$ClearSelection r12 = com.avito.android.select.mvi.entity.SelectInternalAction.ClearSelection.f265580b
            r11.f265604q = r4
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto Lbe
            return r0
        L9d:
            com.avito.android.select.mvi.entity.SelectInternalAction$HideKeyboard r12 = com.avito.android.select.mvi.entity.SelectInternalAction.HideKeyboard.f265585b
            r11.f265605r = r1
            r11.f265604q = r6
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto Laa
            return r0
        Laa:
            com.avito.android.select.mvi.entity.SelectInternalAction$Reset r12 = new com.avito.android.select.mvi.entity.SelectInternalAction$Reset
            dq0.a r2 = r8.f394146m
            java.lang.String r2 = r2.f394105k
            r12.<init>(r2)
            r11.f265605r = r7
            r11.f265604q = r5
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto Lbe
            return r0
        Lbe:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.mvi.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
