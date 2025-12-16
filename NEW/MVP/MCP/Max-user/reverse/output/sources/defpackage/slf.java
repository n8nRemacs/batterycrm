package defpackage;

import android.util.Log;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class slf implements iua, skb, nva {
    public static c3g c(int i) {
        Object next;
        Iterator it = c3g.X.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (((c3g) next).a == i) {
                break;
            }
        }
        c3g c3gVar = (c3g) next;
        if (c3gVar != null) {
            return c3gVar;
        }
        throw new IllegalArgumentException(wy1.e(i, "No such value ", " for TaskStatus"));
    }

    public static usb e(int i) {
        Object next;
        Iterator it = usb.e1.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (((usb) next).a == i) {
                break;
            }
        }
        usb usbVar = (usb) next;
        if (usbVar != null) {
            return usbVar;
        }
        throw new IllegalArgumentException(wy1.e(i, "No such value ", " for PersistableTaskType"));
    }

    @Override // defpackage.iua
    public h9e a() {
        return new w16(-9223372036854775807L);
    }

    @Override // defpackage.iua, defpackage.jua
    public void b(long j) {
    }

    @Override // defpackage.iua
    public long d(hp5 hp5Var) {
        return -1L;
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }
}
