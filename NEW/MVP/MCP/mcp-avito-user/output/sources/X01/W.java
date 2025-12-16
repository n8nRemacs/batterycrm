package x01;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;

/* loaded from: classes7.dex */
public class W {
    @SuppressLint({"DefaultLocale"})
    public static boolean a(Context context, String str, int i12) {
        long length = new File(context.getFilesDir(), androidx.camera.camera2.internal.G.f("../shared_prefs/", C49733s.f(context, str) + ".xml")).length();
        if (length <= i12) {
            return false;
        }
        m0.b(String.format("reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i12)));
        return true;
    }
}
