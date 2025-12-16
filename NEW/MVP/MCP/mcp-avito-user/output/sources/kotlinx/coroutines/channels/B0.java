package kotlinx.coroutines.channels;

import kotlin.C42833p;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* compiled from: ConflatedBufferedChannel.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/B0;", "E", "Lkotlinx/coroutines/channels/m;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class B0<E> extends C43108m<E> {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final BufferOverflow f410776n;

    public /* synthetic */ B0(int i12, BufferOverflow bufferOverflow, Y41.l lVar, int i13, C42822w c42822w) {
        this(i12, bufferOverflow, (i13 & 4) != 0 ? null : lVar);
    }

    @Override // kotlinx.coroutines.channels.C43108m
    public final boolean F() {
        return this.f410776n == BufferOverflow.f410778c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.C43108m
    public final void S(@Y61.k kotlinx.coroutines.selects.r<?> rVar, @Y61.l Object obj) {
        Object objB0 = b0(obj, false);
        if (!(objB0 instanceof B.c)) {
            rVar.d(kotlin.G0.f406611a);
        } else {
            if (!(objB0 instanceof B.a)) {
                throw new IllegalStateException("unreachable");
            }
            B.b(objB0);
            rVar.d(C43122v.f411013l);
        }
    }

    @Override // kotlinx.coroutines.channels.C43108m
    @Y61.l
    public final Object U(E e12, @Y61.k Continuation<? super Boolean> continuation) {
        Object objB0 = b0(e12, true);
        if (objB0 instanceof B.c) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(true);
    }

    @Override // kotlinx.coroutines.channels.C43108m
    public final boolean V() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e2, code lost:
    
        r0.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(E r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.B0.b0(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.C43108m, kotlinx.coroutines.channels.M0
    @Y61.l
    public final Object send(E e12, @Y61.k Continuation<? super kotlin.G0> continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionC;
        Object objB0 = b0(e12, true);
        if (!(objB0 instanceof B.a)) {
            return kotlin.G0.f406611a;
        }
        B.b(objB0);
        Y41.l<E, kotlin.G0> lVar = this.f410944c;
        if (lVar == null || (undeliveredElementExceptionC = kotlinx.coroutines.internal.Q.c(lVar, e12, null)) == null) {
            throw y();
        }
        C42833p.a(undeliveredElementExceptionC, y());
        throw undeliveredElementExceptionC;
    }

    @Override // kotlinx.coroutines.channels.C43108m, kotlinx.coroutines.channels.M0
    @Y61.k
    public final Object w(E e12) {
        return b0(e12, false);
    }

    public B0(int i12, @Y61.k BufferOverflow bufferOverflow, @Y61.l Y41.l<? super E, kotlin.G0> lVar) {
        super(i12, lVar);
        this.f410776n = bufferOverflow;
        if (bufferOverflow != BufferOverflow.f410777b) {
            if (i12 < 1) {
                throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.m0.f406844a.b(C43108m.class).l0() + " instead").toString());
        }
    }
}
