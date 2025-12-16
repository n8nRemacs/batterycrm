package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vwf {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public vwf(Handler handler) {
        this.a = handler;
    }

    public static twf b() {
        twf twfVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                twfVar = arrayList.isEmpty() ? new twf() : (twf) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return twfVar;
    }

    public final twf a(int i, Object obj) {
        twf twfVarB = b();
        twfVarB.a = this.a.obtainMessage(i, obj);
        return twfVarB;
    }

    public final boolean c(int i) {
        return this.a.sendEmptyMessage(i);
    }
}
