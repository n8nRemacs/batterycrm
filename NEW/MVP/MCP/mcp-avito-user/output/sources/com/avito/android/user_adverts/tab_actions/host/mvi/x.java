package com.avito.android.user_adverts.tab_actions.host.mvi;

import YI0.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsActionsActor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.mvi.UserAdvertsActionsActor$processPrepareActivate$1", f = "UserAdvertsActionsActor.kt", i = {}, l = {262, 262}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class x extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<DeepLink>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314602q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f314603r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35641a f314604s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.d f314605t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a.d dVar, C35641a c35641a, Continuation continuation) {
        super(2, continuation);
        this.f314604s = c35641a;
        this.f314605t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        x xVar = new x(this.f314605t, this.f314604s, continuation);
        xVar.f314603r = obj;
        return xVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<DeepLink>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((x) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314602q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f314603r;
            com.avito.android.user_adverts.tab_actions.host.domain.a aVar = this.f314604s.f314398b;
            Set<String> setB = this.f314605t.b();
            this.f314603r = interfaceC43172j;
            this.f314602q = 1;
            obj = aVar.a(setB, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f314603r;
            C42729a0.b(obj);
        }
        this.f314603r = null;
        this.f314602q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
