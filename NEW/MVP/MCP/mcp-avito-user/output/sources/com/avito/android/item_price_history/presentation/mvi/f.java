package com.avito.android.item_price_history.presentation.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ItemPriceHistoryBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.item_price_history.presentation.mvi.ItemPriceHistoryBootstrap$getForm$1", f = "ItemPriceHistoryBootstrap.kt", i = {0, 1}, l = {40, 42, 44, 48}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes14.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f173817q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f173818r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f173819s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f173819s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f173819s, continuation);
        fVar.f173818r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f173817q
            com.avito.android.item_price_history.presentation.mvi.h r2 = r8.f173819s
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L41
            if (r1 == r6) goto L39
            if (r1 == r5) goto L31
            if (r1 == r4) goto L28
            if (r1 != r3) goto L20
            java.lang.Object r0 = r8.f173818r
            r2 = r0
            com.avito.android.item_price_history.presentation.mvi.h r2 = (com.avito.android.item_price_history.presentation.mvi.h) r2
            kotlin.C42729a0.b(r9)
            goto Lb0
        L20:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L28:
            java.lang.Object r0 = r8.f173818r
            r2 = r0
            com.avito.android.item_price_history.presentation.mvi.h r2 = (com.avito.android.item_price_history.presentation.mvi.h) r2
            kotlin.C42729a0.b(r9)
            goto L8b
        L31:
            java.lang.Object r1 = r8.f173818r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L6d
        L39:
            java.lang.Object r1 = r8.f173818r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L59
        L41:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f173818r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction$ShowFirstLoading r1 = new com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction$ShowFirstLoading
            r1.<init>()
            r8.f173818r = r9
            r8.f173817q = r6
            java.lang.Object r1 = r9.emit(r1, r8)
            if (r1 != r0) goto L58
            return r0
        L58:
            r1 = r9
        L59:
            AO.a r9 = r2.f173828a
            r7 = 0
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            r8.f173818r = r1
            r8.f173817q = r5
            AO.c r9 = r9.f320a
            java.lang.Object r9 = r9.a(r7, r8)
            if (r9 != r0) goto L6d
            return r0
        L6d:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r5 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L8e
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r9 = r9.getResult()
            BO.a r9 = (BO.a) r9
            com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction$ShowContent r3 = new com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction$ShowContent
            r3.<init>(r9)
            r8.f173818r = r2
            r8.f173817q = r4
            java.lang.Object r9 = r1.emit(r3, r8)
            if (r9 != r0) goto L8b
            return r0
        L8b:
            r2.f173831d = r6
            goto Lb2
        L8e:
            boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r4 == 0) goto Lb5
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
            com.avito.android.remote.error.ApiError r4 = r9.getError()
            java.lang.Throwable r9 = r9.getCause()
            com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r4, r9)
            com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction$ShowError r4 = new com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction$ShowError
            r4.<init>(r9)
            r8.f173818r = r2
            r8.f173817q = r3
            java.lang.Object r9 = r1.emit(r4, r8)
            if (r9 != r0) goto Lb0
            return r0
        Lb0:
            r2.f173831d = r6
        Lb2:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        Lb5:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.item_price_history.presentation.mvi.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
