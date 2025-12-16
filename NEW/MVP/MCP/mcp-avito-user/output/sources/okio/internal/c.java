package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ByteString.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final char[] f420071a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c12) {
        if ('0' <= c12 && c12 < ':') {
            return c12 - '0';
        }
        if ('a' <= c12 && c12 < 'g') {
            return c12 - 'W';
        }
        if ('A' > c12 || c12 >= 'G') {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.l("Unexpected hex digit: ", c12));
        }
        return c12 - '7';
    }
}
