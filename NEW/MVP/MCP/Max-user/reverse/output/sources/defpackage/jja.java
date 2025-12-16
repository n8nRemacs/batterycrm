package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class jja extends l0g {
    public ArrayList c;
    public ArrayList d;
    public ArrayList o;

    public jja(tm9 tm9Var) {
        super(tm9Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        int i = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -989040443:
                if (str.equals("phones")) {
                    c = 0;
                    break;
                }
                break;
            case -930898016:
                if (str.equals("rindex")) {
                    c = 1;
                    break;
                }
                break;
            case 104120:
                if (str.equals("ids")) {
                    c = 2;
                    break;
                }
                break;
        }
        ArrayList arrayList = null;
        switch (c) {
            case 0:
                if (tm9Var.w().a() == 7) {
                    arrayList = new ArrayList();
                    int iN0 = tm9Var.n0();
                    while (i < iN0) {
                        arrayList.add(efi.o(tm9Var));
                        i++;
                    }
                } else {
                    tm9Var.v();
                }
                this.c = arrayList;
                break;
            case 1:
                if (tm9Var.w().a() == 7) {
                    arrayList = new ArrayList();
                    int iN02 = tm9Var.n0();
                    for (int i2 = 0; i2 < iN02; i2++) {
                        arrayList.add(Integer.valueOf(efi.k(tm9Var, 0)));
                    }
                } else {
                    tm9Var.v();
                }
                this.d = arrayList;
                break;
            case 2:
                if (tm9Var.w().a() == 7) {
                    arrayList = new ArrayList();
                    int iN03 = tm9Var.n0();
                    while (i < iN03) {
                        arrayList.add(Long.valueOf(efi.l(tm9Var, 0L)));
                        i++;
                    }
                } else {
                    tm9Var.v();
                }
                this.o = arrayList;
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
        return ho7.j(wy1.k("{phones=", iA, ", rindex=", iA2, ", ids="), zdi.a(this.o), "}");
    }
}
