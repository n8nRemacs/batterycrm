package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public interface cx5 {
    void error(String str, Throwable th);

    default void log(String str) {
        Log.d("Default", str);
    }
}
