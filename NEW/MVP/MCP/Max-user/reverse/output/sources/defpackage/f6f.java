package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class f6f extends g6f {
    public static f6f a(String str, Context context, h6f[] h6fVarArr) {
        StringBuilder sbN = az1.n("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < h6fVarArr.length; i++) {
            sbN.append("\n\t\tSoSource ");
            sbN.append(i);
            sbN.append(": ");
            sbN.append(h6fVarArr[i].toString());
        }
        if (context != null) {
            sbN.append("\n\tNative lib dir: ");
            sbN.append(context.getApplicationInfo().nativeLibraryDir);
            sbN.append("\n");
        }
        return new f6f(str, sbN.toString());
    }
}
