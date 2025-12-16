package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class fa7 extends vqa {
    public static final /* synthetic */ int Y = 0;
    public final j0e X;
    public final k18 a;
    public final int b;
    public final String c;
    public final String d;
    public final String o;

    public fa7(k18 k18Var, int i, String str, String str2, String str3, j0e j0eVar) {
        this.a = k18Var;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.o = str3;
        this.X = j0eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        ga7 ga7VarB;
        long jE;
        ea7 ea7Var;
        ea7 ea7Var2 = new ea7(vtaVar, this.a, this.b, this.c, this.d, this.o, this.X.a());
        vtaVar.c(ea7Var2);
        if (ea7Var2.Z.get()) {
            return;
        }
        t97 t97Var = (t97) ea7Var2.a.getValue();
        int i = ea7Var2.b;
        String str = ea7Var2.c;
        String str2 = ea7Var2.d;
        String str3 = ea7Var2.o;
        zy5 zy5Var = (zy5) t97Var;
        zy5Var.getClass();
        wqi.c("zy5", "upload", new Object[0]);
        File file = new File(str);
        wy5 wy5Var = null;
        if (!file.exists()) {
            ea7Var2.b("file not found", uog.m);
            ea7Var = ea7Var2;
        } else if (file.length() == 0) {
            ea7Var2.b("file is zero length", uog.n);
            ea7Var = ea7Var2;
        } else {
            int iV = az1.v(i);
            ua9 ua9Var = iV != 0 ? (iV == 1 || iV == 2 || iV == 3 || iV == 4) ? zy5.d : null : zy5.e;
            try {
                an3 an3Var = new an3();
                an3Var.j(null, str3);
                ga7VarB = an3Var.b();
            } catch (IllegalArgumentException unused) {
                ga7VarB = null;
            }
            if (ga7VarB == null) {
                wqi.e("zy5", "url is not valid - try to get new url from server", null);
                zy5.d(ea7Var2);
                ea7Var = ea7Var2;
            } else {
                if (i == 5) {
                    jE = 0;
                } else {
                    jE = "upload failed";
                    try {
                        jE = i == 1 ? zy5Var.e(ga7VarB) : zy5Var.c(ga7VarB);
                    } catch (xy5 e) {
                        ea7Var2.b(jE, e.a);
                        ea7Var = ea7Var2;
                    } catch (IOException e2) {
                        String string = e2.toString();
                        o97 o97Var = uog.l;
                        if (string != null) {
                            o97Var = new o97(-1, "UNKNOWN_ERROR", string);
                        }
                        ea7Var2.b(jE, o97Var);
                        ea7Var = ea7Var2;
                    }
                }
                if (jE < 0) {
                    wqi.e("zy5", "url expired - try to get new url from server", null);
                    zy5.d(ea7Var2);
                    ea7Var = ea7Var2;
                } else {
                    ua9 ua9Var2 = ua9Var;
                    zmd zmdVarA = zy5Var.a(file, str2, ga7VarB, ua9Var2, jE, ea7Var2, i);
                    mbd mbdVarB = ((sua) zy5Var.b.getValue()).b(zmdVarA);
                    wy5 wy5Var2 = new wy5();
                    wy5Var2.b = false;
                    wy5Var2.a = mbdVarB;
                    uy5 uy5Var = new uy5(zy5Var, zmdVarA, ea7Var2, file, new AtomicBoolean(), str2, ga7VarB, ua9Var2, i, wy5Var2);
                    ea7Var = ea7Var2;
                    mbdVarB.e(uy5Var);
                    wy5Var = wy5Var2;
                }
            }
        }
        ea7Var.set(wy5Var);
    }
}
