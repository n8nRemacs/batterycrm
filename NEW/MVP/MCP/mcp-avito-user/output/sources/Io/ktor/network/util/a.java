package io.ktor.network.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: Pools.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lio/ktor/network/util/a;", "Lio/ktor/utils/io/pool/d;", "Ljava/nio/ByteBuffer;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public final class a extends io.ktor.utils.io.pool.d<ByteBuffer> {
    @Override // io.ktor.utils.io.pool.d
    public final ByteBuffer c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.clear();
        byteBuffer2.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer2;
    }

    @Override // io.ktor.utils.io.pool.d
    public final ByteBuffer g() {
        return ByteBuffer.allocateDirect(0);
    }

    @Override // io.ktor.utils.io.pool.d
    public final void i(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (byteBuffer2.capacity() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
