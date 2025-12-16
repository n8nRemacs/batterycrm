package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zg6 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(ghb ghbVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zg6) it.next()).a(ghbVar);
        }
    }

    public final void b(ghb ghbVar, rgb rgbVar, bhb bhbVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zg6) it.next()).b(ghbVar, rgbVar, bhbVar);
        }
    }

    public final void c(ghb ghbVar, rgb rgbVar, bhb bhbVar, IOException iOException) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zg6) it.next()).c(ghbVar, rgbVar, bhbVar, iOException);
        }
    }

    public final void d(ghb ghbVar, rgb rgbVar, bhb bhbVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zg6) it.next()).d(ghbVar, rgbVar, bhbVar);
        }
    }
}
