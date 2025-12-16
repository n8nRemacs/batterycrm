package com.avito.android.verification.verification_form_builder;

import com.avito.android.di.B;
import com.avito.android.remote.A1;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.inn.VerificationInnValidationResult;
import com.avito.android.util.R0;
import com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FormBuilderInteractor.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/h;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A1 f325377a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f325378b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FormBuilderArgs f325379c;

    /* compiled from: FormBuilderInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_form_builder.FormBuilderInteractor$getFormBuilderScreenData$1", f = "FormBuilderInteractor.kt", i = {0, 1}, l = {23, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325380q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f325381r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f325381r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f325380q
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
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto L9e
            L22:
                java.lang.Object r1 = r6.f325381r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L5d
            L2a:
                java.lang.Object r1 = r6.f325381r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4a
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f325381r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction$Loading r1 = new com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction$Loading
                r1.<init>()
                r6.f325381r = r7
                r6.f325380q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r7
            L4a:
                com.avito.android.verification.verification_form_builder.h r7 = com.avito.android.verification.verification_form_builder.h.this
                com.avito.android.remote.A1 r5 = r7.f325377a
                com.avito.android.verification.verification_form_builder.FormBuilderArgs r7 = r7.f325379c
                java.lang.Object r7 = r7.f325334b
                r6.f325381r = r1
                r6.f325380q = r4
                java.lang.Object r7 = r5.t(r7, r6)
                if (r7 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L7c
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                com.avito.android.remote.model.inn.VerificationFormBuilderResult r7 = (com.avito.android.remote.model.inn.VerificationFormBuilderResult) r7
                com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction$Loaded r2 = new com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction$Loaded
                r2.<init>(r7)
                r6.f325381r = r5
                r6.f325380q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L9e
                return r0
            L7c:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La1
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r3 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
                com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction$Error r3 = new com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction$Error
                r3.<init>(r7)
                r6.f325381r = r5
                r6.f325380q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L9e
                return r0
            L9e:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            La1:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_form_builder.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FormBuilderInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_form_builder.FormBuilderInteractor$getFormBuilderScreenData$2", f = "FormBuilderInteractor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<?>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325383q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f325384r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f325385s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f325384r = interfaceC43172j;
            bVar.f325385s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325383q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f325384r;
                FormBuilderInternalAction.Error error = new FormBuilderInternalAction.Error(this.f325385s);
                this.f325384r = null;
                this.f325383q = 1;
                if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
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

    /* compiled from: FormBuilderInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_form_builder.FormBuilderInteractor$validateFields$2", f = "FormBuilderInteractor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<VerificationInnValidationResult>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325386q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f325388s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map<String, ? extends Object> map, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f325388s = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return h.this.new c(this.f325388s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<VerificationInnValidationResult>> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325386q;
            if (i12 == 0) {
                C42729a0.b(obj);
                h hVar = h.this;
                A1 a12 = hVar.f325377a;
                ?? r42 = hVar.f325379c.f325334b;
                this.f325386q = 1;
                obj = a12.s(r42, this.f325388s, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    @Inject
    public h(@Y61.k A1 a12, @Y61.k R0 r02, @Y61.k FormBuilderArgs formBuilderArgs) {
        this.f325377a = a12;
        this.f325378b = r02;
        this.f325379c = formBuilderArgs;
    }

    @Y61.k
    public final InterfaceC43160i<FormBuilderInternalAction> a() {
        return C43175k.I(this.f325378b.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }

    @Y61.l
    public final Object b(@Y61.k Map<String, ? extends Object> map, @Y61.k Continuation<? super TypedResult<VerificationInnValidationResult>> continuation) {
        return C43259k.g(this.f325378b.a(), new c(map, null), continuation);
    }
}
