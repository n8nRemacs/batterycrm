package com.avito.android.cpx_promo.v2.mvi;

import Zr.C19598c;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoV2Actor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.v2.mvi.CpxPromoV2Actor$generateSliderChangedActions$1", f = "CpxPromoV2Actor.kt", i = {0, 0, 1}, l = {551, 553}, m = "invokeSuspend", n = {"$this$flow", "updateSliderInternalAction", "updateSliderInternalAction"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoV2InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public CpxPromoV2InternalAction.UpdateSlider f127562q;

    /* renamed from: r, reason: collision with root package name */
    public int f127563r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f127564s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2State f127565t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f127566u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f127567v;

    /* compiled from: CpxPromoV2Actor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cpx_promo.v2.mvi.CpxPromoV2Actor$generateSliderChangedActions$1$1", f = "CpxPromoV2Actor.kt", i = {}, l = {557}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.cpx_promo.v2.mvi.a$a, reason: collision with other inner class name */
    public static final class C3794a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f127568q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CpxPromoV2State f127569r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ m f127570s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ CpxPromoV2InternalAction.UpdateSlider f127571t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3794a(CpxPromoV2State cpxPromoV2State, m mVar, CpxPromoV2InternalAction.UpdateSlider updateSlider, Continuation<? super C3794a> continuation) {
            super(2, continuation);
            this.f127569r = cpxPromoV2State;
            this.f127570s = mVar;
            this.f127571t = updateSlider;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new C3794a(this.f127569r, this.f127570s, this.f127571t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C3794a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f127568q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f127568q = 1;
                if (C43131e0.b(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            CpxPromoV2State cpxPromoV2State = this.f127569r;
            boolean z12 = cpxPromoV2State.f127630h.f127669c;
            CpxPromoV2InternalAction.UpdateSlider updateSlider = this.f127571t;
            m mVar = this.f127570s;
            if (z12) {
                mVar.f127739g.c(new C19598c(mVar.f127734b, updateSlider.f127614l, updateSlider.f127605c, cpxPromoV2State.f127632j.f127652d.f127503b, updateSlider.f127613k));
            } else {
                mVar.f127739g.c(new Zr.j(updateSlider.f127605c, mVar.f127734b, updateSlider.f127614l, updateSlider.f127613k));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CpxPromoV2State cpxPromoV2State, m mVar, float f12, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f127565t = cpxPromoV2State;
        this.f127566u = mVar;
        this.f127567v = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f127565t, this.f127566u, this.f127567v, continuation);
        aVar.f127564s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f127563r
            r2 = 0
            r3 = 2
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State r4 = r11.f127565t
            r5 = 1
            com.avito.android.cpx_promo.v2.mvi.m r6 = r11.f127566u
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r11.f127564s
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$UpdateSlider r0 = (com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction.UpdateSlider) r0
            kotlin.C42729a0.b(r12)
            goto L77
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$UpdateSlider r1 = r11.f127562q
            java.lang.Object r5 = r11.f127564s
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
            kotlin.C42729a0.b(r12)
            goto L67
        L2d:
            kotlin.C42729a0.b(r12)
            java.lang.Object r12 = r11.f127564s
            kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.InterfaceC43172j) r12
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State$f r1 = r4.f127630h
            boolean r1 = r1.f127669c
            ls.a r7 = r6.f127737e
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State$b r8 = r4.f127632j
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2$Auto$Budget$Value$BudgetId r8 = r8.f127652d
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2 r9 = r4.f127626d
            js.c r8 = com.avito.android.cpx_promo.v2.mvi.m.d(r6, r1, r8, r9)
            float r10 = r11.f127567v
            int r10 = (int) r10
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            if (r9 == 0) goto L54
            com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2$a r9 = r9.f127490l
            if (r9 == 0) goto L54
            if (r1 != 0) goto L54
            goto L55
        L54:
            r9 = r2
        L55:
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$UpdateSlider r1 = r7.c(r8, r10, r2, r9)
            r11.f127564s = r12
            r11.f127562q = r1
            r11.f127563r = r5
            java.lang.Object r5 = r12.emit(r1, r11)
            if (r5 != r0) goto L66
            return r0
        L66:
            r5 = r12
        L67:
            com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction$Validate r12 = com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction.Validate.f127621b
            r11.f127564s = r1
            r11.f127562q = r2
            r11.f127563r = r3
            java.lang.Object r12 = r5.emit(r12, r11)
            if (r12 != r0) goto L76
            return r0
        L76:
            r0 = r1
        L77:
            kotlinx.coroutines.N0 r12 = r6.f127740h
            if (r12 == 0) goto L80
            kotlinx.coroutines.V0 r12 = (kotlinx.coroutines.V0) r12
            r12.c(r2)
        L80:
            com.avito.android.util.R0 r12 = r6.f127736d
            kotlinx.coroutines.d1 r12 = r12.b()
            kotlinx.coroutines.internal.h r12 = kotlinx.coroutines.U.a(r12)
            com.avito.android.cpx_promo.v2.mvi.a$a r1 = new com.avito.android.cpx_promo.v2.mvi.a$a
            r1.<init>(r4, r6, r0, r2)
            r0 = 3
            kotlinx.coroutines.N0 r12 = kotlinx.coroutines.C43259k.d(r12, r2, r2, r1, r0)
            r6.f127740h = r12
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.v2.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
