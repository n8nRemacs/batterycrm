package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class uia extends l0g {
    public bu X;
    public int Y;
    public long Z;
    public long c;
    public ArrayList d;
    public int o;
    public ArrayList s0;
    public List t0;

    public uia(tm9 tm9Var) {
        super(tm9Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.ArrayList] */
    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        ?? arrayList;
        bu buVar;
        str.getClass();
        int i = 1;
        int i2 = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -2005455306:
                if (str.equals("recentsList")) {
                    c = 0;
                    break;
                }
                break;
            case -310976023:
                if (str.equals("recentEmojiList")) {
                    c = 1;
                    break;
                }
                break;
            case -295915613:
                if (str.equals("updateType")) {
                    c = 2;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c = 3;
                    break;
                }
                break;
            case 104120:
                if (str.equals("ids")) {
                    c = 4;
                    break;
                }
                break;
            case 3545755:
                if (str.equals("sync")) {
                    c = 5;
                    break;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    c = 6;
                    break;
                }
                break;
            case 109327645:
                if (str.equals("setId")) {
                    c = 7;
                    break;
                }
                break;
            case 747804969:
                if (str.equals("position")) {
                    c = '\b';
                    break;
                }
                break;
        }
        ArrayList arrayList2 = null;
        switch (c) {
            case 0:
                if (tm9Var.w().a() == 7) {
                    arrayList2 = new ArrayList();
                    int iN0 = tm9Var.n0();
                    while (i2 < iN0) {
                        arrayList2.add(tcd.a(tm9Var));
                        i2++;
                    }
                } else {
                    tm9Var.v();
                }
                this.s0 = arrayList2;
                break;
            case 1:
                if (tm9Var.w().a() == 7) {
                    arrayList = new ArrayList();
                    int iN02 = tm9Var.n0();
                    while (i2 < iN02) {
                        rcd rcdVarA = rcd.a(tm9Var);
                        if (rcdVarA != null) {
                            arrayList.add(rcdVarA);
                        }
                        i2++;
                    }
                } else {
                    tm9Var.v();
                    arrayList = Collections.EMPTY_LIST;
                }
                this.t0 = arrayList;
                break;
            case 2:
                String strO = efi.o(tm9Var);
                bu[] buVarArr = bu.d;
                int length = buVarArr.length;
                while (true) {
                    if (i2 < length) {
                        buVar = buVarArr[i2];
                        if (!buVar.a.equalsIgnoreCase(strO)) {
                            i2++;
                        }
                    } else {
                        buVar = bu.UNKNOWN;
                    }
                }
                this.X = buVar;
                break;
            case 3:
                this.c = efi.l(tm9Var, 0L);
                break;
            case 4:
                if (tm9Var.w().a() == 7) {
                    arrayList2 = new ArrayList();
                    int iN03 = tm9Var.n0();
                    while (i2 < iN03) {
                        arrayList2.add(Long.valueOf(efi.l(tm9Var, 0L)));
                        i2++;
                    }
                } else {
                    tm9Var.v();
                }
                this.d = arrayList2;
                break;
            case 5:
                this.Z = efi.l(tm9Var, 0L);
                break;
            case 6:
                String strO2 = efi.o(tm9Var);
                int[] iArrY = az1.y(10);
                int length2 = iArrY.length;
                while (true) {
                    if (i2 < length2) {
                        int i3 = iArrY[i2];
                        if (az1.d(i3).equals(strO2)) {
                            i = i3;
                        } else {
                            i2++;
                        }
                    }
                }
                this.o = i;
                break;
            case 7:
                efi.l(tm9Var, 0L);
                break;
            case '\b':
                this.Y = efi.k(tm9Var, 0);
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        long j = this.c;
        int i = this.o;
        bu buVar = this.X;
        int i2 = this.Y;
        int iA = zdi.a(this.t0);
        int iA2 = zdi.a(this.s0);
        StringBuilder sbL = az1.l(j, "Response{id=", ", assetType=");
        sbL.append(az1.w(i));
        sbL.append(", updateType=");
        sbL.append(buVar);
        sbL.append(", position=");
        hf3.g(sbL, i2, ", recentEmojiList=", iA, ", recentsList=");
        return ho7.j(sbL, iA2, "}");
    }
}
