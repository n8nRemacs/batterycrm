package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class vz9 {
    public static final MimeTypeMap a = MimeTypeMap.getSingleton();
    public static final Map b;

    static {
        bh7.b("image/heif", "heif", "image/heic", "heic");
        b = bh7.b("heif", "image/heif", "heic", "image/heic");
    }
}
