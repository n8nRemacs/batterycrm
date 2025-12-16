package com.google.android.gms.common.util;

import j.N;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class s {
    @RX0.a
    public static void a(@N StringBuilder sb2, @N HashMap<String, String> map) {
        sb2.append("{");
        boolean z12 = true;
        for (String str : map.keySet()) {
            if (!z12) {
                sb2.append(",");
            }
            String str2 = map.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z12 = false;
        }
        sb2.append("}");
    }
}
