package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import fJ0.InterfaceC40301a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserAdvertsListActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LfJ0/a$a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "<anonymous>", "(LfJ0/a$a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processCloseAction$1", f = "UserAdvertsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35678i extends SuspendLambda implements Y41.p<InterfaceC40301a.AbstractC11137a, Continuation<? super InterfaceC43160i<? extends UserAdvertsListInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f315430q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C35670a f315431r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<UserAdvertsListState> f315432s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35678i(Y41.a aVar, C35670a c35670a, Continuation continuation) {
        super(2, continuation);
        this.f315431r = c35670a;
        this.f315432s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35678i c35678i = new C35678i(this.f315432s, this.f315431r, continuation);
        c35678i.f315430q = obj;
        return c35678i;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC40301a.AbstractC11137a abstractC11137a, Continuation<? super InterfaceC43160i<? extends UserAdvertsListInternalAction>> continuation) {
        return ((C35678i) create(abstractC11137a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f315431r.b((InterfaceC40301a.AbstractC11137a) this.f315430q, this.f315432s.invoke());
    }
}
