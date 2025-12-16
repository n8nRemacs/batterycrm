package com.avito.android.mortgage.person_form.mvi;

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

/* compiled from: PersonFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$phoneConfirmed$1", f = "PersonFormActor.kt", i = {}, l = {488}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.person_form.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32657i extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201233q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201234r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32649a f201235s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G00.c f201236t;

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$phoneConfirmed$1$1", f = "PersonFormActor.kt", i = {}, l = {492}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.i$a */
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201237q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<?> f201238r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43172j<?> interfaceC43172j, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f201238r = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f201238r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201237q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PersonFormInternalAction.ReloadingStarted reloadingStarted = new PersonFormInternalAction.ReloadingStarted();
                this.f201237q = 1;
                if (this.f201238r.emit(reloadingStarted, this) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJZ/m;", "it", "Lkotlin/G0;", "<anonymous>", "(LJZ/m;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$phoneConfirmed$1$2", f = "PersonFormActor.kt", i = {}, l = {493}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.i$b */
    public static final class b extends SuspendLambda implements Y41.p<JZ.m, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201239q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201240r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<?> f201241s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC43172j<?> interfaceC43172j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f201241s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f201241s, continuation);
            bVar.f201240r = obj;
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
            int i12 = this.f201239q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PersonFormInternalAction.ReloadingCompleted reloadingCompleted = new PersonFormInternalAction.ReloadingCompleted((JZ.m) this.f201240r);
                this.f201239q = 1;
                if (this.f201241s.emit(reloadingCompleted, this) == coroutine_suspended) {
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

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$phoneConfirmed$1$3", f = "PersonFormActor.kt", i = {}, l = {494}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.i$c */
    public static final class c extends SuspendLambda implements Y41.p<ApiError, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201242q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201243r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<?> f201244s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC43172j<?> interfaceC43172j, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f201244s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f201244s, continuation);
            cVar.f201243r = obj;
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
            int i12 = this.f201242q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PersonFormInternalAction.ReloadingFailed reloadingFailed = new PersonFormInternalAction.ReloadingFailed((ApiError) this.f201243r);
                this.f201242q = 1;
                if (this.f201244s.emit(reloadingFailed, this) == coroutine_suspended) {
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
    public C32657i(G00.c cVar, C32649a c32649a, Continuation continuation) {
        super(2, continuation);
        this.f201235s = c32649a;
        this.f201236t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32657i c32657i = new C32657i(this.f201236t, this.f201235s, continuation);
        c32657i.f201234r = obj;
        return c32657i;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32657i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201233q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201234r;
            com.avito.android.mortgage.person_form.mvi.domain.a aVar = this.f201235s.f200895a;
            G00.c cVar = this.f201236t;
            String str = cVar.f6144b;
            String strC = cVar.c();
            a aVar2 = new a(interfaceC43172j, null);
            b bVar = new b(interfaceC43172j, null);
            c cVar2 = new c(interfaceC43172j, null);
            this.f201233q = 1;
            if (aVar.a(str, cVar.f6145c, strC, aVar2, bVar, cVar2, this) == coroutine_suspended) {
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
