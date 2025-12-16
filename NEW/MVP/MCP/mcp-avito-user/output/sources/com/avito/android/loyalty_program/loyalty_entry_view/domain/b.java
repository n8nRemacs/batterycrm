package com.avito.android.loyalty_program.loyalty_entry_view.domain;

import BX.b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yX.C50195a;

/* compiled from: LoyaltyEntryViewInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/domain/b;", "Lcom/avito/android/loyalty_program/loyalty_entry_view/domain/a;", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.loyalty_program.loyalty_entry_view.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C50195a f184157a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FX.a f184158b;

    /* compiled from: LoyaltyEntryViewInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBX/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.loyalty_program.loyalty_entry_view.domain.LoyaltyEntryViewInteractorImpl$getLoyaltyBonusesCount$1", f = "LoyaltyEntryViewInteractor.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 38}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super BX.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f184159q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f184160r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f184160r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BX.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
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
                int r1 = r13.f184159q
                com.avito.android.loyalty_program.loyalty_entry_view.domain.b r2 = com.avito.android.loyalty_program.loyalty_entry_view.domain.b.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                kotlin.C42729a0.b(r14)
                goto Lc6
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1d:
                java.lang.Object r1 = r13.f184160r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L3a
            L25:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f184160r
                r1 = r14
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                FX.a r14 = r2.f184158b
                r13.f184160r = r1
                r13.f184159q = r4
                java.lang.Object r14 = r14.a(r13)
                if (r14 != r0) goto L3a
                return r0
            L3a:
                com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
                boolean r5 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto La8
                com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
                java.lang.Object r14 = r14.getResult()
                GX.a r14 = (GX.a) r14
                BX.b$a r5 = new BX.b$a
                java.lang.Long r7 = r14.getBonusesCount()
                java.lang.String r8 = r14.getFormattedBonusesCount()
                java.lang.String r9 = r14.getUri()
                GX.b r14 = r14.getOnboarding()
                if (r14 == 0) goto La3
                yX.a r2 = r2.f184157a
                com.avito.android.remote.model.serp.Onboarding r10 = new com.avito.android.remote.model.serp.Onboarding
                if (r2 == 0) goto L83
                kotlin.reflect.n<java.lang.Object>[] r11 = yX.C50195a.f443165e
                r12 = 0
                r11 = r11[r12]
                com.avito.android.A0$a r2 = r2.f443166b
                DE0.a r2 = r2.a()
                java.lang.Object r2 = r2.invoke()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != r4) goto L83
                double r11 = java.lang.Math.random()
                java.lang.String r2 = java.lang.String.valueOf(r11)
                goto L87
            L83:
                java.lang.String r2 = r14.getOnceShowId()
            L87:
                if (r2 != 0) goto L8a
                goto La3
            L8a:
                java.lang.String r4 = r14.getTitle()
                if (r4 != 0) goto L91
                goto La3
            L91:
                java.lang.String r11 = r14.getDescription()
                if (r11 != 0) goto L98
                goto La3
            L98:
                java.lang.String r14 = r14.getButtonText()
                if (r14 != 0) goto L9f
                goto La3
            L9f:
                r10.<init>(r2, r4, r11, r14)
                goto La4
            La3:
                r10 = r6
            La4:
                r5.<init>(r7, r8, r9, r10)
                goto Lbb
            La8:
                boolean r2 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lc9
                com.avito.android.remote.model.TypedResult$Error r14 = (com.avito.android.remote.model.TypedResult.Error) r14
                com.avito.android.remote.error.ApiError r2 = r14.getError()
                java.lang.Throwable r14 = r14.getCause()
                com.avito.android.util.C35936s.a(r2, r14)
                BX.b$b r5 = BX.b.C0057b.f1449a
            Lbb:
                r13.f184160r = r6
                r13.f184159q = r3
                java.lang.Object r14 = r1.emit(r5, r13)
                if (r14 != r0) goto Lc6
                return r0
            Lc6:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            Lc9:
                kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                r14.<init>()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.loyalty_program.loyalty_entry_view.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LoyaltyEntryViewInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBX/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.loyalty_program.loyalty_entry_view.domain.LoyaltyEntryViewInteractorImpl$getLoyaltyBonusesCount$2", f = "LoyaltyEntryViewInteractor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.loyalty_program.loyalty_entry_view.domain.b$b, reason: collision with other inner class name */
    public static final class C5399b extends SuspendLambda implements p<InterfaceC43172j<? super BX.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f184162q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f184163r;

        public C5399b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C5399b c5399b = new C5399b(2, continuation);
            c5399b.f184163r = obj;
            return c5399b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BX.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C5399b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f184162q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f184163r;
                b.c cVar = b.c.f1450a;
                this.f184162q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k C50195a c50195a, @k FX.a aVar) {
        this.f184157a = c50195a;
        this.f184158b = aVar;
    }

    @Override // com.avito.android.loyalty_program.loyalty_entry_view.domain.a
    @k
    public final InterfaceC43160i<BX.b> a() {
        return C43175k.I(C43262l0.f411947c, new C43137a0(new C5399b(2, null), C43175k.G(new a(null))));
    }
}
