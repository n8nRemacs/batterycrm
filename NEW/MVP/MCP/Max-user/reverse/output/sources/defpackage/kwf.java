package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class kwf {
    public static final kwf a = new kwf();

    public final vwf a(Looper looper, Handler.Callback callback) {
        return new vwf(new Handler(looper, callback));
    }
}
