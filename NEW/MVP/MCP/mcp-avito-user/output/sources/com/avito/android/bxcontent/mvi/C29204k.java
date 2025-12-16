package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.serp_list.Mode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$setupActionsHorizontalBlockVisibility$1", f = "BxContentActor.kt", i = {0}, l = {1574, 1576}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.bxcontent.mvi.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29204k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f112476q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f112477r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f112478s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Mode f112479t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29204k(com.avito.android.bxcontent.mvi.entity.l lVar, Mode mode, Continuation<? super C29204k> continuation) {
        super(2, continuation);
        this.f112478s = lVar;
        this.f112479t = mode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29204k c29204k = new C29204k(this.f112478s, this.f112479t, continuation);
        c29204k.f112477r = obj;
        return c29204k;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C29204k) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f112476q
            r2 = 0
            com.avito.android.serp_list.Mode r3 = r9.f112479t
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L27
            if (r1 == r6) goto L1f
            if (r1 != r5) goto L17
            kotlin.C42729a0.b(r10)
            goto L7c
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            java.lang.Object r1 = r9.f112477r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L66
        L27:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f112477r
            r1 = r10
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.bxcontent.mvi.entity.l r10 = r9.f112478s
            com.avito.android.bxcontent.mvi.entity.t r10 = r10.f()
            java.util.List<com.avito.android.serp.adapter.l1> r10 = r10.f112428e
            java.lang.Object r10 = kotlin.collections.C42745f0.G(r10)
            boolean r7 = r10 instanceof com.avito.android.serp.adapter.actions_horizontal_block.ActionsHorizontalBlockItem
            if (r7 == 0) goto L42
            com.avito.android.serp.adapter.actions_horizontal_block.ActionsHorizontalBlockItem r10 = (com.avito.android.serp.adapter.actions_horizontal_block.ActionsHorizontalBlockItem) r10
            goto L43
        L42:
            r10 = r2
        L43:
            if (r10 == 0) goto L53
            com.avito.android.serp_list.Mode r7 = com.avito.android.serp_list.Mode.f273993c
            if (r3 != r7) goto L4b
            r7 = r6
            goto L4c
        L4b:
            r7 = r4
        L4c:
            r8 = 47
            com.avito.android.serp.adapter.actions_horizontal_block.ActionsHorizontalBlockItem r10 = com.avito.android.serp.adapter.actions_horizontal_block.ActionsHorizontalBlockItem.a(r10, r2, r2, r7, r8)
            goto L54
        L53:
            r10 = r2
        L54:
            if (r10 == 0) goto L7c
            com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateItem r7 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateItem
            r7.<init>(r10)
            r9.f112477r = r1
            r9.f112476q = r6
            java.lang.Object r10 = r1.emit(r7, r9)
            if (r10 != r0) goto L66
            return r0
        L66:
            com.avito.android.serp_list.Mode r10 = com.avito.android.serp_list.Mode.f273992b
            if (r3 != r10) goto L6b
            goto L6c
        L6b:
            r6 = r4
        L6c:
            com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateInlineActions r10 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateInlineActions
            r10.<init>(r6, r4, r5, r2)
            r9.f112477r = r2
            r9.f112476q = r5
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L7c
            return r0
        L7c:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29204k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
