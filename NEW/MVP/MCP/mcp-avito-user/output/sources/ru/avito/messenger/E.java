package ru.avito.messenger;

import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.avito.messenger.generated.api.get_channel_by_id.GetChannelByIdResponse;
import ru.avito.messenger.generated.api.get_channel_by_id.GetChatByIdRequest;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lru/avito/messenger/generated/api/get_channel_by_id/GetChannelByIdResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ru.avito.messenger.MessengerClientFacadeImpl$getChannel$forceAlternativeImpl$1$1", f = "MessengerClientFacade.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class E extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super TypedResult<GetChannelByIdResponse>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f430647q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f430648r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f430649s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(D d12, String str, Continuation<? super E> continuation) {
        super(2, continuation);
        this.f430648r = d12;
        this.f430649s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new E(this.f430648r, this.f430649s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super TypedResult<GetChannelByIdResponse>> continuation) {
        return ((E) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f430647q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z81.a aVar = this.f430648r.f430604b.get();
            GetChatByIdRequest getChatByIdRequest = new GetChatByIdRequest(GetChatByIdRequest.Category.Int1, this.f430649s);
            this.f430647q = 1;
            obj = aVar.f(getChatByIdRequest, this);
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
