package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z40 {
    public boolean a;
    public boolean b;
    public boolean c;

    public a50 a() {
        if (this.a || !(this.b || this.c)) {
            return new a50(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public void b(ArrayList arrayList) {
        if ((this.a || this.b || this.c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((zr4) it.next()).a();
            }
            gri.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
