package com.avito.android.change_specific;

import Y41.q;
import Za0.InterfaceC19524a;
import com.avito.android.change_specific.mvi.entity.ExtendedProfileChangeSpecificInternalAction;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.ProfileConstructionResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import hb0.C40908a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileChangeSpecificInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/change_specific/k;", "Lcom/avito/android/change_specific/j;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f117981a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC19524a> f117982b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f117983c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileChangeSpecificArguments f117984d;

    /* compiled from: ExtendedProfileChangeSpecificInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.change_specific.ExtendedProfileChangeSpecificInteractorImpl$loadSpecifics$1", f = "ExtendedProfileChangeSpecificInteractor.kt", i = {0}, l = {36, 38}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f117985q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f117986r;

        /* compiled from: ExtendedProfileChangeSpecificInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.change_specific.ExtendedProfileChangeSpecificInteractorImpl$loadSpecifics$1$1", f = "ExtendedProfileChangeSpecificInteractor.kt", i = {0, 1}, l = {50, 53, 71}, m = "invokeSuspend", n = {"savedProfileDeferredInfo", "it"}, s = {"L$0", "L$2"})
        /* renamed from: com.avito.android.change_specific.k$a$a, reason: collision with other inner class name */
        public static final class C3434a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public InterfaceC43172j f117988q;

            /* renamed from: r, reason: collision with root package name */
            public ProfileConstructionResponse.Ok f117989r;

            /* renamed from: s, reason: collision with root package name */
            public int f117990s;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f117991t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k f117992u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<?> f117993v;

            /* compiled from: ExtendedProfileChangeSpecificInteractor.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/ProfileConstructionResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.change_specific.ExtendedProfileChangeSpecificInteractorImpl$loadSpecifics$1$1$profileConstructorDeferredData$1", f = "ExtendedProfileChangeSpecificInteractor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.change_specific.k$a$a$a, reason: collision with other inner class name */
            public static final class C3435a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<ProfileConstructionResponse>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f117994q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ k f117995r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3435a(k kVar, Continuation<? super C3435a> continuation) {
                    super(2, continuation);
                    this.f117995r = kVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3435a(this.f117995r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super TypedResult<ProfileConstructionResponse>> continuation) {
                    return ((C3435a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f117994q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC34401z0 interfaceC34401z0 = this.f117995r.f117981a;
                        this.f117994q = 1;
                        obj = interfaceC34401z0.H("upgrade", null, null, this);
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

            /* compiled from: ExtendedProfileChangeSpecificInteractor.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lhb0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.change_specific.ExtendedProfileChangeSpecificInteractorImpl$loadSpecifics$1$1$savedProfileDeferredInfo$1", f = "ExtendedProfileChangeSpecificInteractor.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.change_specific.k$a$a$b */
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<C40908a>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f117996q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ k f117997r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(k kVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f117997r = kVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f117997r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super TypedResult<C40908a>> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f117996q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC19524a interfaceC19524a = this.f117997r.f117982b.get();
                        this.f117996q = 1;
                        obj = interfaceC19524a.f(null, this);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3434a(k kVar, InterfaceC43172j<?> interfaceC43172j, Continuation<? super C3434a> continuation) {
                super(2, continuation);
                this.f117992u = kVar;
                this.f117993v = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C3434a c3434a = new C3434a(this.f117992u, this.f117993v, continuation);
                c3434a.f117991t = obj;
                return c3434a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C3434a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) throws com.avito.android.util.ApiException {
                /*
                    Method dump skipped, instructions count: 375
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.change_specific.k.a.C3434a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = k.this.new a(continuation);
            aVar.f117986r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f117985q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f117986r;
                ExtendedProfileChangeSpecificInternalAction.ContentLoading contentLoading = new ExtendedProfileChangeSpecificInternalAction.ContentLoading();
                this.f117986r = interfaceC43172j;
                this.f117985q = 1;
                if (interfaceC43172j.emit(contentLoading, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f117986r;
                C42729a0.b(obj);
            }
            C3434a c3434a = new C3434a(k.this, interfaceC43172j, null);
            this.f117986r = null;
            this.f117985q = 2;
            if (U.c(c3434a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.change_specific.ExtendedProfileChangeSpecificInteractorImpl$loadSpecifics$2", f = "ExtendedProfileChangeSpecificInteractor.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<?>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f117998q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f117999r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f118000s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f117999r = interfaceC43172j;
            bVar.f118000s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f117998q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f117999r;
                ExtendedProfileChangeSpecificInternalAction.ContentLoadingError contentLoadingError = new ExtendedProfileChangeSpecificInternalAction.ContentLoadingError(this.f118000s);
                this.f117999r = null;
                this.f117998q = 1;
                if (interfaceC43172j.emit(contentLoadingError, this) == coroutine_suspended) {
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

    /* compiled from: ExtendedProfileChangeSpecificInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.change_specific.ExtendedProfileChangeSpecificInteractorImpl$save$1", f = "ExtendedProfileChangeSpecificInteractor.kt", i = {0, 1}, l = {92, 93, 95}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileChangeSpecificInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f118001q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f118002r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f118004t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f118004t = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = k.this.new c(this.f118004t, continuation);
            cVar.f118002r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileChangeSpecificInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) throws com.avito.android.util.ApiException {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f118001q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r6)
                goto L73
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                java.lang.Object r1 = r5.f118002r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L57
            L25:
                java.lang.Object r1 = r5.f118002r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L42
            L2d:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f118002r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                com.avito.android.change_specific.mvi.entity.ExtendedProfileChangeSpecificInternalAction$SavingInProgress r1 = com.avito.android.change_specific.mvi.entity.ExtendedProfileChangeSpecificInternalAction.SavingInProgress.f118029b
                r5.f118002r = r6
                r5.f118001q = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L41
                return r0
            L41:
                r1 = r6
            L42:
                com.avito.android.change_specific.k r6 = com.avito.android.change_specific.k.this
                com.avito.android.remote.z0 r6 = r6.f117981a
                int r4 = r5.f118004t
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
                r5.f118002r = r1
                r5.f118001q = r3
                java.lang.Object r6 = r6.n(r4, r5)
                if (r6 != r0) goto L57
                return r0
            L57:
                com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L76
                com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                java.lang.Object r6 = r6.getResult()
                kotlin.G0 r6 = (kotlin.G0) r6
                com.avito.android.change_specific.mvi.entity.ExtendedProfileChangeSpecificInternalAction$SavingSuccess r6 = com.avito.android.change_specific.mvi.entity.ExtendedProfileChangeSpecificInternalAction.SavingSuccess.f118030b
                r3 = 0
                r5.f118002r = r3
                r5.f118001q = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L73
                return r0
            L73:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L76:
                boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto L89
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r0 = r6.getError()
                java.lang.Throwable r6 = r6.getCause()
                com.avito.android.util.ApiException r6 = com.avito.android.util.C35936s.a(r0, r6)
                throw r6
            L89:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.change_specific.k.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileChangeSpecificInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.change_specific.ExtendedProfileChangeSpecificInteractorImpl$save$2", f = "ExtendedProfileChangeSpecificInteractor.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements q<InterfaceC43172j<? super ExtendedProfileChangeSpecificInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f118005q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f118006r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f118007s;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileChangeSpecificInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f118006r = interfaceC43172j;
            dVar.f118007s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f118005q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f118006r;
                ExtendedProfileChangeSpecificInternalAction.SavingError savingError = new ExtendedProfileChangeSpecificInternalAction.SavingError(this.f118007s);
                this.f118006r = null;
                this.f118005q = 1;
                if (interfaceC43172j.emit(savingError, this) == coroutine_suspended) {
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
    public k(@Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k h31.e<InterfaceC19524a> eVar, @Y61.k R0 r02, @Y61.k ExtendedProfileChangeSpecificArguments extendedProfileChangeSpecificArguments) {
        this.f117981a = interfaceC34401z0;
        this.f117982b = eVar;
        this.f117983c = r02;
        this.f117984d = extendedProfileChangeSpecificArguments;
    }

    @Override // com.avito.android.change_specific.j
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileChangeSpecificInternalAction> a(int i12) {
        return C43175k.I(this.f117983c.a(), new C43152f0(C43175k.G(new c(i12, null)), new d(3, null)));
    }

    @Override // com.avito.android.change_specific.j
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileChangeSpecificInternalAction> b() {
        return C43175k.I(this.f117983c.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }
}
