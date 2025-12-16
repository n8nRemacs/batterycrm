package defpackage;

import android.text.Layout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class f5g {
    public final bwf a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    public f5g(bwf bwfVar) {
        this.a = bwfVar;
    }

    public final Layout a() {
        return (Layout) this.a.getValue();
    }

    public final void b(Layout layout) {
        new bwf(new nm9(layout));
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            rga rgaVar = (rga) it.next();
            sga sgaVar = rgaVar.a;
            sgaVar.post(new se5(sgaVar, rgaVar.b, this, 25));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5g) && a() == ((f5g) obj).a();
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
