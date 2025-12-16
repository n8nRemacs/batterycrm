package com.avito.android.user_adverts.tab_actions.host.mvi;

import YI0.a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import hm0.InterfaceC40961a;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsActionsActor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lhm0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.mvi.UserAdvertsActionsActor$processActions$1", f = "UserAdvertsActionsActor.kt", i = {}, l = {291, 290}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<InterfaceC40961a>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314585q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f314586r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35641a f314587s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.d f314588t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a.d dVar, C35641a c35641a, Continuation continuation) {
        super(2, continuation);
        this.f314587s = c35641a;
        this.f314588t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t tVar = new t(this.f314588t, this.f314587s, continuation);
        tVar.f314586r = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<InterfaceC40961a>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((t) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314585q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f314586r;
            a.d dVar = this.f314588t;
            UserAdvertActionType.Multiple multiple = dVar.f19420c;
            Set<String> setB = dVar.b();
            this.f314586r = interfaceC43172j;
            this.f314585q = 1;
            int i13 = C35641a.f314396d;
            C35641a c35641a = this.f314587s;
            c35641a.getClass();
            int iOrdinal = multiple.ordinal();
            com.avito.android.user_adverts.tab_actions.host.domain.a aVar = c35641a.f314398b;
            if (iOrdinal == 0) {
                obj = aVar.f(setB, null, this);
            } else if (iOrdinal == 1) {
                nI0.i.f414995a.getClass();
                obj = aVar.b(setB, dVar.f19419b.equals("draft"), this);
            } else if (iOrdinal == 2) {
                obj = aVar.c(setB, this);
            } else if (iOrdinal == 3) {
                obj = aVar.e(setB, this);
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = aVar.d(dVar.f19421d, setB);
            }
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
            interfaceC43172j = (InterfaceC43172j) this.f314586r;
            C42729a0.b(obj);
        }
        this.f314586r = null;
        this.f314585q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
