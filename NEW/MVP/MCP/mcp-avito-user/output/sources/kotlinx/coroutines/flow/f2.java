package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: SharedFlow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f411393a = new kotlinx.coroutines.internal.a0("NO_VALUE");

    @Y61.k
    public static final e2 a(int i12, int i13, @Y61.k BufferOverflow bufferOverflow) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "replay cannot be negative, but was ").toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(AK.c.g(i13, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i12 <= 0 && i13 <= 0 && bufferOverflow != BufferOverflow.f410777b) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
        int i14 = i13 + i12;
        if (i14 < 0) {
            i14 = Integer.MAX_VALUE;
        }
        return new e2(i12, i14, bufferOverflow);
    }

    public static /* synthetic */ e2 b(int i12, int i13, BufferOverflow bufferOverflow, int i14) {
        if ((i14 & 1) != 0) {
            i12 = 0;
        }
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        if ((i14 & 4) != 0) {
            bufferOverflow = BufferOverflow.f410777b;
        }
        return a(i12, i13, bufferOverflow);
    }

    public static final void c(Object[] objArr, long j12, Object obj) {
        objArr[((int) j12) & (objArr.length - 1)] = obj;
    }

    @Y61.k
    public static final <T> InterfaceC43160i<T> d(@Y61.k d2<? extends T> d2Var, @Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return ((i12 == 0 || i12 == -3) && bufferOverflow == BufferOverflow.f410777b) ? d2Var : new kotlinx.coroutines.flow.internal.k(i12, coroutineContext, bufferOverflow, d2Var);
    }
}
