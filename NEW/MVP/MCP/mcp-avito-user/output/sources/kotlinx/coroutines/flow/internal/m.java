package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/m;", "T", "Lkotlinx/coroutines/flow/internal/f;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m<T> extends AbstractC43168f<T> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Iterable<InterfaceC43160i<T>> f411507e;

    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411508q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<T> f411509r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ F<T> f411510s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43160i<? extends T> interfaceC43160i, F<T> f12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f411509r = interfaceC43160i;
            this.f411510s = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f411509r, this.f411510s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411508q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f411508q = 1;
                if (this.f411509r.collect(this.f411510s, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    public /* synthetic */ m(Iterable iterable, CoroutineContext coroutineContext, int i12, BufferOverflow bufferOverflow, int i13, C42822w c42822w) {
        this(iterable, (i13 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i13 & 4) != 0 ? -2 : i12, (i13 & 8) != 0 ? BufferOverflow.f410777b : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.l
    public final Object b(@Y61.k I0<? super T> i02, @Y61.k Continuation<? super G0> continuation) {
        F f12 = new F(i02);
        Iterator<InterfaceC43160i<T>> it = this.f411507e.iterator();
        while (it.hasNext()) {
            C43259k.d(i02, null, null, new a(it.next(), f12, null), 3);
        }
        return G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final AbstractC43168f<T> c(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return new m(this.f411507e, coroutineContext, i12, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final K0<T> e(@Y61.k T t12) {
        C43167e c43167e = new C43167e(this, null);
        return F0.c(t12, this.f411466b, this.f411467c, BufferOverflow.f410777b, CoroutineStart.f410680b, c43167e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k Iterable<? extends InterfaceC43160i<? extends T>> iterable, @Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        super(coroutineContext, i12, bufferOverflow);
        this.f411507e = iterable;
    }
}
