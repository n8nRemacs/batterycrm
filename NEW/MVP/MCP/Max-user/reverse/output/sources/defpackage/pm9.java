package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class pm9 {
    public final pb2 a;
    public final eh9 b;
    public final bwf c;
    public final bwf d = new bwf(new fr7(14, this));
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();

    public pm9(pb2 pb2Var, eh9 eh9Var, bwf bwfVar) {
        this.a = pb2Var;
        this.b = eh9Var;
        this.c = bwfVar;
    }

    public final Layout a() {
        return (Layout) this.c.getValue();
    }

    public final void b(Layout layout) {
        new bwf(new nm9(layout));
        new bwf(new nm9(this, layout));
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            rm9 rm9Var = (rm9) ((om9) it.next());
            rm9Var.getClass();
            if (Looper.getMainLooper().isCurrentThread()) {
                rm9Var.setLayout(this);
            } else {
                Handler handler = rm9Var.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new zn6(rm9Var, 15, this));
                } else {
                    rm9Var.post(new yn6(rm9Var, 20, this));
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm9)) {
            return false;
        }
        pm9 pm9Var = (pm9) obj;
        if (a() != pm9Var.a()) {
            return false;
        }
        pb2 pb2Var = this.a;
        Long lValueOf = pb2Var != null ? Long.valueOf(pb2Var.a) : null;
        pb2 pb2Var2 = pm9Var.a;
        return fni.a(lValueOf, pb2Var2 != null ? Long.valueOf(pb2Var2.a) : null) && this.b.a.a == pm9Var.b.a.a;
    }

    public final int hashCode() {
        pb2 pb2Var = this.a;
        Long lValueOf = pb2Var != null ? Long.valueOf(pb2Var.a) : null;
        return a().hashCode() + a9h.a((lValueOf != null ? lValueOf.hashCode() : 0) * 31, 31, this.b.a.a);
    }
}
