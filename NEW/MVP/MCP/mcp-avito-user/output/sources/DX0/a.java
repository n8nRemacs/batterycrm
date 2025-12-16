package DX0;

import android.util.Log;

/* compiled from: Logging.java */
/* loaded from: classes10.dex */
public final class a {
    public static void a(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }
}
