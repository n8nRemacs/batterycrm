package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import i00.InterfaceC41203a;
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

/* compiled from: DeleteRealtyObjectUseCase.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/r;", "Lcom/avito/android/mortgage/root/mvi/domain/q;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41203a> f203110a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final z f203111b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f203112c;

    /* compiled from: DeleteRealtyObjectUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.DeleteRealtyObjectUseCaseImpl$invoke$1", f = "DeleteRealtyObjectUseCase.kt", i = {0, 0, 1, 1}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF, 32, 36}, m = "invokeSuspend", n = {"$this$flow", "type", "$this$flow", "type"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public ApplicationProcessType f203113q;

        /* renamed from: r, reason: collision with root package name */
        public int f203114r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f203115s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f203117u;

        /* compiled from: DeleteRealtyObjectUseCase.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.DeleteRealtyObjectUseCaseImpl$invoke$1$1", f = "DeleteRealtyObjectUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.mortgage.root.mvi.domain.r$a$a, reason: collision with other inner class name */
        public static final class C6045a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
            public C6045a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
                return new C6045a(1, continuation);
            }

            @Override // Y41.l
            public final Object invoke(Continuation<? super G0> continuation) {
                return ((C6045a) create(continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return G0.f406611a;
            }
        }

        /* compiled from: DeleteRealtyObjectUseCase.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJZ/e;", "it", "Lkotlin/G0;", "<anonymous>", "(LJZ/e;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.DeleteRealtyObjectUseCaseImpl$invoke$1$2", f = "DeleteRealtyObjectUseCase.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<JZ.e, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f203118q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f203119r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<MortgageRootInternalAction> f203120s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ ApplicationProcessType f203121t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, ApplicationProcessType applicationProcessType, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f203120s = interfaceC43172j;
                this.f203121t = applicationProcessType;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                b bVar = new b(this.f203120s, this.f203121t, continuation);
                bVar.f203119r = obj;
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
                int i12 = this.f203118q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    JZ.e eVar = (JZ.e) this.f203119r;
                    MortgageRootInternalAction.StepLoadingCompleted stepLoadingCompleted = new MortgageRootInternalAction.StepLoadingCompleted(eVar.getHeader(), eVar.a(), eVar.getMetaInfo(), this.f203121t);
                    this.f203118q = 1;
                    if (this.f203120s.emit(stepLoadingCompleted, this) == coroutine_suspended) {
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

        /* compiled from: DeleteRealtyObjectUseCase.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.DeleteRealtyObjectUseCaseImpl$invoke$1$3", f = "DeleteRealtyObjectUseCase.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<ApiError, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f203122q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f203123r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<MortgageRootInternalAction> f203124s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ ApplicationProcessType f203125t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, ApplicationProcessType applicationProcessType, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f203124s = interfaceC43172j;
                this.f203125t = applicationProcessType;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                c cVar = new c(this.f203124s, this.f203125t, continuation);
                cVar.f203123r = obj;
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
                int i12 = this.f203122q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    MortgageRootInternalAction.StepLoadingFailed stepLoadingFailed = new MortgageRootInternalAction.StepLoadingFailed((ApiError) this.f203123r, this.f203125t);
                    this.f203122q = 1;
                    if (this.f203124s.emit(stepLoadingFailed, this) == coroutine_suspended) {
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
            this.f203117u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = r.this.new a(this.f203117u, continuation);
            aVar.f203115s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f203114r
                com.avito.android.mortgage.root.mvi.domain.r r2 = com.avito.android.mortgage.root.mvi.domain.r.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L31
                if (r1 == r5) goto L27
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                kotlin.C42729a0.b(r11)
                goto Lb9
            L1b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L23:
                kotlin.C42729a0.b(r11)
                goto L91
            L27:
                com.avito.android.mortgage.api.model.items.application.ApplicationProcessType r1 = r10.f203113q
                java.lang.Object r5 = r10.f203115s
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
                kotlin.C42729a0.b(r11)
                goto L72
            L31:
                com.avito.android.mortgage.api.model.items.application.ApplicationProcessType r1 = r10.f203113q
                java.lang.Object r7 = r10.f203115s
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                kotlin.C42729a0.b(r11)
                r11 = r7
                goto L58
            L3c:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f203115s
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.mortgage.api.model.items.application.ApplicationProcessType r1 = com.avito.android.mortgage.api.model.items.application.ApplicationProcessType.CONFIRM_REALTY_OBJECT
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$StepLoadingStarted r7 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$StepLoadingStarted
                r8 = 0
                r7.<init>(r1, r8)
                r10.f203115s = r11
                r10.f203113q = r1
                r10.f203114r = r6
                java.lang.Object r7 = r11.emit(r7, r10)
                if (r7 != r0) goto L58
                return r0
            L58:
                h31.e<i00.a> r7 = r2.f203110a
                java.lang.Object r7 = r7.get()
                i00.a r7 = (i00.InterfaceC41203a) r7
                r10.f203115s = r11
                r10.f203113q = r1
                r10.f203114r = r5
                java.lang.String r5 = r10.f203117u
                java.lang.Object r5 = r7.j(r5, r10)
                if (r5 != r0) goto L6f
                return r0
            L6f:
                r9 = r5
                r5 = r11
                r11 = r9
            L72:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r7 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                r8 = 0
                if (r7 == 0) goto L94
                com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$StepLoadingFailed r2 = new com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction$StepLoadingFailed
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r11 = r11.getError()
                r2.<init>(r11, r1)
                r10.f203115s = r8
                r10.f203113q = r8
                r10.f203114r = r4
                java.lang.Object r11 = r5.emit(r2, r10)
                if (r11 != r0) goto L91
                return r0
            L91:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            L94:
                com.avito.android.mortgage.root.mvi.domain.z r11 = r2.f203111b
                com.avito.android.mortgage.root.mvi.domain.r$a$a r4 = new com.avito.android.mortgage.root.mvi.domain.r$a$a
                r4.<init>(r6, r8)
                com.avito.android.mortgage.root.mvi.domain.r$a$b r6 = new com.avito.android.mortgage.root.mvi.domain.r$a$b
                r6.<init>(r5, r1, r8)
                com.avito.android.mortgage.root.mvi.domain.r$a$c r7 = new com.avito.android.mortgage.root.mvi.domain.r$a$c
                r7.<init>(r5, r1, r8)
                r10.f203115s = r8
                r10.f203113q = r8
                r10.f203114r = r3
                java.lang.String r2 = r10.f203117u
                r1 = r11
                r3 = r4
                r4 = r6
                r5 = r7
                r6 = r10
                java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6)
                if (r11 != r0) goto Lb9
                return r0
            Lb9:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.r.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public r(@Y61.k z zVar, @Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f203110a = eVar;
        this.f203111b = zVar;
        this.f203112c = r02;
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.q
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> a(@Y61.k String str) {
        return C43175k.I(this.f203112c.a(), C43175k.G(new a(str, null)));
    }
}
