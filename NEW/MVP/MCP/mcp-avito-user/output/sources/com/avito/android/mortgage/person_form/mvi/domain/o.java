package com.avito.android.mortgage.person_form.mvi.domain;

import JZ.u;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.R0;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VerificationBannerInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/domain/o;", "Lcom/avito/android/mortgage/person_form/mvi/domain/n;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f201137a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<IZ.a> f201138b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.mvi.domain.a f201139c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.util.d f201140d;

    /* compiled from: VerificationBannerInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.VerificationBannerInteractorImpl$handleVerificationBannerAction$1", f = "VerificationBannerInteractor.kt", i = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5}, l = {51, 54, 60, 61, 64, 65, 71}, m = "invokeSuspend", n = {"$this$flow", "action", "$this$flow", "action", "$this$flow", "action", "statusChanged", "processId", "$this$flow", "statusChanged", "$this$flow", "statusChanged", "it", "$this$flow", "statusChanged"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PersonFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f201141q;

        /* renamed from: r, reason: collision with root package name */
        public Serializable f201142r;

        /* renamed from: s, reason: collision with root package name */
        public String f201143s;

        /* renamed from: t, reason: collision with root package name */
        public int f201144t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f201145u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u f201146v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ o f201147w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f201148x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f201149y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f201150z;

        /* compiled from: VerificationBannerInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.VerificationBannerInteractorImpl$handleVerificationBannerAction$1$3", f = "VerificationBannerInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.mortgage.person_form.mvi.domain.o$a$a, reason: collision with other inner class name */
        public static final class C5959a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
            public C5959a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
                return new C5959a(1, continuation);
            }

            @Override // Y41.l
            public final Object invoke(Continuation<? super G0> continuation) {
                return ((C5959a) create(continuation)).invokeSuspend(G0.f406611a);
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
        @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.VerificationBannerInteractorImpl$handleVerificationBannerAction$1$4", f = "VerificationBannerInteractor.kt", i = {}, l = {78, 80}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<JZ.m, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f201151q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f201152r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201153s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f201153s = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                b bVar = new b(this.f201153s, continuation);
                bVar.f201152r = obj;
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
                int i12 = this.f201151q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    JZ.m mVar = (JZ.m) this.f201152r;
                    u verificationBanner = mVar.getVerificationBanner();
                    boolean zF2 = L.f(verificationBanner != null ? verificationBanner.getStatus() : null, "verified");
                    InterfaceC43172j<PersonFormInternalAction> interfaceC43172j = this.f201153s;
                    if (zF2) {
                        PersonFormInternalAction.UpdateContent updateContent = new PersonFormInternalAction.UpdateContent(mVar);
                        this.f201151q = 1;
                        if (interfaceC43172j.emit(updateContent, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        PersonFormInternalAction.UpdateVerificationBanner updateVerificationBanner = new PersonFormInternalAction.UpdateVerificationBanner(mVar.getVerificationBanner());
                        this.f201151q = 2;
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
        @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.VerificationBannerInteractorImpl$handleVerificationBannerAction$1$5", f = "VerificationBannerInteractor.kt", i = {0}, l = {84, 85}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        public static final class c extends SuspendLambda implements Y41.p<ApiError, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f201154q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f201155r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<PersonFormInternalAction> f201156s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f201156s = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                c cVar = new c(this.f201156s, continuation);
                cVar.f201155r = obj;
                return cVar;
            }

            @Override // Y41.p
            public final Object invoke(ApiError apiError, Continuation<? super G0> continuation) {
                return ((c) create(apiError, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                ApiError apiError;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f201154q;
                InterfaceC43172j<PersonFormInternalAction> interfaceC43172j = this.f201156s;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    apiError = (ApiError) this.f201155r;
                    PersonFormInternalAction.SetVerificationBannerActionEnabled setVerificationBannerActionEnabled = new PersonFormInternalAction.SetVerificationBannerActionEnabled(true);
                    this.f201155r = apiError;
                    this.f201154q = 1;
                    if (interfaceC43172j.emit(setVerificationBannerActionEnabled, this) == coroutine_suspended) {
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
                    apiError = (ApiError) this.f201155r;
                    C42729a0.b(obj);
                }
                PersonFormInternalAction.ShowError showError = new PersonFormInternalAction.ShowError(apiError);
                this.f201155r = null;
                this.f201154q = 2;
                if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar, o oVar, String str, String str2, String str3, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f201146v = uVar;
            this.f201147w = oVar;
            this.f201148x = str;
            this.f201149y = str2;
            this.f201150z = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f201146v, this.f201147w, this.f201148x, this.f201149y, this.f201150z, continuation);
            aVar.f201145u = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0115 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0166 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 436
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.domain.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public o(@Y61.k R0 r02, @Y61.k h31.e<IZ.a> eVar, @Y61.k com.avito.android.mortgage.person_form.mvi.domain.a aVar, @Y61.k com.avito.android.mortgage.util.d dVar) {
        this.f201137a = r02;
        this.f201138b = eVar;
        this.f201139c = aVar;
        this.f201140d = dVar;
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.n
    @Y61.k
    public final InterfaceC43160i<PersonFormInternalAction> a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k u uVar) {
        return C43175k.I(this.f201137a.a(), C43175k.G(new a(uVar, this, str, str2, str3, null)));
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.n
    @Y61.k
    public final InterfaceC43160i b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return C43175k.I(this.f201137a.a(), C43175k.G(new p(this, str, str2, str3, null)));
    }
}
