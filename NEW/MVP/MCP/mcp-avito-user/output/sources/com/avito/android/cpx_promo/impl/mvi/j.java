package com.avito.android.cpx_promo.impl.mvi;

import Zr.C19598c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import com.avito.android.cpx_promo.impl.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.impl.mvi.CpxPromoActor$processSliderValueChange$1", f = "CpxPromoActor.kt", i = {0, 0, 1}, l = {282, 283}, m = "invokeSuspend", n = {"$this$flow", "updateSliderInternalAction", "updateSliderInternalAction"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes12.dex */
final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public CpxPromoInternalAction.UpdateSlider f127189q;

    /* renamed from: r, reason: collision with root package name */
    public int f127190r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f127191s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f127192t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CpxPromoState f127193u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a.l f127194v;

    /* compiled from: CpxPromoActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cpx_promo.impl.mvi.CpxPromoActor$processSliderValueChange$1$1", f = "CpxPromoActor.kt", i = {}, l = {287}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f127195q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CpxPromoState f127196r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ k f127197s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ CpxPromoInternalAction.UpdateSlider f127198t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CpxPromoState cpxPromoState, k kVar, CpxPromoInternalAction.UpdateSlider updateSlider, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f127196r = cpxPromoState;
            this.f127197s = kVar;
            this.f127198t = updateSlider;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f127196r, this.f127197s, this.f127198t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f127195q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f127195q = 1;
                if (C43131e0.b(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            CpxPromoState cpxPromoState = this.f127196r;
            boolean z12 = cpxPromoState.f127115h.f127143d;
            CpxPromoInternalAction.UpdateSlider updateSlider = this.f127198t;
            k kVar = this.f127197s;
            if (z12) {
                InterfaceC28373a interfaceC28373a = kVar.f127205g;
                long j12 = updateSlider.f127096c;
                CpxPromoState.BudgetChip budgetChip = cpxPromoState.f127116i.f127125e;
                interfaceC28373a.c(new C19598c(kVar.f127200b, updateSlider.f127102i, j12, budgetChip != null ? budgetChip.f127120b : null, updateSlider.f127101h));
            } else {
                kVar.f127205g.c(new Zr.j(updateSlider.f127096c, kVar.f127200b, updateSlider.f127102i, updateSlider.f127101h));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, CpxPromoState cpxPromoState, a.l lVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f127192t = kVar;
        this.f127193u = cpxPromoState;
        this.f127194v = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f127192t, this.f127193u, this.f127194v, continuation);
        jVar.f127191s = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
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
            int r1 = r13.f127190r
            r2 = 0
            r3 = 2
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState r4 = r13.f127193u
            r5 = 1
            com.avito.android.cpx_promo.impl.mvi.k r6 = r13.f127192t
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r13.f127191s
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction$UpdateSlider r0 = (com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction.UpdateSlider) r0
            kotlin.C42729a0.b(r14)
            goto L73
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction$UpdateSlider r1 = r13.f127189q
            java.lang.Object r5 = r13.f127191s
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
            kotlin.C42729a0.b(r14)
            goto L63
        L2d:
            kotlin.C42729a0.b(r14)
            java.lang.Object r14 = r13.f127191s
            kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
            fs.a r7 = r6.f127203e
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState$SegmentedControlState r1 = r4.f127115h
            boolean r8 = r1.f127143d
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState$BudgetState r1 = r4.f127116i
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState$BudgetChip r1 = r1.f127125e
            if (r1 == 0) goto L44
            java.lang.String r1 = r1.f127120b
            r9 = r1
            goto L45
        L44:
            r9 = r2
        L45:
            com.avito.android.cpx_promo.impl.mvi.entity.a$l r1 = r13.f127194v
            float r1 = r1.f127167a
            int r1 = (int) r1
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            r11 = 0
            com.avito.android.cpx_promo.impl.interactor.model.CpxPromo r12 = r4.f127111d
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction$UpdateSlider r1 = r7.b(r8, r9, r10, r11, r12)
            r13.f127191s = r14
            r13.f127189q = r1
            r13.f127190r = r5
            java.lang.Object r5 = r14.emit(r1, r13)
            if (r5 != r0) goto L62
            return r0
        L62:
            r5 = r14
        L63:
            com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction$Validate r14 = com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction.Validate.f127106b
            r13.f127191s = r1
            r13.f127189q = r2
            r13.f127190r = r3
            java.lang.Object r14 = r5.emit(r14, r13)
            if (r14 != r0) goto L72
            return r0
        L72:
            r0 = r1
        L73:
            kotlinx.coroutines.N0 r14 = r6.f127206h
            if (r14 == 0) goto L7c
            kotlinx.coroutines.V0 r14 = (kotlinx.coroutines.V0) r14
            r14.c(r2)
        L7c:
            com.avito.android.util.R0 r14 = r6.f127202d
            kotlinx.coroutines.d1 r14 = r14.b()
            kotlinx.coroutines.internal.h r14 = kotlinx.coroutines.U.a(r14)
            com.avito.android.cpx_promo.impl.mvi.j$a r1 = new com.avito.android.cpx_promo.impl.mvi.j$a
            r1.<init>(r4, r6, r0, r2)
            r0 = 3
            kotlinx.coroutines.N0 r14 = kotlinx.coroutines.C43259k.d(r14, r2, r2, r1, r0)
            r6.f127206h = r14
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.impl.mvi.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
