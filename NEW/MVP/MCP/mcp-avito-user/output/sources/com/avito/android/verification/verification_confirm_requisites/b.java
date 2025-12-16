package com.avito.android.verification.verification_confirm_requisites;

import Y41.p;
import Y41.q;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.A1;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.inn.VerificationConfirmRequisitesResult;
import com.avito.android.remote.model.inn.VerificationInnValidationResult;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VerificationConfirmRequisitesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/b;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A1 f324914a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f324915b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f324916c;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43152f0 f324917b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.verification.verification_confirm_requisites.b$a$a, reason: collision with other inner class name */
        public static final class C10049a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f324918b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesInteractor$getVerificationConfirmRequisitesScreenData$$inlined$map$1$2", f = "VerificationConfirmRequisitesInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.verification.verification_confirm_requisites.b$a$a$a, reason: collision with other inner class name */
            public static final class C10050a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f324919q;

                /* renamed from: r, reason: collision with root package name */
                public int f324920r;

                public C10050a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f324919q = obj;
                    this.f324920r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C10049a.this.emit(null, this);
                }
            }

            public C10049a(InterfaceC43172j interfaceC43172j) {
                this.f324918b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.verification.verification_confirm_requisites.b.a.C10049a.C10050a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.verification.verification_confirm_requisites.b$a$a$a r0 = (com.avito.android.verification.verification_confirm_requisites.b.a.C10049a.C10050a) r0
                    int r1 = r0.f324920r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f324920r = r1
                    goto L18
                L13:
                    com.avito.android.verification.verification_confirm_requisites.b$a$a$a r0 = new com.avito.android.verification.verification_confirm_requisites.b$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f324919q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f324920r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L6e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.util.P2 r5 = (com.avito.android.util.P2) r5
                    com.avito.android.util.P2$c r6 = com.avito.android.util.P2.c.f318721a
                    boolean r6 = kotlin.jvm.internal.L.f(r5, r6)
                    if (r6 == 0) goto L44
                    com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction$Loading r5 = new com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction$Loading
                    r5.<init>()
                    goto L63
                L44:
                    boolean r6 = r5 instanceof com.avito.android.util.P2.b
                    if (r6 == 0) goto L55
                    com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction$Loaded r6 = new com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction$Loaded
                    com.avito.android.util.P2$b r5 = (com.avito.android.util.P2.b) r5
                    T r5 = r5.f318720a
                    com.avito.android.remote.model.inn.VerificationConfirmRequisitesResult r5 = (com.avito.android.remote.model.inn.VerificationConfirmRequisitesResult) r5
                    r6.<init>(r5)
                L53:
                    r5 = r6
                    goto L63
                L55:
                    boolean r6 = r5 instanceof com.avito.android.util.P2.a
                    if (r6 == 0) goto L71
                    com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction$Error r6 = new com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction$Error
                    com.avito.android.util.P2$a r5 = (com.avito.android.util.P2.a) r5
                    com.avito.android.remote.error.ApiError r5 = r5.f318719a
                    r6.<init>(r5)
                    goto L53
                L63:
                    r0.f324920r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f324918b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L6e
                    return r1
                L6e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L71:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_confirm_requisites.b.a.C10049a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(C43152f0 c43152f0) {
            this.f324917b = c43152f0;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) throws Throwable {
            Object objCollect = this.f324917b.collect(new C10049a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: VerificationConfirmRequisitesInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/inn/VerificationConfirmRequisitesResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesInteractor$getVerificationConfirmRequisitesScreenData$1", f = "VerificationConfirmRequisitesInteractor.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.verification.verification_confirm_requisites.b$b, reason: collision with other inner class name */
    public static final class C10051b extends SuspendLambda implements p<InterfaceC43172j<? super P2<? super VerificationConfirmRequisitesResult>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f324922q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f324923r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f324925t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10051b(Map<String, String> map, Continuation<? super C10051b> continuation) {
            super(2, continuation);
            this.f324925t = map;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            C10051b c10051b = b.this.new C10051b(this.f324925t, continuation);
            c10051b.f324923r = obj;
            return c10051b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super P2<? super VerificationConfirmRequisitesResult>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C10051b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[RETURN] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f324922q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r6)
                goto L80
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                java.lang.Object r1 = r5.f324923r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L53
            L25:
                java.lang.Object r1 = r5.f324923r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L42
            L2d:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f324923r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                com.avito.android.util.P2$c r1 = com.avito.android.util.P2.c.f318721a
                r5.f324923r = r6
                r5.f324922q = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L41
                return r0
            L41:
                r1 = r6
            L42:
                com.avito.android.verification.verification_confirm_requisites.b r6 = com.avito.android.verification.verification_confirm_requisites.b.this
                com.avito.android.remote.A1 r6 = r6.f324914a
                r5.f324923r = r1
                r5.f324922q = r3
                java.lang.Object r3 = r5.f324925t
                java.lang.Object r6 = r6.h(r3, r5)
                if (r6 != r0) goto L53
                return r0
            L53:
                com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L65
                com.avito.android.util.P2$b r3 = new com.avito.android.util.P2$b
                com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                java.lang.Object r6 = r6.getResult()
                r3.<init>(r6)
                goto L74
            L65:
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L83
                com.avito.android.util.P2$a r3 = new com.avito.android.util.P2$a
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r6 = r6.getError()
                r3.<init>(r6)
            L74:
                r6 = 0
                r5.f324923r = r6
                r5.f324922q = r2
                java.lang.Object r6 = r1.emit(r3, r5)
                if (r6 != r0) goto L80
                return r0
            L80:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L83:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_confirm_requisites.b.C10051b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VerificationConfirmRequisitesInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/inn/VerificationConfirmRequisitesResult;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesInteractor$getVerificationConfirmRequisitesScreenData$2", f = "VerificationConfirmRequisitesInteractor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super P2<? super VerificationConfirmRequisitesResult>>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f324926q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f324927r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f324928s;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super P2<? super VerificationConfirmRequisitesResult>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f324927r = interfaceC43172j;
            cVar.f324928s = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f324926q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f324927r;
                P2.a aVar = new P2.a(b.this.f324916c.a(this.f324928s));
                this.f324927r = null;
                this.f324926q = 1;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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

    /* compiled from: VerificationConfirmRequisitesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesInteractor$validateFields$1", f = "VerificationConfirmRequisitesInteractor.kt", i = {}, l = {44, 44}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f324930q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f324931r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f324933t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f324934u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Map<String, String> map, Map<String, ? extends Object> map2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f324933t = map;
            this.f324934u = map2;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = b.this.new d(this.f324933t, this.f324934u, continuation);
            dVar.f324931r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f324930q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f324931r;
                A1 a12 = b.this.f324914a;
                this.f324931r = interfaceC43172j;
                this.f324930q = 1;
                obj = a12.d(this.f324933t, this.f324934u, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f324931r;
                C42729a0.b(obj);
            }
            this.f324931r = null;
            this.f324930q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k A1 a12, @Y61.k R0 r02, @Y61.k com.avito.android.remote.error.f fVar) {
        this.f324914a = a12;
        this.f324915b = r02;
        this.f324916c = fVar;
    }

    @Y61.k
    public final InterfaceC43160i<ConfirmRequisitesInternalAction> a(@Y61.k Map<String, String> map) {
        return C43175k.I(this.f324915b.a(), new a(new C43152f0(C43175k.G(new C10051b(map, null)), new c(null))));
    }

    @Y61.k
    public final InterfaceC43160i<TypedResult<VerificationInnValidationResult>> b(@Y61.k Map<String, String> map, @Y61.k Map<String, ? extends Object> map2) {
        return C43175k.I(this.f324915b.a(), C43175k.G(new d(map, map2, null)));
    }
}
