package com.avito.android.master_plan.mvi;

import Y41.p;
import com.avito.android.master_plan.mvi.entity.MasterPlanInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pY.InterfaceC47032c;
import wY.C49575a;

/* compiled from: MasterPlanBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/master_plan/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.arch.mvi.b<MasterPlanInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C49575a f186059a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.master_plan.h f186060b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47032c f186061c;

    /* compiled from: MasterPlanBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/master_plan/mvi/entity/MasterPlanInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.master_plan.mvi.MasterPlanBootstrap$produce$1", f = "MasterPlanBootstrap.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 30}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super MasterPlanInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f186062q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f186063r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f186063r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MasterPlanInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[RETURN] */
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
                int r1 = r11.f186062q
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                com.avito.android.master_plan.mvi.c r6 = com.avito.android.master_plan.mvi.c.this
                if (r1 == 0) goto L29
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                kotlin.C42729a0.b(r12)
                goto L8a
            L21:
                java.lang.Object r1 = r11.f186063r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L6a
            L29:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f186063r
                r1 = r12
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                wY.a r12 = r6.f186059a
                com.avito.android.remote.model.Image r7 = r12.f441538a
                if (r7 == 0) goto L7f
                java.util.ArrayList<com.avito.android.lib.design.master_plan_view.MasterPlanPin> r7 = r12.f441539b
                boolean r7 = com.avito.android.util.O2.a(r7)
                if (r7 == 0) goto L7f
                com.avito.android.lib.design.master_plan_view.MasterPlanPin r12 = r12.f441541d
                if (r12 == 0) goto L7f
                r12 = 6
                java.lang.String r3 = "open"
                pY.c r7 = r6.f186061c
                pY.InterfaceC47032c.a.a(r7, r3, r2, r2, r12)
                com.avito.android.master_plan.mvi.entity.MasterPlanInternalAction$InitialArgsChecked r12 = new com.avito.android.master_plan.mvi.entity.MasterPlanInternalAction$InitialArgsChecked
                vY.b r3 = new vY.b
                wY.a r7 = r6.f186059a
                com.avito.android.remote.model.Image r8 = r7.f441538a
                float r9 = r7.f441540c
                com.avito.android.lib.design.master_plan_view.MasterPlanPin r10 = r7.f441541d
                java.util.ArrayList<com.avito.android.lib.design.master_plan_view.MasterPlanPin> r7 = r7.f441539b
                r3.<init>(r8, r7, r9, r10)
                r12.<init>(r3)
                r11.f186063r = r1
                r11.f186062q = r5
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto L6a
                return r0
            L6a:
                com.avito.android.master_plan.h r12 = r6.f186060b
                wY.a r3 = r6.f186059a
                java.lang.String r3 = r3.f441542e
                kotlinx.coroutines.flow.i r12 = r12.a(r3)
                r11.f186063r = r2
                r11.f186062q = r4
                java.lang.Object r12 = kotlinx.coroutines.flow.C43175k.u(r11, r12, r1)
                if (r12 != r0) goto L8a
                return r0
            L7f:
                com.avito.android.master_plan.mvi.entity.MasterPlanInternalAction$WrongInitialArgs r12 = com.avito.android.master_plan.mvi.entity.MasterPlanInternalAction.WrongInitialArgs.f186081b
                r11.f186062q = r3
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto L8a
                return r0
            L8a:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.master_plan.mvi.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@Y61.k C49575a c49575a, @Y61.k com.avito.android.master_plan.h hVar, @Y61.k InterfaceC47032c interfaceC47032c) {
        this.f186059a = c49575a;
        this.f186060b = hVar;
        this.f186061c = interfaceC47032c;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<MasterPlanInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
