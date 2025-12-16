package com.avito.android.c2c_trx.deeplinks;

import Ol.C14707a;
import Pl.InterfaceC14800a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: AddAutoToC2CTrxDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LOl/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.c2c_trx.deeplinks.AddAutoToC2CTrxDeepLinkHandler$doHandleSuspend$2", f = "AddAutoToC2CTrxDeepLinkHandler.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<C14707a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f113291q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f113292r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AddAutoToC2CTrxLink.Arguments f113293s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AddAutoToC2CTrxLink.Arguments arguments, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f113292r = cVar;
        this.f113293s = arguments;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f113292r, this.f113293s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<C14707a>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f113291q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC14800a interfaceC14800a = this.f113292r.f113295h;
            this.f113291q = 1;
            obj = interfaceC14800a.a(this.f113293s, this);
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
