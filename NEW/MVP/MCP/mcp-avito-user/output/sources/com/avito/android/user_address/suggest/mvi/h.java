package com.avito.android.user_address.suggest.mvi;

import com.avito.android.user_address.suggest.mvi.f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressSuggestMviActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviActor$handle$1", f = "UserAddressSuggestMviActor.kt", i = {0, 1, 2}, l = {57, 58, 59, 63}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes4.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f308115q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f308116r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f308117s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f.d f308118t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, f.d dVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f308117s = gVar;
        this.f308118t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f308117s, this.f308118t, continuation);
        hVar.f308116r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094 A[LOOP:0: B:24:0x008e->B:26:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1 A[RETURN] */
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
            int r1 = r9.f308115q
            com.avito.android.user_address.suggest.mvi.f$d r2 = r9.f308118t
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3b
            if (r1 == r6) goto L33
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            kotlin.C42729a0.b(r10)
            goto Lc2
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f308116r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L77
        L2b:
            java.lang.Object r1 = r9.f308116r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L60
        L33:
            java.lang.Object r1 = r9.f308116r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L53
        L3b:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f308116r
            r1 = r10
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviInternalAction$SuggestLoading r10 = new com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviInternalAction$SuggestLoading
            r10.<init>()
            r9.f308116r = r1
            r9.f308115q = r6
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L53
            return r0
        L53:
            r9.f308116r = r1
            r9.f308115q = r5
            r5 = 300(0x12c, double:1.48E-321)
            java.lang.Object r10 = kotlinx.coroutines.C43131e0.b(r5, r9)
            if (r10 != r0) goto L60
            return r0
        L60:
            com.avito.android.user_address.suggest.mvi.g r10 = r9.f308117s
            com.avito.android.user_address.suggest.domain.a r5 = r10.f308110a
            java.lang.String r6 = r2.f308109a
            com.avito.android.user_address.a r10 = r10.f308111b
            java.lang.String r10 = r10.getF307189a()
            r9.f308116r = r1
            r9.f308115q = r4
            java.lang.Object r10 = r5.a(r6, r10, r9)
            if (r10 != r0) goto L77
            return r0
        L77:
            tF.a$c r10 = (tF.AbstractC48544a.c) r10
            java.util.List r10 = r10.a()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C42745f0.q(r10, r5)
            r4.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
        L8e:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto Laf
            java.lang.Object r5 = r10.next()
            com.avito.android.geo_common.model.AddressSuggestionV2 r5 = (com.avito.android.geo_common.model.AddressSuggestionV2) r5
            com.avito.android.user_address.suggest.data.SuggestItem r6 = new com.avito.android.user_address.suggest.data.SuggestItem
            java.lang.String r7 = r5.getTitle()
            java.lang.String r8 = r5.getSubtitle()
            java.lang.String r5 = r5.getJsonWebToken()
            r6.<init>(r7, r8, r5)
            r4.add(r6)
            goto L8e
        Laf:
            com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviInternalAction$LoadData r10 = new com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviInternalAction$LoadData
            java.lang.String r2 = r2.f308109a
            r10.<init>(r2, r4)
            r2 = 0
            r9.f308116r = r2
            r9.f308115q = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto Lc2
            return r0
        Lc2:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.suggest.mvi.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
