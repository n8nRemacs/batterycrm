package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class hdg {
    public static WeakReference c;
    public fs4 a;
    public final ScheduledThreadPoolExecutor b;

    public hdg(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    public final synchronized gdg a() {
        String str;
        gdg gdgVar;
        fs4 fs4Var = this.a;
        synchronized (((ArrayDeque) fs4Var.d)) {
            str = (String) ((ArrayDeque) fs4Var.d).peek();
        }
        Pattern pattern = gdg.d;
        gdgVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                gdgVar = new gdg(strArrSplit[0], strArrSplit[1]);
            }
        }
        return gdgVar;
    }
}
