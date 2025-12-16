package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class ai3 {
    public static ai3 b;
    public final Object a;

    public ai3(int i) {
        switch (i) {
            case 1:
                this.a = new Object();
                new Handler(Looper.getMainLooper(), new z5f(0, this));
                break;
            default:
                this.a = ipi.b(3, new fu2(16));
                break;
        }
    }
}
