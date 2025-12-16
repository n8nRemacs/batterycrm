package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi;

import X50.a;
import Y41.p;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import com.avito.android.passport.deeplinks.PassportCreationBusinessVrfLink;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ReAgentSetProfileNameActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.ReAgentSetProfileNameActor$handleResult$1", f = "ReAgentSetProfileNameActor.kt", i = {}, l = {102, 111, 122, 132, 145, 155}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super ReAgentSetProfileNameInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f211462q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f211463r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X50.a f211464s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f211465t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(X50.a aVar, e eVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f211464s = aVar;
        this.f211465t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f211464s, this.f211465t, continuation);
        dVar.f211463r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ReAgentSetProfileNameInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f211462q) {
            case 0:
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f211463r;
                X50.a aVar = this.f211464s;
                if (aVar instanceof a.b) {
                    ReAgentSetProfileNameInternalAction.OnFinal onFinal = new ReAgentSetProfileNameInternalAction.OnFinal(this.f211465t.f211466a.f211378e, true);
                    this.f211462q = 1;
                    if (interfaceC43172j.emit(onFinal, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar instanceof a.C1318a) {
                    ((a.C1318a) aVar).getClass();
                    ReAgentSetProfileNameInternalAction.HandleDeeplink handleDeeplink = new ReAgentSetProfileNameInternalAction.HandleDeeplink(new PassportSwitchProfileLink(String.valueOf(0), null, 2, null), "passport.add_profile.re_agent_set_profile_name.switch_profile", null, 4, null);
                    this.f211462q = 2;
                    if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar instanceof a.c) {
                    ReAgentSetProfileNameInternalAction.HandleDeeplink handleDeeplink2 = new ReAgentSetProfileNameInternalAction.HandleDeeplink(((a.c) aVar).f18580a, "passport.add_profile.re_agent_set_profile_name.start_verification", null, 4, null);
                    this.f211462q = 3;
                    if (interfaceC43172j.emit(handleDeeplink2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (aVar instanceof a.d) {
                    DeepLink deepLink = ((a.d) aVar).f18582a;
                    if (deepLink instanceof PassportCreationBusinessVrfLink) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("passport_creation_business_vrf_result_after_screen_close_args", true);
                        G0 g02 = G0.f406611a;
                        ReAgentSetProfileNameInternalAction.HandleDeeplink handleDeeplink3 = new ReAgentSetProfileNameInternalAction.HandleDeeplink(bundle, deepLink, "passport.add_profile.re_agent_set_profile_name.business_vrf_link");
                        this.f211462q = 4;
                        if (interfaceC43172j.emit(handleDeeplink3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        ReAgentSetProfileNameInternalAction.HandleDeeplink handleDeeplink4 = new ReAgentSetProfileNameInternalAction.HandleDeeplink(deepLink, "passport.add_profile.re_agent_set_profile_name.next_link", null, 4, null);
                        this.f211462q = 5;
                        if (interfaceC43172j.emit(handleDeeplink4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (aVar instanceof a.e) {
                    ReAgentSetProfileNameInternalAction.Close close = ReAgentSetProfileNameInternalAction.Close.f211470b;
                    this.f211462q = 6;
                    if (interfaceC43172j.emit(close, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                C42729a0.b(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return G0.f406611a;
    }
}
