package androidx.compose.material3;

import androidx.compose.ui.node.C22421l;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1286}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21876t3 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f37296q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C21898u3 f37297r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f37298s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21876t3(C21898u3 c21898u3, long j12, Continuation<? super C21876t3> continuation) {
        super(2, continuation);
        this.f37297r = c21898u3;
        this.f37298s = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C21876t3(this.f37297r, this.f37298s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21876t3) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f37296q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return kotlin.G0.f406611a;
        }
        C42729a0.b(obj);
        C21898u3 c21898u3 = this.f37297r;
        c21898u3.getClass();
        long j12 = this.f37298s;
        l0.g.g(j12);
        l0.g.h(j12);
        C22421l.g(c21898u3).f40608B.M0(Ok.f35272c);
        this.f37296q = 1;
        throw null;
    }
}
