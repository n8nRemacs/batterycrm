package com.avito.android.verification.verification_confirm_requisites.mvi;

import Y41.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.inn.VerificationInnValidationResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35936s;
import com.avito.android.verification.inn.n;
import com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction;
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

/* compiled from: ConfirmRequisitesActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_confirm_requisites.mvi.ConfirmRequisitesActor$validateInput$2", f = "ConfirmRequisitesActor.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ConfirmRequisitesInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f324981q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f324982r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.verification.verification_confirm_requisites.mvi.a f324983s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n.a f324984t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ConfirmRequisitesInternalAction.SetButtonLoading f324985u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ConfirmRequisitesInternalAction.SetButtonLoading f324986v;

    /* compiled from: ConfirmRequisitesActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_confirm_requisites.mvi.ConfirmRequisitesActor$validateInput$2$1", f = "ConfirmRequisitesActor.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f324987q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ConfirmRequisitesInternalAction.SetButtonLoading f324988r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<ConfirmRequisitesInternalAction> f324989s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ConfirmRequisitesInternalAction.SetButtonLoading setButtonLoading, InterfaceC43172j interfaceC43172j, Continuation continuation) {
            super(2, continuation);
            this.f324988r = setButtonLoading;
            this.f324989s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f324988r, this.f324989s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f324987q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ConfirmRequisitesInternalAction.SetButtonLoading setButtonLoading = this.f324988r;
                this.f324987q = 1;
                if (this.f324989s.emit(setButtonLoading, this) == coroutine_suspended) {
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

    /* compiled from: ConfirmRequisitesActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_confirm_requisites.mvi.ConfirmRequisitesActor$validateInput$2$2", f = "ConfirmRequisitesActor.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f324990q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ConfirmRequisitesInternalAction.SetButtonLoading f324991r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<ConfirmRequisitesInternalAction> f324992s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ConfirmRequisitesInternalAction.SetButtonLoading setButtonLoading, InterfaceC43172j interfaceC43172j, Continuation continuation) {
            super(3, continuation);
            this.f324991r = setButtonLoading;
            this.f324992s = interfaceC43172j;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super TypedResult<VerificationInnValidationResult>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            return new b(this.f324991r, this.f324992s, continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f324990q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ConfirmRequisitesInternalAction.SetButtonLoading setButtonLoading = this.f324991r;
                this.f324990q = 1;
                if (this.f324992s.emit(setButtonLoading, this) == coroutine_suspended) {
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

    /* compiled from: ConfirmRequisitesActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "result", "Lkotlin/G0;", "emit", "(Lcom/avito/android/remote/model/TypedResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.verification.verification_confirm_requisites.mvi.a f324993b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<ConfirmRequisitesInternalAction> f324994c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(com.avito.android.verification.verification_confirm_requisites.mvi.a aVar, InterfaceC43172j<? super ConfirmRequisitesInternalAction> interfaceC43172j) {
            this.f324993b = aVar;
            this.f324994c = interfaceC43172j;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            ConfirmRequisitesInternalAction showErrorToast;
            Object objEmit;
            TypedResult typedResult = (TypedResult) obj;
            boolean z12 = typedResult instanceof TypedResult.Success;
            InterfaceC43172j<ConfirmRequisitesInternalAction> interfaceC43172j = this.f324994c;
            if (z12) {
                VerificationInnValidationResult verificationInnValidationResult = (VerificationInnValidationResult) ((TypedResult.Success) typedResult).getResult();
                int i12 = com.avito.android.verification.verification_confirm_requisites.mvi.a.f324956e;
                com.avito.android.verification.verification_confirm_requisites.mvi.a aVar = this.f324993b;
                aVar.getClass();
                Map<String, AttributedText> errors = verificationInnValidationResult.getErrors();
                DeepLink uri = verificationInnValidationResult.getUri();
                if (errors != null && !errors.isEmpty()) {
                    showErrorToast = new ConfirmRequisitesInternalAction.InputValidationFailed(errors);
                } else if (uri != null) {
                    b.a.a(aVar.f324958b, uri, null, null, 6);
                    showErrorToast = null;
                } else {
                    showErrorToast = new ConfirmRequisitesInternalAction.ShowErrorToast(z.l(new UnknownError()));
                }
                if (showErrorToast != null && (objEmit = interfaceC43172j.emit(showErrorToast, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objEmit;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                Object objEmit2 = interfaceC43172j.emit(new ConfirmRequisitesInternalAction.ShowErrorToast(z.l(C35936s.a(error.getError(), error.getCause()))), continuation);
                if (objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objEmit2;
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.android.verification.verification_confirm_requisites.mvi.a aVar, n.a aVar2, ConfirmRequisitesInternalAction.SetButtonLoading setButtonLoading, ConfirmRequisitesInternalAction.SetButtonLoading setButtonLoading2, Continuation continuation) {
        super(2, continuation);
        this.f324983s = aVar;
        this.f324984t = aVar2;
        this.f324985u = setButtonLoading;
        this.f324986v = setButtonLoading2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        ConfirmRequisitesInternalAction.SetButtonLoading setButtonLoading = this.f324985u;
        ConfirmRequisitesInternalAction.SetButtonLoading setButtonLoading2 = this.f324986v;
        f fVar = new f(this.f324983s, this.f324984t, setButtonLoading, setButtonLoading2, continuation);
        fVar.f324982r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ConfirmRequisitesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f324981q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f324982r;
            com.avito.android.verification.verification_confirm_requisites.mvi.a aVar = this.f324983s;
            X x12 = new X(new C43137a0(new a(this.f324985u, interfaceC43172j, null), aVar.f324959c.b(aVar.f324957a.f324890b, ((n.a.b) this.f324984t).f324117a)), new b(this.f324986v, interfaceC43172j, null));
            c cVar = new c(aVar, interfaceC43172j);
            this.f324981q = 1;
            if (x12.collect(cVar, this) == coroutine_suspended) {
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
