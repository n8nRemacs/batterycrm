package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class vm5 extends d5c {
    public final wu7 b;

    public vm5(wu7 wu7Var, xg7 xg7Var) {
        super(xg7Var);
        this.b = wu7Var;
        Looper looperMyLooper = Looper.myLooper();
        new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        new LinkedList();
    }
}
