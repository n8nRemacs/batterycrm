package com.avito.android.profile.user_profile.mvi;

import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
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
import kv.C43501a;

/* compiled from: UserProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$deeplinkHandlerFlow$1$1", f = "UserProfileActor.kt", i = {}, l = {381}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile.user_profile.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33393f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226476q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226477r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43501a f226478s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33388a f226479t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33393f(C43501a c43501a, C33388a c33388a, Continuation<? super C33393f> continuation) {
        super(2, continuation);
        this.f226478s = c43501a;
        this.f226479t = c33388a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33393f c33393f = new C33393f(this.f226478s, this.f226479t, continuation);
        c33393f.f226477r = obj;
        return c33393f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33393f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226476q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f226477r;
            boolean z12 = this.f226478s.f413261b instanceof UserAddressLink.Result.Success;
            InterfaceC43160i interfaceC43160iD = C33388a.d(this.f226479t, 3);
            this.f226476q = 1;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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
