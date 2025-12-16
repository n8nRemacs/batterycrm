package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class s50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ s50(Object obj, Object obj2, long j, long j2, int i) {
        this.a = i;
        this.d = obj;
        this.o = obj2;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        Object obj = this.o;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                yl5 yl5Var = (yl5) ((xo8) obj2).c;
                String str = zxg.a;
                nj4 nj4Var = yl5Var.a.D0;
                id idVarH = nj4Var.H();
                nj4Var.I(idVarH, 1008, new ti4(idVarH, (String) obj, this.c, this.b, 0));
                break;
            case 1:
                bsd bsdVar = (bsd) obj;
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    bsdVar.f(this.b, this.c, (fh9) it.next(), false);
                }
                break;
            case 2:
                String str2 = (String) obj;
                yl5 yl5Var2 = (yl5) ((vhb) obj2).c;
                String str3 = zxg.a;
                nj4 nj4Var2 = yl5Var2.a.D0;
                id idVarH2 = nj4Var2.H();
                nj4Var2.I(idVarH2, 1016, new ti4(idVarH2, str2, this.c, this.b, 2));
                break;
            default:
                String str4 = (String) obj;
                xl5 xl5Var = (xl5) ((enb) obj2).c;
                int i2 = xxg.a;
                mj4 mj4Var = xl5Var.a.B0;
                hd hdVarJ = mj4Var.J();
                mj4Var.K(hdVarJ, 1016, new zi4(hdVarJ, str4, this.c, this.b));
                break;
        }
    }
}
