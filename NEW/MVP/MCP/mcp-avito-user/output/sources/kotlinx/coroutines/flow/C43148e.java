package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: Channels.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/e;", "T", "Lkotlinx/coroutines/flow/internal/f;", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43148e<T> extends AbstractC43168f<T> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f411358g = AtomicIntegerFieldUpdater.newUpdater(C43148e.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.channels.K0<T> f411359e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f411360f;

    public /* synthetic */ C43148e(kotlinx.coroutines.channels.K0 k02, boolean z12, CoroutineContext coroutineContext, int i12, BufferOverflow bufferOverflow, int i13, C42822w c42822w) {
        this(k02, z12, (i13 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i13 & 8) != 0 ? -3 : i12, (i13 & 16) != 0 ? BufferOverflow.f410777b : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final String a() {
        return "channel=" + this.f411359e;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.l
    public final Object b(@Y61.k kotlinx.coroutines.channels.I0<? super T> i02, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objA = C43219z.a(new kotlinx.coroutines.flow.internal.F(i02), this.f411359e, this.f411360f, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final AbstractC43168f<T> c(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return new C43148e(this.f411359e, this.f411360f, coroutineContext, i12, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f, kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k Continuation<? super kotlin.G0> continuation) {
        if (this.f411467c != -3) {
            Object objCollect = super.collect(interfaceC43172j, continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
        }
        boolean z12 = this.f411360f;
        if (z12 && f411358g.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object objA = C43219z.a(interfaceC43172j, this.f411359e, z12, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final InterfaceC43160i<T> d() {
        return new C43148e(this.f411359e, this.f411360f, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final kotlinx.coroutines.channels.K0<T> e(@Y61.k kotlinx.coroutines.T t12) {
        if (!this.f411360f || f411358g.getAndSet(this, 1) == 0) {
            return this.f411467c == -3 ? this.f411359e : super.e(t12);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43148e(@Y61.k kotlinx.coroutines.channels.K0<? extends T> k02, boolean z12, @Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        super(coroutineContext, i12, bufferOverflow);
        this.f411359e = k02;
        this.f411360f = z12;
        this.consumed$volatile = 0;
    }
}
