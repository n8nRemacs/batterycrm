package V31;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MemoryJvm.kt */
@X41.g
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"LV31/e;", "", "a", "buffer", "Ljava/nio/ByteBuffer;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f16906b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final ByteBuffer f16907c = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ByteBuffer f16908a;

    /* compiled from: MemoryJvm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LV31/e$a;", "", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ e(ByteBuffer byteBuffer) {
        this.f16908a = byteBuffer;
    }

    public static final /* synthetic */ e a(ByteBuffer byteBuffer) {
        return new e(byteBuffer);
    }

    public static final void b(ByteBuffer byteBuffer, @Y61.k ByteBuffer byteBuffer2, int i12, int i13, int i14) {
        if (byteBuffer.hasArray() && byteBuffer2.hasArray() && !byteBuffer.isReadOnly() && !byteBuffer2.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i12, byteBuffer2.array(), byteBuffer2.arrayOffset() + i14, i13);
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i12);
        byteBufferDuplicate.limit(i12 + i13);
        ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
        byteBufferDuplicate2.position(i14);
        byteBufferDuplicate2.put(byteBufferDuplicate);
    }

    public static final void c(ByteBuffer byteBuffer, @Y61.k ByteBuffer byteBuffer2, long j12, long j13, long j14) {
        if (j12 >= 2147483647L) {
            io.ktor.utils.io.core.internal.f.a(j12, "offset");
            throw null;
        }
        int i12 = (int) j12;
        if (j13 >= 2147483647L) {
            io.ktor.utils.io.core.internal.f.a(j13, "length");
            throw null;
        }
        int i13 = (int) j13;
        if (j14 < 2147483647L) {
            b(byteBuffer, byteBuffer2, i12, i13, (int) j14);
        } else {
            io.ktor.utils.io.core.internal.f.a(j14, "destinationOffset");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return L.f(this.f16908a, ((e) obj).f16908a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16908a.hashCode();
    }

    public final String toString() {
        return "Memory(buffer=" + this.f16908a + ')';
    }
}
