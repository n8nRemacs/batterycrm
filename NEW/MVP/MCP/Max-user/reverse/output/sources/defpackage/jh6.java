package defpackage;

import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class jh6 implements cm6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ jh6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.o = obj4;
        this.X = obj5;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                oh6 oh6Var = (oh6) this.b;
                ghb ghbVar = (ghb) this.c;
                chb chbVar = (chb) this.d;
                c32 c32Var = (c32) this.o;
                c32 c32Var2 = (c32) this.X;
                Iterator it = oh6Var.b.iterator();
                while (it.hasNext()) {
                    ((dhb) it.next()).q(ghbVar, chbVar, c32Var, c32Var2);
                }
                return qqg.a;
            case 1:
                vu9 vu9Var = (vu9) this.b;
                return new dn9(vu9Var.B1, vu9Var.X, (k18) this.c, (k18) this.d, (k18) this.o, (k18) this.X);
            default:
                uld uldVar = (uld) this.b;
                uid uidVar = (uid) this.c;
                Handler handler = (Handler) this.d;
                xo8 xo8Var = (xo8) this.o;
                vgb vgbVar = (vgb) this.X;
                iv6 iv6Var = uldVar.d;
                if (iv6Var == null) {
                    iv6Var = null;
                }
                fde fdeVar = uldVar.o;
                sld sldVar = new sld(iv6Var, fdeVar != null ? fdeVar : null, uldVar.getLooper(), new yw(uidVar, 2), new l3b(handler, 19, xo8Var), new a7c(handler, 1, xo8Var));
                uldVar.X.put(vgbVar, sldVar);
                uldVar.Y.add(sldVar.h);
                m2c m2cVar = sldVar.h;
                m2cVar.getClass();
                m2cVar.f = new k1f();
                handler.post(new d8c(xo8Var, 17, uidVar));
                return qqg.a;
        }
    }
}
