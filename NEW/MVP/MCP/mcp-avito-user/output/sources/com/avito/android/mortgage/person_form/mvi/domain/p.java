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
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VerificationBannerInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.VerificationBannerInteractorImpl$updateBanner$1", f = "VerificationBannerInteractor.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PersonFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201157q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201158r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f201159s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f201160t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f201161u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f201162v;

    /* compiled from: VerificationBannerInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.VerificationBannerInteractorImpl$updateBanner$1$1", f = "VerificationBannerInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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

    /* compiled from: VerificationBannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJZ/m;", "it", "Lkotlin/G0;", "<anonymous>", "(LJZ/m;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.VerificationBannerInteractorImpl$updateBanner$1$2", f = "VerificationBannerInteractor.kt", i = {}, l = {104, 106}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<JZ.m, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201163q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201164r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201165s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f201165s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f201165s, continuation);
            bVar.f201164r = obj;
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
            int i12 = this.f201163q;
            if (i12 == 0) {
                C42729a0.b(obj);
                JZ.m mVar = (JZ.m) this.f201164r;
                u verificationBanner = mVar.getVerificationBanner();
                boolean zF2 = L.f(verificationBanner != null ? verificationBanner.getStatus() : null, "verified");
                InterfaceC43172j<PersonFormInternalAction> interfaceC43172j = this.f201165s;
                if (zF2) {
                    PersonFormInternalAction.UpdateContent updateContent = new PersonFormInternalAction.UpdateContent(mVar);
                    this.f201163q = 1;
                    if (interfaceC43172j.emit(updateContent, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    PersonFormInternalAction.UpdateVerificationBanner updateVerificationBanner = new PersonFormInternalAction.UpdateVerificationBanner(mVar.getVerificationBanner());
                    this.f201163q = 2;
                    if (interfaceC43172j.emit(updateVerificationBanner, this) == coroutine_suspended) {
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

    /* compiled from: VerificationBannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.VerificationBannerInteractorImpl$updateBanner$1$3", f = "VerificationBannerInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
    public p(o oVar, String str, String str2, String str3, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f201159s = oVar;
        this.f201160t = str;
        this.f201161u = str2;
        this.f201162v = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f201159s, this.f201160t, this.f201161u, this.f201162v, continuation);
        pVar.f201158r = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201157q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201158r;
            com.avito.android.mortgage.person_form.mvi.domain.a aVar = this.f201159s.f201139c;
            a aVar2 = new a(1, null);
            b bVar = new b(interfaceC43172j, null);
            c cVar = new c(2, null);
            this.f201157q = 1;
            if (aVar.a(this.f201160t, this.f201161u, this.f201162v, aVar2, bVar, cVar, this) == coroutine_suspended) {
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
