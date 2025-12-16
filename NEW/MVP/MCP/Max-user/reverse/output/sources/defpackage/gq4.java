package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class gq4 extends vq4 implements Comparable {
    public final int A0;
    public final int B0;
    public final int C0;
    public final int D0;
    public final boolean E0;
    public final boolean F0;
    public final boolean X;
    public final String Y;
    public final mq4 Z;
    public final int o;
    public final boolean s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final boolean w0;
    public final int x0;
    public final int y0;
    public final boolean z0;

    public gq4(int i, kfg kfgVar, int i2, mq4 mq4Var, int i3, boolean z) {
        wg7 wg7Var;
        int i4;
        int iB;
        String[] strArrSplit;
        int iB2;
        super(i, kfgVar, i2);
        this.Z = mq4Var;
        this.Y = zq4.e(this.d.c);
        int i5 = 0;
        this.s0 = zq4.c(i3, false);
        int i6 = 0;
        while (true) {
            wg7 wg7Var2 = mq4Var.x0;
            wg7Var = mq4Var.B0;
            i4 = Integer.MAX_VALUE;
            if (i6 >= wg7Var2.size()) {
                iB = 0;
                i6 = Integer.MAX_VALUE;
                break;
            } else {
                iB = zq4.b(this.d, (String) mq4Var.x0.get(i6), false);
                if (iB > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.u0 = i6;
        this.t0 = iB;
        int i7 = this.d.o;
        int i8 = mq4Var.y0;
        this.v0 = (i7 == 0 || i7 != i8) ? Integer.bitCount(i7 & i8) : Integer.MAX_VALUE;
        gf6 gf6Var = this.d;
        int i9 = gf6Var.o;
        this.w0 = i9 == 0 || (i9 & 1) != 0;
        this.z0 = (gf6Var.d & 1) != 0;
        int i10 = gf6Var.I0;
        this.A0 = i10;
        this.B0 = gf6Var.J0;
        int i11 = gf6Var.Z;
        this.C0 = i11;
        this.X = (i11 == -1 || i11 <= mq4Var.A0) && (i10 == -1 || i10 <= mq4Var.z0);
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i12 = xxg.a;
        if (i12 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i12 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            strArrSplit[i13] = xxg.C(strArrSplit[i13]);
        }
        int i14 = 0;
        while (true) {
            if (i14 >= strArrSplit.length) {
                iB2 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iB2 = zq4.b(this.d, strArrSplit[i14], false);
                if (iB2 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.x0 = i14;
        this.y0 = iB2;
        int i15 = 0;
        while (true) {
            if (i15 >= wg7Var.size()) {
                break;
            }
            String str = this.d.v0;
            if (str != null && str.equals(wg7Var.get(i15))) {
                i4 = i15;
                break;
            }
            i15++;
        }
        this.D0 = i4;
        this.E0 = (i3 & 128) == 128;
        this.F0 = (i3 & 64) == 64;
        boolean z2 = this.X;
        mq4 mq4Var2 = this.Z;
        if (zq4.c(i3, mq4Var2.T0) && (z2 || mq4Var2.O0)) {
            i5 = (!zq4.c(i3, false) || !z2 || this.d.Z == -1 || mq4Var2.G0 || mq4Var2.F0 || (!mq4Var2.V0 && z)) ? 1 : 2;
        }
        this.o = i5;
    }

    @Override // defpackage.vq4
    public final int a() {
        return this.o;
    }

    @Override // defpackage.vq4
    public final boolean c(vq4 vq4Var) {
        int i;
        String str;
        int i2;
        gq4 gq4Var = (gq4) vq4Var;
        gf6 gf6Var = gq4Var.d;
        mq4 mq4Var = this.Z;
        boolean z = mq4Var.R0;
        gf6 gf6Var2 = this.d;
        if (!z && ((i2 = gf6Var2.I0) == -1 || i2 != gf6Var.I0)) {
            return false;
        }
        if (!mq4Var.P0 && ((str = gf6Var2.v0) == null || !TextUtils.equals(str, gf6Var.v0))) {
            return false;
        }
        if (!mq4Var.Q0 && ((i = gf6Var2.J0) == -1 || i != gf6Var.J0)) {
            return false;
        }
        if (mq4Var.S0) {
            return true;
        }
        return this.E0 == gq4Var.E0 && this.F0 == gq4Var.F0;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(gq4 gq4Var) {
        boolean z = this.s0;
        boolean z2 = this.X;
        ijb ijbVarB = (z2 && z) ? zq4.f : zq4.f.b();
        boolean z3 = gq4Var.s0;
        int i = gq4Var.C0;
        cj3 cj3VarD = cj3.a.d(z, z3);
        Integer numValueOf = Integer.valueOf(this.u0);
        Integer numValueOf2 = Integer.valueOf(gq4Var.u0);
        yca ycaVar = yca.c;
        cj3 cj3VarC = cj3VarD.c(numValueOf, numValueOf2, ycaVar).a(this.t0, gq4Var.t0).a(this.v0, gq4Var.v0).d(this.z0, gq4Var.z0).d(this.w0, gq4Var.w0).c(Integer.valueOf(this.x0), Integer.valueOf(gq4Var.x0), ycaVar).a(this.y0, gq4Var.y0).d(z2, gq4Var.X).c(Integer.valueOf(this.D0), Integer.valueOf(gq4Var.D0), ycaVar);
        int i2 = this.C0;
        cj3 cj3VarC2 = cj3VarC.c(Integer.valueOf(i2), Integer.valueOf(i), this.Z.F0 ? zq4.f.b() : zq4.g).d(this.E0, gq4Var.E0).d(this.F0, gq4Var.F0).c(Integer.valueOf(this.A0), Integer.valueOf(gq4Var.A0), ijbVarB).c(Integer.valueOf(this.B0), Integer.valueOf(gq4Var.B0), ijbVarB);
        Integer numValueOf3 = Integer.valueOf(i2);
        Integer numValueOf4 = Integer.valueOf(i);
        if (!xxg.a(this.Y, gq4Var.Y)) {
            ijbVarB = zq4.g;
        }
        return cj3VarC2.c(numValueOf3, numValueOf4, ijbVarB).f();
    }
}
