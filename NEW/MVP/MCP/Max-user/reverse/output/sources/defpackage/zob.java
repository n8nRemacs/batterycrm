package defpackage;

import android.graphics.Color;
import java.nio.file.Path;

/* loaded from: classes.dex */
public abstract class zob {
    public static String a(Path path) {
        String string;
        Path fileName = path.getFileName();
        if (fileName == null || (string = fileName.toString()) == null) {
            return "";
        }
        int iH = vmf.H(".", string, 6);
        return iH == -1 ? string : string.substring(0, iH);
    }

    public static final int b(int i, float f) {
        return Color.argb(kti.d(f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }
}
