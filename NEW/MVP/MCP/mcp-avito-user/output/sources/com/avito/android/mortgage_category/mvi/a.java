package com.avito.android.mortgage_category.mvi;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.mortgage_category.mvi.entity.MortgageCategoryInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageCategoryActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_category.mvi.MortgageCategoryActor$process$1", f = "MortgageCategoryActor.kt", i = {0}, l = {AvailableCode.HMS_IS_SPOOF, 30, 35}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super MortgageCategoryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204913q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f204914r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P10.d f204915s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f204916t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(P10.d dVar, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f204915s = dVar;
        this.f204916t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f204915s, this.f204916t, continuation);
        aVar.f204914r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageCategoryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f204913q
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            com.avito.android.mortgage_category.mvi.b r6 = r10.f204916t
            P10.d r7 = r10.f204915s
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            kotlin.C42729a0.b(r11)
            goto L84
        L23:
            java.lang.Object r1 = r10.f204914r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L5a
        L2b:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f204914r
            r1 = r11
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            O10.b r11 = r7.f12780d
            if (r11 == 0) goto L40
            O10.a r11 = r11.getF11914e()
            if (r11 == 0) goto L40
            com.avito.android.deep_linking.links.DeepLink r11 = r11.f11898b
            goto L41
        L40:
            r11 = r2
        L41:
            O10.b r8 = r7.f12780d
            boolean r8 = r8 instanceof O10.b.a
            java.lang.String r9 = r7.f12778b
            if (r8 == 0) goto L6f
            com.avito.android.mortgage_category.mvi.domain.d r11 = r6.f204918b
            kotlinx.coroutines.flow.i r11 = r11.a(r9)
            r10.f204914r = r1
            r10.f204913q = r5
            java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r11, r1)
            if (r11 != r0) goto L5a
            return r0
        L5a:
            com.avito.android.mortgage_category.mvi.domain.a r11 = r6.f204917a
            java.lang.String r3 = r7.f12778b
            java.lang.String r5 = r7.f12779c
            kotlinx.coroutines.flow.i r11 = r11.a(r3, r5)
            r10.f204914r = r2
            r10.f204913q = r4
            java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r11, r1)
            if (r11 != r0) goto L84
            return r0
        L6f:
            if (r11 == 0) goto L84
            I10.a r2 = r6.f204919c
            r2.a(r9)
            com.avito.android.mortgage_category.mvi.entity.MortgageCategoryInternalAction$HandleDeeplink r2 = new com.avito.android.mortgage_category.mvi.entity.MortgageCategoryInternalAction$HandleDeeplink
            r2.<init>(r11)
            r10.f204913q = r3
            java.lang.Object r11 = r1.emit(r2, r10)
            if (r11 != r0) goto L84
            return r0
        L84:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_category.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
