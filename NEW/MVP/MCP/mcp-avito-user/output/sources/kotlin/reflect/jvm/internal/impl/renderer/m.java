package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: RenderingUtils.kt */
@s0
/* loaded from: classes8.dex */
public final class m {
    @Y61.k
    public static final String a(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        String strB = fVar.b();
        if (!l.f409549a.contains(strB)) {
            int i12 = 0;
            while (true) {
                if (i12 < strB.length()) {
                    char cCharAt = strB.charAt(i12);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i12++;
                } else if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                    return fVar.b();
                }
            }
        }
        return "`".concat(fVar.b()) + '`';
    }

    @Y61.k
    public static final String b(@Y61.k List<kotlin.reflect.jvm.internal.impl.name.f> list) {
        StringBuilder sb2 = new StringBuilder();
        for (kotlin.reflect.jvm.internal.impl.name.f fVar : list) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(a(fVar));
        }
        return sb2.toString();
    }

    @Y61.l
    public static final String c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5) {
        if (!C43066x.h0(str, str2, false) || !C43066x.h0(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!d(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final boolean d(@Y61.k String str, @Y61.k String str2) {
        if (!str.equals(C43066x.a0(str2, "?", "", false)) && (!C43066x.z(str2, "?", false) || !L.f(str.concat("?"), str2))) {
            if (!L.f("(" + str + ")?", str2)) {
                return false;
            }
        }
        return true;
    }
}
