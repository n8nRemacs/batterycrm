package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public abstract class rui {
    public static final u30 a(hf6 hf6Var) {
        return new u30(hf6Var.a, hf6Var.n, hf6Var.k, hf6Var.j, hf6Var.G, hf6Var.F, hf6Var.b, hf6Var.d);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final v3h b(hf6 hf6Var) {
        hyg hygVar;
        int i = hf6Var.v;
        int i2 = hf6Var.u;
        Size size = hf6Var.z % 180 == 0 ? new Size(i2, i) : new Size(i, i2);
        String str = hf6Var.a;
        String str2 = hf6Var.n;
        String str3 = hf6Var.k;
        int i3 = hf6Var.j;
        int width = (int) (size.getWidth() * hf6Var.A);
        int height = size.getHeight();
        float f = hf6Var.y;
        ty9 ty9Var = hf6Var.l;
        fk6 fk6Var = null;
        if (ty9Var == null) {
            hygVar = null;
        } else {
            for (ry9 ry9Var : ty9Var.a) {
                if (ry9Var instanceof hyg) {
                    hygVar = (hyg) ry9Var;
                    break;
                }
            }
            hygVar = null;
        }
        if (hygVar != null) {
            String str4 = hygVar.a;
            switch (str4.hashCode()) {
                case -1096862286:
                    if (str4.equals("lowest")) {
                        fk6Var = fk6.d;
                        break;
                    }
                    break;
                case -1068855134:
                    if (str4.equals("mobile")) {
                        fk6Var = fk6.c;
                        break;
                    }
                    break;
                case 3324:
                    if (str4.equals("hd")) {
                        fk6Var = fk6.Y;
                        break;
                    }
                    break;
                case 3665:
                    if (str4.equals("sd")) {
                        fk6Var = fk6.X;
                        break;
                    }
                    break;
                case 107348:
                    if (str4.equals("low")) {
                        fk6Var = fk6.o;
                        break;
                    }
                    break;
                case 3154575:
                    if (str4.equals("full")) {
                        fk6Var = fk6.Z;
                        break;
                    }
                    break;
                case 3481927:
                    if (str4.equals("quad")) {
                        fk6Var = fk6.s0;
                        break;
                    }
                    break;
                case 111384492:
                    if (str4.equals("ultra")) {
                        fk6Var = fk6.t0;
                        break;
                    }
                    break;
            }
        }
        return new v3h(str, str2, str3, i3, width, height, f, fk6Var);
    }

    public static void c(int i, int i2) {
        String strE;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strE = tui.e("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(ho7.f(i2, "negative size: "));
                }
                strE = tui.e("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strE);
        }
    }

    public static void d(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? f(i, i3, "start index") : (i2 < 0 || i2 > i3) ? f(i2, i3, "end index") : tui.e("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void e(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static String f(int i, int i2, String str) {
        if (i < 0) {
            return tui.e("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return tui.e("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(ho7.f(i2, "negative size: "));
    }
}
