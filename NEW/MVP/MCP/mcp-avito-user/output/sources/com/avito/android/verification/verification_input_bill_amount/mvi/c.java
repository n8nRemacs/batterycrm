package com.avito.android.verification.verification_input_bill_amount.mvi;

import Y41.p;
import Y41.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.inn.VerificationInnValidationResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35936s;
import com.avito.android.verification.inn.n;
import com.avito.android.verification.verification_input_bill_amount.mvi.entity.InputBillAmountInternalAction;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: InputBillAmountActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_input_bill_amount.mvi.InputBillAmountActor$validateInput$2", f = "InputBillAmountActor.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super InputBillAmountInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f325550q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f325551r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f325552s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n.a f325553t;

    /* compiled from: InputBillAmountActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_input_bill_amount.mvi.InputBillAmountActor$validateInput$2$1", f = "InputBillAmountActor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325554q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InputBillAmountInternalAction> f325555r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43172j<? super InputBillAmountInternalAction> interfaceC43172j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f325555r = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f325555r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325554q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InputBillAmountInternalAction.SetButtonLoading setButtonLoading = new InputBillAmountInternalAction.SetButtonLoading(true);
                this.f325554q = 1;
                if (this.f325555r.emit(setButtonLoading, this) == coroutine_suspended) {
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

    /* compiled from: InputBillAmountActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_input_bill_amount.mvi.InputBillAmountActor$validateInput$2$2", f = "InputBillAmountActor.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325556q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InputBillAmountInternalAction> f325557r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43172j<? super InputBillAmountInternalAction> interfaceC43172j, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f325557r = interfaceC43172j;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            return new b(this.f325557r, continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325556q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InputBillAmountInternalAction.SetButtonLoading setButtonLoading = new InputBillAmountInternalAction.SetButtonLoading(false);
                this.f325556q = 1;
                if (this.f325557r.emit(setButtonLoading, this) == coroutine_suspended) {
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

    /* compiled from: InputBillAmountActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "result", "Lkotlin/G0;", "emit", "(Lcom/avito/android/remote/model/TypedResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.verification.verification_input_bill_amount.mvi.c$c, reason: collision with other inner class name */
    public static final class C10066c<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f325558b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InputBillAmountInternalAction> f325559c;

        /* JADX WARN: Multi-variable type inference failed */
        public C10066c(d dVar, InterfaceC43172j<? super InputBillAmountInternalAction> interfaceC43172j) {
            this.f325558b = dVar;
            this.f325559c = interfaceC43172j;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InputBillAmountInternalAction showErrorToast;
            Object objEmit;
            TypedResult typedResult = (TypedResult) obj;
            boolean z12 = typedResult instanceof TypedResult.Success;
            InterfaceC43172j<InputBillAmountInternalAction> interfaceC43172j = this.f325559c;
            if (z12) {
                VerificationInnValidationResult verificationInnValidationResult = (VerificationInnValidationResult) ((TypedResult.Success) typedResult).getResult();
                d dVar = this.f325558b;
                dVar.getClass();
                Map<String, AttributedText> errors = verificationInnValidationResult.getErrors();
                DeepLink uri = verificationInnValidationResult.getUri();
                if (errors != null && !errors.isEmpty()) {
                    showErrorToast = new InputBillAmountInternalAction.InputValidationFailed(errors);
                } else if (uri != null) {
                    b.a.a(dVar.f325561b, uri, null, null, 6);
                    showErrorToast = null;
                } else {
                    showErrorToast = new InputBillAmountInternalAction.ShowErrorToast(z.l(new UnknownError()));
                }
                if (showErrorToast != null && (objEmit = interfaceC43172j.emit(showErrorToast, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objEmit;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                Object objEmit2 = interfaceC43172j.emit(new InputBillAmountInternalAction.ShowErrorToast(z.l(C35936s.a(error.getError(), error.getCause()))), continuation);
                if (objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objEmit2;
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, n.a aVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f325552s = dVar;
        this.f325553t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f325552s, this.f325553t, continuation);
        cVar.f325551r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InputBillAmountInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f325550q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f325551r;
            d dVar = this.f325552s;
            X x12 = new X(new C43137a0(new a(interfaceC43172j, null), dVar.f325562c.b(dVar.f325560a.f325482b, ((n.a.b) this.f325553t).f324117a)), new b(interfaceC43172j, null));
            C10066c c10066c = new C10066c(dVar, interfaceC43172j);
            this.f325550q = 1;
            if (x12.collect(c10066c, this) == coroutine_suspended) {
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
