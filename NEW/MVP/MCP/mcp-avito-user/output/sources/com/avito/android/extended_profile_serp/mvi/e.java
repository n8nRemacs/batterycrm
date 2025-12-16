package com.avito.android.extended_profile_serp.mvi;

import bB.InterfaceC25487a;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSerpActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.mvi.ExtendedProfileSerpActor$navigateToGeoFilters$1", f = "ExtendedProfileSerpActor.kt", i = {0, 1}, l = {442, 447, 449}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSerpInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f152913q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f152914r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f152915s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25487a.k f152916t;

    /* compiled from: ExtendedProfileSerpActor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.extended_profile_serp.mvi.ExtendedProfileSerpActor$navigateToGeoFilters$1$1", f = "ExtendedProfileSerpActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f152917q;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(2, continuation);
            aVar.f152917q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return ((a) create(bool, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return (Boolean) this.f152917q;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, InterfaceC25487a.k kVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f152915s = nVar;
        this.f152916t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f152915s, this.f152916t, continuation);
        eVar.f152914r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSerpInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
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
            int r1 = r7.f152913q
            com.avito.android.extended_profile_serp.mvi.n r2 = r7.f152915s
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L30
            if (r1 == r4) goto L28
            if (r1 == r5) goto L20
            if (r1 != r3) goto L18
            kotlin.C42729a0.b(r8)
            goto L74
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            java.lang.Object r1 = r7.f152914r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L67
        L28:
            java.lang.Object r1 = r7.f152914r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L45
        L30:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f152914r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction$InlineFiltersLoading r1 = com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction.InlineFiltersLoading.f152935b
            r7.f152914r = r8
            r7.f152913q = r4
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L44
            return r0
        L44:
            r1 = r8
        L45:
            com.avito.android.inline_filters.w r8 = r2.f153025e
            com.jakewharton.rxrelay3.b r8 = r8.getF172393J()
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.rx3.y.a(r8)
            kotlinx.coroutines.flow.c r8 = kotlinx.coroutines.flow.C43175k.e(r8)
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.C43175k.r(r8)
            com.avito.android.extended_profile_serp.mvi.e$a r4 = new com.avito.android.extended_profile_serp.mvi.e$a
            r4.<init>(r5, r6)
            r7.f152914r = r1
            r7.f152913q = r5
            java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.x(r8, r4, r7)
            if (r8 != r0) goto L67
            return r0
        L67:
            com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction$InlineFiltersLoaded r8 = com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction.InlineFiltersLoaded.f152934b
            r7.f152914r = r6
            r7.f152913q = r3
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L74
            return r0
        L74:
            com.avito.android.inline_filters.w r8 = r2.f153025e
            com.avito.android.remote.model.search.InlineFilters r0 = r8.getF172427u()
            if (r0 == 0) goto L99
            com.avito.android.remote.model.search.Result r0 = r0.getResult()
            if (r0 == 0) goto L99
            com.avito.android.remote.model.search.Filter r0 = r0.getGeoFilter()
            if (r0 == 0) goto L99
            java.lang.String r0 = r0.getId()
            if (r0 != 0) goto L8f
            goto L99
        L8f:
            bB.a$k r1 = r7.f152916t
            com.avito.android.remote.model.SearchParams r1 = r1.f56960a
            r8.o1(r6, r1, r0, r6)
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L99:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_serp.mvi.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
