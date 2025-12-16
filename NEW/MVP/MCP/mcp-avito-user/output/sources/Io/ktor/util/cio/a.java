package io.ktor.util.cio;

import io.ktor.util.InterfaceC41603j0;
import java.nio.ByteBuffer;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ByteBufferPool.kt */
@InterfaceC41603j0
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/util/cio/a;", "Lio/ktor/utils/io/pool/d;", "Ljava/nio/ByteBuffer;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public final class a extends io.ktor.utils.io.pool.d<ByteBuffer> {
    public a() {
        super(2048);
    }

    @Override // io.ktor.utils.io.pool.d
    public final ByteBuffer c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.clear();
        return byteBuffer2;
    }

    @Override // io.ktor.utils.io.pool.d
    public final ByteBuffer g() {
        return ByteBuffer.allocate(4098);
    }
}
