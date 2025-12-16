package W31;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;
import kotlin.text.C43066x;

/* compiled from: UTF.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d {
    public static final long a(int i12, int i13) {
        return (i13 & 4294967295L) | (i12 << 32);
    }

    public static final IndexOutOfBoundsException b(int i12, int i13) {
        return new IndexOutOfBoundsException(r.l(i12, i13, "0 (offset) + ", " (length) > ", " (array.length)"));
    }

    public static final void c(int i12) {
        throw new IllegalArgumentException("Malformed code-point " + Integer.toHexString(i12) + " found");
    }

    public static final void d(byte b12) {
        StringBuilder sb2 = new StringBuilder("Unsupported byte code, first byte is 0x");
        C43044a.a(16);
        sb2.append(C43066x.R(2, Integer.toString(b12 & 255, 16)));
        throw new IllegalStateException(sb2.toString().toString());
    }
}
