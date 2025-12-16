package io.ktor.utils.io.pool;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ByteBufferPools.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lio/ktor/utils/io/pool/b;", "Lio/ktor/utils/io/pool/d;", "Ljava/nio/ByteBuffer;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b extends d<ByteBuffer> {

    /* renamed from: g, reason: collision with root package name */
    public final int f401245g;

    /* JADX WARN: Illegal instructions before constructor call */
    public b() {
        int i12 = 0;
        this(i12, i12, 3, null);
    }

    @Override // io.ktor.utils.io.pool.d
    public final ByteBuffer c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.clear();
        byteBuffer2.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer2;
    }

    @Override // io.ktor.utils.io.pool.d
    public final ByteBuffer g() {
        return ByteBuffer.allocate(this.f401245g);
    }

    @Override // io.ktor.utils.io.pool.d
    public final void i(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (byteBuffer2.capacity() != this.f401245g) {
            throw new IllegalStateException("Check failed.");
        }
        if (byteBuffer2.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public /* synthetic */ b(int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 2000 : i12, (i14 & 2) != 0 ? 4096 : i13);
    }

    public b(int i12, int i13) {
        super(i12);
        this.f401245g = i13;
    }
}
