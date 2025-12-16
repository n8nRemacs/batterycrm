package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class o82 {
    public final k18 a = yec.a.getAccessor().d(142);

    public static List b() {
        int i = r8b.x0;
        a7 a7Var = new a7(i, new toe(i, 0, new n5g(u8b.w1), null, null, baj.a(yud.s), null, null, null, 472), 536871936);
        int i2 = r8b.A0;
        a7 a7Var2 = new a7(i2, new toe(i2, 0, new n5g(mvd.V1), null, null, baj.a(yud.T1), null, null, null, 472), 1073742848);
        int i3 = r8b.B0;
        a7 a7Var3 = new a7(i3, new toe(i3, 0, new n5g(u8b.z1), null, null, baj.a(ivd.K0), null, null, null, 472), 1073742848);
        int i4 = r8b.y0;
        return ve3.j(a7Var, a7Var2, a7Var3, new a7(i4, new toe(i4, 0, new n5g(u8b.x1), null, null, baj.a(yud.H1), null, null, null, 472), -2147482624));
    }

    public final List a(i82 i82Var) {
        Uri uri;
        s5g n5gVar;
        s5g n5gVar2;
        boolean z = i82Var instanceof sd2;
        k18 k18Var = this.a;
        String lastPathSegment = null;
        if (z) {
            sd2 sd2Var = (sd2) i82Var;
            tcf tcfVar = sd2Var.i;
            boolean zT = sd2Var.t();
            w82 w82Var = w82.a;
            w82 w82Var2 = w82.b;
            if (zT) {
                x82 x82Var = (x82) tcfVar.getValue();
                if (x82Var != null) {
                    String str = x82Var.c;
                    w82 w82Var3 = x82Var.b;
                    o98 o98VarD = ve3.d();
                    o98VarD.add(new a8e(new n5g(u8b.H1), null, 14));
                    o98VarD.add(new qbe(r8b.h0, w82Var3 == w82Var2, new n5g(u8b.W1), new n5g(u8b.U1), 536879104));
                    o98VarD.add(new qbe(r8b.i0, w82Var3 == w82Var, new n5g(u8b.b2), new n5g(u8b.Y1), 1073750016));
                    int iOrdinal = w82Var3.ordinal();
                    if (iOrdinal == 0) {
                        ((j98) k18Var.getValue()).getClass();
                        String str2 = x82Var.c;
                        n5g n5gVar3 = new n5g(u8b.Z1);
                        s5g s5gVar = x82Var.d;
                        if (s5gVar != null) {
                            n5gVar2 = s5gVar;
                        } else {
                            n5gVar2 = (str2 == null || str2.length() == 0) ? new n5g(u8b.E1) : new n5g(u8b.F1);
                        }
                        Integer num = x82Var.e;
                        o98VarD.add(new vwe(new twe("max.ru/", str2, n5gVar3, false, n5gVar2, Integer.valueOf(num != null ? num.intValue() : w9b.Y))));
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (str == null || str.length() == 0) {
                            o98VarD.add(new k2c(new n5g(u8b.C1)));
                        } else {
                            o98VarD.add(new vwe(new uwe(new r5g(str), new n5g(u8b.D1), Integer.valueOf(w9b.Y))));
                        }
                    }
                    if (fni.a(sd2Var.r(), Boolean.FALSE)) {
                        o98VarD.addAll(b());
                    }
                    return ve3.a(o98VarD);
                }
            } else {
                x82 x82Var2 = (x82) tcfVar.getValue();
                if (x82Var2 != null) {
                    String str3 = x82Var2.c;
                    w82 w82Var4 = x82Var2.b;
                    o98 o98VarD2 = ve3.d();
                    o98VarD2.add(new a8e(new n5g(u8b.N1), null, 14));
                    o98VarD2.add(new qbe(r8b.h0, w82Var4 == w82Var2, new n5g(u8b.W1), new n5g(u8b.X1), 536879104));
                    o98VarD2.add(new qbe(r8b.i0, w82Var4 == w82Var, new n5g(u8b.b2), new n5g(u8b.c2), 1073750016));
                    int iOrdinal2 = w82Var4.ordinal();
                    if (iOrdinal2 == 0) {
                        ((j98) k18Var.getValue()).getClass();
                        String str4 = x82Var2.c;
                        n5g n5gVar4 = new n5g(u8b.Z1);
                        s5g s5gVar2 = x82Var2.d;
                        if (s5gVar2 != null) {
                            n5gVar = s5gVar2;
                        } else {
                            n5gVar = (str4 == null || str4.length() == 0) ? new n5g(u8b.K1) : new n5g(u8b.L1);
                        }
                        Integer num2 = x82Var2.e;
                        o98VarD2.add(new vwe(new twe("max.ru/", str4, n5gVar4, false, n5gVar, Integer.valueOf(num2 != null ? num2.intValue() : w9b.Y))));
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (str3 == null || str3.length() == 0) {
                            o98VarD2.add(new k2c(new n5g(u8b.I1)));
                        } else {
                            o98VarD2.add(new vwe(new uwe(new r5g(str3), new n5g(u8b.J1), Integer.valueOf(w9b.Y))));
                        }
                    }
                    if (fni.a(sd2Var.r(), Boolean.FALSE) && str3 != null && str3.length() != 0) {
                        o98VarD2.addAll(b());
                    }
                    return ve3.a(o98VarD2);
                }
            }
        } else {
            if (!(i82Var instanceof iv3)) {
                throw new NoWhenBranchMatchedException();
            }
            y82 y82Var = (y82) ((iv3) i82Var).i.getValue();
            if (y82Var != null) {
                o98 o98VarD3 = ve3.d();
                o98VarD3.add(new swe());
                ((j98) k18Var.getValue()).getClass();
                String str5 = y82Var.b;
                if (str5 != null && (uri = Uri.parse(str5)) != null) {
                    lastPathSegment = uri.getLastPathSegment();
                }
                String str6 = lastPathSegment;
                n5g n5gVar5 = new n5g(u8b.x0);
                s5g s5gVar3 = y82Var.c;
                Integer num3 = y82Var.d;
                o98VarD3.add(new vwe(new twe("max.ru/", str6, n5gVar5, true, s5gVar3, Integer.valueOf(num3 != null ? num3.intValue() : w9b.Y))));
                return ve3.a(o98VarD3);
            }
        }
        return hd5.a;
    }
}
