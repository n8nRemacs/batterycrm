package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class j4j {
    public static final b0a a(hl7 hl7Var, wu7 wu7Var) {
        long j = hl7Var.a;
        String str = hl7Var.b;
        String str2 = hl7Var.c;
        if (str2.length() == 0) {
            str2 = null;
        }
        String str3 = hl7Var.d;
        ll7[] ll7VarArr = hl7Var.q;
        if (ll7VarArr.length == 0) {
            ll7VarArr = null;
        }
        String str4 = hl7Var.p;
        if (str4.length() == 0) {
            str4 = null;
        }
        String str5 = hl7Var.e;
        ll7[] ll7VarArr2 = ll7VarArr;
        String str6 = str4;
        long j2 = hl7Var.f;
        int i = hl7Var.g;
        int i2 = hl7Var.h;
        boolean z = hl7Var.i;
        boolean z2 = hl7Var.j;
        byte[] bArr = null;
        boolean z3 = hl7Var.k;
        long j3 = hl7Var.l;
        long j4 = hl7Var.m;
        Long lValueOf = Long.valueOf(j4);
        if (j4 <= 0) {
            lValueOf = null;
        }
        long j5 = hl7Var.r;
        String str7 = hl7Var.n;
        if (str7.length() == 0) {
            str7 = null;
        }
        byte[] bArr2 = hl7Var.o;
        String str8 = str7;
        if (bArr2.length != 0) {
            bArr = bArr2;
        }
        return new b0a(j, str, str2, str3, ll7VarArr2, str6, str5, j2, i, i2, z, z2, z3, j3, lValueOf, j5, hl7Var.s, str8, bArr, (CharSequence) wu7Var.invoke(hl7Var), hl7Var.t);
    }

    public static void b(long j, qu0 qu0Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((xx0) arrayList4.get(i8)).d() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        xx0 xx0Var = (xx0) arrayList.get(i2);
        xx0 xx0Var2 = (xx0) arrayList4.get(i3 - 1);
        if (i7 == xx0Var.d()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            xx0 xx0Var3 = (xx0) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            xx0Var = xx0Var3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (xx0Var.h(i7) == xx0Var2.h(i7)) {
            int iMin = Math.min(xx0Var.d(), xx0Var2.d());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && xx0Var.h(i11) == xx0Var2.h(i11); i11++) {
                i10++;
            }
            long j3 = 4;
            long j4 = (qu0Var.b / j3) + j + 2 + i10 + 1;
            qu0Var.t0(-i10);
            qu0Var.t0(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                qu0Var.t0(xx0Var.h(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 != ((xx0) arrayList4.get(i4)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                qu0Var.t0(((Number) arrayList5.get(i4)).intValue());
                return;
            } else {
                qu0 qu0Var2 = new qu0();
                qu0Var.t0(((int) ((qu0Var2.b / j3) + j4)) * (-1));
                b(j4, qu0Var2, i12, arrayList4, i4, i3, arrayList5);
                qu0Var.p0(qu0Var2);
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((xx0) arrayList4.get(i14 - 1)).h(i7) != ((xx0) arrayList4.get(i14)).h(i7)) {
                i13++;
            }
        }
        long j5 = 4;
        long j6 = (qu0Var.b / j5) + j + 2 + (i13 * 2);
        qu0Var.t0(i13);
        qu0Var.t0(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iH = ((xx0) arrayList4.get(i15)).h(i7);
            if (i15 == i4 || iH != ((xx0) arrayList4.get(i15 - 1)).h(i7)) {
                qu0Var.t0(iH & 255);
            }
        }
        qu0 qu0Var3 = new qu0();
        int i16 = i4;
        while (i16 < i3) {
            byte bH = ((xx0) arrayList4.get(i16)).h(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bH != ((xx0) arrayList4.get(i18)).h(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((xx0) arrayList4.get(i16)).d()) {
                qu0Var.t0(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
            } else {
                qu0Var.t0(((int) ((qu0Var3.b / j5) + j6)) * (-1));
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
                b(j2, qu0Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j6 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        qu0Var.p0(qu0Var3);
    }
}
