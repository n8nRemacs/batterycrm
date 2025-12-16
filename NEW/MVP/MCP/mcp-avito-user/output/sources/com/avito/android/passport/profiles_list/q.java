package com.avito.android.passport.profiles_list;

import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import l60.InterfaceC43550a;

/* compiled from: ProfilesListInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lp60/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profiles_list.ProfilesListInteractorImpl$loadProfiles$1", f = "ProfilesListInteractor.kt", i = {}, l = {46, 46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<p60.b>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f213855q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f213856r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f213857s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f213857s = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f213857s, continuation);
        qVar.f213856r = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<p60.b>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f213855q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f213856r;
            InterfaceC43550a interfaceC43550a = this.f213857s.f213878a;
            this.f213856r = interfaceC43172j;
            this.f213855q = 1;
            obj = interfaceC43550a.c(this);
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
            interfaceC43172j = (InterfaceC43172j) this.f213856r;
            C42729a0.b(obj);
        }
        this.f213856r = null;
        this.f213855q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
