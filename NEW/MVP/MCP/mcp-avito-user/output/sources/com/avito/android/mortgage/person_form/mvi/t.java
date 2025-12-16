package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import com.avito.android.remote.error.ApiError;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PersonFormContentActorSubscriptions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormContentActorSubscriptions$subscribeInitialLoading$1", f = "PersonFormContentActorSubscriptions.kt", i = {0}, l = {52, 54}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PersonFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201309q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201310r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f201311s;

    /* compiled from: PersonFormContentActorSubscriptions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormContentActorSubscriptions$subscribeInitialLoading$1$1", f = "PersonFormContentActorSubscriptions.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201312q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201313r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f201313r = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f201313r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201312q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PersonFormInternalAction.LoadingStarted loadingStarted = new PersonFormInternalAction.LoadingStarted();
                this.f201312q = 1;
                if (this.f201313r.emit(loadingStarted, this) == coroutine_suspended) {
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

    /* compiled from: PersonFormContentActorSubscriptions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJZ/m;", "it", "Lkotlin/G0;", "<anonymous>", "(LJZ/m;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormContentActorSubscriptions$subscribeInitialLoading$1$2", f = "PersonFormContentActorSubscriptions.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<JZ.m, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201314q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201315r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201316s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f201316s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f201316s, continuation);
            bVar.f201315r = obj;
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
            int i12 = this.f201314q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PersonFormInternalAction.LoadingCompleted loadingCompleted = new PersonFormInternalAction.LoadingCompleted((JZ.m) this.f201315r);
                this.f201314q = 1;
                if (this.f201316s.emit(loadingCompleted, this) == coroutine_suspended) {
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

    /* compiled from: PersonFormContentActorSubscriptions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormContentActorSubscriptions$subscribeInitialLoading$1$3", f = "PersonFormContentActorSubscriptions.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<ApiError, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201317q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201318r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201319s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f201319s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f201319s, continuation);
            cVar.f201318r = obj;
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
            int i12 = this.f201317q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PersonFormInternalAction.LoadingFailed loadingFailed = new PersonFormInternalAction.LoadingFailed((ApiError) this.f201318r);
                this.f201317q = 1;
                if (this.f201319s.emit(loadingFailed, this) == coroutine_suspended) {
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
    public t(v vVar, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f201311s = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t tVar = new t(this.f201311s, continuation);
        tVar.f201310r = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((t) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201309q;
        v vVar = this.f201311s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f201310r;
            if (vVar.f201329f) {
                return G0.f406611a;
            }
            vVar.f201329f = true;
            PersonFormInternalAction.Init init = new PersonFormInternalAction.Init(vVar.f201325b);
            this.f201310r = interfaceC43172j;
            this.f201309q = 1;
            if (interfaceC43172j.emit(init, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f201310r;
            C42729a0.b(obj);
        }
        com.avito.android.mortgage.person_form.mvi.domain.a aVar = vVar.f201326c;
        PersonFormArguments personFormArguments = vVar.f201325b;
        String str = personFormArguments.f200856f;
        String str2 = personFormArguments.f200853c.get(personFormArguments.f200854d);
        a aVar2 = new a(interfaceC43172j, null);
        b bVar = new b(interfaceC43172j, null);
        c cVar = new c(interfaceC43172j, null);
        this.f201310r = null;
        this.f201309q = 2;
        if (aVar.a(str, personFormArguments.f200855e, str2, aVar2, bVar, cVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
