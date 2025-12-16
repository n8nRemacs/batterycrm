package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wwf implements e07 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public wwf(Handler handler) {
        this.a = handler;
    }

    public static uwf c() {
        uwf uwfVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                uwfVar = arrayList.isEmpty() ? new uwf() : (uwf) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return uwfVar;
    }

    public final uwf a(int i, Object obj) {
        uwf uwfVarC = c();
        uwfVarC.a = this.a.obtainMessage(i, obj);
        return uwfVarC;
    }

    public final uwf b(Object obj, int i, int i2, int i3) {
        uwf uwfVarC = c();
        uwfVarC.a = this.a.obtainMessage(i, i2, i3, obj);
        return uwfVarC;
    }

    public final boolean d(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void e(int i) {
        hsi.b(i != 0);
        this.a.removeMessages(i);
    }

    public final boolean f(int i) {
        return this.a.sendEmptyMessage(i);
    }
}
