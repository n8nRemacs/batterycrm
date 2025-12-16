package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import os.u;

/* compiled from: GetCpxPromoGeoUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.GetCpxPromoGeoUseCase$invoke$1", f = "GetCpxPromoGeoUseCase.kt", i = {0, 1, 2}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 30, 34, 35, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super CpxPromoGeoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f127824q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127825r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f127826s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f127827t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u f127828u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f127829v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List<Long> f127830w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ArrayList arrayList, u uVar, ArrayList arrayList2, List list, Continuation continuation) {
        super(2, continuation);
        this.f127826s = bVar;
        this.f127827t = arrayList;
        this.f127828u = uVar;
        this.f127829v = arrayList2;
        this.f127830w = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f127826s, this.f127827t, this.f127828u, this.f127829v, this.f127830w, continuation);
        aVar.f127825r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoGeoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f127824q
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L42
            if (r2 == r8) goto L3a
            if (r2 == r7) goto L30
            if (r2 == r6) goto L28
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1b
            goto L23
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L23:
            kotlin.C42729a0.b(r17)
            goto Lc8
        L28:
            java.lang.Object r2 = r0.f127825r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r17)
            goto L98
        L30:
            java.lang.Object r2 = r0.f127825r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r17)
            r4 = r17
            goto L7a
        L3a:
            java.lang.Object r2 = r0.f127825r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r17)
            goto L59
        L42:
            kotlin.C42729a0.b(r17)
            java.lang.Object r2 = r0.f127825r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction$Loading r9 = new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction$Loading
            r9.<init>()
            r0.f127825r = r2
            r0.f127824q = r8
            java.lang.Object r8 = r2.emit(r9, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.b r8 = r0.f127826s
            ns.a r9 = r8.f127832b
            os.n r15 = new os.n
            java.util.ArrayList r11 = r0.f127827t
            os.u r12 = r0.f127828u
            java.lang.String r13 = r8.f127833c
            java.util.ArrayList r14 = r0.f127829v
            java.util.List<java.lang.Long> r8 = r0.f127830w
            r10 = r15
            r4 = r15
            r15 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            r0.f127825r = r2
            r0.f127824q = r7
            java.lang.Object r4 = r9.c(r4, r0)
            if (r4 != r1) goto L7a
            return r1
        L7a:
            com.avito.android.remote.model.TypedResult r4 = (com.avito.android.remote.model.TypedResult) r4
            boolean r7 = r4 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r7 == 0) goto La5
            com.avito.android.remote.model.TypedResult$Success r4 = (com.avito.android.remote.model.TypedResult.Success) r4
            java.lang.Object r4 = r4.getResult()
            os.a r4 = (os.C44931a) r4
            com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction$Content r7 = new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction$Content
            r7.<init>(r4)
            r0.f127825r = r2
            r0.f127824q = r6
            java.lang.Object r4 = r2.emit(r7, r0)
            if (r4 != r1) goto L98
            return r1
        L98:
            com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction$Revalidate r4 = com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction.Revalidate.f127888b
            r0.f127825r = r3
            r0.f127824q = r5
            java.lang.Object r2 = r2.emit(r4, r0)
            if (r2 != r1) goto Lc8
            return r1
        La5:
            boolean r5 = r4 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto Lcb
            com.avito.android.remote.model.TypedResult$Error r4 = (com.avito.android.remote.model.TypedResult.Error) r4
            com.avito.android.remote.error.ApiError r5 = r4.getError()
            java.lang.Throwable r4 = r4.getCause()
            com.avito.android.util.ApiException r4 = com.avito.android.util.C35936s.a(r5, r4)
            com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction$Error r5 = new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction$Error
            r5.<init>(r4)
            r0.f127825r = r3
            r3 = 5
            r0.f127824q = r3
            java.lang.Object r2 = r2.emit(r5, r0)
            if (r2 != r1) goto Lc8
            return r1
        Lc8:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        Lcb:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
