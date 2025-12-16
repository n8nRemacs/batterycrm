package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f06 implements ff0 {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.ff0
    public final void a(boolean z) {
        synchronized (h06.j) {
            try {
                Iterator it = new ArrayList(h06.k.values()).iterator();
                while (it.hasNext()) {
                    h06 h06Var = (h06) it.next();
                    if (h06Var.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = h06Var.i.iterator();
                        while (it2.hasNext()) {
                            h06 h06Var2 = ((e06) it2.next()).a;
                            if (!z) {
                                ((vm4) h06Var2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
