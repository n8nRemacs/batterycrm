package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.remote.error.ApiError;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: InitialLoadApplicationUseCase.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/u;", "Lcom/avito/android/mortgage/root/mvi/domain/t;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f203129a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final w f203130b;

    /* compiled from: InitialLoadApplicationUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.InitialLoadApplicationUseCaseImpl$loadApplication$1", f = "InitialLoadApplicationUseCase.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203131q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203132r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f203134t;

        /* compiled from: InitialLoadApplicationUseCase.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.InitialLoadApplicationUseCaseImpl$loadApplication$1$1", f = "InitialLoadApplicationUseCase.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.mortgage.root.mvi.domain.u$a$a, reason: collision with other inner class name */
        public static final class C6046a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f203135q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<MortgageRootInternalAction> f203136r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6046a(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super C6046a> continuation) {
                super(1, continuation);
                this.f203136r = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
                return new C6046a(this.f203136r, continuation);
            }

            @Override // Y41.l
            public final Object invoke(Continuation<? super G0> continuation) {
                return ((C6046a) create(continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f203135q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    MortgageRootInternalAction.ApplicationLoadingStarted applicationLoadingStarted = new MortgageRootInternalAction.ApplicationLoadingStarted();
                    this.f203135q = 1;
                    if (this.f203136r.emit(applicationLoadingStarted, this) == coroutine_suspended) {
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

        /* compiled from: InitialLoadApplicationUseCase.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJZ/e;", "it", "Lkotlin/G0;", "<anonymous>", "(LJZ/e;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.InitialLoadApplicationUseCaseImpl$loadApplication$1$2", f = "InitialLoadApplicationUseCase.kt", i = {0}, l = {23, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        public static final class b extends SuspendLambda implements Y41.p<JZ.e, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f203137q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f203138r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<MortgageRootInternalAction> f203139s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ u f203140t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f203141u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, u uVar, String str, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f203139s = interfaceC43172j;
                this.f203140t = uVar;
                this.f203141u = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                b bVar = new b(this.f203139s, this.f203140t, this.f203141u, continuation);
                bVar.f203138r = obj;
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
                int i12 = this.f203137q;
                InterfaceC43172j<MortgageRootInternalAction> interfaceC43172j = this.f203139s;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    eVar = (JZ.e) this.f203138r;
                    MortgageRootInternalAction.ApplicationLoadingCompleted applicationLoadingCompleted = new MortgageRootInternalAction.ApplicationLoadingCompleted(eVar.getHeader(), eVar.a(), eVar.getMetaInfo());
                    this.f203138r = eVar;
                    this.f203137q = 1;
                    if (interfaceC43172j.emit(applicationLoadingCompleted, this) == coroutine_suspended) {
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
                    eVar = (JZ.e) this.f203138r;
                    C42729a0.b(obj);
                }
                InterfaceC43160i<MortgageRootInternalAction> interfaceC43160iA = this.f203140t.f203130b.a(this.f203141u, eVar.getMetaInfo().getVerificationFlow(), eVar.getMetaInfo().getOpenOnFirstLoad());
                this.f203138r = null;
                this.f203137q = 2;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }

        /* compiled from: InitialLoadApplicationUseCase.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.InitialLoadApplicationUseCaseImpl$loadApplication$1$3", f = "InitialLoadApplicationUseCase.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<ApiError, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f203142q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f203143r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<MortgageRootInternalAction> f203144s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f203144s = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                c cVar = new c(this.f203144s, continuation);
                cVar.f203143r = obj;
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
                int i12 = this.f203142q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    MortgageRootInternalAction.ApplicationLoadingFailed applicationLoadingFailed = new MortgageRootInternalAction.ApplicationLoadingFailed((ApiError) this.f203143r);
                    this.f203142q = 1;
                    if (this.f203144s.emit(applicationLoadingFailed, this) == coroutine_suspended) {
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
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f203134t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = u.this.new a(this.f203134t, continuation);
            aVar.f203132r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f203131q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f203132r;
                u uVar = u.this;
                z zVar = uVar.f203129a;
                C6046a c6046a = new C6046a(interfaceC43172j, null);
                b bVar = new b(interfaceC43172j, uVar, this.f203134t, null);
                c cVar = new c(interfaceC43172j, null);
                this.f203131q = 1;
                if (zVar.a(this.f203134t, c6046a, bVar, cVar, this) == coroutine_suspended) {
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
    public u(@Y61.k z zVar, @Y61.k w wVar) {
        this.f203129a = zVar;
        this.f203130b = wVar;
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.t
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> a(@Y61.k String str) {
        return C43175k.G(new a(str, null));
    }
}
