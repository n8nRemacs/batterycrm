package com.vk.push.core.network.utils;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: CallHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 0})
@DebugMetadata(c = "com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1", f = "CallHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class c extends SuspendLambda implements p<T, Continuation<? super String>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Response f367128q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Response response, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f367128q = response;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new c(this.f367128q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super String> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strString;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ResponseBody responseBodyBody = this.f367128q.body();
        return (responseBodyBody == null || (strString = responseBodyBody.string()) == null) ? "" : strString;
    }
}
