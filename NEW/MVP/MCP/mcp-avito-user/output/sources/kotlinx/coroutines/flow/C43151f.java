package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/f;", "T", "Lkotlinx/coroutines/flow/internal/f;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C43151f<T> extends AbstractC43168f<T> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.p<kotlinx.coroutines.channels.I0<? super T>, Continuation<? super kotlin.G0>, Object> f411381e;

    public /* synthetic */ C43151f(Y41.p pVar, CoroutineContext coroutineContext, int i12, BufferOverflow bufferOverflow, int i13, C42822w c42822w) {
        this(pVar, (i13 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i13 & 4) != 0 ? -2 : i12, (i13 & 8) != 0 ? BufferOverflow.f410777b : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.l
    public Object b(@Y61.k kotlinx.coroutines.channels.I0<? super T> i02, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objInvoke = this.f411381e.invoke(i02, continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : kotlin.G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public AbstractC43168f<T> c(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return new C43151f(this.f411381e, coroutineContext, i12, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final String toString() {
        return "block[" + this.f411381e + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43151f(@Y61.k Y41.p<? super kotlinx.coroutines.channels.I0<? super T>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        super(coroutineContext, i12, bufferOverflow);
        this.f411381e = pVar;
    }
}
