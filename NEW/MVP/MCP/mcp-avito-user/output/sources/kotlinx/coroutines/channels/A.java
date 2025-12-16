package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.channels.InterfaceC43123w;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A {
    public static C43108m a(int i12, BufferOverflow bufferOverflow, Y41.l lVar, int i13) {
        C43108m b02;
        if ((i13 & 1) != 0) {
            i12 = 0;
        }
        if ((i13 & 2) != 0) {
            bufferOverflow = BufferOverflow.f410777b;
        }
        if ((i13 & 4) != 0) {
            lVar = null;
        }
        if (i12 != -2) {
            if (i12 == -1) {
                if (bufferOverflow == BufferOverflow.f410777b) {
                    return new B0(1, BufferOverflow.f410778c, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i12 != 0) {
                return i12 != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.f410777b ? new C43108m(i12, lVar) : new B0(i12, bufferOverflow, lVar) : new C43108m(Integer.MAX_VALUE, lVar);
            }
            b02 = bufferOverflow == BufferOverflow.f410777b ? new C43108m(0, lVar) : new B0(1, bufferOverflow, lVar);
        } else if (bufferOverflow == BufferOverflow.f410777b) {
            InterfaceC43123w.f411026v2.getClass();
            b02 = new C43108m(InterfaceC43123w.b.f411028b, lVar);
        } else {
            b02 = new B0(1, bufferOverflow, lVar);
        }
        return b02;
    }
}
