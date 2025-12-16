package kotlinx.serialization.json.internal;

import kotlin.Metadata;

/* compiled from: AbstractJsonLexer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43451b {
    public static final byte a(char c12) {
        if (c12 < '~') {
            return C43464o.f413118c[c12];
        }
        return (byte) 0;
    }

    @Y61.k
    public static final String b(byte b12) {
        return b12 == 1 ? "quotation mark '\"'" : b12 == 2 ? "string escape sequence '\\'" : b12 == 4 ? "comma ','" : b12 == 5 ? "colon ':'" : b12 == 6 ? "start of the object '{'" : b12 == 7 ? "end of the object '}'" : b12 == 8 ? "start of the array '['" : b12 == 9 ? "end of the array ']'" : b12 == 10 ? "end of the input" : b12 == 127 ? "invalid token" : "valid token";
    }
}
