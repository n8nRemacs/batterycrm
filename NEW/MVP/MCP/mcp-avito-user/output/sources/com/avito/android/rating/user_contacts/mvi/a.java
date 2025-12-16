package com.avito.android.rating.user_contacts.mvi;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserContactsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.user_contacts.mvi.UserContactsActor$handleDeeplink$1", f = "UserContactsActor.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserContactsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247770q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247771r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DeepLink f247772s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f247773t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DeepLink deepLink, Bundle bundle, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f247772s = deepLink;
        this.f247773t = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f247772s, this.f247773t, continuation);
        aVar.f247771r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserContactsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247770q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f247771r;
            DeepLink deepLink = this.f247772s;
            if (deepLink != null) {
                UserContactsInternalAction.HandleDeeplink handleDeeplink = new UserContactsInternalAction.HandleDeeplink(deepLink, this.f247773t);
                this.f247770q = 1;
                if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
