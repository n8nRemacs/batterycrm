package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class jei {
    public static volatile tn8 a = new jbe(23);

    public static final String a(int[] iArr) {
        char[] cArr = new char[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) iArr[i];
        }
        return new String(cArr);
    }

    public static void b() {
        z5j.f("Not in application's main thread", c());
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void d(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            z5j.f("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }
}
