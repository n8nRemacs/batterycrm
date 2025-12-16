package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HexFormat.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43053j {
    public static final boolean a(String str) {
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (kotlin.jvm.internal.L.g(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
