package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: ByteChannelCtor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Y {
    @Y61.k
    public static final C41619a a(@Y61.k byte[] bArr) {
        return new C41619a(ByteBuffer.wrap(bArr, 0, bArr.length));
    }
}
