package com.avito.android.messenger.deeplink;

import com.avito.android.messenger.deeplink.Q;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FlowerRedirectDeepLinkHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.deeplink.FlowerRedirectDeepLinkHandler$requestFlower$1", f = "FlowerRedirectDeepLinkHandler.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class S extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f195418q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Q f195419r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FlowerRedirectLink f195420s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Q q12, FlowerRedirectLink flowerRedirectLink, Continuation<? super S> continuation) {
        super(2, continuation);
        this.f195419r = q12;
        this.f195420s = flowerRedirectLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new S(this.f195419r, this.f195420s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((S) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f195418q;
        Q q12 = this.f195419r;
        FlowerRedirectLink flowerRedirectLink = this.f195420s;
        if (i12 == 0) {
            C42729a0.b(obj);
            String str = flowerRedirectLink.f195326b;
            this.f195418q = 1;
            obj = q12.f195406h.a(str, flowerRedirectLink.f195329e, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            C35936s.a(error.getError(), error.getCause());
        }
        q12.i(Q.a.C5767a.f195409b, q12.f195405g, flowerRedirectLink.f195328d);
        return kotlin.G0.f406611a;
    }
}
