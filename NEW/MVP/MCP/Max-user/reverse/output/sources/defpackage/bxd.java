package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class bxd {
    public final u9a a;
    public final int b;
    public final ty9 c;
    public boolean d;

    public bxd(hf6 hf6Var, u9a u9aVar) {
        this.a = u9aVar;
        this.c = hf6Var.l;
        this.b = tfi.e(hf6Var.n);
    }

    public static String i(hf6 hf6Var, List list) {
        String str = hf6Var.n;
        gf3 gf3Var = hf6Var.D;
        str.getClass();
        boolean zM = xz9.m(str);
        gh7 gh7Var = new gh7(4);
        gh7Var.i(str);
        if (zM) {
            gh7Var.a("video/hevc");
            gh7Var.a("video/avc");
        }
        list.getClass();
        gh7Var.d(list);
        wg7 wg7VarA = gh7Var.j().a();
        for (int i = 0; i < wg7VarA.size(); i++) {
            String str2 = (String) wg7VarA.get(i);
            if (list.contains(str2)) {
                if (zM && gf3.h(gf3Var)) {
                    if (!ff5.f(str2, gf3Var).isEmpty()) {
                        return str2;
                    }
                } else if (!ff5.e(str2).isEmpty()) {
                    return str2;
                }
            }
        }
        return null;
    }

    public abstract sx6 j(g95 g95Var, hf6 hf6Var, int i);

    public abstract ph4 k();

    public abstract hf6 l();

    public abstract boolean m();

    public boolean n() {
        return false;
    }

    public abstract void o();

    public abstract void p();
}
