package com.avito.android.profile.user_profile.preloading;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import io.reactivex.rxjava3.internal.operators.observable.T;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: UserProfileDataPreloadable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.preloading.UserProfileDataPreloadable$load$1", f = "UserProfileDataPreloadable.kt", i = {0}, l = {21, 22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226570q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226571r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f226572s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f226573t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, e eVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f226572s = bVar;
        this.f226573t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f226572s, this.f226573t, continuation);
        aVar.f226571r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226570q;
        b bVar = this.f226572s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f226571r;
            T tO2 = bVar.f226575b.o();
            this.f226571r = interfaceC43172j;
            this.f226570q = 1;
            obj = C43292o.b(tO2, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f226571r;
            C42729a0.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            C43152f0 c43152f0O = bVar.f226574a.o(this.f226573t.f226578a);
            this.f226571r = null;
            this.f226570q = 2;
            if (C43175k.u(this, c43152f0O, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            UserProfileInternalAction.AuthorizationError authorizationError = UserProfileInternalAction.AuthorizationError.f226415b;
            this.f226571r = null;
            this.f226570q = 3;
            if (interfaceC43172j.emit(authorizationError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
