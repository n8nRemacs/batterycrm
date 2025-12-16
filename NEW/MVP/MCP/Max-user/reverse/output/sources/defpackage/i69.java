package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class i69 {
    public final a69 a;
    public final int b;
    public final k69 c;
    public final k69 d;
    public final k69 e;
    public final ArrayList f;
    public final WeakReference g;
    public boolean h = false;
    public boolean i = false;

    public i69(h69 h69Var, k69 k69Var, a69 a69Var, int i, k69 k69Var2, Collection collection) {
        this.g = new WeakReference(h69Var);
        this.d = k69Var;
        this.a = a69Var;
        this.b = i;
        this.c = h69Var.r;
        this.e = k69Var2;
        this.f = collection == null ? null : new ArrayList(collection);
        h69Var.m.postDelayed(new gq5(18, this), BuildConfig.SILENCE_TIME_TO_UPLOAD);
    }

    public final void a() {
        l69.b();
        if (this.h || this.i) {
            return;
        }
        WeakReference weakReference = this.g;
        h69 h69Var = (h69) weakReference.get();
        a69 a69Var = this.a;
        if (h69Var == null || h69Var.z != this) {
            if (this.h || this.i) {
                return;
            }
            this.i = true;
            if (a69Var != null) {
                a69Var.h(0);
                a69Var.d();
                return;
            }
            return;
        }
        this.h = true;
        h69Var.z = null;
        h69 h69Var2 = (h69) weakReference.get();
        k69 k69Var = this.c;
        int i = this.b;
        if (h69Var2 != null) {
            HashMap map = h69Var2.v;
            if (h69Var2.r == k69Var) {
                Message messageObtainMessage = h69Var2.m.obtainMessage(263, k69Var);
                messageObtainMessage.arg1 = i;
                messageObtainMessage.sendToTarget();
                a69 a69Var2 = h69Var2.s;
                if (a69Var2 != null) {
                    a69Var2.h(i);
                    h69Var2.s.d();
                }
                if (!map.isEmpty()) {
                    for (a69 a69Var3 : map.values()) {
                        a69Var3.h(i);
                        a69Var3.d();
                    }
                    map.clear();
                }
                h69Var2.s = null;
            }
        }
        h69 h69Var3 = (h69) weakReference.get();
        if (h69Var3 == null) {
            return;
        }
        f69 f69Var = h69Var3.m;
        k69 k69Var2 = this.d;
        h69Var3.r = k69Var2;
        h69Var3.s = a69Var;
        k69 k69Var3 = this.e;
        if (k69Var3 == null) {
            Message messageObtainMessage2 = f69Var.obtainMessage(262, new kmb(k69Var, k69Var2));
            messageObtainMessage2.arg1 = i;
            messageObtainMessage2.sendToTarget();
        } else {
            Message messageObtainMessage3 = f69Var.obtainMessage(264, new kmb(k69Var3, k69Var2));
            messageObtainMessage3.arg1 = i;
            messageObtainMessage3.sendToTarget();
        }
        h69Var3.v.clear();
        h69Var3.f();
        h69Var3.j();
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            h69Var3.r.n(arrayList);
        }
    }
}
