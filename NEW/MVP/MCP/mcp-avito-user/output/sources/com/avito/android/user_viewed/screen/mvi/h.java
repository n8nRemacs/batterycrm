package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_viewed.domain.model.UserViewedData;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import eK0.C40018a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UserViewedBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "typed", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/user_viewed/domain/model/UserViewedData;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_viewed.screen.mvi.UserViewedBootstrap$observeViewedItems$1", f = "UserViewedBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class h extends SuspendLambda implements Y41.p<TypedResult<UserViewedData>, Continuation<? super UserViewedInternalAction>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f318435q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f318436r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f318436r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f318436r, continuation);
        hVar.f318435q = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(TypedResult<UserViewedData> typedResult, Continuation<? super UserViewedInternalAction> continuation) {
        return ((h) create(typedResult, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        TypedResult typedResult = (TypedResult) this.f318435q;
        if (typedResult instanceof TypedResult.Error) {
            return new UserViewedInternalAction.Error(((TypedResult.Error) typedResult).getError());
        }
        if (!(typedResult instanceof TypedResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Success success = (TypedResult.Success) typedResult;
        this.f318436r.f318439c.c(new C40018a((UserViewedData) success.getResult()));
        return new UserViewedInternalAction.Content(((UserViewedData) success.getResult()).f318385b);
    }
}
