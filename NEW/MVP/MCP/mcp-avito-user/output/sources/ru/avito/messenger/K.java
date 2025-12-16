package ru.avito.messenger;

import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.avito.messenger.generated.api.get_user_visible_messages.GetUserVisibleMessagesRequest;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Ld91/i;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ru.avito.messenger.MessengerClientFacadeImpl$history$forceAlternativeImpl$1$1", f = "MessengerClientFacade.kt", i = {}, l = {297}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class K extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super TypedResult<d91.i>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f430664q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f430665r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f430666s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f430667t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(D d12, String str, Integer num, Continuation<? super K> continuation) {
        super(2, continuation);
        this.f430665r = d12;
        this.f430666s = str;
        this.f430667t = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new K(this.f430665r, this.f430666s, this.f430667t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super TypedResult<d91.i>> continuation) {
        return ((K) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f430664q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z81.a aVar = this.f430665r.f430604b.get();
            GetUserVisibleMessagesRequest getUserVisibleMessagesRequest = new GetUserVisibleMessagesRequest(this.f430666s, Boxing.boxLong(this.f430667t.intValue()), null, GetUserVisibleMessagesRequest.Order.Int0);
            this.f430664q = 1;
            obj = aVar.g(getUserVisibleMessagesRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
