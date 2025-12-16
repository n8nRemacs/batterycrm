package com.avito.android.screens.bbip_private.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction;
import com.avito.android.util.R0;
import hh.InterfaceC40935c;
import ih.InterfaceC41399a;
import javax.inject.Inject;
import jh.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qp0.C47426a;

/* compiled from: BbipPrivateInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/domain/b;", "Lcom/avito/android/screens/bbip_private/domain/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.screens.bbip_private.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f260533a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC41399a f260534b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f260535c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final qp0.c f260536d;

    /* compiled from: BbipPrivateInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private.domain.BbipPrivateInteractorImpl$getConfigurator$1", f = "BbipPrivateInteractor.kt", i = {0, 1, 2, 2}, l = {37, 39, 46, 49, 51}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$2"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super BbipPrivateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public b f260537q;

        /* renamed from: r, reason: collision with root package name */
        public v f260538r;

        /* renamed from: s, reason: collision with root package name */
        public int f260539s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f260540t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f260542v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f260542v = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f260542v, continuation);
            aVar.f260540t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipPrivateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
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
                int r1 = r9.f260539s
                com.avito.android.screens.bbip_private.domain.b r2 = com.avito.android.screens.bbip_private.domain.b.this
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
                jh.v r1 = r9.f260538r
                com.avito.android.screens.bbip_private.domain.b r2 = r9.f260537q
                java.lang.Object r3 = r9.f260540t
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r10)
                goto L91
            L34:
                java.lang.Object r1 = r9.f260540t
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L6d
            L3c:
                java.lang.Object r1 = r9.f260540t
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L5c
            L44:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f260540t
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ConfiguratorLoading r10 = new com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ConfiguratorLoading
                r10.<init>()
                r9.f260540t = r1
                r9.f260539s = r7
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L5c
                return r0
            L5c:
                ih.a r10 = r2.f260534b
                r9.f260540t = r1
                r9.f260539s = r6
                java.lang.String r6 = r9.f260542v
                java.lang.String r7 = r2.f260533a
                java.lang.Object r10 = r10.f(r7, r6, r9)
                if (r10 != r0) goto L6d
                return r0
            L6d:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r6 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r6 == 0) goto Laa
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                jh.v r10 = (jh.v) r10
                com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ConfiguratorContent r3 = new com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ConfiguratorContent
                r3.<init>(r10)
                r9.f260540t = r1
                r9.f260537q = r2
                r9.f260538r = r10
                r9.f260539s = r5
                java.lang.Object r3 = r1.emit(r3, r9)
                if (r3 != r0) goto L8f
                return r0
            L8f:
                r3 = r1
                r1 = r10
            L91:
                qp0.c r10 = r2.f260536d
                qp0.b r10 = r10.e(r1)
                kotlinx.coroutines.flow.i r10 = r2.c(r10)
                r9.f260540t = r8
                r9.f260537q = r8
                r9.f260538r = r8
                r9.f260539s = r4
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
                com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ConfiguratorError r2 = new com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ConfiguratorError
                r2.<init>(r10)
                r9.f260540t = r8
                r9.f260539s = r3
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
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BbipPrivateInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private.domain.BbipPrivateInteractorImpl$postContext$1", f = "BbipPrivateInteractor.kt", i = {0, 1, 2, 2}, l = {75, 79, 82, 84, 87}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$1"})
    /* renamed from: com.avito.android.screens.bbip_private.domain.b$b, reason: collision with other inner class name */
    public static final class C7810b extends SuspendLambda implements p<InterfaceC43172j<? super BbipPrivateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public DeepLinkResponse f260543q;

        /* renamed from: r, reason: collision with root package name */
        public int f260544r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f260545s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Integer f260546t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f260547u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C47426a f260548v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f260549w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7810b(Integer num, b bVar, C47426a c47426a, String str, Continuation<? super C7810b> continuation) {
            super(2, continuation);
            this.f260546t = num;
            this.f260547u = bVar;
            this.f260548v = c47426a;
            this.f260549w = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7810b c7810b = new C7810b(this.f260546t, this.f260547u, this.f260548v, this.f260549w, continuation);
            c7810b.f260545s = obj;
            return c7810b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipPrivateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7810b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private.domain.b.C7810b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BbipPrivateInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private.domain.BbipPrivateInteractorImpl$postForecast$1", f = "BbipPrivateInteractor.kt", i = {0, 1}, l = {58, 62, 63, 64}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f260550q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f260551r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ qp0.b f260553t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qp0.b bVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f260553t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = b.this.new c(this.f260553t, continuation);
            cVar.f260551r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
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
                int r1 = r7.f260550q
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
                goto La2
            L22:
                java.lang.Object r1 = r7.f260551r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L61
            L2a:
                java.lang.Object r1 = r7.f260551r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4a
            L32:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f260551r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ForecastLoading r1 = new com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ForecastLoading
                r1.<init>()
                r7.f260551r = r8
                r7.f260550q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r8
            L4a:
                com.avito.android.screens.bbip_private.domain.b r8 = com.avito.android.screens.bbip_private.domain.b.this
                qp0.c r5 = r8.f260536d
                qp0.b r6 = r7.f260553t
                java.util.Map r5 = r5.a(r6)
                r7.f260551r = r1
                r7.f260550q = r4
                ih.a r8 = r8.f260534b
                java.lang.Object r8 = r8.a(r5, r7)
                if (r8 != r0) goto L61
                return r0
            L61:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L80
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                jh.A r8 = (jh.C42376A) r8
                com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ForecastContent r2 = new com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ForecastContent
                r2.<init>(r8)
                r7.f260551r = r5
                r7.f260550q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto La2
                return r0
            L80:
                boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La5
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r3 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r3, r8)
                com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ForecastError r3 = new com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction$ForecastError
                r3.<init>(r8)
                r7.f260551r = r5
                r7.f260550q = r2
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto La2
                return r0
            La2:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            La5:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private.domain.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@InterfaceC40935c @k String str, @k InterfaceC41399a interfaceC41399a, @k R0 r02, @k qp0.c cVar) {
        this.f260533a = str;
        this.f260534b = interfaceC41399a;
        this.f260535c = r02;
        this.f260536d = cVar;
    }

    @Override // com.avito.android.screens.bbip_private.domain.a
    @k
    public final InterfaceC43160i<BbipPrivateInternalAction> a(@k String str) {
        return C43175k.I(this.f260535c.a(), C43175k.G(new a(str, null)));
    }

    @Override // com.avito.android.screens.bbip_private.domain.a
    @k
    public final InterfaceC43160i<BbipPrivateInternalAction> b(@k C47426a c47426a, @l Integer num, @l String str) {
        return C43175k.I(this.f260535c.a(), C43175k.G(new C7810b(num, this, c47426a, str, null)));
    }

    @Override // com.avito.android.screens.bbip_private.domain.a
    @k
    public final InterfaceC43160i<BbipPrivateInternalAction> c(@k qp0.b bVar) {
        return C43175k.I(this.f260535c.a(), C43175k.G(new c(bVar, null)));
    }
}
