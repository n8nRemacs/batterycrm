package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi;

import Ju.InterfaceC14249c;
import Y41.p;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameInternalAction;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ReAgentSetProfileNameActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.ReAgentSetProfileNameActor$handleDeeplinkResult$1", f = "ReAgentSetProfileNameActor.kt", i = {}, l = {190, 196, 213, 221, 237, 245}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super ReAgentSetProfileNameInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f211456q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f211457r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f211458s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14249c f211459t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f211460u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ReAgentSetProfileNameState f211461v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, InterfaceC14249c interfaceC14249c, e eVar, ReAgentSetProfileNameState reAgentSetProfileNameState, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f211458s = str;
        this.f211459t = interfaceC14249c;
        this.f211460u = eVar;
        this.f211461v = reAgentSetProfileNameState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f211458s, this.f211459t, this.f211460u, this.f211461v, continuation);
        cVar.f211457r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ReAgentSetProfileNameInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
