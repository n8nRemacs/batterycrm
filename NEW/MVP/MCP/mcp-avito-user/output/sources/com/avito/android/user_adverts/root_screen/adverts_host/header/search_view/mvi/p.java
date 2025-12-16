package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import BI0.a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UserSearchSuggests;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SearchActor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/UserSearchSuggests;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.SearchActor$processSuggestions$1", f = "SearchActor.kt", i = {0}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<UserSearchSuggests>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f312923q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f312924r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35571a f312925s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.k f312926t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a.k kVar, C35571a c35571a, Continuation continuation) {
        super(2, continuation);
        this.f312925s = c35571a;
        this.f312926t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f312926t, this.f312925s, continuation);
        pVar.f312924r = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<UserSearchSuggests>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
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
            int r1 = r6.f312923q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r7)
            goto L61
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r1 = r6.f312924r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L55
        L25:
            java.lang.Object r1 = r6.f312924r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L42
        L2d:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f312924r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            r6.f312924r = r7
            r6.f312923q = r4
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = kotlinx.coroutines.C43131e0.b(r4, r6)
            if (r1 != r0) goto L41
            return r0
        L41:
            r1 = r7
        L42:
            com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.a r7 = r6.f312925s
            sI0.a r7 = r7.f312851a
            BI0.a$k r4 = r6.f312926t
            java.lang.String r4 = r4.f1301a
            r6.f312924r = r1
            r6.f312923q = r3
            java.lang.Object r7 = r7.g(r4, r6)
            if (r7 != r0) goto L55
            return r0
        L55:
            r3 = 0
            r6.f312924r = r3
            r6.f312923q = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L61
            return r0
        L61:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
