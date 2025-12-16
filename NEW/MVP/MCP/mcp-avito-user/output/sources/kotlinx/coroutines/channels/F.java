package kotlinx.coroutines.channels;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.B;

/* compiled from: Channels.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/channels/B;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/channels/B;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class F extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super B<? extends kotlin.G0>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f410786q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f410787r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ M0<Object> f410788s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f410789t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(M0<Object> m02, Object obj, Continuation<? super F> continuation) {
        super(2, continuation);
        this.f410788s = m02;
        this.f410789t = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        F f12 = new F(this.f410788s, this.f410789t, continuation);
        f12.f410787r = obj;
        return f12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super B<? extends kotlin.G0>> continuation) {
        return ((F) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object bVar;
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410786q;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                M0<Object> m02 = this.f410788s;
                Object obj2 = this.f410789t;
                int i13 = kotlin.Z.f406624c;
                this.f410786q = 1;
                if (m02.send(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            bVar = kotlin.G0.f406611a;
            int i14 = kotlin.Z.f406624c;
        } catch (Throwable th2) {
            int i15 = kotlin.Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            B.b bVar2 = B.f410772b;
            Throwable thB = kotlin.Z.b(bVar);
            bVar2.getClass();
            objA = B.b.a(thB);
        } else {
            B.b bVar3 = B.f410772b;
            objA = kotlin.G0.f406611a;
            bVar3.getClass();
        }
        return B.a(objA);
    }
}
