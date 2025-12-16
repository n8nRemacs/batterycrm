package Ba1;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public abstract class H {
    public static final ArrayList a(int i12, Y41.l lVar, String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        String str2 = "";
        String str3 = str2;
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '\n') {
                arrayList.add(str2 + str3);
                str2 = "";
                str3 = str2;
            } else if (cCharAt != ' ') {
                str3 = str3 + cCharAt;
            } else {
                if (((Number) lVar.invoke(str2 + str3)).intValue() > i12) {
                    arrayList.add(str2);
                    str2 = str3 + cCharAt;
                } else {
                    str2 = str2 + str3 + cCharAt;
                }
                str3 = "";
            }
        }
        if (((Number) lVar.invoke(str2 + str3)).intValue() > i12) {
            arrayList.add(str2);
            arrayList.add(str3);
        } else {
            arrayList.add(str2 + str3);
        }
        return arrayList;
    }
}
