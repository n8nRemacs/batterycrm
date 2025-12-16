package defpackage;

import android.os.Looper;
import java.util.List;

/* loaded from: classes.dex */
public abstract class iei {
    public static final Object a = new Object();

    public static final void a() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new xu1("Methods that affect the view hierarchy can can only be called from the main thread.");
        }
    }

    public static final void b(iv6 iv6Var, List list) {
        iv6Var.u("history↓");
        if (list.isEmpty()) {
            iv6Var.u("empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        j37 j37VarB = gei.b(list);
        if (j37VarB != null) {
            sb.append(j37VarB.getA());
            sb.append(" ");
        }
        sb.append("║║");
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            j37 j37Var = (j37) list.get(i);
            if (j37Var instanceof i37) {
                sb.append(" GAP ║║");
            } else {
                j37 j37Var2 = i > 0 ? (j37) list.get(i - 1) : null;
                if ((j37Var2 instanceof i37) || j37Var2 == null) {
                    sb.append(" ");
                    sb.append(iv6.k(j37Var.getC()));
                    sb.append(" - ");
                    i2 = 0;
                }
                i2++;
                j37 j37Var3 = i < list.size() + (-1) ? (j37) list.get(i + 1) : null;
                if ((j37Var3 instanceof i37) || j37Var3 == null) {
                    sb.append(iv6.k(j37Var.getC()));
                    sb.append(" (" + i2 + ")");
                    sb.append(" ║║");
                }
            }
            i++;
        }
        j37 j37VarC = gei.c(list);
        if (j37VarC != null) {
            sb.append(" ");
            sb.append(j37VarC.getA());
        }
        iv6Var.u(sb.toString());
    }

    public static final void c(iv6 iv6Var, g37 g37Var) {
        iv6Var.u("bounds↓");
        StringBuilder sb = new StringBuilder("firstId: ");
        sb.append(g37Var.g());
        sb.append(" ║║ lastId: ");
        sb.append(g37Var.h());
        sb.append(" ║║ chunks: ");
        if (g37Var.j().isEmpty()) {
            sb.append("empty");
        } else {
            sb.append("║║");
            for (d93 d93Var : g37Var.j()) {
                sb.append(" ");
                sb.append(iv6.k(d93Var.a()));
                sb.append(" - ");
                sb.append(iv6.k(d93Var.c()));
                sb.append(" ║║");
            }
        }
        iv6Var.u(sb.toString());
    }
}
