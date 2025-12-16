package Fc1;

import android.util.Base64;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.text.C43047d;
import kotlin.text.C43066x;

/* loaded from: classes9.dex */
public final class W1 {
    @Y61.k
    public static String a(@Y61.k String str) {
        List listF0;
        if (str.length() == 0) {
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            return "";
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            byte[] bytes = "UXFeedback".getBytes(C43047d.f410589b);
            byte[] bArr = new byte[bArrDecode.length];
            int length = bArrDecode.length;
            for (int i12 = 0; i12 < length; i12++) {
                bArr[i12] = (byte) (bArrDecode[i12] ^ bytes[i12 % bytes.length]);
            }
            listF0 = C43066x.f0(new String(bArr, C43047d.f410589b), new String[]{"#"}, 0, 6);
        } catch (Exception unused) {
            listF0 = C42784z0.f406748b;
        }
        if (listF0.size() != 2) {
            kotlin.jvm.internal.u0 u0Var2 = kotlin.jvm.internal.u0.f406856a;
            return "";
        }
        if (kotlin.jvm.internal.L.f(listF0.get(0), "UXFeedback")) {
            return (String) listF0.get(1);
        }
        kotlin.jvm.internal.u0 u0Var3 = kotlin.jvm.internal.u0.f406856a;
        return "";
    }
}
