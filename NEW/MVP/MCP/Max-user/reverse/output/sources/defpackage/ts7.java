package defpackage;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class ts7 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ss7 ss7Var = (ss7) obj;
        ss7 ss7Var2 = (ss7) obj2;
        if (ss7Var.b == 0 && ss7Var2.b != 0) {
            return -1;
        }
        if (ss7Var.b == 0 || ss7Var2.b != 0) {
            return Float.compare(ss7Var2.c != 0 ? ss7Var2.d / ss7Var2.c : 1.0f, ss7Var.c != 0 ? ss7Var.d / ss7Var.c : 1.0f);
        }
        return 1;
    }
}
