package aU0;

import androidx.compose.foundation.H;
import androidx.compose.ui.platform.C22491k0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EngineBeduinException.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"engine_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: aU0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19817a {
    public static final String a(String str, String str2) {
        StringBuilder sbR = H.r(str);
        String strConcat = str2 != null ? ".".concat(str2) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        sbR.append(strConcat);
        return sbR.toString();
    }

    public static final String b(String str, String str2, String str3) {
        StringBuilder sbR = H.r(str);
        String strA = str3 != null ? C22491k0.a('}', "{", str3) : null;
        if (strA == null) {
            strA = "";
        }
        sbR.append(strA);
        String strConcat = str2 != null ? ".".concat(str2) : null;
        sbR.append(strConcat != null ? strConcat : "");
        return sbR.toString();
    }
}
