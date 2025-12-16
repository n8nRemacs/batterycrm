package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class vob {
    public static final String b;
    public final Context a;

    static {
        String str = File.separator;
        b = str + "copy" + str + "media";
    }

    public vob(Context context) {
        this.a = context;
    }

    public final String a() {
        String strI = az1.i(this.a.getCacheDir().getPath(), b);
        try {
            File file = new File(strI);
            if (file.exists()) {
                return strI;
            }
            file.mkdirs();
            return strI;
        } catch (IOException e) {
            wqi.g("PathHelper", e, wy1.i("Failed to create dir=", strI, " due to: ", e.getMessage()), new Object[0]);
            return strI;
        }
    }
}
