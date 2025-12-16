package com.avito.android.user_adverts.tab_actions.info.mvi;

import Y41.p;
import Y61.k;
import Y61.l;
import bJ0.C25520c;
import bJ0.InterfaceC25518a;
import com.avito.android.user_adverts.tab_actions.info.mvi.entity.UserAdvertsActionResultInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserAdvertsActionResultActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LbJ0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction;", "<anonymous>", "(LbJ0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.info.mvi.UserAdvertsActionResultActor$process$1", f = "UserAdvertsActionResultActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements p<InterfaceC25518a, Continuation<? super InterfaceC43160i<? extends UserAdvertsActionResultInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f314674q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f314675r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C25520c> f314676s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Y41.a<C25520c> aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f314675r = cVar;
        this.f314676s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f314675r, this.f314676s, continuation);
        bVar.f314674q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC25518a interfaceC25518a, Continuation<? super InterfaceC43160i<? extends UserAdvertsActionResultInternalAction>> continuation) {
        return ((b) create(interfaceC25518a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f314676s.invoke();
        this.f314675r.getClass();
        return C43175k.w();
    }
}
