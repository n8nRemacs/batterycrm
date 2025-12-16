package com.avito.android.screens.bbip_v2.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction;
import com.avito.android.util.R0;
import hh.InterfaceC40935c;
import ih.InterfaceC41399a;
import javax.inject.Inject;
import jh.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import up0.C49089a;
import up0.C49090b;
import up0.InterfaceC49091c;

/* compiled from: BbipV2Interactor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/domain/b;", "Lcom/avito/android/screens/bbip_v2/domain/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.screens.bbip_v2.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f261477a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC41399a f261478b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f261479c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC49091c f261480d;

    /* compiled from: BbipV2Interactor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_v2.domain.BbipV2InteractorImpl$getConfigurator$1", f = "BbipV2Interactor.kt", i = {0, 1, 2, 2}, l = {33, 35, 40, 43, 45}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$2"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super BbipV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public b f261481q;

        /* renamed from: r, reason: collision with root package name */
        public j f261482r;

        /* renamed from: s, reason: collision with root package name */
        public int f261483s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f261484t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f261486v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f261486v = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f261486v, continuation);
            aVar.f261484t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
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
                int r1 = r9.f261483s
                com.avito.android.screens.bbip_v2.domain.b r2 = com.avito.android.screens.bbip_v2.domain.b.this
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L44
                if (r1 == r7) goto L3c
                if (r1 == r6) goto L34
                if (r1 == r5) goto L28
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                goto L23
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                kotlin.C42729a0.b(r10)
                goto Lcc
            L28:
                jh.j r1 = r9.f261482r
                com.avito.android.screens.bbip_v2.domain.b r2 = r9.f261481q
                java.lang.Object r3 = r9.f261484t
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r10)
                goto L91
            L34:
                java.lang.Object r1 = r9.f261484t
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L6d
            L3c:
                java.lang.Object r1 = r9.f261484t
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L5c
            L44:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f261484t
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ConfiguratorLoading r10 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ConfiguratorLoading
                r10.<init>()
                r9.f261484t = r1
                r9.f261483s = r7
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L5c
                return r0
            L5c:
                ih.a r10 = r2.f261478b
                r9.f261484t = r1
                r9.f261483s = r6
                java.lang.String r6 = r9.f261486v
                java.lang.String r7 = r2.f261477a
                java.lang.Object r10 = r10.e(r7, r6, r9)
                if (r10 != r0) goto L6d
                return r0
            L6d:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r6 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r6 == 0) goto Laa
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                jh.j r10 = (jh.j) r10
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ConfiguratorContent r3 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ConfiguratorContent
                r3.<init>(r10)
                r9.f261484t = r1
                r9.f261481q = r2
                r9.f261482r = r10
                r9.f261483s = r5
                java.lang.Object r3 = r1.emit(r3, r9)
                if (r3 != r0) goto L8f
                return r0
            L8f:
                r3 = r1
                r1 = r10
            L91:
                up0.c r10 = r2.f261480d
                up0.b r10 = r10.b(r1)
                kotlinx.coroutines.flow.i r10 = r2.b(r10)
                r9.f261484t = r8
                r9.f261481q = r8
                r9.f261482r = r8
                r9.f261483s = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r3)
                if (r10 != r0) goto Lcc
                return r0
            Laa:
                boolean r2 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lcf
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                com.avito.android.remote.error.ApiError r2 = r10.getError()
                java.lang.Throwable r10 = r10.getCause()
                com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r2, r10)
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ConfiguratorError r2 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ConfiguratorError
                r2.<init>(r10)
                r9.f261484t = r8
                r9.f261483s = r3
                java.lang.Object r10 = r1.emit(r2, r9)
                if (r10 != r0) goto Lcc
                return r0
            Lcc:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            Lcf:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_v2.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BbipV2Interactor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_v2.domain.BbipV2InteractorImpl$getForecast$1", f = "BbipV2Interactor.kt", i = {0, 1}, l = {52, 54, 60, 61}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.screens.bbip_v2.domain.b$b, reason: collision with other inner class name */
    public static final class C7824b extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f261487q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f261488r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C49090b f261490t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7824b(C49090b c49090b, Continuation<? super C7824b> continuation) {
            super(2, continuation);
            this.f261490t = c49090b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7824b c7824b = b.this.new C7824b(this.f261490t, continuation);
            c7824b.f261488r = obj;
            return c7824b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7824b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
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
                int r1 = r11.f261487q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                kotlin.C42729a0.b(r12)
                goto Lb5
            L22:
                java.lang.Object r1 = r11.f261488r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L74
            L2a:
                java.lang.Object r1 = r11.f261488r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L4a
            L32:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f261488r
                kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.InterfaceC43172j) r12
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ForecastLoading r1 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ForecastLoading
                r1.<init>()
                r11.f261488r = r12
                r11.f261487q = r5
                java.lang.Object r1 = r12.emit(r1, r11)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r12
            L4a:
                com.avito.android.screens.bbip_v2.domain.b r12 = com.avito.android.screens.bbip_v2.domain.b.this
                ih.a r5 = r12.f261478b
                up0.b r6 = r11.f261490t
                java.lang.Integer r7 = r6.f440295c
                r8 = 0
                if (r7 == 0) goto L5a
                int r7 = r7.intValue()
                goto L5b
            L5a:
                r7 = r8
            L5b:
                java.lang.Integer r9 = r6.f440294b
                if (r9 == 0) goto L63
                int r8 = r9.intValue()
            L63:
                r11.f261488r = r1
                r11.f261487q = r4
                java.lang.String r12 = r12.f261477a
                java.lang.String r9 = r6.f440293a
                r6 = r12
                r10 = r11
                java.lang.Object r12 = r5.b(r6, r7, r8, r9, r10)
                if (r12 != r0) goto L74
                return r0
            L74:
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
                boolean r4 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L93
                com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
                java.lang.Object r12 = r12.getResult()
                jh.n r12 = (jh.n) r12
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ForecastContent r2 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ForecastContent
                r2.<init>(r12)
                r11.f261488r = r5
                r11.f261487q = r3
                java.lang.Object r12 = r1.emit(r2, r11)
                if (r12 != r0) goto Lb5
                return r0
            L93:
                boolean r3 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Lb8
                com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
                com.avito.android.remote.error.ApiError r3 = r12.getError()
                java.lang.Throwable r12 = r12.getCause()
                com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r3, r12)
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ForecastError r3 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ForecastError
                r3.<init>(r12)
                r11.f261488r = r5
                r11.f261487q = r2
                java.lang.Object r12 = r1.emit(r3, r11)
                if (r12 != r0) goto Lb5
                return r0
            Lb5:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            Lb8:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_v2.domain.b.C7824b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BbipV2Interactor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_v2.domain.BbipV2InteractorImpl$postContext$1", f = "BbipV2Interactor.kt", i = {0, 1}, l = {68, 72, 73, 74}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super BbipV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f261491q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f261492r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C49089a f261494t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C49089a c49089a, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f261494t = c49089a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = b.this.new c(this.f261494t, continuation);
            cVar.f261492r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
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
                int r1 = r7.f261491q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.C42729a0.b(r8)
                goto L9f
            L22:
                java.lang.Object r1 = r7.f261492r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5e
            L2a:
                java.lang.Object r1 = r7.f261492r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L47
            L32:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f261492r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ContextLoading r1 = com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction.ContextLoading.f261540b
                r7.f261492r = r8
                r7.f261491q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L46
                return r0
            L46:
                r1 = r8
            L47:
                com.avito.android.screens.bbip_v2.domain.b r8 = com.avito.android.screens.bbip_v2.domain.b.this
                up0.c r5 = r8.f261480d
                up0.a r6 = r7.f261494t
                java.util.Map r5 = r5.a(r6)
                r7.f261492r = r1
                r7.f261491q = r4
                ih.a r8 = r8.f261478b
                java.lang.Object r8 = r8.h(r5, r7)
                if (r8 != r0) goto L5e
                return r0
            L5e:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L7d
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                com.avito.android.remote.model.DeepLinkResponse r8 = (com.avito.android.remote.model.DeepLinkResponse) r8
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ContextContent r2 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ContextContent
                r2.<init>(r8)
                r7.f261492r = r5
                r7.f261491q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto L9f
                return r0
            L7d:
                boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La2
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r3 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r3, r8)
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ContextError r3 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ContextError
                r3.<init>(r8)
                r7.f261492r = r5
                r7.f261491q = r2
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto L9f
                return r0
            L9f:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            La2:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_v2.domain.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@InterfaceC40935c @k String str, @k InterfaceC41399a interfaceC41399a, @k R0 r02, @k InterfaceC49091c interfaceC49091c) {
        this.f261477a = str;
        this.f261478b = interfaceC41399a;
        this.f261479c = r02;
        this.f261480d = interfaceC49091c;
    }

    @Override // com.avito.android.screens.bbip_v2.domain.a
    @k
    public final InterfaceC43160i<BbipV2InternalAction> a(@k String str) {
        return C43175k.I(this.f261479c.a(), C43175k.G(new a(str, null)));
    }

    @Override // com.avito.android.screens.bbip_v2.domain.a
    @k
    public final InterfaceC43160i<BbipV2InternalAction> b(@k C49090b c49090b) {
        return C43175k.I(this.f261479c.a(), C43175k.G(new C7824b(c49090b, null)));
    }

    @Override // com.avito.android.screens.bbip_v2.domain.a
    @k
    public final InterfaceC43160i<BbipV2InternalAction> c(@k C49089a c49089a) {
        return C43175k.I(this.f261479c.a(), C43175k.G(new c(c49089a, null)));
    }
}
