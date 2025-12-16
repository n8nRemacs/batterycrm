package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import com.avito.android.cpx_promo.v2.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoV2Actor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.v2.mvi.CpxPromoV2Actor$processBudgetSelected$1", f = "CpxPromoV2Actor.kt", i = {0, 1, 1, 2}, l = {260, 272, 273}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "updateSliderInternalAction", "updateSliderInternalAction"}, s = {"L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoV2InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public CpxPromoV2InternalAction.UpdateSlider f127579q;

    /* renamed from: r, reason: collision with root package name */
    public int f127580r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f127581s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f127582t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a.b f127583u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2State f127584v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, a.b bVar, CpxPromoV2State cpxPromoV2State, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f127582t = mVar;
        this.f127583u = bVar;
        this.f127584v = cpxPromoV2State;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f127582t, this.f127583u, this.f127584v, continuation);
        eVar.f127581s = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.f127580r
            r2 = 3
            r3 = 2
            com.avito.android.cpx_promo.v2.mvi.entity.a$b r4 = r13.f127583u
            com.avito.android.cpx_promo.v2.mvi.m r5 = r13.f127582t
            r6 = 1
            r7 = 0
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State r8 = r13.f127584v
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L33
            if (r1 == r3) goto L29
            if (r1 != r2) goto L21
            java.lang.Object r0 = r13.f127581s
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$UpdateSlider r0 = (com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction.UpdateSlider) r0
            kotlin.C42729a0.b(r14)
            goto L9e
        L21:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L29:
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$UpdateSlider r1 = r13.f127579q
            java.lang.Object r3 = r13.f127581s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r14)
            goto L8e
        L33:
            java.lang.Object r1 = r13.f127581s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r14)
            r14 = r1
            goto L5a
        L3c:
            kotlin.C42729a0.b(r14)
            java.lang.Object r14 = r13.f127581s
            kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
            ls.a r1 = r5.f127737e
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State$a r9 = r4.f127690a
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2$Auto$Budget$Value$BudgetId r9 = r9.f127647b
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2 r10 = r8.f127626d
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$UpdateBudget r1 = r1.a(r6, r9, r10)
            r13.f127581s = r14
            r13.f127580r = r6
            java.lang.Object r1 = r14.emit(r1, r13)
            if (r1 != r0) goto L5a
            return r0
        L5a:
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State$f r1 = r8.f127630h
            boolean r1 = r1.f127669c
            ls.a r6 = r5.f127737e
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State$a r9 = r4.f127690a
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2$Auto$Budget$Value$BudgetId r9 = r9.f127647b
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2 r10 = r8.f127626d
            js.c r9 = com.avito.android.cpx_promo.v2.mvi.m.d(r5, r1, r9, r10)
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State$g r8 = r8.f127633k
            int r8 = r8.f127682l
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            if (r10 == 0) goto L7b
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2$a r10 = r10.f127490l
            if (r10 == 0) goto L7b
            if (r1 != 0) goto L7b
            goto L7c
        L7b:
            r10 = r7
        L7c:
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$UpdateSlider r1 = r6.c(r9, r8, r7, r10)
            r13.f127581s = r14
            r13.f127579q = r1
            r13.f127580r = r3
            java.lang.Object r3 = r14.emit(r1, r13)
            if (r3 != r0) goto L8d
            return r0
        L8d:
            r3 = r14
        L8e:
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$Validate r14 = com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction.Validate.f127621b
            r13.f127581s = r1
            r13.f127579q = r7
            r13.f127580r = r2
            java.lang.Object r14 = r3.emit(r14, r13)
            if (r14 != r0) goto L9d
            return r0
        L9d:
            r0 = r1
        L9e:
            com.avito.android.analytics.a r14 = r5.f127739g
            Zr.a r1 = new Zr.a
            long r9 = r0.f127605c
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State$a r2 = r4.f127690a
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2$Auto$Budget$Value$BudgetId r2 = r2.f127647b
            java.lang.String r11 = r2.f127503b
            int r8 = r0.f127614l
            int r12 = r0.f127613k
            java.lang.String r7 = r5.f127734b
            r6 = r1
            r6.<init>(r7, r8, r9, r11, r12)
            r14.c(r1)
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.v2.mvi.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
