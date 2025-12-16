package io.ktor.utils.io;

import kotlin.Metadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class W {
    public static final void a(Throwable th2) throws Throwable {
        Throwable thB;
        try {
            thB = M1.b(th2, th2);
        } catch (Throwable unused) {
            thB = null;
        }
        if (thB != null) {
            throw thB;
        }
    }
}
