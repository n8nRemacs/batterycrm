package com.avito.android.user_adverts.tab_actions.host.mvi;

import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsActionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "interAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.mvi.UserAdvertsActionsActor$sendActionResultEvent$1", f = "UserAdvertsActionsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class z extends SuspendLambda implements Y41.p<UserAdvertsActionsInternalAction, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f314609q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35641a f314610r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C35641a c35641a, Continuation<? super z> continuation) {
        super(2, continuation);
        this.f314610r = c35641a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        z zVar = new z(this.f314610r, continuation);
        zVar.f314609q = obj;
        return zVar;
    }

    @Override // Y41.p
    public final Object invoke(UserAdvertsActionsInternalAction userAdvertsActionsInternalAction, Continuation<? super G0> continuation) {
        return ((z) create(userAdvertsActionsInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_actions.host.mvi.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
