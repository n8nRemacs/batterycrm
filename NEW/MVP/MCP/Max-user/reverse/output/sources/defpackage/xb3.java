package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class xb3 {
    public static final x6i a = new x6i(Looper.getMainLooper());

    public static void a(Context context, String str) {
        a.u(new cj(context, "Copied Text", str, 15));
    }

    public static final boolean b() {
        return Build.VERSION.SDK_INT <= 32 || ((Boolean) vzg.a.getValue()).booleanValue();
    }

    public static final CharSequence c(Context context) {
        ClipData.Item itemAt;
        ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) {
            return null;
        }
        return itemAt.getText();
    }
}
