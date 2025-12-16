package defpackage;

/* loaded from: classes.dex */
public abstract class uwi {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static ks8 b(ty9 ty9Var, String str) {
        int i = 0;
        while (true) {
            ry9[] ry9VarArr = ty9Var.a;
            if (i >= ry9VarArr.length) {
                return null;
            }
            ry9 ry9Var = ry9VarArr[i];
            if (ry9Var instanceof ks8) {
                ks8 ks8Var = (ks8) ry9Var;
                if (ks8Var.a.equals(str)) {
                    return ks8Var;
                }
            }
            i++;
        }
    }

    public static fg3 c(int i, umb umbVar) {
        int iJ = umbVar.j();
        if (umbVar.j() == 1684108385) {
            umbVar.K(8);
            String strT = umbVar.t(iJ - 16);
            return new fg3("und", strT, strT);
        }
        a8i.l("MetadataUtil", "Failed to parse comment attribute: " + oy.i(i));
        return null;
    }

    public static ym d(umb umbVar) {
        int iJ = umbVar.j();
        if (umbVar.j() != 1684108385) {
            a8i.l("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iJ2 = umbVar.j();
        byte[] bArr = gt0.a;
        int i = iJ2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            wy1.p(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        umbVar.K(4);
        int i2 = iJ - 16;
        byte[] bArr2 = new byte[i2];
        umbVar.h(0, bArr2, i2);
        return new ym(str, null, 3, bArr2);
    }

    public static h4g e(int i, umb umbVar, String str) {
        int iJ = umbVar.j();
        if (umbVar.j() == 1684108385 && iJ >= 22) {
            umbVar.K(10);
            int iD = umbVar.D();
            if (iD > 0) {
                String strF = ho7.f(iD, "");
                int iD2 = umbVar.D();
                if (iD2 > 0) {
                    strF = xc0.e(iD2, strF, "/");
                }
                return new h4g(str, null, wg7.m(strF));
            }
        }
        a8i.l("MetadataUtil", "Failed to parse index/count attribute: " + oy.i(i));
        return null;
    }

    public static int f(umb umbVar) {
        int iJ = umbVar.j();
        if (umbVar.j() == 1684108385) {
            umbVar.K(8);
            int i = iJ - 16;
            if (i == 1) {
                return umbVar.x();
            }
            if (i == 2) {
                return umbVar.D();
            }
            if (i == 3) {
                return umbVar.A();
            }
            if (i == 4 && (umbVar.a[umbVar.b] & 128) == 0) {
                return umbVar.B();
            }
        }
        a8i.l("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static nc7 g(int i, String str, umb umbVar, boolean z, boolean z2) {
        int iF = f(umbVar);
        if (z2) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z ? new h4g(str, null, wg7.m(Integer.toString(iF))) : new fg3("und", str, Integer.toString(iF));
        }
        a8i.l("MetadataUtil", "Failed to parse uint8 attribute: " + oy.i(i));
        return null;
    }

    public static h4g h(int i, umb umbVar, String str) {
        int iJ = umbVar.j();
        if (umbVar.j() == 1684108385) {
            umbVar.K(8);
            return new h4g(str, null, wg7.m(umbVar.t(iJ - 16)));
        }
        a8i.l("MetadataUtil", "Failed to parse text attribute: " + oy.i(i));
        return null;
    }

    public static void i(int i, ty9 ty9Var, ff6 ff6Var, ty9 ty9Var2, ty9... ty9VarArr) {
        if (ty9Var2 == null) {
            ty9Var2 = new ty9(new ry9[0]);
        }
        if (ty9Var != null) {
            int i2 = 0;
            while (true) {
                ry9[] ry9VarArr = ty9Var.a;
                if (i2 >= ry9VarArr.length) {
                    break;
                }
                ry9 ry9Var = ry9VarArr[i2];
                if (ry9Var instanceof ks8) {
                    ks8 ks8Var = (ks8) ry9Var;
                    if (!ks8Var.a.equals("com.android.capture.fps")) {
                        ty9Var2 = ty9Var2.a(ks8Var);
                    } else if (i == 2) {
                        ty9Var2 = ty9Var2.a(ks8Var);
                    }
                }
                i2++;
            }
        }
        for (ty9 ty9Var3 : ty9VarArr) {
            ty9Var2 = ty9Var2.b(ty9Var3);
        }
        if (ty9Var2.a.length > 0) {
            ff6Var.k = ty9Var2;
        }
    }
}
