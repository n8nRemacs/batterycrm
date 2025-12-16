package com.avito.android.auto_reseller_contacts.deepLink;

import Ve.InterfaceC15669a;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.RequestMessageLink;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import okhttp3.internal.Util;

/* compiled from: RequestMessageLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LWe/q;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auto_reseller_contacts.deepLink.RequestMessageLinkHandler$doHandle$1$1$1$1", f = "RequestMessageLinkHandler.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<We.q>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f95737q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f95738r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RequestMessageLink f95739s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, RequestMessageLink requestMessageLink, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f95738r = mVar;
        this.f95739s = requestMessageLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f95738r, this.f95739s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<We.q>> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f95737q;
        if (i12 == 0) {
            C42729a0.b(obj);
            m mVar = this.f95738r;
            InterfaceC15669a interfaceC15669a = mVar.f95747g.get();
            String strA = mVar.f95756p.a();
            String strA2 = mVar.f95755o.a();
            RequestMessageLink requestMessageLink = this.f95739s;
            long longOrDefault = Util.toLongOrDefault(requestMessageLink.f133636b, 0L);
            Boolean boolBoxBoolean = Boxing.boxBoolean(requestMessageLink.f133637c);
            this.f95737q = 1;
            obj = interfaceC15669a.a(strA, longOrDefault, "3/items/{itemId}/chat -> action.url", strA2, Constants.DEEPLINK, boolBoxBoolean, this);
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
