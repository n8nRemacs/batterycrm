package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.remote.error.ApiError;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: ApplicationPollingInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.ApplicationPollingInteractorImpl$internalStartPolling$1", f = "ApplicationPollingInteractor.kt", i = {0, 1, 2}, l = {125, 127, 137}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0"})
/* renamed from: com.avito.android.mortgage.root.mvi.domain.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32690d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f203056q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f203057r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32691e f203058s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f203059t;

    /* compiled from: ApplicationPollingInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.ApplicationPollingInteractorImpl$internalStartPolling$1$1", f = "ApplicationPollingInteractor.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.root.mvi.domain.d$a */
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203060q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C32691e f203061r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C32691e c32691e, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f203061r = c32691e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f203061r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f203060q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = this.f203061r.f203071d;
                MortgageRootInternalAction.ApplicationPollingStarted applicationPollingStarted = new MortgageRootInternalAction.ApplicationPollingStarted();
                this.f203060q = 1;
                if (e2Var.emit(applicationPollingStarted, this) == coroutine_suspended) {
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

    /* compiled from: ApplicationPollingInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJZ/e;", "it", "Lkotlin/G0;", "<anonymous>", "(LJZ/e;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.ApplicationPollingInteractorImpl$internalStartPolling$1$2", f = "ApplicationPollingInteractor.kt", i = {0}, l = {131, 132}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    /* renamed from: com.avito.android.mortgage.root.mvi.domain.d$b */
    public static final class b extends SuspendLambda implements Y41.p<JZ.e, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203062q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203063r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C32691e f203064s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C32691e c32691e, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f203064s = c32691e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f203064s, continuation);
            bVar.f203063r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(JZ.e eVar, Continuation<? super G0> continuation) {
            return ((b) create(eVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            JZ.e eVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f203062q;
            C32691e c32691e = this.f203064s;
            if (i12 == 0) {
                C42729a0.b(obj);
                eVar = (JZ.e) this.f203063r;
                e2 e2Var = c32691e.f203071d;
                MortgageRootInternalAction.ApplicationPollingCompleted applicationPollingCompleted = new MortgageRootInternalAction.ApplicationPollingCompleted(eVar.getHeader(), eVar.a(), eVar.getMetaInfo());
                this.f203063r = eVar;
                this.f203062q = 1;
                if (e2Var.emit(applicationPollingCompleted, this) == coroutine_suspended) {
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
                eVar = (JZ.e) this.f203063r;
                C42729a0.b(obj);
            }
            JZ.d metaInfo = eVar.getMetaInfo();
            this.f203063r = null;
            this.f203062q = 2;
            if (C32691e.d(c32691e, metaInfo, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ApplicationPollingInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.ApplicationPollingInteractorImpl$internalStartPolling$1$3", f = "ApplicationPollingInteractor.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.root.mvi.domain.d$c */
    public static final class c extends SuspendLambda implements Y41.p<ApiError, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203065q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203066r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C32691e f203067s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C32691e c32691e, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f203067s = c32691e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f203067s, continuation);
            cVar.f203066r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(ApiError apiError, Continuation<? super G0> continuation) {
            return ((c) create(apiError, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f203065q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ApiError apiError = (ApiError) this.f203066r;
                e2 e2Var = this.f203067s.f203071d;
                MortgageRootInternalAction.ApplicationPollingFailed applicationPollingFailed = new MortgageRootInternalAction.ApplicationPollingFailed(apiError);
                this.f203065q = 1;
                if (e2Var.emit(applicationPollingFailed, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32690d(C32691e c32691e, String str, Continuation<? super C32690d> continuation) {
        super(2, continuation);
        this.f203058s = c32691e;
        this.f203059t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32690d c32690d = new C32690d(this.f203058s, this.f203059t, continuation);
        c32690d.f203057r = obj;
        return c32690d;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C32690d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:13:0x003b). Please report as a decompilation issue!!! */
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
            int r1 = r12.f203056q
            r2 = 3
            r3 = 2
            r4 = 1
            com.avito.android.mortgage.root.mvi.domain.e r5 = r12.f203058s
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r12.f203057r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r13)
            goto L3b
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            java.lang.Object r1 = r12.f203057r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r13)
            goto L73
        L2b:
            java.lang.Object r1 = r12.f203057r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r13)
            goto L53
        L33:
            kotlin.C42729a0.b(r13)
            java.lang.Object r13 = r12.f203057r
            kotlinx.coroutines.T r13 = (kotlinx.coroutines.T) r13
            r1 = r13
        L3b:
            boolean r13 = kotlinx.coroutines.U.e(r1)
            if (r13 == 0) goto L80
            kotlinx.coroutines.flow.e2 r13 = r5.f203071d
            com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$ApplicationPollingStarted r6 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$ApplicationPollingStarted
            r6.<init>()
            r12.f203057r = r1
            r12.f203056q = r4
            java.lang.Object r13 = r13.emit(r6, r12)
            if (r13 != r0) goto L53
            return r0
        L53:
            com.avito.android.mortgage.root.mvi.domain.z r6 = r5.f203068a
            com.avito.android.mortgage.root.mvi.domain.d$a r8 = new com.avito.android.mortgage.root.mvi.domain.d$a
            r13 = 0
            r8.<init>(r5, r13)
            com.avito.android.mortgage.root.mvi.domain.d$b r9 = new com.avito.android.mortgage.root.mvi.domain.d$b
            r9.<init>(r5, r13)
            com.avito.android.mortgage.root.mvi.domain.d$c r10 = new com.avito.android.mortgage.root.mvi.domain.d$c
            r10.<init>(r5, r13)
            r12.f203057r = r1
            r12.f203056q = r3
            java.lang.String r7 = r12.f203059t
            r11 = r12
            java.lang.Object r13 = r6.a(r7, r8, r9, r10, r11)
            if (r13 != r0) goto L73
            return r0
        L73:
            r12.f203057r = r1
            r12.f203056q = r2
            r6 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r13 = kotlinx.coroutines.C43131e0.b(r6, r12)
            if (r13 != r0) goto L3b
            return r0
        L80:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.C32690d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
