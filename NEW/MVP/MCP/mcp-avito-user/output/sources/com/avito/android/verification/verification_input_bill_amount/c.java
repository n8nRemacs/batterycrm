package com.avito.android.verification.verification_input_bill_amount;

import Y41.p;
import Y41.q;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.di.B;
import com.avito.android.remote.A1;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.inn.VerificationInnValidationResult;
import com.avito.android.remote.model.inn.VerificationInputBillAmountResult;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import com.avito.android.verification.verification_input_bill_amount.mvi.entity.InputBillAmountInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VerificationInputBillAmountInteractor.kt */
@B
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/c;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A1 f325501a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f325502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f325503c;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43152f0 f325504b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.verification.verification_input_bill_amount.c$a$a, reason: collision with other inner class name */
        public static final class C10063a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f325505b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.verification.verification_input_bill_amount.VerificationInputBillAmountInteractor$getVerificationInputBillAmountScreenData$$inlined$map$1$2", f = "VerificationInputBillAmountInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.verification.verification_input_bill_amount.c$a$a$a, reason: collision with other inner class name */
            public static final class C10064a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f325506q;

                /* renamed from: r, reason: collision with root package name */
                public int f325507r;

                public C10064a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f325506q = obj;
                    this.f325507r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C10063a.this.emit(null, this);
                }
            }

            public C10063a(InterfaceC43172j interfaceC43172j) {
                this.f325505b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.verification.verification_input_bill_amount.c.a.C10063a.C10064a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.verification.verification_input_bill_amount.c$a$a$a r0 = (com.avito.android.verification.verification_input_bill_amount.c.a.C10063a.C10064a) r0
                    int r1 = r0.f325507r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f325507r = r1
                    goto L18
                L13:
                    com.avito.android.verification.verification_input_bill_amount.c$a$a$a r0 = new com.avito.android.verification.verification_input_bill_amount.c$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f325506q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f325507r
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
                    com.avito.android.verification.verification_input_bill_amount.mvi.entity.InputBillAmountInternalAction$Loading r5 = new com.avito.android.verification.verification_input_bill_amount.mvi.entity.InputBillAmountInternalAction$Loading
                    r5.<init>()
                    goto L63
                L44:
                    boolean r6 = r5 instanceof com.avito.android.util.P2.a
                    if (r6 == 0) goto L53
                    com.avito.android.verification.verification_input_bill_amount.mvi.entity.InputBillAmountInternalAction$Error r6 = new com.avito.android.verification.verification_input_bill_amount.mvi.entity.InputBillAmountInternalAction$Error
                    com.avito.android.util.P2$a r5 = (com.avito.android.util.P2.a) r5
                    com.avito.android.remote.error.ApiError r5 = r5.f318719a
                    r6.<init>(r5)
                L51:
                    r5 = r6
                    goto L63
                L53:
                    boolean r6 = r5 instanceof com.avito.android.util.P2.b
                    if (r6 == 0) goto L71
                    com.avito.android.verification.verification_input_bill_amount.mvi.entity.InputBillAmountInternalAction$Loaded r6 = new com.avito.android.verification.verification_input_bill_amount.mvi.entity.InputBillAmountInternalAction$Loaded
                    com.avito.android.util.P2$b r5 = (com.avito.android.util.P2.b) r5
                    T r5 = r5.f318720a
                    com.avito.android.remote.model.inn.VerificationInputBillAmountResult r5 = (com.avito.android.remote.model.inn.VerificationInputBillAmountResult) r5
                    r6.<init>(r5)
                    goto L51
                L63:
                    r0.f325507r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f325505b
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
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_input_bill_amount.c.a.C10063a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(C43152f0 c43152f0) {
            this.f325504b = c43152f0;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) throws Throwable {
            Object objCollect = this.f325504b.collect(new C10063a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: VerificationInputBillAmountInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/inn/VerificationInputBillAmountResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_input_bill_amount.VerificationInputBillAmountInteractor$getVerificationInputBillAmountScreenData$1", f = "VerificationInputBillAmountInteractor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super P2<? super VerificationInputBillAmountResult>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325509q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f325510r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f325512t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<String, String> map, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f325512t = map;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = c.this.new b(this.f325512t, continuation);
            bVar.f325510r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super P2<? super VerificationInputBillAmountResult>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            P2 aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325509q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f325510r;
                A1 a12 = c.this.f325501a;
                this.f325510r = interfaceC43172j;
                this.f325509q = 1;
                obj = a12.o(this.f325512t, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f325510r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                aVar = new P2.b(((TypedResult.Success) typedResult).getResult());
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new P2.a(((TypedResult.Error) typedResult).getError());
            }
            this.f325510r = null;
            this.f325509q = 2;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationInputBillAmountInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/inn/VerificationInputBillAmountResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_input_bill_amount.VerificationInputBillAmountInteractor$getVerificationInputBillAmountScreenData$2", f = "VerificationInputBillAmountInteractor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.verification.verification_input_bill_amount.c$c, reason: collision with other inner class name */
    public static final class C10065c extends SuspendLambda implements p<InterfaceC43172j<? super P2<? super VerificationInputBillAmountResult>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325513q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f325514r;

        public C10065c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            C10065c c10065c = new C10065c(2, continuation);
            c10065c.f325514r = obj;
            return c10065c;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super P2<? super VerificationInputBillAmountResult>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C10065c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325513q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f325514r;
                P2.c cVar = P2.c.f318721a;
                this.f325513q = 1;
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

    /* compiled from: VerificationInputBillAmountInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/inn/VerificationInputBillAmountResult;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_input_bill_amount.VerificationInputBillAmountInteractor$getVerificationInputBillAmountScreenData$3", f = "VerificationInputBillAmountInteractor.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements q<InterfaceC43172j<? super P2<? super VerificationInputBillAmountResult>>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325515q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f325516r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f325517s;

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super P2<? super VerificationInputBillAmountResult>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = c.this.new d(continuation);
            dVar.f325516r = interfaceC43172j;
            dVar.f325517s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325515q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f325516r;
                P2.a aVar = new P2.a(c.this.f325503c.a(this.f325517s));
                this.f325516r = null;
                this.f325515q = 1;
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

    /* compiled from: VerificationInputBillAmountInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_input_bill_amount.VerificationInputBillAmountInteractor$validateFields$1", f = "VerificationInputBillAmountInteractor.kt", i = {}, l = {43, 43}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325519q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f325520r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f325522t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f325523u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Map<String, String> map, Map<String, ? extends Object> map2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f325522t = map;
            this.f325523u = map2;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = c.this.new e(this.f325522t, this.f325523u, continuation);
            eVar.f325520r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325519q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f325520r;
                A1 a12 = c.this.f325501a;
                this.f325520r = interfaceC43172j;
                this.f325519q = 1;
                obj = a12.e(this.f325522t, this.f325523u, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f325520r;
                C42729a0.b(obj);
            }
            this.f325520r = null;
            this.f325519q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@Y61.k A1 a12, @Y61.k R0 r02, @Y61.k com.avito.android.remote.error.f fVar) {
        this.f325501a = a12;
        this.f325502b = r02;
        this.f325503c = fVar;
    }

    @Y61.k
    public final InterfaceC43160i<InputBillAmountInternalAction> a(@Y61.k Map<String, String> map) {
        return C43175k.I(this.f325502b.a(), new a(new C43152f0(new C43137a0(new C10065c(2, null), C43175k.G(new b(map, null))), new d(null))));
    }

    @Y61.k
    public final InterfaceC43160i<TypedResult<VerificationInnValidationResult>> b(@Y61.k Map<String, String> map, @Y61.k Map<String, ? extends Object> map2) {
        return C43175k.I(this.f325502b.a(), C43175k.G(new e(map, map2, null)));
    }
}
