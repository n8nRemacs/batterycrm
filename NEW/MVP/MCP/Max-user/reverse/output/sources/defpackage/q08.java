package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import net.jpountz.lz4.LZ4Factory;

/* loaded from: classes2.dex */
public abstract class q08 {
    public static volatile LZ4Factory a;
    public static final s55 b = new s55(26);

    public static mw4 b(e9j e9jVar) {
        int i;
        pw4 pw4Var;
        int i2;
        ow4 ow4Var;
        int i3;
        int i4;
        pw4 pw4Var2;
        pw4 pw4Var3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iF = e9jVar.f();
        int iE = e9jVar.e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ow4 ow4Var2 = new ow4();
        int i14 = 0;
        ow4Var2.a = 0;
        ow4Var2.b = iF;
        ow4Var2.c = 0;
        ow4Var2.d = iE;
        arrayList2.add(ow4Var2);
        int i15 = iF + iE;
        int i16 = 1;
        int i17 = (((i15 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i17];
        int i18 = i17 / 2;
        int[] iArr2 = new int[i17];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            ow4 ow4Var3 = (ow4) arrayList2.remove(arrayList2.size() - i16);
            if (ow4Var3.b() < i16 || ow4Var3.a() < i16) {
                i = i18;
                pw4Var = null;
            } else {
                int iA = ((ow4Var3.a() + ow4Var3.b()) + i16) / 2;
                int i19 = i16 + i18;
                iArr[i19] = ow4Var3.a;
                iArr2[i19] = ow4Var3.b;
                int i20 = i14;
                while (i20 < iA) {
                    int i21 = Math.abs(ow4Var3.b() - ow4Var3.a()) % 2 == i16 ? i16 : i14;
                    int iB = ow4Var3.b() - ow4Var3.a();
                    int i22 = -i20;
                    int i23 = i22;
                    while (true) {
                        if (i23 > i20) {
                            i3 = i14;
                            i = i18;
                            i4 = iA;
                            pw4Var2 = null;
                            break;
                        }
                        if (i23 == i22 || (i23 != i20 && iArr[i23 + 1 + i18] > iArr[(i23 - 1) + i18])) {
                            i9 = iArr[i23 + 1 + i18];
                            i10 = i9;
                        } else {
                            i9 = iArr[(i23 - 1) + i18];
                            i10 = i9 + 1;
                        }
                        i = i18;
                        int i24 = ((i10 - ow4Var3.a) + ow4Var3.c) - i23;
                        if (i20 == 0 || i10 != i9) {
                            i11 = i10;
                            i12 = i24;
                        } else {
                            i11 = i10;
                            i12 = i24 - 1;
                        }
                        int i25 = i23;
                        int i26 = i24;
                        int i27 = i11;
                        i4 = iA;
                        while (i27 < ow4Var3.b && i26 < ow4Var3.d && e9jVar.c(i27, i26)) {
                            i27++;
                            i26++;
                        }
                        iArr[i25 + i] = i27;
                        if (i21 != 0) {
                            int i28 = iB - i25;
                            i13 = i21;
                            if (i28 >= i22 + 1 && i28 <= i20 - 1 && iArr2[i28 + i] <= i27) {
                                pw4Var2 = new pw4();
                                pw4Var2.a = i9;
                                pw4Var2.b = i12;
                                pw4Var2.c = i27;
                                pw4Var2.d = i26;
                                i3 = 0;
                                pw4Var2.e = false;
                                break;
                            }
                        } else {
                            i13 = i21;
                        }
                        i23 = i25 + 2;
                        i14 = 0;
                        i18 = i;
                        iA = i4;
                        i21 = i13;
                    }
                    if (pw4Var2 != null) {
                        pw4Var = pw4Var2;
                        break;
                    }
                    int i29 = (ow4Var3.b() - ow4Var3.a()) % 2 == 0 ? 1 : i3;
                    int iB2 = ow4Var3.b() - ow4Var3.a();
                    int i30 = i22;
                    while (true) {
                        if (i30 > i20) {
                            pw4Var3 = null;
                            break;
                        }
                        if (i30 == i22 || (i30 != i20 && iArr2[i30 + 1 + i] < iArr2[(i30 - 1) + i])) {
                            i5 = iArr2[i30 + 1 + i];
                            i6 = i5;
                        } else {
                            i5 = iArr2[(i30 - 1) + i];
                            i6 = i5 - 1;
                        }
                        int i31 = ow4Var3.d - ((ow4Var3.b - i6) - i30);
                        int i32 = (i20 == 0 || i6 != i5) ? i31 : i31 + 1;
                        int i33 = i29;
                        while (i6 > ow4Var3.a && i31 > ow4Var3.c) {
                            i7 = iB2;
                            if (!e9jVar.c(i6 - 1, i31 - 1)) {
                                break;
                            }
                            i6--;
                            i31--;
                            iB2 = i7;
                        }
                        i7 = iB2;
                        iArr2[i30 + i] = i6;
                        if (i33 != 0 && (i8 = i7 - i30) >= i22 && i8 <= i20 && iArr[i8 + i] >= i6) {
                            pw4Var3 = new pw4();
                            pw4Var3.a = i6;
                            pw4Var3.b = i31;
                            pw4Var3.c = i5;
                            pw4Var3.d = i32;
                            pw4Var3.e = true;
                            break;
                        }
                        i30 += 2;
                        i29 = i33;
                        iB2 = i7;
                    }
                    if (pw4Var3 != null) {
                        pw4Var = pw4Var3;
                        break;
                    }
                    i20++;
                    i18 = i;
                    iA = i4;
                    i16 = 1;
                    i14 = 0;
                }
                i = i18;
                pw4Var = null;
            }
            if (pw4Var != null) {
                if (pw4Var.a() > 0) {
                    int i34 = pw4Var.d;
                    int i35 = pw4Var.b;
                    int i36 = i34 - i35;
                    int i37 = pw4Var.c;
                    int i38 = pw4Var.a;
                    int i39 = i37 - i38;
                    arrayList.add(i36 != i39 ? pw4Var.e ? new lw4(i38, i35, pw4Var.a()) : i36 > i39 ? new lw4(i38, i35 + 1, pw4Var.a()) : new lw4(i38 + 1, i35, pw4Var.a()) : new lw4(i38, i35, i39));
                }
                if (arrayList3.isEmpty()) {
                    ow4Var = new ow4();
                    i2 = 1;
                } else {
                    i2 = 1;
                    ow4Var = (ow4) arrayList3.remove(arrayList3.size() - 1);
                }
                ow4Var.a = ow4Var3.a;
                ow4Var.c = ow4Var3.c;
                ow4Var.b = pw4Var.a;
                ow4Var.d = pw4Var.b;
                arrayList2.add(ow4Var);
                ow4Var3.b = ow4Var3.b;
                ow4Var3.d = ow4Var3.d;
                ow4Var3.a = pw4Var.c;
                ow4Var3.c = pw4Var.d;
                arrayList2.add(ow4Var3);
            } else {
                i2 = 1;
                arrayList3.add(ow4Var3);
            }
            i18 = i;
            i16 = i2;
            i14 = 0;
        }
        Collections.sort(arrayList, b);
        return new mw4(e9jVar, arrayList, iArr, iArr2);
    }

    public static LZ4Factory c() {
        if (a == null) {
            synchronized (q08.class) {
                try {
                    if (a == null) {
                        a = LZ4Factory.fastestInstance();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public static dyf f(int i, yeb yebVar) {
        int iV = az1.v(i);
        if (iV == 0) {
            return new dyf(yebVar.getIcon().f, yebVar.getText().e, yebVar.b().a.n, true);
        }
        if (iV == 1) {
            return new dyf(yebVar.getIcon().j, yebVar.getText().g, yebVar.b().a.h, true);
        }
        if (iV == 2) {
            return new dyf(yebVar.c().b.a.f, yebVar.c().c.b.e, yebVar.c().c.b.e, false);
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract View d(int i);

    public abstract boolean e();
}
