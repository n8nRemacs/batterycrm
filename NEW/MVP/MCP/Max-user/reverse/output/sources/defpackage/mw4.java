package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class mw4 {
    public final int a;
    public boolean b;
    public int c;
    public final Object d;
    public final Serializable e;
    public Object f;
    public final Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public mw4(e9j e9jVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        lw4 lw4Var;
        int i2;
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = e9jVar;
        int iF = e9jVar.f();
        this.a = iF;
        int iE = e9jVar.e();
        this.c = iE;
        this.b = true;
        lw4 lw4Var2 = arrayList.isEmpty() ? null : (lw4) arrayList.get(0);
        if (lw4Var2 == null || lw4Var2.a != 0 || lw4Var2.b != 0) {
            arrayList.add(0, new lw4(0, 0, 0));
        }
        arrayList.add(new lw4(iF, iE, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lw4 lw4Var3 = (lw4) it.next();
            for (int i3 = 0; i3 < lw4Var3.c; i3++) {
                int i4 = lw4Var3.a + i3;
                int i5 = lw4Var3.b + i3;
                int i6 = e9jVar.b(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.b) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                lw4 lw4Var4 = (lw4) it2.next();
                while (true) {
                    i = lw4Var4.a;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 < size) {
                                    lw4Var = (lw4) arrayList.get(i8);
                                    while (true) {
                                        i2 = lw4Var.b;
                                        if (i9 < i2) {
                                            if (iArr2[i9] == 0 && e9jVar.c(i7, i9)) {
                                                int i10 = e9jVar.b(i7, i9) ? 8 : 4;
                                                iArr[i7] = (i9 << 4) | i10;
                                                iArr2[i9] = i10 | (i7 << 4);
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                                i9 = lw4Var.c + i2;
                                i8++;
                            }
                        }
                        i7++;
                    }
                }
                i7 = lw4Var4.c + i;
            }
        }
    }

    public static nw4 b(ArrayDeque arrayDeque, int i, boolean z) {
        nw4 nw4Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                nw4Var = null;
                break;
            }
            nw4Var = (nw4) it.next();
            if (nw4Var.a == i && nw4Var.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            nw4 nw4Var2 = (nw4) it.next();
            if (z) {
                nw4Var2.b--;
            } else {
                nw4Var2.b++;
            }
        }
        return nw4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(da8 da8Var) {
        int i;
        int i2;
        int[] iArr;
        ArrayList arrayList;
        int[] iArr2 = (int[]) this.e;
        ArrayList arrayList2 = (ArrayList) this.d;
        e9j e9jVar = (e9j) this.g;
        hm0 hm0Var = da8Var instanceof hm0 ? (hm0) da8Var : new hm0(da8Var);
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = this.c;
        int i4 = 1;
        int size = arrayList2.size() - 1;
        int i5 = this.a;
        int i6 = i5;
        while (size >= 0) {
            lw4 lw4Var = (lw4) arrayList2.get(size);
            int i7 = lw4Var.a;
            int i8 = lw4Var.c;
            int i9 = i7 + i8;
            int i10 = lw4Var.b;
            int i11 = i10 + i8;
            int i12 = i4;
            while (true) {
                i = 0;
                if (i6 <= i9) {
                    break;
                }
                i6--;
                int i13 = iArr2[i6];
                if ((i13 & 12) != 0) {
                    iArr = iArr2;
                    int i14 = i13 >> 4;
                    nw4 nw4VarB = b(arrayDeque, i14, false);
                    if (nw4VarB != null) {
                        int i15 = (i5 - nw4VarB.b) - 1;
                        hm0Var.b(i6, i15);
                        if ((i13 & 4) != 0) {
                            arrayList = arrayList2;
                            hm0Var.h(i15, i12, e9jVar.d(i6, i14));
                        } else {
                            arrayList = arrayList2;
                        }
                    } else {
                        arrayList = arrayList2;
                        boolean z = i12;
                        arrayDeque.add(new nw4(i6, (i5 - i6) - (z ? 1 : 0), z));
                    }
                } else {
                    iArr = iArr2;
                    arrayList = arrayList2;
                    hm0Var.g(i6, i12);
                    i5--;
                }
                arrayList2 = arrayList;
                iArr2 = iArr;
                i12 = 1;
            }
            int[] iArr3 = iArr2;
            ArrayList arrayList3 = arrayList2;
            while (i3 > i11) {
                i3--;
                int i16 = ((int[]) this.f)[i3];
                if ((i16 & 12) != 0) {
                    int i17 = i16 >> 4;
                    nw4 nw4VarB2 = b(arrayDeque, i17, true);
                    if (nw4VarB2 == null) {
                        arrayDeque.add(new nw4(i3, i5 - i6, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        hm0Var.b((i5 - nw4VarB2.b) - 1, i6);
                        if ((i16 & 4) != 0) {
                            hm0Var.h(i6, 1, e9jVar.d(i17, i3));
                        }
                    }
                } else {
                    i2 = i;
                    hm0Var.c(i6, 1);
                    i5++;
                }
                i = i2;
            }
            int i18 = i10;
            int i19 = i7;
            while (i < i8) {
                if ((iArr3[i19] & 15) == 2) {
                    hm0Var.h(i19, 1, e9jVar.d(i19, i18));
                }
                i19++;
                i18++;
                i++;
            }
            size--;
            i3 = i10;
            i6 = i7;
            i4 = 1;
            arrayList2 = arrayList3;
            iArr2 = iArr3;
        }
        hm0Var.a();
    }

    public mw4(bhd bhdVar, msf msfVar, f9g f9gVar, int i) {
        this.g = bhdVar;
        this.b = false;
        this.c = 0;
        this.f = null;
        this.d = msfVar;
        this.e = f9gVar;
        this.a = i;
    }
}
