package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.R0;
import i00.InterfaceC41203a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UpdateBankSelectionUseCase.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/L;", "Lcom/avito/android/mortgage/root/mvi/domain/K;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class L implements K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f203003a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41203a> f203004b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f203005c;

    /* compiled from: UpdateBankSelectionUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.UpdateBankSelectionUseCaseImpl$invoke$1", f = "UpdateBankSelectionUseCase.kt", i = {0, 1, 3}, l = {35, 38, 47, 53, 62, 67}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203006q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203007r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f203008s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f203009t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ L f203010u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f203011v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f203012w;

        /* compiled from: UpdateBankSelectionUseCase.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.UpdateBankSelectionUseCaseImpl$invoke$1$5", f = "UpdateBankSelectionUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.mortgage.root.mvi.domain.L$a$a, reason: collision with other inner class name */
        public static final class C6044a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
            public C6044a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
                return new C6044a(1, continuation);
            }

            @Override // Y41.l
            public final Object invoke(Continuation<? super G0> continuation) {
                return ((C6044a) create(continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return G0.f406611a;
            }
        }

        /* compiled from: UpdateBankSelectionUseCase.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJZ/e;", "it", "Lkotlin/G0;", "<anonymous>", "(LJZ/e;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.UpdateBankSelectionUseCaseImpl$invoke$1$6", f = "UpdateBankSelectionUseCase.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<JZ.e, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f203013q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f203014r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<?> f203015s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC43172j<?> interfaceC43172j, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f203015s = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                b bVar = new b(this.f203015s, continuation);
                bVar.f203014r = obj;
                return bVar;
            }

            @Override // Y41.p
            public final Object invoke(JZ.e eVar, Continuation<? super G0> continuation) {
                return ((b) create(eVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f203013q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    JZ.e eVar = (JZ.e) this.f203014r;
                    MortgageRootInternalAction.SelectBankLoadingCompleted selectBankLoadingCompleted = new MortgageRootInternalAction.SelectBankLoadingCompleted(eVar.getHeader(), eVar.a(), eVar.getMetaInfo());
                    this.f203013q = 1;
                    if (this.f203015s.emit(selectBankLoadingCompleted, this) == coroutine_suspended) {
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

        /* compiled from: UpdateBankSelectionUseCase.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.UpdateBankSelectionUseCaseImpl$invoke$1$7", f = "UpdateBankSelectionUseCase.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<ApiError, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f203016q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f203017r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<?> f203018s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC43172j<?> interfaceC43172j, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f203018s = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                c cVar = new c(this.f203018s, continuation);
                cVar.f203017r = obj;
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
                int i12 = this.f203016q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    MortgageRootInternalAction.SelectBankLoadingFailed selectBankLoadingFailed = new MortgageRootInternalAction.SelectBankLoadingFailed((ApiError) this.f203017r);
                    this.f203016q = 1;
                    if (this.f203018s.emit(selectBankLoadingFailed, this) == coroutine_suspended) {
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
        public a(String str, String str2, L l12, String str3, boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f203008s = str;
            this.f203009t = str2;
            this.f203010u = l12;
            this.f203011v = str3;
            this.f203012w = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f203008s, this.f203009t, this.f203010u, this.f203011v, this.f203012w, continuation);
            aVar.f203007r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 330
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.L.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public L(@Y61.k z zVar, @Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f203003a = zVar;
        this.f203004b = eVar;
        this.f203005c = r02;
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.K
    @Y61.k
    public final InterfaceC43160i a(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, boolean z12) {
        return C43175k.I(this.f203005c.a(), C43175k.G(new a(str, str2, this, str3, z12, null)));
    }
}
