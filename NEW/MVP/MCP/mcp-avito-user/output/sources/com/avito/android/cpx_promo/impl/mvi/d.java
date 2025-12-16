package com.avito.android.cpx_promo.impl.mvi;

import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import com.avito.android.cpx_promo.impl.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.impl.mvi.CpxPromoActor$processBudgetSelected$1", f = "CpxPromoActor.kt", i = {0, 1, 1, 2}, l = {251, 259, 260}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "updateSliderInternalAction", "updateSliderInternalAction"}, s = {"L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public CpxPromoInternalAction.UpdateSlider f127064q;

    /* renamed from: r, reason: collision with root package name */
    public int f127065r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f127066s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f127067t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a.b f127068u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CpxPromoState f127069v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, a.b bVar, CpxPromoState cpxPromoState, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f127067t = kVar;
        this.f127068u = bVar;
        this.f127069v = cpxPromoState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f127067t, this.f127068u, this.f127069v, continuation);
        dVar.f127066s = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f127065r
            r2 = 3
            r3 = 2
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState r4 = r14.f127069v
            com.avito.android.cpx_promo.impl.mvi.entity.a$b r5 = r14.f127068u
            com.avito.android.cpx_promo.impl.mvi.k r6 = r14.f127067t
            r7 = 1
            if (r1 == 0) goto L3a
            if (r1 == r7) goto L31
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r0 = r14.f127066s
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction$UpdateSlider r0 = (com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction.UpdateSlider) r0
            kotlin.C42729a0.b(r15)
            goto L8b
        L1f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L27:
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction$UpdateSlider r1 = r14.f127064q
            java.lang.Object r3 = r14.f127066s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r15)
            goto L7a
        L31:
            java.lang.Object r1 = r14.f127066s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r15)
            r15 = r1
            goto L56
        L3a:
            kotlin.C42729a0.b(r15)
            java.lang.Object r15 = r14.f127066s
            kotlinx.coroutines.flow.j r15 = (kotlinx.coroutines.flow.InterfaceC43172j) r15
            fs.a r1 = r6.f127203e
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState$BudgetChip r8 = r5.f127158a
            com.avito.android.cpx_promo.impl.interactor.model.CpxPromo r9 = r4.f127111d
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction$UpdateBudget r1 = r1.d(r7, r8, r9)
            r14.f127066s = r15
            r14.f127065r = r7
            java.lang.Object r1 = r15.emit(r1, r14)
            if (r1 != r0) goto L56
            return r0
        L56:
            fs.a r7 = r6.f127203e
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState$BudgetChip r1 = r5.f127158a
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState$SliderState r8 = r4.f127117j
            int r8 = r8.f127153j
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            r8 = 1
            r11 = 0
            java.lang.String r9 = r1.f127120b
            com.avito.android.cpx_promo.impl.interactor.model.CpxPromo r12 = r4.f127111d
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction$UpdateSlider r1 = r7.b(r8, r9, r10, r11, r12)
            r14.f127066s = r15
            r14.f127064q = r1
            r14.f127065r = r3
            java.lang.Object r3 = r15.emit(r1, r14)
            if (r3 != r0) goto L79
            return r0
        L79:
            r3 = r15
        L7a:
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction$Validate r15 = com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction.Validate.f127106b
            r14.f127066s = r1
            r4 = 0
            r14.f127064q = r4
            r14.f127065r = r2
            java.lang.Object r15 = r3.emit(r15, r14)
            if (r15 != r0) goto L8a
            return r0
        L8a:
            r0 = r1
        L8b:
            com.avito.android.analytics.a r15 = r6.f127205g
            Zr.a r1 = new Zr.a
            long r10 = r0.f127096c
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState$BudgetChip r2 = r5.f127158a
            int r9 = r0.f127102i
            int r13 = r0.f127101h
            java.lang.String r8 = r6.f127200b
            java.lang.String r12 = r2.f127120b
            r7 = r1
            r7.<init>(r8, r9, r10, r12, r13)
            r15.c(r1)
            kotlin.G0 r15 = kotlin.G0.f406611a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.impl.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
