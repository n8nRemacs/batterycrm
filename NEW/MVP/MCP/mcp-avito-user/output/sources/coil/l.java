package coil;

import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ImageLoaders.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcoil/request/q;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcoil/request/q;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "coil.ImageLoaders$executeBlocking$1", f = "ImageLoaders.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class l extends SuspendLambda implements Y41.p<T, Continuation<? super coil.request.q>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f58513q;

    public l() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super coil.request.q> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f58513q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f58513q = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return obj;
    }
}
