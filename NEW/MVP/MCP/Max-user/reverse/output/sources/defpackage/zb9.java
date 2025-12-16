package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zb9 {
    public static final Object a = to8.j(new imb("mkv", "video/x-matroska"), new imb("glb", "model/gltf-binary"));

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    public static final String a(String str) {
        int iG = vmf.G(str, '.', 0, 6);
        String strSubstring = (iG < 0 || iG == str.length() + (-1)) ? null : str.substring(iG + 1);
        if (strSubstring == null) {
            return null;
        }
        String lowerCase = strSubstring.toLowerCase(Locale.US);
        String mimeTypeFromExtension = (String) vz9.b.get(lowerCase);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = vz9.a.getMimeTypeFromExtension(lowerCase);
        }
        return mimeTypeFromExtension == null ? (String) a.get(lowerCase) : mimeTypeFromExtension;
    }
}
