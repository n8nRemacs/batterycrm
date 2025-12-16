package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import v51.C49167a;

/* compiled from: propertiesConventionUtil.kt */
@s0
/* loaded from: classes8.dex */
public final class I {
    public static kotlin.reflect.jvm.internal.impl.name.f a(kotlin.reflect.jvm.internal.impl.name.f fVar, String str, String str2, int i12) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z12 = (i12 & 4) != 0;
        if ((i12 & 8) != 0) {
            str2 = null;
        }
        if (!fVar.f409253c) {
            String strC = fVar.c();
            if (C43066x.h0(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return kotlin.reflect.jvm.internal.impl.name.f.e(str2.concat(C43066x.U(str, strC)));
                }
                if (!z12) {
                    return fVar;
                }
                String strU = C43066x.U(str, strC);
                if (strU.length() != 0 && C49167a.b(0, strU)) {
                    if (strU.length() != 1 && C49167a.b(1, strU)) {
                        kotlin.ranges.k it = new kotlin.ranges.l(0, strU.length() - 1, 1).iterator();
                        while (true) {
                            if (!it.f406910d) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (!C49167a.b(((Number) next).intValue(), strU)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strU = C49167a.c(strU.substring(0, iIntValue)).concat(strU.substring(iIntValue));
                        } else {
                            strU = C49167a.c(strU);
                        }
                    } else if (strU.length() != 0 && 'A' <= (cCharAt2 = strU.charAt(0)) && cCharAt2 < '[') {
                        strU = Character.toLowerCase(cCharAt2) + strU.substring(1);
                    }
                }
                if (kotlin.reflect.jvm.internal.impl.name.f.f(strU)) {
                    return kotlin.reflect.jvm.internal.impl.name.f.e(strU);
                }
            }
        }
        return null;
    }
}
