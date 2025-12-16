package com.avito.android.oauth.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.oauth.presentation.OAuthDetails;
import com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction;
import com.avito.android.remote.model.TypedResult;
import h40.C40769a;
import javax.inject.Inject;
import k40.C42502a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import l40.InterfaceC43542a;
import l40.c;

/* compiled from: OAuthInteractorImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/B;", "Lcom/avito/android/oauth/presentation/mvi/A;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.oauth.repository.c f208248a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final OAuthDetails f208249b;

    /* compiled from: OAuthInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.oauth.presentation.mvi.OAuthInteractorImpl$getAuthCode$1", f = "OAuthInteractorImpl.kt", i = {0}, l = {123, 134, 136}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OAuthInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f208250q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f208251r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = B.this.new a(continuation);
            aVar.f208251r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super OAuthInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objC;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f208250q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f208251r;
                B b12 = B.this;
                com.avito.android.oauth.repository.c cVar = b12.f208248a;
                OAuthDetails oAuthDetails = b12.f208249b;
                String str = oAuthDetails.f208236b;
                this.f208251r = interfaceC43172j;
                this.f208250q = 1;
                objC = cVar.f208462a.c(str, oAuthDetails.f208242h, oAuthDetails.f208241g, oAuthDetails.f208243i, oAuthDetails.f208239e, oAuthDetails.f208237c, oAuthDetails.f208238d, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f208251r;
                C42729a0.b(obj);
                interfaceC43172j = interfaceC43172j2;
                objC = obj;
            }
            TypedResult typedResult = (TypedResult) objC;
            if (typedResult instanceof TypedResult.Success) {
                OAuthInternalAction.Redirect redirect = new OAuthInternalAction.Redirect(((C40769a) ((TypedResult.Success) typedResult).getResult()).getRedirectUri());
                this.f208251r = null;
                this.f208250q = 2;
                if (interfaceC43172j.emit(redirect, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                InterfaceC43542a.m mVar = InterfaceC43542a.m.f413461a;
                TypedResult.Error error = typedResult instanceof TypedResult.Error ? (TypedResult.Error) typedResult : null;
                OAuthInternalAction.ShowNetworkError showNetworkError = new OAuthInternalAction.ShowNetworkError(mVar, error != null ? error.getError() : null);
                this.f208251r = null;
                this.f208250q = 3;
                if (interfaceC43172j.emit(showNetworkError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OAuthInteractorImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.oauth.presentation.mvi.OAuthInteractorImpl$getClientAndConsentInfo$1", f = "OAuthInteractorImpl.kt", i = {0, 1, 1, 2, 2, 2}, l = {52, 53, 63, 65, 72, 83, 92}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "consentResult", "$this$flow", "consentResult", "infoResult"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OAuthInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult f208253q;

        /* renamed from: r, reason: collision with root package name */
        public TypedResult f208254r;

        /* renamed from: s, reason: collision with root package name */
        public int f208255s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f208256t;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = B.this.new b(continuation);
            bVar.f208256t = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super OAuthInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01ae A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 480
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.oauth.presentation.mvi.B.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: OAuthInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.oauth.presentation.mvi.OAuthInteractorImpl$sendConsentInfoAndGetCode$1", f = "OAuthInteractorImpl.kt", i = {0}, l = {103, 110, 112}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OAuthInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f208258q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f208259r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c.C11772c f208261t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c.C11772c c11772c, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f208261t = c11772c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = B.this.new c(this.f208261t, continuation);
            cVar.f208259r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super OAuthInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f208258q;
            c.C11772c c11772c = this.f208261t;
            B b12 = B.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f208259r;
                com.avito.android.oauth.repository.c cVar = b12.f208248a;
                String str = c11772c.f413486a;
                this.f208259r = interfaceC43172j;
                this.f208258q = 1;
                obj = cVar.f208462a.a(str, c11772c.f413490e, c11772c.f413488c, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f208259r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if ((typedResult instanceof TypedResult.Success) && ((C42502a) ((TypedResult.Success) typedResult).getResult()).getSuccess()) {
                InterfaceC43160i<OAuthInternalAction> interfaceC43160iC = b12.c();
                this.f208259r = null;
                this.f208258q = 2;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                InterfaceC43542a.o oVar = new InterfaceC43542a.o(c11772c);
                TypedResult.Error error = typedResult instanceof TypedResult.Error ? (TypedResult.Error) typedResult : null;
                OAuthInternalAction.ShowNetworkError showNetworkError = new OAuthInternalAction.ShowNetworkError(oVar, error != null ? error.getError() : null);
                this.f208259r = null;
                this.f208258q = 3;
                if (interfaceC43172j.emit(showNetworkError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public B(@Y61.k com.avito.android.oauth.repository.c cVar, @Y61.k OAuthDetails oAuthDetails) {
        this.f208248a = cVar;
        this.f208249b = oAuthDetails;
    }

    @Override // com.avito.android.oauth.presentation.mvi.A
    @Y61.k
    public final C43152f0 a() {
        return new C43152f0(C43175k.G(new C(this, null)), new D(3, null));
    }

    @Override // com.avito.android.oauth.presentation.mvi.A
    @Y61.k
    public final InterfaceC43160i<OAuthInternalAction> b() {
        return C43175k.G(new b(null));
    }

    @Override // com.avito.android.oauth.presentation.mvi.A
    @Y61.k
    public final InterfaceC43160i<OAuthInternalAction> c() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.oauth.presentation.mvi.A
    @Y61.k
    public final InterfaceC43160i<OAuthInternalAction> d(@Y61.k c.C11772c c11772c) {
        return C43175k.G(new c(c11772c, null));
    }
}
