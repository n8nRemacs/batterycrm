package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi;

import Y41.p;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameInternalAction;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ReAgentSetProfileNameActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.ReAgentSetProfileNameActor$createProfile$1", f = "ReAgentSetProfileNameActor.kt", i = {0, 1, 2, 2, 4, 4}, l = {72, 74, 82, 83, 87, 88}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$2", "L$0", "L$1"})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ReAgentSetProfileNameInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f211446q;

    /* renamed from: r, reason: collision with root package name */
    public X50.a f211447r;

    /* renamed from: s, reason: collision with root package name */
    public int f211448s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f211449t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f211450u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ReAgentSetProfileNameState f211451v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, ReAgentSetProfileNameState reAgentSetProfileNameState, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f211450u = eVar;
        this.f211451v = reAgentSetProfileNameState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f211450u, this.f211451v, continuation);
        aVar.f211449t = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ReAgentSetProfileNameInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
