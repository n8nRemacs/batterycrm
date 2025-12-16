package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.Thread;

/* loaded from: classes2.dex */
public final class bi7 implements Thread.UncaughtExceptionHandler {
    public final k18 a;
    public final SharedPreferences b;
    public final Thread.UncaughtExceptionHandler c = Thread.getDefaultUncaughtExceptionHandler();

    public bi7(k18 k18Var, Context context) {
        this.a = k18Var;
        this.b = context.getSharedPreferences("app_crash_prefs", 0);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.b.edit().putLong("pref_last_crash_time", System.currentTimeMillis()).apply();
        w4e w4eVar = (w4e) ((pb3) this.a.getValue());
        w4eVar.i0.O(w4eVar, w4e.m0[52], Integer.valueOf(th instanceof OutOfMemoryError ? 2 : 1));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
