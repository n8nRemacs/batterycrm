package com.avito.android.extended_profile_serp.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PublicProfileLink;
import com.avito.android.extended_profile_serp.C30558v;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSerpActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.mvi.ExtendedProfileSerpActor$process$1", f = "ExtendedProfileSerpActor.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSerpInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f152986q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f152987r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSerpState f152988s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f152989t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, ExtendedProfileSerpState extendedProfileSerpState, Continuation continuation) {
        super(2, continuation);
        this.f152988s = extendedProfileSerpState;
        this.f152989t = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f152989t, this.f152988s, continuation);
        gVar.f152987r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSerpInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DeepLink deepLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f152986q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f152987r;
            C30558v c30558v = this.f152988s.f152955e;
            DeepLink deepLink2 = null;
            if (c30558v != null && (deepLink = c30558v.f153116g) != null && (!(deepLink instanceof PublicProfileLink) || !this.f152989t.f153021a.f152446f)) {
                deepLink2 = deepLink;
            }
            ExtendedProfileSerpInternalAction.CloseScreen closeScreen = new ExtendedProfileSerpInternalAction.CloseScreen(deepLink2);
            this.f152986q = 1;
            if (interfaceC43172j.emit(closeScreen, this) == coroutine_suspended) {
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
