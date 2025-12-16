package androidx.room;

import java.util.concurrent.Callable;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CoroutinesRoom.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.room.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C23480x extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Callable<Object> f54419q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f54420r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23480x(Callable callable, kotlinx.coroutines.r rVar, Continuation continuation) {
        super(2, continuation);
        this.f54419q = callable;
        this.f54420r = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C23480x(this.f54419q, this.f54420r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C23480x) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        kotlinx.coroutines.r rVar = this.f54420r;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        try {
            Object objCall = this.f54419q.call();
            int i12 = kotlin.Z.f406624c;
            rVar.resumeWith(objCall);
        } catch (Throwable th2) {
            int i13 = kotlin.Z.f406624c;
            rVar.resumeWith(new Z.b(th2));
        }
        return kotlin.G0.f406611a;
    }
}
