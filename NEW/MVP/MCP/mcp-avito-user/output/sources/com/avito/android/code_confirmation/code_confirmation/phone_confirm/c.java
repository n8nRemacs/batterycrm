package com.avito.android.code_confirmation.code_confirmation.phone_confirm;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.code_confirmation.code_confirmation.RequestCodeV2Source;
import com.avito.android.code_confirmation.code_confirmation.phone_confirm.a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.registration.RequestCodeResult;
import com.avito.android.remote.model.registration.VerifyCodeResult;
import com.avito.android.remote.r;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.Q;
import l41.o;

/* compiled from: PhoneConfirmInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/c;", "Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/b;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.code_confirmation.code_confirmation.phone_confirm.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final r f119591a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f119592b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f119593c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f119594d;

    /* compiled from: PhoneConfirmInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/registration/RequestCodeResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_confirmation.code_confirmation.phone_confirm.PhoneConfirmInteractorImpl$requestCode$1", f = "PhoneConfirmInteractor.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<RequestCodeResult>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f119595q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f119597s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ RequestCodeV2Source f119598t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, RequestCodeV2Source requestCodeV2Source, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f119597s = str;
            this.f119598t = requestCodeV2Source;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new a(this.f119597s, this.f119598t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<RequestCodeResult>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f119595q;
            if (i12 == 0) {
                C42729a0.b(obj);
                r rVar = c.this.f119591a;
                String str = this.f119598t.f119430b;
                this.f119595q = 1;
                obj = rVar.f(this.f119597s, str, this);
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

    /* compiled from: PhoneConfirmInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/registration/RequestCodeResult;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return I.l(new ApiException(c.this.f119593c.a((Throwable) obj), null, 2, null));
        }
    }

    /* compiled from: PhoneConfirmInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_confirmation.code_confirmation.phone_confirm.PhoneConfirmInteractorImpl$sendCode$1", f = "PhoneConfirmInteractor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.code_confirmation.code_confirmation.phone_confirm.c$c, reason: collision with other inner class name */
    public static final class C3511c extends SuspendLambda implements p<T, Continuation<? super TypedResult<VerifyCodeResult>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f119600q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f119602s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f119603t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ RequestCodeV2Source f119604u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3511c(String str, String str2, RequestCodeV2Source requestCodeV2Source, Continuation<? super C3511c> continuation) {
            super(2, continuation);
            this.f119602s = str;
            this.f119603t = str2;
            this.f119604u = requestCodeV2Source;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new C3511c(this.f119602s, this.f119603t, this.f119604u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<VerifyCodeResult>> continuation) {
            return ((C3511c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f119600q;
            if (i12 == 0) {
                C42729a0.b(obj);
                r rVar = c.this.f119591a;
                String str = this.f119604u.f119430b;
                this.f119600q = 1;
                obj = rVar.o(this.f119602s, this.f119603t, str, this);
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

    /* compiled from: PhoneConfirmInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements o {
        public d() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return I.l(new ApiException(c.this.f119593c.a((Throwable) obj), null, 2, null));
        }
    }

    /* compiled from: PhoneConfirmInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "result", "Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/a;", "apply", "(Lcom/avito/android/remote/model/registration/VerifyCodeResult;)Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements o {
        public e() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            VerifyCodeResult verifyCodeResult = (VerifyCodeResult) obj;
            if (verifyCodeResult instanceof VerifyCodeResult.Ok) {
                Boolean reverified = ((VerifyCodeResult.Ok) verifyCodeResult).getReverified();
                return new a.b(reverified != null ? reverified.booleanValue() : false);
            }
            if (verifyCodeResult instanceof VerifyCodeResult.Failure) {
                return new a.C3510a(((VerifyCodeResult.Failure) verifyCodeResult).getMessage());
            }
            if (!(verifyCodeResult instanceof VerifyCodeResult.IncorrectData)) {
                throw new NoWhenBranchMatchedException();
            }
            Map<String, String> messages = ((VerifyCodeResult.IncorrectData) verifyCodeResult).getMessages();
            c cVar = c.this;
            cVar.getClass();
            String f119612b = (String) C42745f0.F(messages.values());
            if (f119612b == null) {
                f119612b = cVar.f119594d.getF119612b();
            }
            return new a.C3510a(f119612b);
        }
    }

    @Inject
    public c(@k r rVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.remote.error.f fVar, @k f fVar2) {
        this.f119591a = rVar;
        this.f119592b = interfaceC35745a5;
        this.f119593c = fVar;
        this.f119594d = fVar2;
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.phone_confirm.b
    @k
    public final I<RequestCodeResult> e(@k String str, @k RequestCodeV2Source requestCodeV2Source, boolean z12, boolean z13) {
        I<TypedResult<RequestCodeResult>> iK2;
        if (z12) {
            iK2 = Q.a(EmptyCoroutineContext.INSTANCE, new a(str, requestCodeV2Source, null));
        } else {
            iK2 = this.f119591a.k(str, z13, requestCodeV2Source.f119430b);
        }
        return g1.a(iK2.z(this.f119592b.a()).t(new b()));
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.phone_confirm.b
    @k
    public final I<com.avito.android.code_confirmation.code_confirmation.phone_confirm.a> g(@k String str, @k String str2, @k RequestCodeV2Source requestCodeV2Source) {
        return g1.a(Q.a(EmptyCoroutineContext.INSTANCE, new C3511c(str, str2, requestCodeV2Source, null)).z(this.f119592b.a()).t(new d())).r(new e());
    }
}
