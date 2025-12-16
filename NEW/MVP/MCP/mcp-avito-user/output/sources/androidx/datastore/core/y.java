package androidx.datastore.core;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class y extends SuspendLambda implements Y41.p<T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f45519q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f45520r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f45521s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(Y41.p<Object, ? super Continuation<Object>, ? extends Object> pVar, Object obj, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f45520r = (SuspendLambda) pVar;
        this.f45521s = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new y(this.f45520r, this.f45521s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<Object> continuation) {
        return ((y) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f45519q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f45519q = 1;
            obj = this.f45520r.invoke(this.f45521s, this);
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
