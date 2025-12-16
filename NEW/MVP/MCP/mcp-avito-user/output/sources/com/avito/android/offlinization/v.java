package com.avito.android.offlinization;

import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.InterfaceC44804n;
import okio.M;

/* compiled from: OfflinizationInterceptorImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.offlinization.OfflinizationInterceptorImpl$waitForRequestAsync$1", f = "OfflinizationInterceptorImpl.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class v extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f208641q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43076a0<Response> f208642r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(InterfaceC43076a0<Response> interfaceC43076a0, Continuation<? super v> continuation) {
        super(2, continuation);
        this.f208642r = interfaceC43076a0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new v(this.f208642r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((v) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC44804n source;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f208641q;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43076a0<Response> interfaceC43076a0 = this.f208642r;
                this.f208641q = 1;
                obj = interfaceC43076a0.F(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            ResponseBody responseBodyBody = ((Response) obj).body();
            if (responseBodyBody != null && (source = responseBodyBody.getSource()) != null) {
                source.E1(M.b());
            }
        } catch (Exception e12) {
            V2.f318762a.a("DEFAULT_TAG", "OfflineMode", e12);
        }
        return G0.f406611a;
    }
}
