package mb1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import okhttp3.Response;
import okhttp3.ResponseBody;

@DebugMetadata(c = "com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1", f = "CallHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class i extends SuspendLambda implements p<T, Continuation<? super String>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Response f414630q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Response response, Continuation continuation) {
        super(2, continuation);
        this.f414630q = response;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new i(this.f414630q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super String> continuation) {
        return new i(this.f414630q, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strString;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ResponseBody responseBodyBody = this.f414630q.body();
        return (responseBodyBody == null || (strString = responseBodyBody.string()) == null) ? "" : strString;
    }
}
