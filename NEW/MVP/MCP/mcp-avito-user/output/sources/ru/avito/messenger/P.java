package ru.avito.messenger;

import com.avito.android.remote.model.TypedResult;
import f91.C40264a;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.avito.messenger.generated.api.read_chats.ReadChatsRequest;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lf91/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ru.avito.messenger.MessengerClientFacadeImpl$markChannelsAsRead$forceAlternativeImpl$1$1", f = "MessengerClientFacade.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class P extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super TypedResult<C40264a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f430693q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f430694r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List<String> f430695s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(D d12, List<String> list, Continuation<? super P> continuation) {
        super(2, continuation);
        this.f430694r = d12;
        this.f430695s = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new P(this.f430694r, this.f430695s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super TypedResult<C40264a>> continuation) {
        return ((P) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f430693q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z81.a aVar = this.f430694r.f430604b.get();
            ReadChatsRequest readChatsRequest = new ReadChatsRequest(ReadChatsRequest.Category.Int1, this.f430695s);
            this.f430693q = 1;
            obj = aVar.a(readChatsRequest, this);
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
