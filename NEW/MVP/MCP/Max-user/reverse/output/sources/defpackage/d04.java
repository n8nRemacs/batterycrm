package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class d04 extends l0g {
    public List c;
    public List d;
    public int o;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        int i = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case 104120:
                if (str.equals("ids")) {
                    c = 0;
                    break;
                }
                break;
            case 3598564:
                if (str.equals("urls")) {
                    c = 1;
                    break;
                }
                break;
            case 110549828:
                if (str.equals("total")) {
                    c = 2;
                    break;
                }
                break;
        }
        List arrayList = 0;
        List arrayList2 = 0;
        switch (c) {
            case 0:
                if (tm9Var.w().a() == 7) {
                    arrayList = new ArrayList();
                    int iN0 = tm9Var.n0();
                    while (i < iN0) {
                        arrayList.add(Long.valueOf(efi.l(tm9Var, 0L)));
                        i++;
                    }
                } else {
                    tm9Var.v();
                }
                if (arrayList == 0) {
                    arrayList = Collections.EMPTY_LIST;
                }
                this.d = arrayList;
                break;
            case 1:
                if (tm9Var.w().a() == 7) {
                    arrayList2 = new ArrayList();
                    int iN02 = tm9Var.n0();
                    while (i < iN02) {
                        arrayList2.add(efi.o(tm9Var));
                        i++;
                    }
                } else {
                    tm9Var.v();
                }
                if (arrayList2 == 0) {
                    arrayList2 = Collections.EMPTY_LIST;
                }
                this.c = arrayList2;
                break;
            case 2:
                this.o = tm9Var.s0();
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        int iA = zdi.a(this.c);
        int iA2 = zdi.a(this.d);
        return ho7.j(wy1.k("{urls=", iA, ", ids=", iA2, ", total="), this.o, "}");
    }
}
