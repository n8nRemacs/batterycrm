package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class ce {
    public static final d07 a;

    static {
        Looper mainLooper = Looper.getMainLooper();
        j0e j0eVar = de.a;
        a = new d07(new Handler(mainLooper));
    }
}
