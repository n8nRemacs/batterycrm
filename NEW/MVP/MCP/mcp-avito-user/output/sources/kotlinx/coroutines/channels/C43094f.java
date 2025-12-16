package kotlinx.coroutines.channels;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* compiled from: BroadcastChannel.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: kotlinx.coroutines.channels.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43094f extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f410888q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C43092e<Object> f410889r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f410890s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.selects.r<?> f410891t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43094f(C43092e<Object> c43092e, Object obj, kotlinx.coroutines.selects.r<?> rVar, Continuation<? super C43094f> continuation) {
        super(2, continuation);
        this.f410889r = c43092e;
        this.f410890s = obj;
        this.f410891t = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C43094f(this.f410889r, this.f410890s, this.f410891t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C43094f) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410888q;
        boolean z12 = true;
        C43092e<Object> c43092e = this.f410889r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                Object obj2 = this.f410890s;
                this.f410888q = 1;
                if (c43092e.send(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
        } catch (Throwable th2) {
            if (!c43092e.l() || (!(th2 instanceof ClosedSendChannelException) && c43092e.y() != th2)) {
                throw th2;
            }
            z12 = false;
        }
        ReentrantLock reentrantLock = c43092e.f410875o;
        kotlinx.coroutines.selects.r<?> rVar = this.f410891t;
        reentrantLock.lock();
        HashMap<kotlinx.coroutines.selects.r<?>, Object> map = c43092e.f410878r;
        try {
            map.put(rVar, z12 ? kotlin.G0.f406611a : C43122v.f411013l);
            kotlin.G0 g02 = kotlin.G0.f406611a;
            if (((kotlinx.coroutines.selects.o) rVar).l(c43092e, g02) != TrySelectDetailedResult.f412193c) {
                map.remove(rVar);
            }
            reentrantLock.unlock();
            return g02;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
