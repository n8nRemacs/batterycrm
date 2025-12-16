package androidx.media3.extractor.text.ttml;

import j.P;
import java.util.Map;

/* compiled from: TtmlRenderUtil.java */
/* loaded from: classes.dex */
final class f {
    @P
    public static g a(@P g gVar, @P String[] strArr, Map<String, g> map) {
        int i12 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i12 < length) {
                    gVar2.a(map.get(strArr[i12]));
                    i12++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a(map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i12 < length2) {
                    gVar.a(map.get(strArr[i12]));
                    i12++;
                }
            }
        }
        return gVar;
    }
}
