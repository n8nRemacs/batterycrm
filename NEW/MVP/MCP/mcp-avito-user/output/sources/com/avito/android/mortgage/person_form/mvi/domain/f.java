package com.avito.android.mortgage.person_form.mvi.domain;

import JZ.u;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import com.avito.android.remote.error.ApiError;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: MortgageFormPollingInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.MortgageFormPollingInteractorImpl$internalStartPolling$1", f = "MortgageFormPollingInteractor.kt", i = {0, 1}, l = {111, 113}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201053q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201054r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f201055s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f201056t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f201057u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f201058v;

    /* compiled from: MortgageFormPollingInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.MortgageFormPollingInteractorImpl$internalStartPolling$1$1", f = "MortgageFormPollingInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(1, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageFormPollingInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJZ/m;", "it", "Lkotlin/G0;", "<anonymous>", "(LJZ/m;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.MortgageFormPollingInteractorImpl$internalStartPolling$1$2", f = "MortgageFormPollingInteractor.kt", i = {}, l = {120, 122}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<JZ.m, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201059q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201060r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ g f201061s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f201061s = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f201061s, continuation);
            bVar.f201060r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(JZ.m mVar, Continuation<? super G0> continuation) {
            return ((b) create(mVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201059q;
            if (i12 == 0) {
                C42729a0.b(obj);
                JZ.m mVar = (JZ.m) this.f201060r;
                u verificationBanner = mVar.getVerificationBanner();
                boolean zF2 = L.f(verificationBanner != null ? verificationBanner.getStatus() : null, "verified");
                g gVar = this.f201061s;
                if (zF2) {
                    e2 e2Var = gVar.f201066c;
                    PersonFormInternalAction.UpdateContent updateContent = new PersonFormInternalAction.UpdateContent(mVar);
                    this.f201059q = 1;
                    if (e2Var.emit(updateContent, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    e2 e2Var2 = gVar.f201066c;
                    PersonFormInternalAction.UpdateVerificationBanner updateVerificationBanner = new PersonFormInternalAction.UpdateVerificationBanner(mVar.getVerificationBanner());
                    this.f201059q = 2;
                    if (e2Var2.emit(updateVerificationBanner, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageFormPollingInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.MortgageFormPollingInteractorImpl$internalStartPolling$1$3", f = "MortgageFormPollingInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<ApiError, Continuation<? super G0>, Object> {
        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(2, continuation);
        }

        @Override // Y41.p
        public final Object invoke(ApiError apiError, Continuation<? super G0> continuation) {
            return ((c) create(apiError, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, String str2, String str3, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f201055s = gVar;
        this.f201056t = str;
        this.f201057u = str2;
        this.f201058v = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f201055s, this.f201056t, this.f201057u, this.f201058v, continuation);
        fVar.f201054r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0065 -> B:7:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f201053q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r12.f201054r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r13)
        L15:
            r13 = r1
            goto L2e
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            java.lang.Object r1 = r12.f201054r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r13)
            goto L42
        L27:
            kotlin.C42729a0.b(r13)
            java.lang.Object r13 = r12.f201054r
            kotlinx.coroutines.T r13 = (kotlinx.coroutines.T) r13
        L2e:
            boolean r1 = kotlinx.coroutines.U.e(r13)
            if (r1 == 0) goto L68
            r12.f201054r = r13
            r12.f201053q = r3
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r1 = kotlinx.coroutines.C43131e0.b(r4, r12)
            if (r1 != r0) goto L41
            return r0
        L41:
            r1 = r13
        L42:
            com.avito.android.mortgage.person_form.mvi.domain.g r13 = r12.f201055s
            com.avito.android.mortgage.person_form.mvi.domain.a r4 = r13.f201065b
            com.avito.android.mortgage.person_form.mvi.domain.f$a r8 = new com.avito.android.mortgage.person_form.mvi.domain.f$a
            r5 = 0
            r8.<init>(r3, r5)
            com.avito.android.mortgage.person_form.mvi.domain.f$b r9 = new com.avito.android.mortgage.person_form.mvi.domain.f$b
            r9.<init>(r13, r5)
            com.avito.android.mortgage.person_form.mvi.domain.f$c r10 = new com.avito.android.mortgage.person_form.mvi.domain.f$c
            r10.<init>(r2, r5)
            r12.f201054r = r1
            r12.f201053q = r2
            java.lang.String r6 = r12.f201057u
            java.lang.String r7 = r12.f201058v
            java.lang.String r5 = r12.f201056t
            r11 = r12
            java.lang.Object r13 = r4.a(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L15
            return r0
        L68:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.domain.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
