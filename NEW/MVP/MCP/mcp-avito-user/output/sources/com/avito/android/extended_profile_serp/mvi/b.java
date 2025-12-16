package com.avito.android.extended_profile_serp.mvi;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
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

/* compiled from: ExtendedProfileSerpActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.mvi.ExtendedProfileSerpActor$handleDeeplink$1", f = "ExtendedProfileSerpActor.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSerpInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f152898q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f152899r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DeepLink f152900s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f152901t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSerpState f152902u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f152903v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DeepLink deepLink, n nVar, ExtendedProfileSerpState extendedProfileSerpState, Bundle bundle, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f152900s = deepLink;
        this.f152901t = nVar;
        this.f152902u = extendedProfileSerpState;
        this.f152903v = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f152900s, this.f152901t, this.f152902u, this.f152903v, continuation);
        bVar.f152899r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSerpInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f152898q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f152899r;
            DeepLink deepLink = this.f152900s;
            boolean z12 = deepLink instanceof ExtendedProfilePhoneRequestLink;
            n nVar = this.f152901t;
            if (z12) {
                nVar.getClass();
                InterfaceC43160i interfaceC43160iG = C43175k.G(new c(this.f152902u, nVar, (ExtendedProfilePhoneRequestLink) deepLink, null));
                this.f152898q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                b.a.a(nVar.f153026f, deepLink, null, this.f152903v, 2);
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
