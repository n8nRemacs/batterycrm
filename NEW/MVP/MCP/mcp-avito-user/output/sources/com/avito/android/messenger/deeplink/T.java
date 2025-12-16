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
@DebugMetadata(c = "com.avito.android.messenger.deeplink.FlowerRedirectDeepLinkHandler$requestFlowerAndWaitResult$1", f = "FlowerRedirectDeepLinkHandler.kt", i = {0}, l = {42}, m = "invokeSuspend", n = {"onResultCallback"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class T extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f195423q;

    /* renamed from: r, reason: collision with root package name */
    public int f195424r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Q f195425s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FlowerRedirectLink f195426t;

    /* compiled from: FlowerRedirectDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Q f195427l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ FlowerRedirectLink f195428m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q q12, FlowerRedirectLink flowerRedirectLink) {
            super(0);
            this.f195427l = q12;
            this.f195428m = flowerRedirectLink;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            Q q12 = this.f195427l;
            q12.f195404f.g(q12.d(), false);
            q12.i(Q.a.C5767a.f195409b, q12.f195405g, this.f195428m.f195328d);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Q q12, FlowerRedirectLink flowerRedirectLink, Continuation<? super T> continuation) {
        super(2, continuation);
        this.f195425s = q12;
        this.f195426t = flowerRedirectLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new T(this.f195425s, this.f195426t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((T) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Y41.a aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f195424r;
        if (i12 == 0) {
            C42729a0.b(obj);
            Q q12 = this.f195425s;
            q12.f195404f.g(q12.d(), true);
            FlowerRedirectLink flowerRedirectLink = this.f195426t;
            a aVar2 = new a(q12, flowerRedirectLink);
            String str = flowerRedirectLink.f195326b;
            this.f195423q = aVar2;
            this.f195424r = 1;
            obj = q12.f195406h.a(str, flowerRedirectLink.f195329e, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = aVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (Y41.a) this.f195423q;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            aVar.invoke();
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            C35936s.a(error.getError(), error.getCause());
            aVar.invoke();
        }
        return kotlin.G0.f406611a;
    }
}
